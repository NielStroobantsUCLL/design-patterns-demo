package template.hookreportgenerator;

public class TemplateDemo {
    public static void main(String[] args) {

        ReportGenerator consoleReport = new ConsoleReport();
        consoleReport.generateReport();

        System.out.println();

        ReportGenerator pdfReport = new PdfReport();
        pdfReport.generateReport();
    }
}
