package com.epamtask;
public class simple_compound_Interest {
    public double simple_interest(double p,double t,double r)
    {
        return((p*t*r)/100);
    }
    public double compound_interest(double p,double t,double r)
    {
        return (p+Math.pow((1+r),t));
    }
}
