import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalculatorRMIInterface extends Remote {
    int calc(int x, int y) throws RemoteException;
}