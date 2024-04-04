interface BrightnessAdjustable extends Flashlight {
	public int MAX_BRIGHTNESS_LEVEL=3;
    void setBrightness(int level);
	public int getBrightness();
    public void reduceBrightness(); 
	public void increaseBrightness();
	
}