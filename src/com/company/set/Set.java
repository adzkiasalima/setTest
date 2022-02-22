package com.company.set;

public class Set {
    Object[] set = new Object[5];

    public boolean isEmpty(){
        if(size()==0) return true;
        return false;
    }


    public <T> void add(T  input){

        if(this.contains(input)) return;

        for (int i= 0; i<this.set.length; i++){
            if (this.set[i] == null) {
                this.set[i] = input;
                return;
            }
        }
    }

    public <T> boolean contains(T input){

        if(isEmpty()) return false;

        for (int i= 0; i<this.set.length; i++){
            if(isElementEqual(set[i],input))
                return true;
        }
        return false;
    }

    public int size(){
        int total = 0;
        for (int i = 0; i < set.length; i++) {
            if(set[i] != null)
                total++;
        }
        return total;
    }

    public void delete(Object input){
        if(isEmpty()) return;
        if(contains(input)){
            for (int i = 0; i < set.length; i++) {
                if(isElementEqual(set[i],input))
                set[i] = null;
            }
        }
    }

    public boolean isElementEqual(Object item,Object input ){
        return item != null && item.equals(input);
    }
}
