package shiyansan;

public class Teacher extends people {
	String acourse;
	Teacher (String number ,String name,String sex,String yuan,String acourse){
		super(number,name,sex,yuan);
		this.acourse = acourse;
		
		}
	public String toString() {
		return "\n"+"��ţ�"+number+"  ������"+name+"  �Ա�"+sex+"  Ժϵ��"+yuan+"  ���ڿγ̣�"+acourse;
		}
	}
