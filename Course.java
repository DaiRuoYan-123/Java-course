package shiyansan;


public class Course {
	


	String number;  //���
	String coursename;  //����
	String place;   //�ص�
	String time;    //�Ͽ�ʱ��
	Teacher t;       //�ڿ���ʦ
	Course(String number ,String coursename,String place,String time,Teacher t){
		this.number = number;
		this.coursename = coursename;
		this.place = place;
		this.time = time;
		this.t = t;
	}
	public String toString() {
		return "\n"+"��ţ�"+number+"  ������"+coursename+"  �Ͽεص㣺"+place+"  ʱ�䣺"+time+"\n"+"�ڿν�ʦ��"+t;
	}
		
	

}
