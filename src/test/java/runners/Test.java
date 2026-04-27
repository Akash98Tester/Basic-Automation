package runners;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		int uniquenum = new Random().nextInt(999)+100;
		String uniquename = String.valueOf(uniquenum);
		String cucumber = "cucumber"+uniquename;
		System.out.println(cucumber);

	}

}
