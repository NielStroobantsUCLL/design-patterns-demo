package template.hookreportgenerator;

//Deze klasse doet niets met de hook en behoudt het standaard gedrag van de template methode.
public class ConsoleReport extends ReportGenerator {

    @Override
    protected void fetchData() {
        System.out.println("Fetching data from database...");
    }

    @Override
    protected void formatData() {
        System.out.println("Formatting data for console output...");
    }

    @Override
    protected void printReport() {
        System.out.println("Printing report to console.");
    }
}
