/* Define Product class with name, price,  and sort it price wise (use comparable interface) .
*/
package lab10;
import java.util.*;
class Product {
 String name;
 double price;
 public Product(String name, double price) {
     this.name = name;
     this.price = price;
 }
 public double getPrice() {
     return price;
 }
 @Override
 public String toString() {
     return "Product{ name:"+name+",Prize:"+price+"}";
 }
}

class ProductSortingComparator implements Comparator<Product>
{
	public int compare(Product p1,Product p2) 
	{
		return Double.compare(p1.getPrice(), p2.getPrice());
	}
}
class Que1 
{
	public static void main(String[] args) 
	{
		ArrayList products=new ArrayList<>();
		Product obj1=new Product("Laptop",900000);
		Product obj2 = new Product("Mobile Phone", 800.00);
        Product obj3 = new Product("Headphones", 150.00);
        Product obj4 = new Product("Smartwatch", 300.00);
        Product obj5 = new Product("Tablet", 500.00);
        products.add(obj1);
        products.add(obj2);
        products.add(obj3);
        products.add(obj4);
        products.add(obj5);
        System.out.println("Before Sorting:");
        for (int i=0;i<products.size();i++)
        {
            System.out.println(products.get(i));
        }
        Collections.sort(products, new ProductSortingComparator());
        System.out.println("After Sorting:");
        for (int i=0;i<products.size();i++)
        {
            System.out.println(products.get(i));
        }

	}
}
