package br.com.afamorim.archunitstudycase.domain.model;

import java.util.Date;

public class Order {

    private Long    id;
    private Pet     pet;
    private Integer quantity;
    private Date    shipDate;
    private String  status;
    private boolean complete;
}
