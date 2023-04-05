package com.vmorg;

public class DesktopMachine extends VirtualMachine{
    private int msWindowsVersion;
    private String buildNumber;
    int desktopCpuNumber;

    //getter
    public int getDesktopCpuNumber() {
        return desktopCpuNumber;
    }

    //setter
    public void setDesktopCpuNumber(int desktopCpuNumber) {
        VirtualMachine cpuNumber = new VirtualMachine();
        desktopCpuNumber = cpuNumber.getNumberOfCPUs();

        if(desktopCpuNumber <= 2 && desktopCpuNumber !=0)
        this.desktopCpuNumber = desktopCpuNumber;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
