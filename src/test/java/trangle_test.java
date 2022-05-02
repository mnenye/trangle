import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class trangle_test {

    @Test
    void test() throws my_exception {
        trangle_class exampleClass = new trangle_class();
        Assertions.assertEquals(40,exampleClass.someMethod(10,20, 10));
        Assertions.assertThrows(my_exception.class,()-> exampleClass.someMethod(-10,20, -10));
    }

    @ParameterizedTest
    @CsvSource({ "10,20,30","100, 200,300","1,2,3"})
    void testWithCsvSource(int a, int b, int result, int c) throws my_exception {
        trangle_class exampleClass = new trangle_class();
        Assertions.assertEquals(result,exampleClass.someMethod(a,b,c));

    }

    @ParameterizedTest
    @CsvSource({ "-10,20, 3","-100, 200, 3","1,-2, 3"})
    void testWithCsvSourceN(int a, int b, int c) throws my_exception {
        trangle_class exampleClass = new trangle_class();
        Assertions.assertThrows(my_exception.class,()-> exampleClass.someMethod(a,b,c));

    }
}
