package Practice;

public class Singleton {

	// in OOPs, a singleton class isa a class that can have only one object or
	// instance of the class at a time.
	// How to desgin singleton class
	// 1. Constructor is always private
	// 2. Write a static method(get instance) that has return type object of
	// singleton class (Lazy initialization)

	private static Singleton singleton_instance = null;
	public String str;

	private Singleton() { // constructor

		str = "Hey i am using singleton class pattern";

	}

	public static Singleton getInstance() { // lazy initialization

		if (singleton_instance == null)

			singleton_instance = new Singleton();
		return singleton_instance;

	}

	public static void main(String[] args) {

		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();

		String s = x.str.toUpperCase();
		System.out.println(s);

		String s1 = y.str.toUpperCase();
		System.out.println(s1);

		String s2 = z.str.toUpperCase();
		System.out.println(s2);

		String s3 = s2.toLowerCase();

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
