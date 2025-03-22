import java.io.*;
// 5. ByteArray Stream - Convert Image to ByteArray
class ImageByteArray {
    public static void main(String[] args) throws IOException {
        File file = new File("image.jpg");
        byte[] bytes;
        try (FileInputStream fis = new FileInputStream(file);
             ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            bytes = bos.toByteArray();
        }
        try (FileOutputStream fos = new FileOutputStream("copy.jpg")) {
            fos.write(bytes);
            System.out.println("Image copied successfully.");
        }
    }
}