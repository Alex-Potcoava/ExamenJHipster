package com.mycompany.myapp.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A Partida.
 */
@Entity
@Table(name = "partida")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Partida implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "ganador", nullable = false)
    private String ganador;

    @NotNull
    @Column(name = "perdedor", nullable = false)
    private String perdedor;

    @NotNull
    @Min(value = 0)
    @Column(name = "puntos_del_ganador", nullable = false)
    private Integer puntosDelGanador;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Partida id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGanador() {
        return this.ganador;
    }

    public Partida ganador(String ganador) {
        this.setGanador(ganador);
        return this;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    public String getPerdedor() {
        return this.perdedor;
    }

    public Partida perdedor(String perdedor) {
        this.setPerdedor(perdedor);
        return this;
    }

    public void setPerdedor(String perdedor) {
        this.perdedor = perdedor;
    }

    public Integer getPuntosDelGanador() {
        return this.puntosDelGanador;
    }

    public Partida puntosDelGanador(Integer puntosDelGanador) {
        this.setPuntosDelGanador(puntosDelGanador);
        return this;
    }

    public void setPuntosDelGanador(Integer puntosDelGanador) {
        this.puntosDelGanador = puntosDelGanador;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Partida)) {
            return false;
        }
        return id != null && id.equals(((Partida) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Partida{" +
            "id=" + getId() +
            ", ganador='" + getGanador() + "'" +
            ", perdedor='" + getPerdedor() + "'" +
            ", puntosDelGanador=" + getPuntosDelGanador() +
            "}";
    }
}
