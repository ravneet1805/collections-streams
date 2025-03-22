import java.io.*;
// 8. Piped Streams - Inter-Thread Communication
class PipedStreamExample {
    public static void main(String[] args) throws IOException {
        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream(pos);
        Thread writer = new Thread(() -> {
            try {
                pos.write("Hello, Piped Streams!".getBytes());
                pos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        Thread reader = new Thread(() -> {
            try {
                int data;
                while ((data = pis.read()) != -1) {
                    System.out.print((char) data);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        writer.start(); reader.start();
    }
}