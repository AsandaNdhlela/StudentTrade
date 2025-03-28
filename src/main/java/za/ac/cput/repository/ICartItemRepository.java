package za.ac.cput.repository;

import za.ac.cput.domain.CartItem;
import java.util.List;

public interface ICartItemRepository extends IRepository<CartItem, Integer> {
    List<CartItem> getAll();
}

