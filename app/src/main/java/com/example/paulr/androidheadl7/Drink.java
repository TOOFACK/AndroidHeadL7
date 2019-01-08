package com.example.paulr.androidheadl7;

public class Drink {

    private String name;
    private String descrtiption;
    private int imageResourceId;

    public static final Drink[] drinks = {
            new Drink("Latte", "A couple of espresso shots with steamed milk", R.drawable.latte),
            new Drink("Cappuccino", "Espresso, hot milk", R.drawable.cappuccino),
            new Drink("Filter", "Highest quality beans roasted and brewed fresh", R.drawable.filter),
    };

    public Drink(String name, String desctiption, int imageResourceId) {
        this.name = name;
        this.descrtiption = desctiption;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesvtiption() {
        return descrtiption;
    }

    public void setDesvtiption(String desvtiption) {
        this.descrtiption = desvtiption;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }


}
