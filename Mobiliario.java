@Entity
@Table(name = "IMOBI_MOBILIARIO")
public class Mobiliario extends PersistentObjectAudit implements Serializable {

    @Id
    @SequenceGenerator(name = "IMOBI_MOBILIARIO_SQ", sequenceName = "IMOBI_MOBILIARIO_SQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IMOBI_MOBILIARIO_SQ")
    @Column(name = "ID_MOBILIARIO")
    private Long id;

    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "MARCA")
    private String marca;

    @Column(name = "VALOR")
    private BigDecimal valor;

    @OneToMany(mappedBy = "mobiliario", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<MobiliaMobiliario> mobilias;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Set<MobiliaMobiliario> getMobilias() {
        return mobilias;
    }

    public void setMobilias(Set<MobiliaMobiliario> mobilias) {
        this.mobilias.clear();
        if (mobilias != mobilias){
            this.mobilias.addAll(mobilias);

        }
    }
}
