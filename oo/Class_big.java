package oo;
import java.io.*;
public class Class_big{
   // 这个实例变量对子类可见
   public String name;
    int a;
   // 私有变量，仅在该类可见
   private double salary ;
   //在构造器中对name赋值
   public Class_big (String empName){
      name = empName;
   }
   //设定salary的值
   public void setSalary(double empSal){
      salary = empSal;
   }  
   // 打印信息
   public void printEmp(){
      System.out.println("名字 : " + name );
      System.out.println("薪水 : " + salary);
   }
 
   public static void main(String[] args){
      Class_big empOne = new Class_big("RUNOOB");
      empOne.setSalary(1000.0);
      empOne.printEmp();
   }
}