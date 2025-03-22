import java.io.*;
// 7. Data Streams - Store and Retrieve Primitive Data
class DataStreamExample {
    public static void main(String[] args) throws IOException {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("students.dat"))) {
            dos.writeInt(1);
            dos.writeUTF("Alice");
            dos.writeDouble(3.8);
        }
        try (DataInputStream dis = new DataInputStream(new FileInputStream("students.dat"))) {
            System.out.println("Roll: " + dis.readInt() + ", Name: " + dis.readUTF() + ", GPA: " + dis.readDouble());
        }
    }
}
