package composite;

// Dit is de leaf class in het composite patroon
public class FileItem implements FileSystemItem {
    private final String name;
    private final int size;

    public FileItem(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    //Indent wordt gebruikt om de hiërarchie visueel weer te geven.
    @Override
    public void print(String indent) {
        System.out.println(indent + "_ " + name + " ( " + size + " KB )");
    }
}
