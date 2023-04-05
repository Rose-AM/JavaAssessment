package com.vmorg;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;


class VirtualMachineTest {

    @Test
     void setHostName() {

        System.out.println("Number of Machines to build:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of CPUs:");
        int numberOfCpu = scanner.nextInt();
        System.out.println();
    }

    @Test
    void getSizeOfHardDisk() {
    }

    @Test
    void getNumberOfCPUs() {
    }

    @Test
    void getNumberOfVirtualMachines() {
    }
}