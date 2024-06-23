import java.util.*;

class Student {
    int id;
    String firstName;
    String lastName;
    String geneder;

    // initialization constructor level(using constractor)
    public Student(int id,
            String firstName,
            String lastName,
            String geneder) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.geneder = geneder;
    }
}

/**
 * Product
 */
class Product {
    float price;
    String productName;
    String quantity;

    public Product(float price,
            String productName,
            String quantity) {
        this.price = price;
        this.productName = productName;
        this.quantity = quantity;
    }
}

public class FilterWithoutStreamJ8 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student(1, "Motuma", "Gishu", "M"));
        studentList.add(new Student(2, "Mama", "NANA", "F"));
        studentList.add(new Student(3, "Sena", "Temesgen", "F"));
        // To filter with Id only
        List<Integer> studentIdList = new ArrayList<Integer>();
        // To get all the firstName
        List<String> firstNameList = new ArrayList<String>();
        for (Student student : studentList) {
            studentIdList.add(student.id);
            firstNameList.add(student.firstName);
        }
        System.out.println("List of Student ID are: " + studentIdList);
        System.out.println("List of firstNameList are: " + firstNameList);

        // Now add to priceList where the products are lessthan 500
        List<Product> productsList = new ArrayList<Product>();
        productsList.add(new Product(400, "Tomato", "5"));
        productsList.add(new Product(400, "Mango", "9"));
        productsList.add(new Product(400, "Papaya", "2"));
        productsList.add(new Product(600, "Omega", "7"));
        productsList.add(new Product(400, "Logu", "1"));
        List<Float> priceList = new ArrayList<Float>();
        for (Product product : productsList) {
            if (product.price < 500) {
                priceList.add(product.price);
            }

        }
        // System.out.println("Product segment");
        System.out.println("List of Prices are: " + priceList);

    }
}
