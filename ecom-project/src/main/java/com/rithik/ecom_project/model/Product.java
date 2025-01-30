package com.rithik.ecom_project.model;

import jakarta.persistence.*;
import lombok.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "PRODUCT") // Explicitly map to table name in uppercase
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private int id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;
    //description

    @JsonProperty("brand")
    private String brand;

    @JsonProperty("price")
    private BigDecimal price;

    @JsonProperty("category")
    private String category;

    @JsonProperty("releaseDate")
    private Date releaseDate;

    @JsonProperty("productAvailable")
    private boolean available;

    @JsonProperty("stockQuantity")
    private int quantity;
    
    @JsonProperty("imageName")
    private String imageName;

    @JsonProperty("imageType")
    private String imageType;
    

    @JsonProperty("imageData")
    @Lob
    private byte[] imageData;


	public String getImageName() {
		return imageName;
	}


	public void setImageName(String imageName) {
		this.imageName = imageName;
	}


	public String getImageType() {
		return imageType;
	}


	public void setImageType(String imageType) {
		this.imageType = imageType;
	}


	public byte[] getImageData() {
		return imageData;
	}


	public void setImageData(byte[] imageData) {
		this.imageData = imageData;
	}



    
    

}
