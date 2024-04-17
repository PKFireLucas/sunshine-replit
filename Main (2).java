class Main{
  public static void PK() {
    System.out.print("PsychoKinesis Starstorm Ω");
  }
  public static void PSI( int IQ ){  //super cool topic!
    if(IQ>47){
      System.out.print("💥");
      IQ -=1;
      PSI(IQ);
    }
  }
  public static void main(String[] args){
    PSI(91);
    PK();
  }
}
