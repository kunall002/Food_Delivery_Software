package in.kunal.foodiesapi.service;

import in.kunal.foodiesapi.io.CartRequest;
import in.kunal.foodiesapi.io.CartResponse;

public interface CartService {

    CartResponse addToCart(CartRequest request);

    CartResponse getCart();

    void clearCart();

    CartResponse removeFromCart(CartRequest cartRequest);
}
