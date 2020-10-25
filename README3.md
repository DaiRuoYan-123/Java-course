# 计191戴若妍2019311217

### 学生选课模拟系统

## 实验目的

（1）初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；

（2）掌握面向对象的类设计方法（属性、方法）；

（3）掌握类的继承用法，通过构造方法实例化对象；

（4）学会使用super()，用于实例化子类；

（5）掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。

## 实验要求

（1）编写上述实体类以及测试主类（注意类之间继承关系的适用）

（2）在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师 等）；模拟学生退课操作，再打印课程信息。

（3）编写实验报告。

## 实验过程

1.先创建父类people类，编写出编号，姓名，性别，所在院系等信息；

2.创建student类，teacher类作为people类的子类，运用extends people继承父类信息；

3.用super(number,name,sex,yuan)，实例化子类；

4.用this关键字给每一个变量传递它们的值

5.用public String toString()返回该对象的字符串表示，输出信息；

6.运用Scanner console=new Scanner(System.in)表示从标准输入设备（一般是键盘）中读取数据

7.用while（），if（）进行循环和选择，实现选课，退课，查询等要求；

8.最后打印输出所要的结果。

## 流程图

![a](https://github.com/DaiRuoYan-123/Java-course/blob/main/%E5%AD%A6%E7%94%9F%E9%80%89%E8%AF%BE%E6%B5%81%E7%A8%8B%E5%9B%BE.jpg)

## 核心代码

1.运用extends 继承父类信息,运用super（）实例化子类

```
public class student extends people {
	Course incourse;
	student (String number ,String name,String sex,String yuan,Course incourse ){
		super(number,name,sex,yuan);
		this.incourse = incourse;
		
	}
```

2. 运用Object根类的toString（）方法,应用在相关对象的信息输出中
	
```  		
	public String toString() {
		return "编号："+number+"  姓名："+name+"  性别："+sex+"  院系"+yuan+"  所选课程："+incourse;
	}
```
3.用Scanner方法从标准输入设备（一般是键盘）中读取数据
```
import java.util.Scanner;
```
```
Scanner console=new Scanner(System.in); //从标准输入设备（一般是键盘）中读取数据
```
4.运用while（）和if（）进行循环和判断

			while(1==1){
				System.out.println("1 请选择操作并输入操作代号：”2“,”3“,”4“");
				System.out.println("2 选课");
				System.out.println("3 退课");
				System.out.println("4 个人课程信息查询");
				System.out.println("**********************分割线***********************");
		
				number=console.nextInt();
				if (number<=0 || number>=5)
					do {
						System.out.println("请输入1到3之间的整数");
						number=console.nextInt();
					}while(number<=0 || number >4);
          
## 系统运行截图

![a](


