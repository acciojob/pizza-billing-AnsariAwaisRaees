package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int basePriceOfPizza;
    private int extraCheesePrice;
    private int extraToppingPrice;
    private int paperBagPrice;

    private boolean isTakeAway;
    private boolean isAddExtraChess;
    private boolean isAddExtraTopping;
    private boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if (isVeg){
            this.basePriceOfPizza = 300;
            this.extraToppingPrice = 70;
        }else{
            this.basePriceOfPizza = 400;
            this.extraToppingPrice = 120;
        }
        this.extraCheesePrice = 80;
        this.paperBagPrice = 20;
        this.price = this.basePriceOfPizza;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if (!isAddExtraChess) {
            this.price += extraCheesePrice;
            isAddExtraChess = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (!isAddExtraTopping){
            this.price += extraToppingPrice;
            isAddExtraTopping = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if (!isTakeAway){
            this.price += paperBagPrice;
            isTakeAway = true;
        }
    }

    public String getBill(){
        // your code goes here
        if (!isBillGenerated){
            this.bill = "Base Price Of The Pizza: "+this.basePriceOfPizza+"\n";
            if (isAddExtraChess){
                this.bill += "Extra Cheese Added: "+this.extraCheesePrice+"\n";
            }
            if (isAddExtraTopping){
                this.bill += "Extra Toppings Added: "+this.extraToppingPrice+"\n";
            }
            if(isTakeAway){
                this.bill += "Paperbag Added: "+this.paperBagPrice+"\n";
            }
            this.bill += "Total Price: "+this.price+"\n";
            isBillGenerated = true;
        }
        return this.bill;
    }
}
