package arrayObject;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Car> cars= new ArrayList<Car>();
        ArrayList<CarModel> carModels=new ArrayList<CarModel>();
        
        ArrayList<CarColor> carColors=new ArrayList<CarColor>();
        carColors.add(new CarColor("Metalik","Siyah"));
        carColors.add(new CarColor("Metalik","Mavi"));
        carColors.add(new CarColor("Mat","Kýrmýzý"));
        carColors.add(new CarColor("Mat","Siyah"));
        carColors.add(new CarColor("Parlak","Kýrmýzý"));
        
        carModels.add(new CarModel("ford","focus"));
        carModels.add(new CarModel("renault","Megane"));
        carModels.add(new CarModel("Volkswagen","Bora"));
        carModels.add(new CarModel("Audi","SQ5"));
        
        cars.add(new Car("Focus Cmax 2018",245000));
        cars.add(new Car("Megan 4",154000));
        cars.add(new Car("Bora",114000));
        cars.add(new Car("Megan 2",64000));
        cars.add(new Car("SQ5",154000));
        System.out.println(cars.get(0).getCaption());
        System.out.println(cars.get(1).getCaption());
        for(Car car:cars) {
        	System.out.println(car.getCaption()+" Fiyat :"+car.getPrice());        
        }	
        for(CarModel carModel:carModels) {
        	System.out.println(carModel.getBrand()+" Model :"+carModel.getModel());
        }
        for(CarColor carColor:carColors) {
        	System.out.println(carColor.getColorType()+" "+carColor.getColor());
        }
        cars.get(0).setCarModel(carModels.get(0));
        cars.get(1).setCarModel(carModels.get(1));
        cars.get(2).setCarModel(carModels.get(1));
        
        cars.get(2).setCarColor(carColors.get(3));
        System.out.println(cars.get(2).getCaption()+"->"
        +cars.get(2).getCarModel().getBrand()+"->"+cars.get(2).getCarColor().getColorType()+
        " "+cars.get(2).getCarColor().getColor());
	}
}
