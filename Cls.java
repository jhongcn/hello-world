import javax.rmi.*

class RemoteCall {
  private String s;
  public void setS(String s) {
    this.s = s;
    System.out.println(s);
  }
  
  public String getS() {
     return this.s;
  }
}
