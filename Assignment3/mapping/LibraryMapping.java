package corejava.collection.assignment02.Assignment3.mapping;

import corejava.collection.assignment02.Assignment3.model.Library;

public class LibraryMapping {
    public static Library map(String data) {
        String[] splitArray = data.split(",");
        try {
            String productName=splitArray[0];
            String libraryName = splitArray[1];
            Integer version = Integer.parseInt(splitArray[2]);

            Library library = new Library(productName,libraryName,version);
            return library;
        } catch (NumberFormatException n) {
            throw new RuntimeException(n);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
