package br.com.open.data.consume.commom.sort;

public interface SortByFieldInterface<T> {

    T order(SortValues sort);

    T orderBy(String field);

}
