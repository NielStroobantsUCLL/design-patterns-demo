package composite;

//CLient
public class Demo {
    public static void main(String[] args) {
        FileItem photo = new FileItem("photo.jpg", 1500);
        FileItem notes = new FileItem("notes.txt", 300);

        Folder docs = new Folder("Documents");
        docs.add(notes);

        Folder root = new Folder("Root");
        root.add(photo);
        root.add(docs);

        root.print("");
        System.out.println("Total size: " + root.getSize() + " KB");
    }
}
