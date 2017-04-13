import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args)
	{
		String src = "髙橋孝輔";
		int[] result = gen(src);
		for (int r : result)
		    System.out.println(Integer.toHexString(r));
			
		for (char c : decode(result))
		    System.out.print(c);
	}
	
	public static int[] gen(String s) {
		char[] cs = s.toCharArray();
		int[] res = new int[cs.length];
		int idx = 0;
		for (char c : cs)
			res[idx++] = c;
		return res;
	}
	
	public static char[] decode(int[] src) {
		char[] name = new char[src.length];
		for (int i = 0; i < src.length; i++)
			name[i] = (char)src[i];
			
		return name;
	}
}
