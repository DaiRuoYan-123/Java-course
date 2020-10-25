package shiyansan;




public class student extends people {
	Course incourse;
	student (String number ,String name,String sex,String yuan,Course incourse ){
		super(number,name,sex,yuan);
		this.incourse = incourse;
		
	}
		
	public String toString() {
		return "编号："+number+"  姓名："+name+"  性别："+sex+"  院系"+yuan+"  所选课程："+incourse;
	}
	
}
