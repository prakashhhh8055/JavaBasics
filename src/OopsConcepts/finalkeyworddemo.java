package OopsConcepts;


class Father {
    final void show1() {
        System.out.println("This is final method");
    }
}

class kid extends Father {
    void show1() {  // ❌ Error: cannot override final method
        System.out.println("Trying to override");
    }
}

public class finalkeyworddemo {

	final int x = 10;
	x = 20;  // ❌ Error: cannot assign a value to final variable


}
