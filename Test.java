package shiyansan;
import java.util.Scanner;

public class Test {
	public static void main(String ards[]) {
		Teacher teacher1 = new Teacher("01","����", "Ů","����ϵ", "�ߵ���ѧ");
		Teacher teacher2 = new Teacher("02", "����", "��", "Ӣ��ϵ","��ѧӢ���д��");
		Teacher teacher3 = new Teacher("03", "��÷", "Ů", "����ϵ","��ѧ����");
		Course a = new Course("101","�ߵ���ѧ","��101","13:00~15:00",teacher1);
		Course b = new Course("102","����","��201","14:00~15:00",teacher2);
		Course c = new Course("103","����","�ٳ�","13:30~15:00",teacher3);
		Scanner console=new Scanner(System.in); //�ӱ�׼�����豸��һ���Ǽ��̣��ж�ȡ����
		System.out.println("��ӭ����ѡ��ϵͳ!");
		System.out.println("*********************************************");
		System.out.println("ѡ����Ϣ��");
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
				System.out.println("1 ��ѡ�����������������ţ���2��,��3��,��4��");
				System.out.println("2 ѡ��");
				System.out.println("3 �˿�");
				System.out.println("4 ���˿γ���Ϣ��ѯ");
				System.out.println("**********************�ָ���***********************");
		
				number=console.nextInt();
				if (number<=0 || number>=5)
					do {
						System.out.println("������1��3֮�������");
						number=console.nextInt();
					}while(number<=0 || number >4);
				
				if(number == 2){
					System.out.println("��������ѡ�γ̱�ţ�");
					number1=console.nextInt();
					if(number1==101) {
						course = a;}
					if(number1==102) {
						course = b;}
					if(number1==103) {
						course = c;}
					if(number1<101||number1>103){
						 System.out.println("�ÿγ̲�����");
					 }//ѡ��γ�
					System.out.println("���Ѿ��ɹ�ѡ���˸ÿγ�:"+"\n"+course);
					System.out.println("*********************************************");
					System.out.println("�����ڵĸ��˿γ���ϢΪ��");
					student m = new student("20115", "��ʿ���", "��","�����" ,course);
					System.out.println("ѧ��������Ϣ��"+m);
					System.out.println("*********************************************");
					break;
					}
				if (number == 3) {
					System.out.println("��ӭ�����˿�ϵͳ��");
					System.out.println("*********************************************");
					System.out.println("��Ŀγ��б���ϢΪ��");
					student m = new student("20115", "��ʿ���", "��","�����" ,course);
					System.out.println(m);
					System.out.println("*********************************************");
					System.out.println("�����˵Ŀγ�Ϊ��"+course);
					student m2 = new student("20115", "��ʿ���", "��","�����" ,null);
					System.out.println("*********************************************");
					System.out.println("�����ڵĿγ��б���ϢΪ");
					System.out.println(m2);
					
					break; 
					
					}
		
				if(number==4) {
					student m = new student("20115", "��ʿ���", "��","�����" ,course);
					System.out.println("ѧ��������Ϣ��"+m);
					System.out.println("��ӭʹ��ѧ��ѡ��ϵͳ��");
					System.out.println("*********************************************");
					break;
				}
			}
		}
		}
}

