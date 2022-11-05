public class StringDisplay extends AbstractDisplay{

    private String str;

    public StringDisplay(String str){
        this.str = str;
    }
    @Override
    public void open() {
        int len = str.length();
        for (int i = 0; i < len + 2; i++) {
            System.out.print(">");
        }
        System.out.print("\n");
    }

    @Override
    public void print() {
        System.out.println("|" + str + "|");
    }

    @Override
    public void close() {
        int len = str.length();
        for (int i = 0; i < len + 2; i++) {
            System.out.print("<");
        }
        System.out.print("\n");
    }
}
