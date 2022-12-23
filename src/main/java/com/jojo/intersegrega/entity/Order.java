package com.jojo.intersegrega.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

//Order entity class
@Getter
@Setter
public class Order extends Entity {

	private LocalDateTime orderPlacedOn;
	
	private double totalValue;
	
}
