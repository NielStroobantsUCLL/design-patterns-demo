package template.hookreportgenerator;

//Wel logging, deze subklasse haakt in op het algoritme.
public class PdfReport extends ReportGenerator {

    @Override
    protected void fetchData() {
        System.out.println("Fetching data from database...");
    }

    @Override
    protected void formatData() {
        System.out.println("Formatting data for PDF layout...");
    }

    @Override
    protected void printReport() {
        System.out.println("Exporting report as PDF file.");
    }

    @Override
    protected boolean shouldLog() {
        return true;
    }
}
