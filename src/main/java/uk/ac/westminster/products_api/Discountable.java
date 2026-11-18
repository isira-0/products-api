package uk.ac.westminster.products_api;

public interface Discountable {
    public void applyDiscount (double rate);
    double getDiscountedPrice();
}
