public class CarParkIterator implements Iterator{

    private CarPark carPark;
    private int index;

    public CarParkIterator(CarPark carPark){
        this.carPark = carPark;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if(index < carPark.getLength()){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Object next() {
        Car car = carPark.getCar(index);
        index++;
        return car;
    }
}
