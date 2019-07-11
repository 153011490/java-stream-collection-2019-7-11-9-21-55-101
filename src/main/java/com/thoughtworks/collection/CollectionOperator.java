package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> arrayList=new ArrayList<>();
        if(left<=right){
            for(int i=left;i<=right;i++){
                arrayList.add(i);
            }
        }else{
            for(int i=left;i>=right;i--){
                arrayList.add(i);
            }
        }
        return arrayList;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> arrayList=new ArrayList<>();
        if(left<=right){
            for(int i=left;i<=right;i++){
                if(i%2==0){
                    arrayList.add(i);
                }
            }
        }else{
            for(int i=left;i>=right;i--){
                if(i%2==0){
                    arrayList.add(i);
                }
            }
        }
        return arrayList;
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> arrList=new ArrayList<>();
        for (int i: array){
            if(i%2==0){
                arrList.add(i);
            }
        }
        return arrList;
    }

    public int popLastElment(int[] array) {
        return array[array.length-1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
