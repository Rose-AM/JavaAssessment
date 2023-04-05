package com.vmorg.buildrequest;

public interface BuildRequest {
    int buildRequestNumber = 0;

    public default int setBuildRequestNumber(int buildRequestNumber) {
        return buildRequestNumber;
    }

    public default int getBuildRequestNumber() {
        return buildRequestNumber;
    }
}
