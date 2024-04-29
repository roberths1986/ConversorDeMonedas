import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {


        ConsultaMoneda consultaMoneda = new ConsultaMoneda();
        Moneda conversor = consultaMoneda.buscaMoneda("USD","ARS");

        int opcion = 0;
        double montoAConvertir;

        while (opcion != 7) {
            Menu menuPrincipal = new Menu();
            menuPrincipal.menuPrincipal();

            Scanner lectura = new Scanner(System.in);
            Scanner monto = new Scanner(System.in);
            opcion = lectura.nextInt();

            DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
            Date hora = new Date();

            if (opcion == 7) {
                System.out.println("Usted ha salido de nuestra App. !!Hasta Luego!!");
                break;
            } else {
                switch (opcion) {
                    case 1:
                        montoAConvertir = monto.nextDouble();
                        conversor = consultaMoneda.buscaMoneda("USD","ARS");
                        System.out.println(montoAConvertir + " USD Equivale a: " + (conversor.conversion_rate() * montoAConvertir) + " Pesos Argentinos ARS");
                        System.out.println("Hora de su consulta: " + dateFormat.format(hora) + "\n");
                        break;
                    case 2:
                        montoAConvertir = monto.nextDouble();
                        conversor = consultaMoneda.buscaMoneda("ARS","USD");
                        System.out.println(montoAConvertir + " ARS Equivale a: " + (conversor.conversion_rate() * montoAConvertir) + " Dolares USD");
                        System.out.println("Hora de su consulta: " + dateFormat.format(hora) + "\n");
                        break;
                    case 3:
                        montoAConvertir = monto.nextDouble();
                        conversor = consultaMoneda.buscaMoneda("USD","BRL");
                        System.out.println(montoAConvertir + " USD Equivale a: " + (conversor.conversion_rate() * montoAConvertir) + " Reales Brasileños BRL");
                        System.out.println("Hora de su consulta: " + dateFormat.format(hora) + "\n");
                        break;
                    case 4:
                        montoAConvertir = monto.nextDouble();
                        conversor = consultaMoneda.buscaMoneda("BRL","USD");
                        System.out.println(montoAConvertir + " BRL Equivale a: " + (conversor.conversion_rate() * montoAConvertir) + " Dolares USD");
                        System.out.println("Hora de su consulta: " + dateFormat.format(hora) + "\n");
                        break;
                    case 5:
                        montoAConvertir = monto.nextDouble();
                        conversor = consultaMoneda.buscaMoneda("USD","UYU");
                        System.out.println(montoAConvertir + " USD Equivale a: " + (conversor.conversion_rate() * montoAConvertir) + " Pesos Uruguayos UYU");
                        System.out.println("Hora de su consulta: " + dateFormat.format(hora) + "\n");
                        break;
                    case 6:
                        montoAConvertir = monto.nextDouble();
                        conversor = consultaMoneda.buscaMoneda("UYU","USD");
                        System.out.println(montoAConvertir + " UYU Equivale a: " + (conversor.conversion_rate() * montoAConvertir) + " Dolares USD");
                        System.out.println("Hora de su consulta: " + dateFormat.format(hora) + "\n");
                        break;
                    default:
                        System.out.println("La opcion " + opcion + " no existe, intente nuevamente\n");
                        break;
                }
            }
        }
    }
}
