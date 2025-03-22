import java.io.*;
// 6. Filter Streams - Convert Uppercase to Lowercase

class UpperToLower {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line.toLowerCase() + "\n");
            }
            System.out.println("Conversion done.");
        }
    }
}