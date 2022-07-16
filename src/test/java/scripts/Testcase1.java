package scripts;

import org.testng.annotations.Test;

import PomPages.AddtocartPage;
import PomPages.SkillraryDemologinPage;
import PomPages.Skillraryloginpage;
import genericLib.BaseClass;

public class Testcase1 extends BaseClass{

	@Test
	public void tc1() {
		Skillraryloginpage s =new  Skillraryloginpage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		
		SkillraryDemologinPage sd=new SkillraryDemologinPage(driver);
		driverutilities.switchtabs(driver);
		driverutilities.mouseHover(driver, sd.getCoursebtn());
		sd.seleniumtrainingtab();
		
		AddtocartPage a=new AddtocartPage(driver);
		driverutilities.doubleclick(driver,a.getAddbtn());
		a.addtocartbtn();
		driverutilities.alertpopup(driver);
	}
}
