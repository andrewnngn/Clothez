package order.dto;

import lombok.Data;

@Data
public class OrderItemDTO {
    private String productId;

    private String productName;

    private String productPhotoUrl;

    private String color;

    private String size;

    private int quantity;
}
