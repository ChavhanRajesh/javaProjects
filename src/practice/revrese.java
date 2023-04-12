package practice;

import java.util.Scanner;

public class revrese {
	public static void main(String[] args) {
		int ans=0;
		for(int a=5674;a>0;a/=10)
		{
			int rem=a%10;
			ans= ans*10+rem;
		}
		System.out.println(ans);
	}}