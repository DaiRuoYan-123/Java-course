package shiyansan;
import java.util.Scanner;

public class Test {
	public static void main(String ards[]) {
		Teacher teacher1 = new Teacher("01","李明", "女","数理系", "高等数学");
		Teacher teacher2 = new Teacher("02", "崔王", "男", "英语系","大学英语读写译");
		Teacher teacher3 = new Teacher("03", "孙梅", "女", "体育系","大学体育");
		Course a = new Course("101","高等数学","教101","13:00~15:00",teacher1);
		Course b = new Course("102","大物","教201","14:00~15:00",teacher2);
		Course c = new Course("103","体育","操场","13:30~15:00",teacher3);
		Scanner console=new Scanner(System.in); //从标准输入设备（一般是键盘）中读取数据
		System.out.println("欢迎来到选课系统!");
		System.out.println("*********************************************");
		System.out.println("选课信息：");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("*********************************************");
		int number;
		int number1;
		String name;
		Course course = null;
		while(1==1) {
	
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
				
				if(number == 2){
					System.out.println("请输入所选课程编号：");
					number1=console.nextInt();
					if(number1==101) {
						course = a;}
					if(number1==102) {
						course = b;}
					if(number1==103) {
						course = c;}
					if(number1<101||number1>103){
						 System.out.println("该课程不存在");
					 }//选择课程
					System.out.println("你已经成功选择了该课程:"+"\n"+course);
					System.out.println("*********************************************");
					System.out.println("你现在的个人课程信息为：");
					student m = new student("20115", "马士大夫", "男","计算机" ,course);
					System.out.println("学生个人信息："+m);
					System.out.println("*********************************************");
					break;
					}
				if (number == 3) {
					System.out.println("欢迎进入退课系统！");
					System.out.println("*********************************************");
					System.out.println("你的课程列表信息为：");
					student m = new student("20115", "马士大夫", "男","计算机" ,course);
					System.out.println(m);
					System.out.println("*********************************************");
					System.out.println("你所退的课程为："+course);
					student m2 = new student("20115", "马士大夫", "男","计算机" ,null);
					System.out.println("*********************************************");
					System.out.println("你现在的课程列表信息为");
					System.out.println(m2);
					
					break; 
					
					}
		
				if(number==4) {
					student m = new student("20115", "马士大夫", "男","计算机" ,course);
					System.out.println("学生个人信息："+m);
					System.out.println("欢迎使用学生选课系统！");
					System.out.println("*********************************************");
					break;
				}
			}
		}
		}
}

