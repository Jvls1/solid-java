package com.jojo.openclose;

import lombok.Getter;
import lombok.Setter;

//base class - closed for modification
@Getter
@Setter
public abstract class Subscriber {

    protected Long subscriberId;

    protected String address;

    protected Long phoneNumber;

    protected int baseRate;

    public abstract double calculateBill(); //extension

}
