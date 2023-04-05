package com.vmorg;

import com.vmorg.buildrequest.BuildReques;

public class VirtualMachine {
    private static String hostName;
    private static String requestorName;
    private static int numberOfCPUs;
    private static int ramSizeInGB;
    private static double sizeOfHardDisk;
    public final int numberOfVirtualMachines = 999;

    public VirtualMachine(){} //Default constructor

    //Setters

    public static void setHostName(String date, BuildReques requestNumber) {
        VirtualMachine.hostName = "host" + date + requestNumber;
    }

    public static void setNumberOfCPUs(int numberOfCPUs) {VirtualMachine.numberOfCPUs = numberOfCPUs;}
    public static void setRamSizeInGB(int ramSizeInGB) {VirtualMachine.ramSizeInGB = ramSizeInGB;}
    public static void setRequestorName(String requestorName) {VirtualMachine.requestorName = requestorName;}
    public static void setSizeOfHardDisk(double sizeOfHardDisk) {VirtualMachine.sizeOfHardDisk = sizeOfHardDisk;}

    //Getters
    public static double getSizeOfHardDisk() {
        return sizeOfHardDisk;
    }
    public static int getNumberOfCPUs() {
        return numberOfCPUs;
    }
    public static int getRamSizeInGB() {return ramSizeInGB;}
    public static String getHostName() {return hostName;}
    public static String getRequestorName() {
        return requestorName;
    }

    public int getNumberOfVirtualMachines() {return numberOfVirtualMachines;}

    @Override
    public String toString() {
        return super.toString();
    }
}
