package com.example.E_Commerce.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import tools.jackson.databind.DatabindException;

import java.math.BigDecimal;
import java.util.Date;

@Component
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    private String brand;
    private BigDecimal price;
    private String category;

  //  @JsonFormat(shape = JsonFormat.Shape.STRING , pattern = "dd-MM-YYYY")

    private Date releaseDate;
    private Boolean productAvailable;
    private Integer stockQuantity;

    private String ImageName;
    private  String ImageType;
    @Lob
    private  byte[] imageData;
}
