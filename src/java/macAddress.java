package test;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

public class mac {
	public static void main(String[] args){
	        try{
	        	String result = "";
	    		InetAddress ip;
	    	
	    		try {
	    			ip = InetAddress.getLocalHost();
	    		   
	    			NetworkInterface network = NetworkInterface.getByInetAddress(ip);
	    			byte[] mac = network.getHardwareAddress();
	    		   
	    			StringBuilder sb = new StringBuilder();
	    			for (int i = 0; i < mac.length; i++) {
	    				sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
	    			}
	    			
	    			result = sb.toString();
	    		} catch (UnknownHostException e) {
	    			e.printStackTrace();
	    		} catch (SocketException e){
	    			e.printStackTrace();
	    		}
	    		    
	            System.out.println("MAC : " + result);
	        }catch(Exception e){
	            e.printStackTrace();
	        }finally{
	            
	        }
	    }

}
