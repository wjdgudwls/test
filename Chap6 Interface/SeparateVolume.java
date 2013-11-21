/**
 * 단행본 클래스
 * @author 형진
 *
 */
class SeparateVolume implements Lendable  {
	String requstNo;            //청구번호
	String bookTitle;           //제목
	String writer;              //저자
	String borrower;            //대출인
	String checkOutDate;        //대출일
	byte state;                 //대출상태
     /**
      * 단행본 클래스 생성자
      * @param requstNo : 청구번호
      * @param bookTitle : 제목
      * @param writer : 저자
      */
	public SeparateVolume(
			String requstNo,String bookTitle,
			String writer)
	{this.requstNo = requstNo;
	this.bookTitle = bookTitle;
	this.writer = writer;}
		
	
	@Override
	public void checkOut(String borrower, String date) {
		if(state == 0){
		this.borrower =borrower;
		this.checkOutDate = date;
		this.state =1;
		System.out.println("*"+bookTitle+"이(가) 대출되었습니다.");
		System.out.println("대출일:"+ this.borrower);
		System.out.println("대출일:"+ this.checkOutDate);
		
		
		} 
		else {
			System.out.println("대출이 불가능 합니다.");
		}
		
	}
    @Override
	public void checkIn() {
    	this.borrower = null;
    	this.checkOutDate = null;
    	this.state = 0;
    	System.out.println("*"+bookTitle+"이(가) 반납되었습니다.");
				
	}


	 {
		
		
	}

}

