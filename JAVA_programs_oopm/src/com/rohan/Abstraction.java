package com.rohan;

abstract class car{
	abstract void musicPlayer();
}

class JBL extends car{
	public void musicPlayer() {
		System.out.println("Bass 50, Trouble 70, High vol 100");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		JBL b = new JBL();
		b.musicPlayer();
	}
}
