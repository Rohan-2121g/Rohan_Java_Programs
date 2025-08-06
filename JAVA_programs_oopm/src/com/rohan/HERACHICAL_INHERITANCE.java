package com.rohan;

class Dad {
    public void bike() {
        System.out.println("SINE");
    }

    public void car() {
        System.out.println("MUSTANG");
    }
}

class Son1 extends Dad {
    public void cycle() {
        System.out.println("Hero");
    }
}

class Son2 extends Dad {
    public void skateboard() {
        System.out.println("NIKE");
    }
}

public class HERACHICAL_INHERITANCE {
	
	public static void main(String[] args) {
        Son1 obj = new Son1();
        obj.bike();
        obj.car();
        obj.cycle();
    }
}
