abstract class MapTest {
    public static void main(String[] args) {
        Maping<String, String> maping = new Maping<>();
        System.out.println(maping.createMap());
        System.out.println(maping.getSameFirstNameCount());
    }
}
