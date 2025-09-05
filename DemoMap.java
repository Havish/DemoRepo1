import java.util.HashMap;

public class DempMap{
    
    Map<Integer, Converter> map = new HashMap<>();

    public static void main(String[] args) {
        DemoMap obj = new DempMap();
        obj.map.put(1, new Converter("walmart", "US"));
    }
}