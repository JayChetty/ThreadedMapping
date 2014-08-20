public class Mapper{

  public static final int ARRAY_SIZE = 10000000;
  private double[] myArray = new double[ARRAY_SIZE];

  public void setUpArray(){
    for(int i=0;i<myArray.length; i++){
      myArray[i] = i;
    }
  }

  public void mapArray(){
    long startTime = System.currentTimeMillis();
    for(int i=0;i<myArray.length; i++){
      myArray[i] = expensiveOperation(myArray[i]);
    }
    long endTime = System.currentTimeMillis();
    long duration = (endTime - startTime);
    System.out.println("mapping took " + duration + " millseconds" );
  }

  public double arraySum(){
    double sum = 0;
    for(int i=0;i<myArray.length; i++){
      sum += myArray[i];
    }
    return sum;
  }

  private double expensiveOperation(double num){
    double out = Math.sqrt(Math.sqrt(Math.sqrt(Math.sqrt(Math.sqrt(Math.sqrt(Math.sqrt(num)))))));
    out = Math.sqrt(Math.sqrt(Math.sqrt(Math.sqrt(Math.sqrt(Math.sqrt(Math.sqrt(out)))))));
    return out;
  }
}