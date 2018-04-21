import javax.rmi.*

class RemoteCall {
  private String s;
  public void setS(String s) {
    this.s = s;
    for (int i=0; i<100; ++i) {
      s += Integer.toString(i);
    }
  }
}
