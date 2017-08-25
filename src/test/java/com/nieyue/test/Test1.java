package com.nieyue.test;

import java.util.Optional;

import com.nieyue.util.MyDESutil;

public class Test1 {
public static void main(String[] args) {
	System.out.println(MyDESutil.getMD5(1000));
	
	optional();
	System.out.println(Optional.ofNullable(0).isPresent());
}

public static void optional(){
	Test1 java8Tester = new Test1();
    Integer value1 = null;
    Integer value2 = new Integer(10);
      
    // Optional.ofNullable - 允许传递为 null 参数
    Optional<Integer> a = Optional.ofNullable(value1);
      
    // Optional.of - 如果传递的参数是 null，抛出异常 NullPointerException
    Optional<Integer> b = Optional.of(value2);
    System.out.println(java8Tester.sum(a,b));
 }
  
 public Integer sum(Optional<Integer> a, Optional<Integer> b){
  
    // Optional.isPresent - 判断值是否存在
      
    System.out.println("第一个参数值存在: " + a.isPresent());
    System.out.println("第二个参数值存在: " + b.isPresent());
      
    // Optional.orElse - 如果值存在，返回它，否则返回默认值
    Integer value1 = a.orElse(new Integer(0));
      
    //Optional.get - 获取值，值需要存在
    Integer value2 = b.get();
    return value1 + value2;
}
}
