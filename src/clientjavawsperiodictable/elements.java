/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientjavawsperiodictable;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 *
 * @author entrar
 */
@Root
public class elements {
    
    @Element
    private int atomicNumber;
    
    @Element
    private String elementName;
    
    @Element
    private String Symbol;
    
    @Element
    private float atomicWeight;
    
    @Element
    private float boilingPoint;
    
    @Element
    private double ionisationPotential;
    
    @Element
    private float atomicRadius;
    
    @Element
    private int MeltingPoint;
    
    @Element
    private float density;

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public String getElementName() {
        return elementName;
    }

    public String getSymbol() {
        return Symbol;
    }

    public float getAtomicWeight() {
        return atomicWeight;
    }

    public float getBoilingPoint() {
        return boilingPoint;
    }

    public double getIonisationPotential() {
        return ionisationPotential;
    }

    public float getAtomicRadius() {
        return atomicRadius;
    }

    public int getMeltingPoint() {
        return MeltingPoint;
    }

    public float getDensity() {
        return density;
    }

    public void setAtomicNumber(int atomicNumber) {
        this.atomicNumber = atomicNumber;
    }

    public void setElementName(String elementName) {
        this.elementName = elementName;
    }

    public void setSymbol(String Symbol) {
        this.Symbol = Symbol;
    }

    public void setAtomicWeight(float atomicWeight) {
        this.atomicWeight = atomicWeight;
    }

    public void setBoilingPoint(float boilingPoint) {
        this.boilingPoint = boilingPoint;
    }

    public void setIonisationPotential(double ionisationPotential) {
        this.ionisationPotential = ionisationPotential;
    }

    public void setAtomicRadius(float atomicRadius) {
        this.atomicRadius = atomicRadius;
    }

    public void setMeltingPoint(int MeltingPoint) {
        this.MeltingPoint = MeltingPoint;
    }

    public void setDensity(float density) {
        this.density = density;
    }
    

}
