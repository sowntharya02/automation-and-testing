package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class task2_d7 {
	int a=100;
	int b=100;
  @Test(priority = 1)
  public void add() {
	  int sum=a+b;
	  Assert.assertEquals(sum, 200);
  }
  @Test(priority = 2)
  public void sub() {
	  int min=a-b;
	  Assert.assertEquals(min,0);
  }
  @Test(priority = 3)
  public void mul() {
	  int mul=a*b;
	  Assert.assertEquals(mul, 10000);
  }
  @Test(priority = 4)
  public void div() {
	  int div=a/b;
	  Assert.assertEquals(div,1);
  }
}
