package api.example.crud.models;

import api.example.crud.dto.CarDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Car {
    public Car (CarDTO data) {
        this.modelo = data.modelo();
        this.dataFabricacao = data.dataFabricacao();
        this.valor = data.valor();
        this.anoModelo = data.anoModelo();
    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String modelo;

    @Column(nullable = false)
    private String dataFabricacao;

    @Column(nullable = false)
    private double valor;

    @Column(nullable = false)
    private int anoModelo;
}
