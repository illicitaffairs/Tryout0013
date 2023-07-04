import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComputadorDeBordo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Computador de Bordo");
        JLabel coordenadasLabel = new JLabel();

        frame.add(coordenadasLabel);
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Timer timer = new Timer();
        timer.schedule(new GerarCoordenadas(coordenadasLabel), 0, 60000); // Gera coordenadas a cada minuto (60000 milissegundos)
    }

    static class GerarCoordenadas extends TimerTask {
        private Random random = new Random();
        private JLabel coordenadasLabel;

        public GerarCoordenadas(JLabel coordenadasLabel) {
            this.coordenadasLabel = coordenadasLabel;
        }

        @Override
        public void run() {
            double latitude = gerarLatitude(); // Gera uma latitude aleatória entre -90 e 90
            double longitude = gerarLongitude(); // Gera uma longitude aleatória entre -180 e 180

            String pais = obterPais(latitude, longitude);

            coordenadasLabel.setText("Latitude: " + latitude + ", Longitude: " + longitude + ", País: " + pais);
        }

        private double gerarLatitude() {
            return random.nextDouble() * 180 - 90;
        }

        private double gerarLongitude() {
            return random.nextDouble() * 360 - 180;
        }

        private String obterPais(double latitude, double longitude) {
            // Lógica para obter o país com base nas coordenadas

            // Exemplo de retorno fixo apenas para fins de demonstração
            if (latitude > 0 && longitude > 0) {
                return "Canadá";
            } else if (latitude > 0 && longitude < 0) {
                return "Estados Unidos";
            } else if (latitude < 0 && longitude > 0) {
                return "Brasil";
            } else {
                return "Austrália";
            }
        }
    }
}
