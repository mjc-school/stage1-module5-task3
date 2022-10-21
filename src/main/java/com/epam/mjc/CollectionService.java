package com.epam.mjc;

import java.util.List;
import java.util.Optional;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
        return list.stream().filter(value -> value%2 ==0).toList();
//        throw new UnsupportedOperationException("You should implement this method.");
    }

    public List<String> toUpperCaseCollection(List<String> list) {
//        throw new UnsupportedOperationException("You should implement this method.");
        return list.stream().map(value -> value.toUpperCase()).toList();
    }

    public Optional<Integer> findMax(List<Integer> list) {
//        throw new UnsupportedOperationException("You should implement this method.");
        return list.stream().max(Integer::compare);
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
//        throw new UnsupportedOperationException("You should implement this method.");
        return list.stream().flatMap(listInList -> listInList.stream()).min(Integer::compare);
    }

    public Integer sum(List<Integer> list) {
//        throw new UnsupportedOperationException("You should implement this method.");
         return list.stream().reduce((x,y) ->x+y).get();
    }
}
