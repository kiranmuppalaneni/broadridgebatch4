package com.broadridge.corejava;

public class OperatorsDemo {

	public static void main(String[] args) {

//		 int i = 1200;
//		 int j = 200;
		// int k = i + j; // dynamic initialization
		//
		// System.out.println(" k = " + k); // String concatenation // over loading
		//
		//// int a = 200+300;
		//
		// k = i - j ;
		// System.out.println(" k = " + k);
		//
		// k = i*j;
		// System.out.println(" k = " + k);
		//
		// k = i/j;
		// System.out.println(" k = " + k);
		//
		// // Assignment operator
		//
		// int b = 100;
		// int c = b; // One variable to other they must be of same type or higher
		//
		// int q,w,e,r,t;
		// q=w=e=r=t=10;
		//
		// int z ;
		// z=20;
		//
		//// Compound assignment operators
		//
		// int n = 100;
		//// n = n+1;
		//// n += 10; // -= , *= , /= , %=
		// n -= 10;
		//
		// System.out.println(n);
		//
		// pre/post inc/dec operators ++ , --

//		int s = 10;
		// s = s+1;
		// s += 1;

		// s++;
		// ++s; // s = s+1;
//		System.out.println(s++);
//		System.out.println(s);
		// 10++

		// double d = 10.05;
		// d++;

		// 2. Relational operators - Non boolean and gives boolean o/p

		 int o = 20;
//         int p = 30;
//         
////         System.out.println(o != p);
////         
////         3. Logical operation  group conditions - boolean  - boolean 
////                              true  && false
//         int q = 35;      //  35 > 20 && 35 < 30 
//         System.out.println( q > o &&  q < p);
		 
		 int i = 20;
		 int j = ++i; //   post - j = 20     pre-    i = i+1
//		                    i= i + 1;                 j =i
		 System.out.println(i +"  " +j);
		 
		 int a=0,b=0,c=0,d=0;
		 
           b-=c*=d+=10;
          
          System.out.println(a +"  " +b+ " "+c +" "+d);
          
          int q = 2000;
          double w= 1.5;
          double e =  q+w;
          
          
	}

}
