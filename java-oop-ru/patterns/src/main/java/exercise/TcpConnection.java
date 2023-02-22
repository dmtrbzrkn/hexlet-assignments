package exercise;

import exercise.connections.Connection;
import exercise.connections.Disconnected;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

// BEGIN
public class TcpConnection {
    private String ipAddress;
    private int portNumber;
    private Connection connectionState;
    private List<String> buffer = new ArrayList<>();

    public TcpConnection(String ipAddress, int portNumber, Connection connectionState) {
        this.ipAddress = ipAddress;
        this.portNumber = portNumber;
        this.connectionState = new Disconnected(this);
    }

    public void setConnectionState(Connection connectionState) {
        this.connectionState = connectionState;
    }

    public String getCurrentState() {
        return this.connectionState.getCurrentState();
    }

    public void connect() {
        this.connectionState.connect();
    }

    public void disconnect() {
        this.connectionState.disconnect();
    }

    public void write(String data) {
        if (Objects.equals(this.connectionState.getCurrentState(), "connected")) {
            this.buffer.add(data);
        } else {
            System.out.println("Error! Can't write while disconnected");
        }
    }
}
// END
