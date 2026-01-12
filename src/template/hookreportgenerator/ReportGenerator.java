package template.hookreportgenerator;

public abstract class ReportGenerator {

    // Template Method
    public final void generateReport() {
        fetchData();
        formatData();

        if (shouldLog()) {          // ← HOOK
            log();
        }

        printReport();
    }

    protected abstract void fetchData();
    protected abstract void formatData();
    protected abstract void printReport();

    // Hook method
    protected boolean shouldLog() {
        return false; // default gedrag
    }

    protected void log() {
        System.out.println("Logging report generation...");
    }
}
