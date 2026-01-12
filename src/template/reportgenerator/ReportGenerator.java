package template.reportgenerator;

public abstract class ReportGenerator {

    // Template Method
    public final void generateReport() {
        fetchData();
        formatData();
        printReport();
    }

    //Abstract method declarations to be implemented by subclasses
    protected abstract void fetchData();
    protected abstract void formatData();
    protected abstract void printReport();

}
