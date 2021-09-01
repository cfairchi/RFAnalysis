package com.expr.mvcr.stk.svc.services.models;

import agi.foundation.communications.LinkBudget;
import agi.foundation.time.JulianDate;

import java.time.format.DateTimeFormatter;

public class LinkBudgetData {
    private String timeStampIso;
    private double propagationLoss;
    private double bitErrorRate;
    private double carrierToInterference;
    private double carrierToNoise;
    private double carrierToNoiseDensity;
    private double carrierToNoisePlusInterference;
    private double effectiveIsotropicRadiatedPower;
    private double energyPerBitToNoiseDensity;
    private double powerAtReceiverOutput;
    private double receivedIsotropicPower;
    private double receivedPowerFluxDensity;
    private double receiverAntennaGainInLinkDirection;
    private double transmitterAntennaGainInLinkDirection;

    public LinkBudgetData() {
    }

    public LinkBudgetData(JulianDate timeStamp, LinkBudget lb) {
        this.timeStampIso = timeStamp.toDateTime().format(DateTimeFormatter.ISO_DATE_TIME);
        this.propagationLoss = lb.getPropagationLoss();
        this.bitErrorRate = lb.getBitErrorRate();
        this.carrierToInterference = lb.getCarrierToInterference();
        this.carrierToNoise = lb.getCarrierToNoise();
        this.carrierToNoiseDensity = lb.getCarrierToNoiseDensity();
        this.carrierToNoisePlusInterference = lb.getCarrierToNoisePlusInterference();
        this.effectiveIsotropicRadiatedPower = lb.getEffectiveIsotropicRadiatedPower();
        this.energyPerBitToNoiseDensity = lb.getEnergyPerBitToNoiseDensity();
        this.powerAtReceiverOutput = lb.getPowerAtReceiverOutput();
        this.receivedIsotropicPower = lb.getReceivedIsotropicPower();
        this.receivedPowerFluxDensity = lb.getReceivedPowerFluxDensity();
        this.receiverAntennaGainInLinkDirection = lb.getReceiverAntennaGainInLinkDirection();
        this.transmitterAntennaGainInLinkDirection = lb.getTransmitterAntennaGainInLinkDirection();
    }

    public String getTimeStampIso() {
        return timeStampIso;
    }

    public void setTimeStampIso(String timeStampIso) {
        this.timeStampIso = timeStampIso;
    }

    public double getPropagationLoss() {
        return propagationLoss;
    }

    public void setPropagationLoss(double propagationLoss) {
        this.propagationLoss = propagationLoss;
    }

    public double getBitErrorRate() {
        return bitErrorRate;
    }

    public void setBitErrorRate(double bitErrorRate) {
        this.bitErrorRate = bitErrorRate;
    }

    public double getCarrierToInterference() {
        return carrierToInterference;
    }

    public void setCarrierToInterference(double carrierToInterference) {
        this.carrierToInterference = carrierToInterference;
    }

    public double getCarrierToNoise() {
        return carrierToNoise;
    }

    public void setCarrierToNoise(double carrierToNoise) {
        this.carrierToNoise = carrierToNoise;
    }

    public double getCarrierToNoiseDensity() {
        return carrierToNoiseDensity;
    }

    public void setCarrierToNoiseDensity(double carrierToNoiseDensity) {
        this.carrierToNoiseDensity = carrierToNoiseDensity;
    }

    public double getCarrierToNoisePlusInterference() {
        return carrierToNoisePlusInterference;
    }

    public void setCarrierToNoisePlusInterference(double carrierToNoisePlusInterference) {
        this.carrierToNoisePlusInterference = carrierToNoisePlusInterference;
    }

    public double getEffectiveIsotropicRadiatedPower() {
        return effectiveIsotropicRadiatedPower;
    }

    public void setEffectiveIsotropicRadiatedPower(double effectiveIsotropicRadiatedPower) {
        this.effectiveIsotropicRadiatedPower = effectiveIsotropicRadiatedPower;
    }

    public double getEnergyPerBitToNoiseDensity() {
        return energyPerBitToNoiseDensity;
    }

    public void setEnergyPerBitToNoiseDensity(double energyPerBitToNoiseDensity) {
        this.energyPerBitToNoiseDensity = energyPerBitToNoiseDensity;
    }

    public double getPowerAtReceiverOutput() {
        return powerAtReceiverOutput;
    }

    public void setPowerAtReceiverOutput(double powerAtReceiverOutput) {
        this.powerAtReceiverOutput = powerAtReceiverOutput;
    }

    public double getReceivedIsotropicPower() {
        return receivedIsotropicPower;
    }

    public void setReceivedIsotropicPower(double receivedIsotropicPower) {
        this.receivedIsotropicPower = receivedIsotropicPower;
    }

    public double getReceivedPowerFluxDensity() {
        return receivedPowerFluxDensity;
    }

    public void setReceivedPowerFluxDensity(double receivedPowerFluxDensity) {
        this.receivedPowerFluxDensity = receivedPowerFluxDensity;
    }

    public double getReceiverAntennaGainInLinkDirection() {
        return receiverAntennaGainInLinkDirection;
    }

    public void setReceiverAntennaGainInLinkDirection(double receiverAntennaGainInLinkDirection) {
        this.receiverAntennaGainInLinkDirection = receiverAntennaGainInLinkDirection;
    }

    public double getTransmitterAntennaGainInLinkDirection() {
        return transmitterAntennaGainInLinkDirection;
    }

    public void setTransmitterAntennaGainInLinkDirection(double transmitterAntennaGainInLinkDirection) {
        this.transmitterAntennaGainInLinkDirection = transmitterAntennaGainInLinkDirection;
    }
}
