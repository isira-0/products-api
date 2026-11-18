package uk.ac.westminster.products_api;

public class DigitalProduct extends Product{
    private String downloadUrl;
    private double fileSize;

    public DigitalProduct() {}

    public DigitalProduct(Long id, String name, double price, String downloadUrl, double filesize) {
        super(id,name,price);
        this.downloadUrl = downloadUrl;
        this.fileSize = filesize;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }
}
