package entities;

public class Bill {
    public char gender;
    public int beer;
    public int barbecue;
    public int softDrink;
    public double valueBeer;
    public double valueBarbecue;
    public double valueSoftDrink;
    public double totalFeeding;

    public double feeding(){
        valueBeer = beer * 5;
        valueBarbecue = barbecue * 7;
        valueSoftDrink = softDrink * 3;
        return totalFeeding = valueBeer + valueBarbecue + valueSoftDrink;
    }

    public double cover(){
        if (feeding() < 30){
            return 4;
        }
        return 0;
    }

    public double ticket(){
        if (gender == 'F'){
            return 8;
        }else {
            return 10;
        }
    }

    public double total(){
        return feeding() + ticket() + cover();
    }

}
