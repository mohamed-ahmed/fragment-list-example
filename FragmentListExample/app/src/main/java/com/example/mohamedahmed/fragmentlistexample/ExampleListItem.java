package com.example.mohamedahmed.fragmentlistexample;

/**
 * Created by mohamedahmed on 7/28/15.
 */
public class ExampleListItem {

    private String itemTitle;

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public ExampleListItem(String title){
        this.itemTitle = title;
    }
}