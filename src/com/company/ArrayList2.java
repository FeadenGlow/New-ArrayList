package com.company;

public class ArrayList2<E> {
    private int defaultCapacity = 10;
    private E arrayList[] = (E[]) new Object[defaultCapacity];
    private int size = 0;
    private int newCapacity(){
        return defaultCapacity *= 1.5;
    }

    /*
    Need methods:
    add();
    get();
    set();
    remove();
    clear();
    size();
     */

    public void add(E object){
        size ++;
        if(size >= defaultCapacity){
            defaultCapacity *= 1.5;
            E[] newArray = (E[]) new Object[defaultCapacity];
            System.arraycopy(arrayList, 0, newArray, 0, arrayList.length);
            arrayList = newArray;
        }
        arrayList[size] = object;
    }

    public E get(int index) throws SizeException{
        if(index+1 > size){
            throw new SizeException("Index 0 out of bounds for length 0");
        }
        return arrayList[index];
    }

    public int size(){
        return arrayList.length;
    }

    public E remove(int index){
        E oldValue = arrayList[index];
        for(int i = index; i < size; i++){
            arrayList[i] = arrayList[i+1];
        }
        size--;
        arrayList[size] = null;
        return oldValue;
    }
    public void clear(){
        for(int i = 0; i < size; i++){
            arrayList[i] = null;
        }
        size = 0;
    }
    public E set(int index, E object)throws SizeException{
        E oldValue = arrayList[index];
        if(index+1 > size){
            throw new SizeException("Index 0 out of bounds for length 0");
        }
            arrayList[index] = object;
        return oldValue;
    }


}
