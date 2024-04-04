class MultifunctionalFlashlight implements BrightnessAdjustable, ColorfulFlashlight {
    private int brightnessLevel;
	private boolean isOn;
    private String color;

    public void turnOn() {
		isOn=true;
		brightnessLevel=MAX_BRIGHTNESS_LEVEL;
        System.out.println("Фонарик включен");
    }

    public void turnOff() {
		isOn=false;
		brightnessLevel=0;
        System.out.println("Фонарик выключен");
    }

    public void setBrightness(int level) {
		if (level==0)
			this.turnOff();
		else if (level>MAX_BRIGHTNESS_LEVEL){
			brightnessLevel = MAX_BRIGHTNESS_LEVEL;
			System.out.println("Уровень яркости" + brightnessLevel);}
		else{
		if (brightnessLevel==0 && level!=0)
			isOn=true;
        brightnessLevel = level;
        System.out.println("Уровень яркости" + brightnessLevel);}
    }
	
	public int getBrightness() {
        return brightnessLevel;
    }
	
	public void reduceBrightness() {
		if (brightnessLevel>0)
			brightnessLevel--;
		else{
			this.turnOff();}
    }
	
	public void increaseBrightness() {
    if (brightnessLevel < MAX_BRIGHTNESS_LEVEL) {
        if (brightnessLevel == 0)
            isOn = true;
        brightnessLevel++;
    } else {
        System.out.println("Фонарик уже на максимальном уровне яркости");
    }
}

    public void setColor(String color) {
        this.color = color;
        System.out.println("Цвет: " + color);
    }

    public String getColor() {
        return color;
    }
    
	public boolean isOn() {
        return isOn;
    }

    public boolean isOff() {
        return !isOn;
    }
}

