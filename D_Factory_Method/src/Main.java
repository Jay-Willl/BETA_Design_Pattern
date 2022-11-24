import com.framework.Factory;
import com.framework.Product;
import com.id.ID;
import com.id.IDFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDFactory();
        Product id1 = factory.createProduct("1");
        Product id2 = factory.createProduct("2");
        Product id3 = factory.createProduct("3");
        id1.use();
        id2.use();
        id3.use();

    }
}