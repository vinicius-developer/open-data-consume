package br.com.open.data.consume.commom.paginator;

public interface PaginatorInterface<T> {

    T setPage(Integer page);

    T setIntens(Integer numberItens);
    
}
