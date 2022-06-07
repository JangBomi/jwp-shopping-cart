package woowacourse.shoppingcart.domain;

public class Cart {

    private static final int MIN_QUANTITY = 1;

    private Long id;
    private Long productId;
    private String name;
    private int price;
    private String imageUrl;
    private int quantity;

    public Cart() {
    }

    public Cart(final Long id, final Product product) {
        this(id, product.getId(), product.getName(), product.getPrice(), product.getImageUrl(), MIN_QUANTITY);
    }

    public Cart(Product product, int quantity) {
        this(null, product.getId(), product.getName(), product.getPrice(), product.getImageUrl(), quantity);
    }

    public Cart(final Long id, final Long productId, final String name, final int price, final String imageUrl, final int quantity) {
        this.id = id;
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.imageUrl = imageUrl;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public Long getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public int getQuantity() {
        return quantity;
    }
}
