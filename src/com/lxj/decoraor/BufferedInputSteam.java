package com.lxj.decoraor;

public class BufferedInputSteam implements FilterInputStream {

	InputStream in;
	public BufferedInputSteam(InputStream in){
		this.in = in;
	}
	@Override
	public void read() {
		// TODO Auto-generated method stub
		in.read();
		System.out.println("BufferedInputSteam read");
	}

}
