package uk.ac.westminster.products_api;

public class DigitalProduct extends Product implements Discountable {
    private String downloadUrl;
    private double fileSize;
    private double discountedPrice;

    @Override
    public void applyDiscount(double rate) {
        discountedPrice = getPrice() * (1 - rate);
    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }

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

    @Override
    public String getSummary() {
        return "Digital: " + getName() + " | Download: " + downloadUrl;
    }
}
