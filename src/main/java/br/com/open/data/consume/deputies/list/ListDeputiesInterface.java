package br.com.open.data.consume.deputies.list;

import br.com.open.data.consume.commom.Genre;
import br.com.open.data.consume.commom.PoliticalParty;
import br.com.open.data.consume.commom.UfsBrazil;

public interface ListDeputiesInterface {

    ListDeputiesInterface addId(Integer id);

    ListDeputiesInterface addName(String name);

    ListDeputiesInterface addLegislature(Integer legislature);

    ListDeputiesInterface addUf(UfsBrazil uf);

    ListDeputiesInterface addPoliticalParty(PoliticalParty party);
 
    ListDeputiesInterface setGenre(Genre genre);

    
    
}
