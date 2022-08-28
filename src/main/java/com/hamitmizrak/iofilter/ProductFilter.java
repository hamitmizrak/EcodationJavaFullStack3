package com.hamitmizrak.iofilter;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Builder
public class ProductFilter {

    private Long id;
    private String name;
    private int price;

    //parametresiz constructor
    public ProductFilter() {
        this.id=0L;
        this.name="ürün adı girilmedi";
        this.price=0;
    }

    //parametresiz constructor
    public ProductFilter(Long id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    //toString method

    @Override
    public String toString() {
        return "ProductFilter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}//end ProductFilter
