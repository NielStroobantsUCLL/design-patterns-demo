package composite;

import java.util.ArrayList;
import java.util.List;

//Composite class die mappen voorstelt
public class Folder implements FileSystemItem{
    private final String name;
    private final List<FileSystemItem> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystemItem item) {
        children.add(item);
    }

    @Override
    public int getSize() {
        //Composite: som van alles wat er in zit, in de map.
        return children.stream().mapToInt(FileSystemItem::getSize).sum();
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "+ " + name + " ( " + getSize() + " KB )");
        for (FileSystemItem item : children) {
            item.print(indent + "   ");
        }
    }
}
