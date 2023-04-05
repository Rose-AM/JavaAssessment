package com.vmorg;

public class ServerMachine extends VirtualMachine{
    private String linuxDistributionName;
    private int majorDistributionNumber;
    private String kernelVersion;
    int serverCPUNumber;
    int serverRamSize;
    int hardDiskSize;


    //Setters
    public void setServerCPUNumber(int serverCPUNumber) {
        VirtualMachine cpuNumber = new VirtualMachine();
        serverCPUNumber = cpuNumber.getNumberOfCPUs();
        if(serverCPUNumber >= 4 || serverCPUNumber <= 8 && serverCPUNumber !=0)
        this.serverCPUNumber = serverCPUNumber;
    }

    public void setRamSize(int ramSize) {
        VirtualMachine cpuNumber = new VirtualMachine();
        ramSize = cpuNumber.getRamSizeInGB();
        if(ramSize >= 64 || ramSize <= 128 && ramSize !=0)
        this.serverRamSize = ramSize;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}