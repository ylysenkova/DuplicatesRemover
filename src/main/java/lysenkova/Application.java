package lysenkova;


public class Application {

    public static void main(String[] args) {
        String dirty = "AABBCCD112233";
        DuplicatesRemover remover = new DuplicatesRemover();
        remover.remove(dirty);
    }
}
