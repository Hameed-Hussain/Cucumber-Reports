package org.step;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {

	public static void generateJVMReport(String json) {
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\CucumberReports\\target");
		Configuration c = new Configuration(f, "Adactin Report");
		c.addClassifications("Browser", "chrome");
		c.addClassifications("platform", "windows 10");
		c.addClassifications("Sprint No", "30");
		c.addClassifications("Environment", "QA");

		List<String> li = new ArrayList<String>();
		li.add(json);
		
		ReportBuilder b = new ReportBuilder(li, c);
		b.generateReports();
	}
}
