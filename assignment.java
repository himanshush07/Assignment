import java.util.*;
import java.util.Scanner;
class assignment
{
	public static int count(String s, char c)
	{
		int res = 0;
		for (int i=0; i<s.length(); i++)
		{
			if (s.charAt(i) == c)
			res++;
		} 
		return res;
	}

	//count the occurance of the characters

	public static void main(String args[])
	{
	        String str= "Gauhati University Institite of Science and Technology";
	        char a = 'a';
		char c = 'c';
		char e = 'e';
		char g = 'g';
		char h = 'h';
		char i = 'i';
		char l = 'l';
		char n = 'n';
		char o = 'o';
		char r = 'r';
		char s = 's';
		char t = 't';
		char u = 'u';
		char v = 'v';
		char y = 'y';
		System.out.println("ROLL NO=150103018"+"\n"+"NAME=Himanshu Sarma"+"\n"+"BRANCH=CSE"+"\n"+"6th sem");	
		System.out.println("\n");	        
		System.out.println("string is = "+str);
		System.out.println("\n");
		System.out.println("number of ocurance character of this string are as follows ->");	
		System.out.println("\n");
		System.out.println("a="+count(str, a)+"\n"+"c="+count(str, c)+"\n"+"e="+count(str, e)+"\n"+"g="+count(str, g)+"\n"+"h="+count(str, h)+"\n"+"i="+count(str, i)+"\n"+"l="+count(str, l)		+"\n"+"n="+count(str, n)+"\n"+"o="+count(str, o)+"\n"+"r="+count(str, r)+"\n"+"s="+count(str, s)+"\n"+"t="+count(str, t)+"\n"+"u="+count(str, u)+"\n"+"v="+count(str, v)+"\n"+"y="+count(str, y));
	
		System.out.println("-----------------------------------------------------------");
	
		//capitalize the alternate char of a string 


		System.out.println("type the string to capitalize");
		Scanner sc=new Scanner(System.in);
		System.out.println("\n");
		String xyz=sc.nextLine();
		String[] xyz1=xyz.split(" ");
		System.out.println("capitalize string is ->");
		System.out.println("\n");
		for(String x:xyz1)
		{
			int abc=0;
			for(Character ch:x.toCharArray())
			{
				if(abc%2==0)
				System.out.print(Character.toUpperCase(ch));
				else
				System.out.print(Character.toLowerCase(ch));
				abc++;
			}
			System.out.print(" ");
		}
	}   
}

