package composite;

//Dit is de component interface voor het composite patroon
public interface FileSystemItem {
    int getSize();
    void print(String indent);
}
