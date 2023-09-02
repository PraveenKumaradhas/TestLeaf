
public class Automation extends MultipleLangauge implements TestTool,Language {

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Ruby from running from Concrete Class which is in Interface");
	}
	public static void main(String[] args) {
		 Automation auto = new Automation();
		 auto.Selenium();
		 auto.Java();
		 auto.ruby();
		 auto.python();
	}
	@Override
	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("Java from running from Concrete Class which is in Interface");
	}
	@Override
	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Seleniumn from running from Concrete Class which is in Interface");
	}

}
