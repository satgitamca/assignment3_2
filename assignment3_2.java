class Shirt
{
private int collarSize;
private int shirtSleeveLength;
private String shirtMaterial;

    public int getCollarSize() {
        return collarSize;
    }

    public void setCollarSize(int collarSize) {
        this.collarSize = collarSize;
    }

    public int getShirtSleeveLength() {
        return shirtSleeveLength;
    }

    public void setShirtSleeveLength(int shirtSleeveLength) {
        this.shirtSleeveLength = shirtSleeveLength;
    }

    public String getShirtMaterial() {
        return shirtMaterial;
    }

    public Shirt()
    {
        this.collarSize = 10;
        this.shirtSleeveLength = 20;
        this.shirtMaterial = "Cotton";
    }

    public void setShirtMaterial(String shirtMaterial) {
        this.shirtMaterial = shirtMaterial;
    }

    public Shirt(int collarSize, int shirtSleeveLength, String shirtMaterial) {
        this.collarSize = collarSize;
        this.shirtSleeveLength = shirtSleeveLength;
        this.shirtMaterial = shirtMaterial;
    }
    public void  TestShirt(int collarSize,int shirtSleeveLength,String shirtMaterial )
    {
        System.out.println("calling Overloaded Constructor");  
        System.out.println("========================================");    
        System.out.println("Shirt Color Size is:"+collarSize);    
        System.out.println("Shirt Sleeve Length is:"+shirtSleeveLength);
        System.out.println("Shirt Material is:"+shirtMaterial);
        System.out.println("");
    }

}

public class assignment3_2 
{
public static void main(String[] args)
{
    //Defaullt Constructor
    Shirt St=new Shirt();
    System.out.println("Calling Default Constructor");  
        System.out.println("========================================");
    System.out.println("The material is " + St.getShirtMaterial());
    //Overloaded constructor
    Shirt OLC=new Shirt(10,11,"Polyster");
    OLC.TestShirt(OLC.getCollarSize(),OLC.getShirtSleeveLength(),OLC.getShirtMaterial());
    
}
    
}
