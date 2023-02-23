public class GraphObserver implements Observer{
    @Override
    public void update(NumberGenerator generator) {
        System.out.println("GraphObserver: ");
        int temp = generator.getNumber();
        for (int i = 0; i < temp; i++) {
            System.out.print("*");
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
