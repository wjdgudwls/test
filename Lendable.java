/**
 * ���Ⱑ�� �������̽�
 * @author 203B-7
 *
 */

interface Lendable {
    /**
     * �����Ѵ� 
     * @param borrower : ������ �̸�
     * @param date : ���� ��¥
     */
	
	
	void checkOut(String borrower, String date); 
    /**
     * �ݳ��Ѵ�
     */
	void checkIn(); 
}