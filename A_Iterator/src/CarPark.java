public class CarPark implements Aggregate{

    private Car[] cars;

    private int last = 0;

    public CarPark(int max){
        cars = new Car[max];
    }

    public Car getCar(int index){
        return cars[index];
    }

    public void addCar(Car car){
        this.cars[last] = car;
        last++;
    }

    public int getLength(){
        return last;
    }


    @Override
    public Iterator iterator() {
        return new CarParkIterator(this);
    }
}
