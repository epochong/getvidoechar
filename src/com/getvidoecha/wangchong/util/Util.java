package com.getvidoecha.wangchong.util;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Util {

	public static void main(String[] args) {
		String srcPath = "F:\\Program\\Java\\eclipse\\source/big.jpg";
		String aimPath = "F:\\Program\\Java\\eclipse\\source/big_after.jpg";
	//定义内存中的图片
		BufferedImage bufferedSrc = null;
		BufferedImage bufferedAim = null;
		Font font= new Font("微软雅黑", 2,9); 
		//设置放大的倍数
		int B =10;
		//定义字符串梦梦梦梦梦梦梦梦梦梦梦梦梦梦梦梦梦梦梦梦梦梦梦梦梦梦梦
		//有美人兮见之不忘日日不见兮思之如狂执子之手与子偕老你   朋朋朋朋朋朋朋朋朋朋朋朋朋朋朋朋朋朋朋朋朋朋朋朋朋朋  嘉嘉嘉嘉嘉嘉嘉嘉嘉嘉嘉嘉嘉嘉嘉嘉嘉嘉嘉嘉嘉嘉嘉嘉嘉
		//■■■■■■■■■■■■■■■■■■■■■■■■■
		String ss ="美美美美美美美美美美美美美美美美美美美美美美美美美美";
		//分割成数组
		String[] s = ss.split("");
		int len = s.length;
		System.out.println(len);
			try {
				bufferedSrc = ImageIO.read(new File(srcPath));
				int width = bufferedSrc.getWidth();
		    	int height = bufferedSrc.getHeight();
		    	int widthN = width*B;
		    	int heightN = height*B;
			    bufferedAim = new BufferedImage(widthN, heightN, 1);
			    //获取目标画笔
			    Graphics2D gg = bufferedAim.createGraphics();
			    gg.setFont(font);
			    gg.setBackground(Color.white);
			    gg.fillRect(0,0,width*B,height*B);
			    int r=0;
			    int g=0;
			    int b=0;
	            gg.setColor(new Color(0,0,0));	
			    int color = 0;
//			    gg.setColor(Color.red);
			    for (int i = 0; i < width; i++) {
					for (int j = 0; j < height; j++) {
					color = bufferedSrc.getRGB(i, j);
//					System.out.println(color);
//					bufferedAim.setRGB(i, j, color);
					r = (color&0xff0000)>>16;
					g = (color&0xff00)>>8;
					b = color&0xff;
					color = (int)(r*0.3+g*0.59+b*0.11);
//					System.out.print(color);
					gg.setColor(new Color(r,g,b));	
//					gg.setColor(new Color(color,color,color));	
				  //  gg.drawString(s[color/10], i*B, j*B);
				    gg.drawString(s[color/20], i*B, j*B);
						
					}
				}
			    ImageIO.write(bufferedAim, "jpg", new File(aimPath));
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			//获取原始图片大小
	}
}
