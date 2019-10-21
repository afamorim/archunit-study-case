package br.com.afamorim.archunitsutdycase.application.model;

import java.util.Date;

public class Order {

    private Long    id;
    private Pet     pet;
    private Integer quantity;
    private Date    shipDate;
    private String  status;
    private boolean complete;
}
