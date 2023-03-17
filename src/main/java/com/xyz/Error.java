
package com.xyz;
import org.h2.security.SHA256;


public class HelloJenkins {
   public void getPassword(){
    String inputString = "s3cr37";
    byte[] key         = inputString.getBytes();
    SHA256.getHMAC(key, message);
  }

  public int foo(int a) {
    int b = 12;
    if (a == 1) {
      return b;
    }
    return b; 
  }

  public int fail(int a) {
    int b = 12;
    if (a == 1) {
      return b;
    } if (b==1){
      return a;
    }
    return b;  
  }
	public String go(){
		return "HelloJenkinsfile";
	}

}


