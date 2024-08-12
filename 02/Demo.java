class Computer {
    public void playMusic() {
        System.out.println("Playing Music.....");
    }

    public String getMeAPen(int cost) {
        if (cost >= 10)
            return "pen";

        return "Nothing";

    }
}

public class Demo {

    public static void main(String[] args) {

        Computer obj = new Computer();

        obj.playMusic();
        String str = obj.getMeAPen(11);
        System.out.println(str);
    }

}
