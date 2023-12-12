package lysenkova;


public class Application {

    public static void main(String[] args) {
        String dirty = "AABBCC1122";
        DuplicatesRemover remover = new DuplicatesRemover();
        remover.remove(dirty);
    }
}
