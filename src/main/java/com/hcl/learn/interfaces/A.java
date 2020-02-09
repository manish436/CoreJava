package com.hcl.learn.interfaces;

public interface A {
   int VAL = 5;
   void foo();
   void bar();
   public static void test() {
	   
   }
   
   default void go() {
	 //Rule 9. Default method can access static methods
	   test();
   }
}