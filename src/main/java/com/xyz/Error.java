import org.h2.security.SHA256;


void getPassword(){
  String inputString = "s3cr37";
  byte[] key         = inputString.getBytes();

  SHA256.getHMAC(key, message);
}


int foo(int a) {
  int b = 12;
  if (a == 1) {
    return b;
  }
  return b; 
}

int fail(int a) {
  int b = 12;
  if (a == 1) {
    return b;
  } if (b==1){
    return a;
  }
  return b;  
}

