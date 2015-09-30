package edu.cpp.cs240;

import java.util.Arrays;

public class Test {

	static int[] findUniqueElements(int[] a) {
	    boolean repeats = true;
	        int count = a.length;
	        for(int i = 0; i < a.length; i++){
	            for(int j = 0; j < a.length; j++)
	                {
	                if(i != j)
	                    {
	                    if(a[i] == a[j])
	                        count--;
	                }
	            }

	        }
	        int[] ue = new int[count];
	           int count2 = 0;
	                for(int i = 0; i < a.length; i++){
	            for(int j = 0; j < a.length; j++)
	                {
	                if(i != j)
	                    {
	                    if(a[i] == a[j])
	                        {
	                        repeats = false;

	                    }

	                }
	            }
	            if(repeats)
	                {
	                ue[count2] = a[i];
	                count2++;
	            }
	                    repeats = true;
	        }
	        return ue;
	    }

	public static void main(String[] args) {
		int[] res= findUniqueElements(new int[]{1,1,1,3,3});
		System.out.println(Arrays.toString(res));

	}

}
