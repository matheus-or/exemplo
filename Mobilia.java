@Entity
@Table(name = "IMOBI_MOBILIA")
public class Mobilia extends PersistentObjectAudit implements Serializable {

    @Id
    @SequenceGenerator(name = "IMOBI_MOBILIA_SQ", sequenceName = "IMOBI_MOBILIA_SQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IMOBI_MOBILIA_SQ")
    @Column(name = "ID_MOBILIA")
    private Long id;

    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "NIVEL")
    private short nivel;

    @OneToMany(mappedBy = "mobilia", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<MobiliaMobiliario> mobiliarios;

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

    public short getNivel() {
        return nivel;
    }

    public void setNivel(short nivel) {
        this.nivel = nivel;
    }

    public Set<MobiliaMobiliario> getMobiliarios() {
        return mobiliarios;
    }

    public void setMobiliarios(Set<MobiliaMobiliario> mobiliarios) {
        this.mobiliarios.clear();
        if(mobiliarios != null){
            this.mobiliarios.addAll(mobiliarios);
        }
        this.mobiliarios = mobiliarios;
    }
}

