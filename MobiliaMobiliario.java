@Entity
@Table(name = "IMOBI_MOBILIA_MOBILIARIO")
public class MobiliaMobiliario implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "ID_MOBILIA")
    private Mobilia mobilia;

    @Id
    @ManyToOne
    @JoinColumn(name = "ID_MOBILIARIO")
    private Mobiliario mobiliario;

    public Mobilia getMobilia() {
        return mobilia;
    }

    public void setMobilia(Mobilia mobilia) {
        this.mobilia = mobilia;
    }

    public Mobiliario getMobiliario() {
        return mobiliario;
    }

    public void setMobiliario(Mobiliario mobiliario) {
        this.mobiliario = mobiliario;
    }
}