/**
 * ���ົ Ŭ����
 * @author ����
 *
 */
class SeparateVolume implements Lendable  {
	String requstNo;            //û����ȣ
	String bookTitle;           //����
	String writer;              //����
	String borrower;            //������
	String checkOutDate;        //������
	byte state;                 //�������
     /**
      * ���ົ Ŭ���� ������
      * @param requstNo : û����ȣ
      * @param bookTitle : ����
      * @param writer : ����
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
		System.out.println("*"+bookTitle+"��(��) ����Ǿ����ϴ�.");
		System.out.println("������:"+ this.borrower);
		System.out.println("������:"+ this.checkOutDate);
		
		
		} 
		else {
			System.out.println("������ �Ұ��� �մϴ�.");
		}
		
	}
    @Override
	public void checkIn() {
    	this.borrower = null;
    	this.checkOutDate = null;
    	this.state = 0;
    	System.out.println("*"+bookTitle+"��(��) �ݳ��Ǿ����ϴ�.");
				
	}


	 {
		
		
	}

}

