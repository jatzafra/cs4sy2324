package tr28_zafra_ex05;

import java.util.ArrayList;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    // Initialize name to parameter and earnings to zero
    // Initialize itemList as a new ArrayList
    // add 'this' store to storeList
    this.name = name;
    this.earnings = 0;
    this.itemList = new ArrayList();
    storeList.add(this);
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    // get Item at index from itemList and add its cost to earnings
    // print statement indicating the sale
    if(index < itemList.size()){
      earnings += itemList.get(index).getCost();
      System.out.println(this.getName() + " sold " + itemList.get(index).getName() + " for " 
                         + itemList.get(index).getCost() + ".");
    }
    else{
      System.out.println("There are only " + itemList.size() + " items in the store.");
    }
  }
  public void sellItem(String name){
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
    for(int i=0; i < itemList.size(); i++){
      if(itemList.get(i).getName().equals(name)){
        earnings += itemList.get(i).getCost();
        System.out.println(this.getName() + " sold " + itemList.get(i).getName() + " for " + itemList.get(i).getCost() + ".");
        break;
       }
      else if((i == itemList.size() - 1)){
        System.out.println(this.getName() + " does not sell " + name + ".");
      }
    }
  }
  public void sellItem(Item i){
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to earnings
    // print statement indicating the sale
    if (itemList.contains(i)){
      itemList.forEach((n) -> {
        if(n == i){
          earnings += n.getCost();
          System.out.println(this.getName() + " sold " + n.getName() + " for " + n.getCost() + ".");
        }
      });
    }
    else{
      System.out.println(this.getName() + " does not sell it.");
    }
  }
  public void addItem(Item i){
    // add Item i to store's itemList
    itemList.add(i);
  }
  public void filterType(String type){
    // loop over itemList and print all items with the specified type
    System.out.println("Filtered " + type + " items from " + this.getName() + ".");
    itemList.forEach((n) -> {
      if(n.getType().equals(type)){
        System.out.println(n.getName());
      }
    });
  }
  public void filterCheap(double maxCost){
    // loop over itemList and print all items with a cost lower than or equal to the specified value
    System.out.println("Filtered items with costs not exceeding " + maxCost + " from " + this.getName() + ".");
    itemList.forEach((n) -> {
      if(n.getCost() <= maxCost){
        System.out.println(n.getName());
      } 
    });
  }
  public void filterExpensive(double minCost){
    // loop over itemList and print all items with a cost higher than or equal to the specified value
    System.out.println("Filtered items with a costs at least " + minCost + " from " + this.getName() + ".");
    itemList.forEach((n) -> {
      if(n.getCost() >= minCost){
        System.out.println(n.getName());
      }
    });
  }
  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java'
    storeList.forEach((n) -> System.out.println(n.getName() + " has earned " + n.getEarnings() +"."));
  }
}
