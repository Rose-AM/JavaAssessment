package com.vmorg;
import java.util.Scanner;

public class Main {

    public static void main (String[] args){
        VirtualMachine vMachine = new VirtualMachine();
        DesktopMachine dVMachine = new DesktopMachine();
        ServerMachine sVMachine = new ServerMachine();

        System.out.println("Number of Machines to build:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of CPUs:");
        int numberOfCpu = scanner.nextInt();
        System.out.println();

        vMachine.setNumberOfCPUs(numberOfCpu);
        System.out.println(numberOfCpu);

        createNewRequest(VirtualMachine machine)

    }
}