package Lesson16;
public class homework {
	
	public static void main(String[] args) {
		String mail = "Bek@mail.ru; Kadessov@gmail.com; KB@yahoo.com;";
		check c = new check();
		c.email(mail);
	}
}
class check{
	public void email(String a){
		int start = 0;
		do {
			a = a.substring(start);
			System.out.println(a.substring((a.indexOf('@')+1),a.indexOf('.')));
			start = a.indexOf(';') + 2;

		}
			while (start < a.length());
		}
	}

