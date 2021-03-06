package com.example.project.model;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;

@Entity
@Table(name = "carriers")
public class Carrier {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
	private Long carrierid;
    
    @Column(name = "Name")
    private String name;

    @Column(name = "Address")
    private String address;

    @Column(name = "Latitude")
    private Double latitude;

    @Column(name = "Longitude")
    private Double longitude;

	public Long getId() {
        return carrierid;
    }

    public void setId(Long carrierid) {
        this.carrierid = carrierid;
	}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Carrier Name(String name){
		this.name = name;
		return this;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public Carrier Address(String address){
		this.address = address;
		return this;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
    
    public Carrier Latitude(Double latitude){
		this.latitude = latitude;
		return this;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
    
    public Carrier Longitude(Double longitude){
		this.longitude = longitude;
		return this;
    }

    @Override
    public String toString() {return "Geldi";}
}