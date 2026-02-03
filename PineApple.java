import javax.xml.namespace.QName;

public class PineApple extends Bakery  {

    private int piece;
    private String name="";


    public PineApple(int piece,String flavor,double unitPrice,String name)
    {
        super(flavor, unitPrice);
        this.piece = piece;
        this.name = name;
    }
    public boolean isPackingBox(){
        return this.piece >= 6;
    }
    public int getBoxNumber(){
        if (isPackingBox()){
            return  this.piece / 6;
        }
        return  0;
    }
    public  String getMessage()
    {
        return this.name;
    }
    public void changeMessage(String new_message)
    {
        this.name = new_message;
    }
    @Override
    public int getPackingCost(){
        if (isPackingBox())
            return getBoxNumber() * super.getPackingCost();
        return 0;
    }

    @Override
    public double calculateTotalPrice(){
        return (getUnitPrice() * this.piece + getPackingCost());

    }


    public String toString(){
        return super.toString() + getMessage()+
                "\nPineApple (" + getFlavor() + ") with" +
                (isPackingBox() ? getBoxNumber() + " Box " : " ") +
                "\nTotal price of PineApple = " +getUnitPrice() * this.piece;


    }

}
