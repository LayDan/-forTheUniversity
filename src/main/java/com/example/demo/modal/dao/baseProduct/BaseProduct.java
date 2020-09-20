package com.example.demo.modal.dao.baseProduct;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BaseProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_generator")
    @SequenceGenerator(name = "product_generator", sequenceName = "product_seq")
    private Long id;

    @Column
    private String info;

    @Column
    private Long price;
}
