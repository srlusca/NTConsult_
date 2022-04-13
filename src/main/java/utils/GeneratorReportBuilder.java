package utils;

import com.rajatthareja.reportbuilder.Color;
import com.rajatthareja.reportbuilder.ReportBuilder;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GeneratorReportBuilder {

    public static void main(String... args) throws Exception {
        // Create ReportBuilder Object
        ReportBuilder reportBuilder = new ReportBuilder();

        // Set output Report Dir
        reportBuilder.setReportDirectory("target/");

        // Set output report file name
        reportBuilder.setReportFileName("NTConsult_results");

        // Set Report Title
        reportBuilder.setReportTitle("NTConsult");

        // Set Report Color for more visit http://materializecss.com/color.html
        reportBuilder.setReportColor(Color.INDIGO);

        // Add additional info for Report
        reportBuilder.setAdditionalInfo("Environment", "localhost");

        // Create list or report Files or Directories or URLs or JSONObject or JSONString
        List<Object> cucumberJsonReports = new ArrayList<>();
        cucumberJsonReports.add(new File("target/cucumber-reports/CucumberTestReport.json"));

        // Build your report
        reportBuilder.build(cucumberJsonReports);
    }
}
