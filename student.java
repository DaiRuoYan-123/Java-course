package shiyansan;




public class student extends people {
	Course incourse;
	student (String number ,String name,String sex,String yuan,Course incourse ){
		super(number,name,sex,yuan);
		this.incourse = incourse;
		
	}
		
	public String toString() {
		return "��ţ�"+number+"  ������"+name+"  �Ա�"+sex+"  Ժϵ"+yuan+"  ��ѡ�γ̣�"+incourse;
	}
	
}
