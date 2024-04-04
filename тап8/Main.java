public class Main {
    public static void main(String[] args) {
        MultifunctionalFlashlight flashlight = new MultifunctionalFlashlight();

        flashlight.turnOn();
        flashlight.setBrightness(3); 
        flashlight.setColor("Красный"); 
        System.out.println("Цвет: " + flashlight.getColor());
        flashlight.turnOff();  
		flashlight.increaseBrightness();
		System.out.println("BrightnessLevel: " + flashlight.getBrightness());
		flashlight.increaseBrightness();
		System.out.println("BrightnessLevel" + flashlight.getBrightness());
		flashlight.increaseBrightness();
		System.out.println("BrightnessLevel " + flashlight.getBrightness());
		flashlight.increaseBrightness();
		System.out.println("BrightnessLevel " + flashlight.getBrightness());
		flashlight.reduceBrightness();
		System.out.println("BrightnessLevel " + flashlight.getBrightness());
		flashlight.reduceBrightness();
		System.out.println("BrightnessLevel " + flashlight.getBrightness());
		flashlight.reduceBrightness();
		System.out.println("BrightnessLevel " + flashlight.getBrightness());
		flashlight.reduceBrightness();
		System.out.println("BrightnessLevel " + flashlight.getBrightness());
		
		
		
    }
}