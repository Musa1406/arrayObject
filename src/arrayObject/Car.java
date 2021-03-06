package arrayObject;

public class Car {
 private String caption;
 private double price;
 private CarModel carModel;
 private CarColor carColor;
public Car() {
	super();
}
public Car(String caption, double price) {
	super();
	this.caption = caption;
	this.price = price;
}
public Car(String caption, double price, CarModel carModel) {
	super();
	this.caption = caption;
	this.price = price;
	this.carModel = carModel;
}
public Car(String caption, double price, CarModel carModel, CarColor carColor) {
	super();
	this.caption = caption;
	this.price = price;
	this.carModel = carModel;
	this.carColor = carColor;
}
public String getCaption() {
	return caption;
}
public void setCaption(String caption) {
	this.caption = caption;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public CarModel getCarModel() {
	return carModel;
}
public void setCarModel(CarModel carModel) {
	this.carModel = carModel;
}
public CarColor getCarColor() {
	return carColor;
}
public void setCarColor(CarColor carColor) {
	this.carColor = carColor;
}


}
