package l11_P4;

public class Lamb {
    private static int count = 0;

    private String name;
    private Lamb (String name){
        this.name = name;
        count++;
    }

    public static Lamb createLamb(String name){
        if (name.length() >= 5)
            return new Lamb(name);
        return null;
    }

    public static String printCount(){
        return String.format("%d lamb's",count);
    }
}
