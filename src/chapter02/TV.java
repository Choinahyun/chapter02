package chapter02;

public class TV {

	private int channel;
	private int volume;
	private boolean power;
	
	public TV () {
	}
	public TV (int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public boolean isPower() {
		return power;
	}
	public void power (boolean power) {
		this.power = power;
	}
	
	public void channel (int channel) {
		if (channel >= 1 && channel <= 255) {
			this.channel = channel;
		}
		else {
			System.out.println("다시 입력해주세요.");
		}
	}
	
	public void channel (boolean channel) {
		
		if (channel == true) {
			if (this.channel == 255) {
				this.channel = 1;
			}
			else {
				this.channel++;
				}
		}
		else {
			if (this.channel == 1) {
				this.channel = 255;
			}
			else {
				this.channel--;
				}
		}
	}
	
	public void volume (int vol) {
		if (vol >= 0 && vol <= 100) {
			this.volume = vol;
		}
		else {
			System.out.println("다시 입력해주세요.");
		}
	}
	
	public void volume (boolean vol) {

		if (vol == true) {
			if (this.volume == 100) {
				this.volume = 0;
			}
			else {
				this.volume ++;
			}
		}
		else {
			if (this.volume == 0) {
				this.volume = 100;
			}
			else {
				this.volume --;
			}
		}
	}
	
	public void status () {
		System.out.println("TV power: " + (power ? "On" : "Off") 
							+ " channel: " + channel + " volume: " +volume);
	}
	
	
	
}
