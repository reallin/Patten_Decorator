package com.lxj.decoraor;

public class DataInputStream implements FilterInputStream {

	InputStream in;
	public DataInputStream(InputStream in){
		this.in = in;
	}
	@Override
	public void read() {
		// TODO Auto-generated method stub
		in.read();
		System.out.println("BufferedInputSteam read");
	}

}
