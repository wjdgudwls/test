
public class InterfaceEx1 {
	public static void main(String[] args) {
		SeparateVolume obj1 =new SeparateVolume(
				"863?777��", "����", "��������");
		AppCDInfo obj2 = new AppCDInfo(
				"2007-7001", "Redhat Fedora");
        obj1.checkOut("������","2013-11-21");
        obj2.checkOut("������","2013-11-21");
        
        obj1.checkIn();
        obj2.checkIn();
	}

}
