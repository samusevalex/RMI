import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServerHandler extends UnicastRemoteObject implements CalculatorRMIInterface {
    protected ServerHandler() throws RemoteException {
        super();
    }

    @Override
    public int calc(int x, int y) throws RemoteException {
        return x * y;
    }

}