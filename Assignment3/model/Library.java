package corejava.collection.assignment02.Assignment3.model;

public class Library {
    private String productName;
    private String libraryName;
    private Integer version;
    public Library(String productName, String libraryName, Integer version) {
        this.productName = productName;
        this.libraryName = libraryName;
        this.version = version;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getLibraryName() {
        return libraryName;
    }
    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }
    public Integer getVersion() {
        return version;
    }
    public void setVersion(Integer version) {
        this.version = version;
    }
    @Override
    public String toString() {
        return java.text.MessageFormat.format("productName: {0}\t libraryName: {1}\t version: {2}\n", productName, libraryName,
                version);
    }
}
