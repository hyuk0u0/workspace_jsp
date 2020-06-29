package kr.co.domain;

import java.util.List;

public class PageTO {
	private int curPage = 1; // 현재 페이지 // 1
	private int perPage = 10; // 한페이지의 게시글 개수
	private int pageLine = 10; // 화면에 표시할 페이지 개수
	private int amount; // 총게시글개수
	private int totalPage; // 총페이지 개수 
	private int startNum; // 시작할rownum값 게시글번호
	private int endNum; // 끝날rownum값
	private int beginPageNum; // 101 perPage에 의해서 결정됨 화면의 표시할 페이지
	private int stopPageNum; // 110
	private List<BoardDTO> list; // 
	
	public PageTO() {
		changeVarVal();
	}

	public PageTO(int curPage) {
		super();
		this.curPage = curPage;
		changeVarVal();
	}

	public int getCurPage() {
		return curPage;
	}

	public void setCurPage(int curPage) {
		this.curPage = curPage;
		changeVarVal();
	}

	public int getPerPage() {
		return perPage;
	}

	public void setPerPage(int perPage) {
		this.perPage = perPage;
		changeVarVal();
	}

	public int getPageLine() {
		return pageLine;
	}

	public void setPageLine(int pageLine) {
		this.pageLine = pageLine;
		changeVarVal();
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
		changeVarVal();
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getStartNum() {
		return startNum;
	}

	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}

	public int getEndNum() {
		return endNum;
	}

	public void setEndNum(int endNum) {
		this.endNum = endNum;
	}

	public int getBeginPageNum() {
		return beginPageNum;
	}

	public void setBeginPageNum(int beginPageNum) {
		this.beginPageNum = beginPageNum;
	}

	public int getStopPageNum() {
		return stopPageNum;
	}

	public void setStopPageNum(int stopPageNum) {
		this.stopPageNum = stopPageNum;
	}

	public List<BoardDTO> getList() {
		return list;
	}

	public void setList(List<BoardDTO> list) {
		this.list = list;
	}
	
	private void changeVarVal() {
		totalPage = amount/perPage; // 총게시글/한페이지에 들어갈수있느 게시글 ex 67/10 = 6 총 6페이지 7페이지 
		if(amount % perPage != 0) {
			totalPage = totalPage+1;
		}
		
		startNum = (curPage - 1) * perPage + 1; // 현재페이지 14    13 10  130 로우num 131 140 
		endNum = curPage * perPage;
		if (endNum > amount) {
			endNum = amount;
			//총게시글의 수가 27
			// endNum = 30
		}
		
		beginPageNum = ((curPage - 1) / pageLine) * pageLine + 1; // 
		stopPageNum = beginPageNum + (pageLine - 1);
		if (stopPageNum > totalPage) {
			stopPageNum = totalPage;
		}
		// stopPageNum = 110;
		// totalPage = 108;
		
		
	}
	
}
