package arrayObject;

public class CarColor {
       private String colorType;
       private String color;
	public CarColor() {
		super();
	}
	public CarColor(String colorType, String color) {
		super();
		this.colorType = colorType;
		this.color = color;
	}
	public String getColorType() {
		return colorType;
	}
	public void setColorType(String colorType) {
		this.colorType = colorType;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
