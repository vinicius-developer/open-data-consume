package br.com.open.data.consume.commom;

public enum PoliticalParty {
    
    AVANTE("AVANTE", 36898, "Avante"),
    CIDADANIA("CIDADANIA", 37905, "Cidadania"),
    DC("DC", 37902, "Democracia Cristã"),
    DEM("DEM", 36769, "Democratas"),
    MDB("MDB", 36899, "Movimento Democrático Brasileiro"),
    NOVO("NOVO", 37901, "Partido Novo"),
    PATRI("PATRI", 37900, "Patriota"),
    PATRIOTA("PATRIOTA", 37907, "Patriota"),
    PCB("PCB", 36863, "Partido Constitucionalista Brasileiro"),
    PCdoB("PCdoB", 36779, "Partido Comunista do Brasil"),
    PCO("PCO", 36781, "Partido da Causa Operária"),
    PDT("PDT", 36786, "Partido Democrático Trabalhista"),
    PHS("PHS", 36793, "Partido Humanista da Solidariedade"),
    PL("PL", 37906, "Partido Liberal"),
    PMB("PMB", 36887, "Partido da Mulher Brasileira"),
    PMN("PMN", 36801, "Partido da Mobilização Nacional"),
    PODE("PODE", 36896, "Podemos"),
    PP("PP", 37903, "Progressistas"),
    PPL("PPL", 36762, "Partido Pátria Livre"),
    PPS("PPS", 36813, "Partido Popular Socialista"),
    PR("PR", 36814, "Partido da República"),
    PRB("PRB", 36815, "Partido Republicano Brasileiro"),
    PROS("PROS", 36763, "Partido Republicano da Ordem Social"),
    PRP("PRP", 36824, "Partido Republicano Progressista"),
    PRTB("PRTB", 36829, "Partido Renovador Trabalhista Brasileiro"),
    PSB("PSB", 36832, "Partido Socialista Brasileiro"),
    PSC("PSC", 36833, "Partido Social Cristão"),
    PSD("PSD", 36834, "Partido Social Democrático"),
    PSDB("PSDB", 36835, "Partido da Social Democracia Brasileira"),
    PSL("PSL", 36837, "Partido Social Liberal"),
    PSOL("PSOL", 36839, "Partido Socialismo e Liberdade"),
    PSTU("PSTU", 36843, "Partido Socialista dos Trabalhadores Unificado"),
    PT("PT", 36844, "Partido dos Trabalhadores"),
    PTB("PTB", 36845, "Partido Trabalhista Brasileiro"),
    PTC("PTC", 36846, "Partido Trabalhista Cristão"),
    PV("PV", 36851, "Partido Verde"),
    REDE("REDE", 36886, "Rede Sustentabilidade"),
    REPUBLICANOS("REPUBLICANOS", 37908, "Republicanos"),
    SEM_PARTIDO("S.PART.", 36852, "Sem Partido"),
    SOLIDARIEDADE("SOLIDARIEDADE", 37904, "Solidariedade"),
    UNIÃO("UNIÃO", 38009, "União Brasil");

    private final String sigla;

    private final Integer id;

    private final String name;

    PoliticalParty(String sigla, Integer id, String name) {
        this.sigla = sigla;
        this.id = id;
        this.name = name;
    }

    public String getSigle() {
        return this.sigla;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

}

