package shiyansan;

public class Teacher extends people {
	String acourse;
	Teacher (String number ,String name,String sex,String yuan,String acourse){
		super(number,name,sex,yuan);
		this.acourse = acourse;
		
		}
	public String toString() {
		return "\n"+"编号："+number+"  姓名："+name+"  性别："+sex+"  院系："+yuan+"  所授课程："+acourse;
		}
	}
