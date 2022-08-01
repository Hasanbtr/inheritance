
public class logManager {
	public void Log(int logType) {
		if(logType==1) {
			System.out.println("Veritababınna Eklendi");
		}
		else if(logType==2) {
			System.out.println("Dosyaya Loglandı");
		}
		else {
			System.out.println("Email Gönderildi");
		}
	}
}
