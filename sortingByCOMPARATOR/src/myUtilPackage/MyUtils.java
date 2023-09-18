package myUtilPackage;

import java.util.ArrayList;

public class MyUtils {
//generic method
	public static<T> void iterateList(ArrayList<T> AnyList) {
		for (T temp : AnyList) {
			System.out.println(temp);

		}
	}


	}

