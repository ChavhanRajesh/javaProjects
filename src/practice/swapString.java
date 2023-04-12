package practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class swapString {
	public static void main(String[] args) {
		String s="i am in tesyantra";
		String split[]=s.split(" ");
		String temp=split[0];
		split[split.length-1]=temp;
		System.out.println(Arrays.toString(split));
	}

}
