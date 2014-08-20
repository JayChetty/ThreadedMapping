public class MapperInParts{

  public static final int ARRAY_SIZE = 10000000;

  private double[] myArray = new double[ARRAY_SIZE];

  public void setUpArray(){
    for(int i=0;i<myArray.length; i++){
      myArray[i] = i;
    }
  }

  public void mapArray(){
    long startTime = System.currentTimeMillis();

    MapPart part = new MapPart(myArray, 0, myArray.length/2);
    MapPart part2 = new MapPart(myArray, myArray.length/2, myArray.length);

    part.start();
    part2.start();
    try {
      part.join();
      part2.join();
    } catch(InterruptedException e) {
         // this is executed when an exception (in this example InterruptedException) occurs
    }

    // part.mapPart();
    // part2.mapPart();

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

}