/*
 * package resources;
 * 
 * import com.relevantcodes.extentreports.IReporter; import
 * com.relevantcodes.extentreports.Report; import
 * com.relevantcodes.extentreports.model.Test;
 * 
 * public class ExtentReporterNG implements IReporter {
 * 
 * private static final String OUTPUT_FOLDER = "test-output/"; private static
 * final String FILE_NAME = "Extent.html";
 * 
 * private ExtentReports extent;
 * 
 * @Override public void generateReport(List xmlSuites, List suites, String
 * outputDirectory) { init();
 * 
 * for (ISuite suite : suites) { Map result = suite.getResults();
 * 
 * for (ISuiteResult r : result.values()) { ITestContext context =
 * r.getTestContext();
 * 
 * buildTestNodes(context.getFailedTests(), Status.FAIL);
 * buildTestNodes(context.getSkippedTests(), Status.SKIP);
 * buildTestNodes(context.getPassedTests(), Status.PASS);
 * 
 * } }
 * 
 * for (String s : Reporter.getOutput()) { extent.setTestRunnerOutput(s); }
 * 
 * extent.flush(); }
 * 
 * @Override public void start(Report report) { // TODO Auto-generated method
 * stub
 * 
 * }
 * 
 * @Override public void stop() { // TODO Auto-generated method stub
 * 
 * }
 * 
 * @Override public void flush() { // TODO Auto-generated method stub
 * 
 * }
 * 
 * @Override public void addTest(Test test) { // TODO Auto-generated method stub
 * 
 * }
 * 
 * @Override public void setTestRunnerLogs() { // TODO Auto-generated method
 * stub
 * 
 * }
 * 
 * @Override public void start(Report report) { // TODO Auto-generated method
 * stub
 * 
 * }
 */