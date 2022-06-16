import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            // Скачиваем список всех функций с сервера по порту 1099
            final Registry registry = LocateRegistry.getRegistry(1099);
            // В списке ищем функцию под именем "server.calculator"
            CalculatorRMIInterface calculator = (CalculatorRMIInterface) registry.lookup("server.calculator");
            // Можно через Naming: CalculatorRMIInterface calculator = (CalculatorRMIInterface) java.rmi.Naming.lookup("//localhost/MyServer")
            int result = calculator.calc(11, 22);
            System.out.println(result);
        } catch (RemoteException | NotBoundException e) {

        }
    }
}
/*
Работа со Swing.

Диалоговое окно типа введи имя
String text = javax.swing.JOptionPane.showInputDialog("What is your name?")

Простой окно с текстом
javax.swing.JOptionPane.showMessageDialog(null, text)
*/