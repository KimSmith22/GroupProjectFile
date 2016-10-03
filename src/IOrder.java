import java.util.Collection;

public interface IOrder {
	boolean addProduct(ProductManager p);
	boolean removeProduct(String name) throws ProductNotFoundException;
	Collection<ProductManager> getCartDetails();
	ProductManager getProductFromCart(String name) throws ProductNotFoundException;
	int productCount();
  double getCartPrice();
}
