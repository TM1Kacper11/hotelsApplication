package pl.kacper.hotels_application.remote.rest.dto.response;

import java.util.List;

public class OrderStatusDto {
    private List<OrderDto> orders;

    public OrderStatusDto() {
    }

    public OrderStatusDto(List<OrderDto> orders) {
        this.orders = orders;
    }

    public List<OrderDto> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderDto> orders) {
        this.orders = orders;
    }
}
