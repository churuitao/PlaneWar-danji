package Marchsoft;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Boom {
	int x;
	int y;
	int life = 0;
	boolean isLive = true;
	protected Image image[] = new Image[10];

	public Boom(int x,int y,int style){
		this.x=x;
		this.y=y;
		if(style==1) {
			for(int i=0;i<9;i++) {
				image[i] = new ImageIcon("./src/Image/xiao"+i+".png").getImage();
				life++;
			}
		}else if(style==2){
			for(int i=0;i<9;i++) {
				image[i] = new ImageIcon("./src/Image/zhong"+i+".png").getImage();
				life++;
			}
		}else {
			for(int i=0;i<10;i++) {
				image[i] = new ImageIcon("./src/Image/da"+i+".png").getImage();
				life++;
			}
		}
	}
	//减少生命值
	public void lifeDown(){
		if(life>0){
			life--;
		}
		else{
			isLive = false;
		}
	}
}
