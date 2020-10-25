package shiyansan;


public class Course {
	


	String number;  //编号
	String coursename;  //课名
	String place;   //地点
	String time;    //上课时间
	Teacher t;       //授课老师
	Course(String number ,String coursename,String place,String time,Teacher t){
		this.number = number;
		this.coursename = coursename;
		this.place = place;
		this.time = time;
		this.t = t;
	}
	public String toString() {
		return "\n"+"编号："+number+"  课名："+coursename+"  上课地点："+place+"  时间："+time+"\n"+"授课教师："+t;
	}
		
	

}
