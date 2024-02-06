package com.example.demo.domain;

import com.example.demo.validators.ValidMinInv;

import javax.persistence.*;


/**
 *
 *
 *
 *
 */
@Entity
@DiscriminatorValue("1")

public class InhousePart extends Part{
    int partId;


    public InhousePart() {
    }
    // Part E & G Change
    public InhousePart(String name, double price, int inv, int minInv, int maxInv) {
        this.name = name;
        this.price = price;
        this.inv = inv;
        this.minInv = minInv;
        this.maxInv = maxInv;
    }

    public int getPartId() {
        return partId;
    }

    public void setPartId(int partId) {
        this.partId = partId;
    }

}
