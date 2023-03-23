package com.shinhan.day06;

public class InnerInterfaceTest {

	public static void main(String[] args) {
		Button b1 = new Button();  // OK
		Button b2 = new Button();  // Cancel
		Button.ClickListener listener1 = new OKListener();
		Button.ClickListener listener2 = new CancelListener();
		
		test(b1, listener1);
		test(b2, listener2);
	}
	
	static void test(Button b1, Button.ClickListener listener) {
		b1.setListener(listener);
		b1.buttonClick();
	}

}
