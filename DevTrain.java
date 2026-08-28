interface Developer {
    void writecode();
}
interface Trainer {
    void testcode();
}
class TechnicalEmployee implements Developer, Trainer {
    public void writecode() {
        System.out.println("Code written");
    }
    public void testcode() {
        System.out.println("Code tested");
    }
}
public class DevTrain{
    public static void main(String[] args) {
        TechnicalEmployee te = new TechnicalEmployee();
        te.writecode();
        te.testcode();
    }
}
