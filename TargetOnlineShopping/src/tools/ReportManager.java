package tools;


import com.relevantcodes.extentreports.ExtentReports;

public class ReportManager {
	static final ExtentReports extent = ExtentReports.get(ReportManager.class);
	static final String FilePath=null;
	public static ExtentReports getReporter(String string) {
		 extent.init(string, true);
		 extent.config().reportHeadline("My custom report summary.");
		  extent.config().setImageSize("30%");
		// TODO Auto-generated method stub
		return extent;
	}

	public static ExtentReports getReports() {
		return null;
		
	}

	
}
