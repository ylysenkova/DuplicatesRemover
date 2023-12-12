package lysenkova;

import java.util.*;

public class DuplicatesRemover {

    public String remove(String dirty) {
        Set<Character> uniqueValues = new HashSet<>();
        Queue<Character> storage = new ArrayDeque<>();

        for (char el : dirty.toCharArray()) {
            boolean isAdded = uniqueValues.add(el);
            if(isAdded) {
                storage.add(el);
            }
        }
        return convert(storage);
    }

    private String convert(Queue<Character> storage) {
        StringBuilder builder = new StringBuilder();
        for (int i = storage.size()-1; i>=0; i--) {
            builder.append(storage.remove());
        }
        return builder.toString();
    }
}
