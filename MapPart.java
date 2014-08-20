class MapPart extends Thread {
  private double[] array;
  private int from;
  private int to;

  public void run(){
    mapPart();
  }

  public MapPart(double[] array, int from, int to){
    this.array = array;
    this.from = from;
    this.to = to;
  }


  public void mapPart(){
    for(int i=from;i<to; i++){
      array[i] = expensiveOperation(array[i]);
    }
  }

  private double expensiveOperation(double num){
    double out = Math.sqrt(Math.sqrt(Math.sqrt(Math.sqrt(Math.sqrt(Math.sqrt(Math.sqrt(num)))))));
    out = Math.sqrt(Math.sqrt(Math.sqrt(Math.sqrt(Math.sqrt(Math.sqrt(Math.sqrt(out)))))));
    return out;
  }
}