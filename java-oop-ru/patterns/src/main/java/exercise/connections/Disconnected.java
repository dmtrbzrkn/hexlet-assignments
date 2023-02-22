package exercise.connections;

import exercise.TcpConnection;

// BEGIN
public class Disconnected implements Connection {
    private TcpConnection tcpConnection;

    public Disconnected(TcpConnection tcpConnection) {
        this.tcpConnection = tcpConnection;
    }

    @Override
    public void connect() {
        this.tcpConnection.setConnectionState(new Connected(this.tcpConnection));
        System.out.println("Connected");
    }

    @Override
    public void disconnect() {
        System.out.println("Error! Already disconnected");
    }

    @Override
    public String getCurrentState() {
        return "disconnected";
    }
}
// END
