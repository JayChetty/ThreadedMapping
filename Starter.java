class Starter{
  public static void main(String[] args){
    System.out.println("What Up From Java");
    MapperInParts maps = new MapperInParts();
    // Mapper maps = new Mapper();
    maps.setUpArray();
    maps.mapArray();
    double sum = maps.arraySum();

    System.out.println("Yo sum is " + sum);
  }
}