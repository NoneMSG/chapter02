package chapter_02;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	
	TV(){
		this.channel=7;
		this.volume=20;
		this.power=true;
		}
	TV(int channel, int volume, boolean power){
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	public int getChannel(){
		return this.channel;
	}
	public int getVolume(){
		return this.volume;
	}
	public boolean isPower(){
		return this.power;
	}
	public void status(){
		String temp="";
		if(this.power==true){
			temp="켜짐";
		}else{
			temp="꺼짐";
		}
		System.out.println("채널  :"+this.channel+" 볼륨: "+this.volume+" 전원: "+temp);
	}
	public void channel(int value){
		if(value>255){
			value =1;
		}else if(value <1){
			value =255;
		}
		this.channel = value;
	}
	public void channel(boolean flag){
		
		if(flag == true){
			this.channel++;
		}else{
			this.channel--;
		}
		if(this.channel>255){
			this.channel=1;
		}else if(this.channel==0){
			this.channel=255;
		}
	}
	public void volume(int value){
		if(value>100){
			value =100;
		}else if(value <1){
			value =0;
		}
		this.volume=value;
	}
	public void volume(boolean flag){
		if(flag==true){
			this.volume++;
		}else{
			this.volume--;
		}
		if(this.volume>100){
			this.volume =100;
		}else if(this.volume <1){
			this.volume =0;
		}
	}
	public boolean power(){
		return this.power;
	}
	public void power(boolean flag){
		if(flag==true){
			this.power=true;
		}else{
			this.power=false;
		}
	}
}
