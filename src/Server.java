import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server{
    public static void main(String[] args){
        try{
            // Создаём объект с функцией, которую можно вызвать Remote
            final ServerHandler server = new ServerHandler();
            // Запускаем сервис, который предоставляет Remote вызов функций
            final Registry registry = LocateRegistry.createRegistry(1099);
            // Биндим нашу функцию к сервису
            registry.bind("server.calculator", server);
            // Можно через Naming: java.rmi.Naming.rebind("//localhost/MyServer", new ServerHandler())
        } catch (RemoteException | AlreadyBoundException e){

        }
    }
}