package prasadDay4.secondpackage;

import prasadDay4.firstpackage.Base;
public class Excecutor {
	
	public static void main(String[] args) {

		 // accessing different package class
		Base b1 = new Base ();

		// private , default and protected members can't access

		b1.methodPublic();
		b1.varPublic =100;
		b1.methodPublic();


	}

}
