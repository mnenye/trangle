public class trangle_class {
    public double someMethod(int a, int b, int c) throws my_exception {
        int p = (a + b + c) / 2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return s;
    }
}
