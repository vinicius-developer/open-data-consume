package br.com.open.data.consume.deputies.list;

import br.com.open.data.consume.commom.Genre;
import br.com.open.data.consume.commom.PoliticalParty;
import br.com.open.data.consume.commom.UfsBrazil;
import br.com.open.data.consume.commom.date.DateInterface;
import br.com.open.data.consume.commom.date.ValidateDate;
import br.com.open.data.consume.commom.paginator.PaginatorInterface;
import br.com.open.data.consume.commom.sort.SortByFieldInterface;
import br.com.open.data.consume.commom.sort.SortValues;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListDeputies
        implements ListDeputiesInterface, DateInterface<ListDeputiesInterface>,
        PaginatorInterface<ListDeputiesInterface>, SortByFieldInterface<ListDeputiesInterface> {

    private String startDate;

    private String endDate;

    private Integer page = 1;

    private Integer itens = 1000;

    private String order = "ASC";

    private String orderBy = "nome";

    private String genre;

    private List<Integer> ids = new ArrayList<>();

    private List<String> names = new ArrayList<>();

    private List<Integer> legislatures = new ArrayList<>();

    private List<String> ufs = new ArrayList<>();

    private List<String> politicalParty = new ArrayList<>();

    @Override
    public ListDeputiesInterface setDateStart(String date) {
        ValidateDate.isValid(date);
        this.startDate = date;
        return this;
    }

    @Override
    public ListDeputiesInterface setDateFinal(String date) {
        ValidateDate.isValid(date);
        this.endDate = date;
        return this;
    }

    @Override
    public ListDeputiesInterface setPage(Integer page) {
        this.page = page;
        return this;
    }

    @Override
    public ListDeputiesInterface setIntens(Integer numberItens) {
        this.itens = numberItens;
        return this;
    }

    @Override
    public ListDeputiesInterface order(SortValues sort) {
        this.order = sort.toString();
        return this;
    }

    @Override
    public ListDeputiesInterface orderBy(String field) {
        this.orderBy = field;
        return this;
    }

    @Override
    public ListDeputiesInterface addId(Integer id) {
        this.ids.add(id);
        return this;
    }

    @Override
    public ListDeputiesInterface addName(String name) {
        this.names.add(name);
        return this;
    }

    @Override
    public ListDeputiesInterface addLegislature(Integer legislature) {
        this.legislatures.add(legislature);
        return this;
    }

    @Override
    public ListDeputiesInterface addUf(UfsBrazil uf) {
        this.ufs.add(uf.toString());
        return this;
    }

    @Override
    public ListDeputiesInterface addPoliticalParty(PoliticalParty party) {
        this.politicalParty.add(party.getSigle());
        return this;
    }

    @Override
    public ListDeputiesInterface setGenre(Genre genre) {
        this.genre = genre.toString();
        return this;
    }

    private String getPathIds() {
        return this.ids.stream().map(Object::toString)
                .collect(Collectors.joining(", "));
    }

    private String getLegislatures() {
        return this.legislatures.stream().map(Object)
    }



    private String getPathString() {
        String path = "?ordem=" +
                this.order +
                "&ordenarPor=" +
                this.orderBy +
                "&pagina=" +
                this.page +
                "&itens=" +
                this.itens;

        if(this.genre != null) {
            path += "&siglaSexo" + this.genre;
        }

        if(this.startDate != null) {
            path += "&dataInicio=" + this.startDate;
        }

        if(this.endDate != null) {
            path += "&dataFim=" + this.endDate;
        }

        if(!this.ids.isEmpty()) {
            path += "&id=" + this.getPathIds();
        }


            return path;
    }


}
