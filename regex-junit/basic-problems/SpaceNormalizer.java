// 8. Replace Multiple Spaces with a Single Space
class SpaceNormalizer {
    public static void main(String[] args) {
        System.out.println(normalize("This   is   an   example   with   multiple   spaces."));
    }

    public static String normalize(String text) {
        return text.replaceAll("\\s+", " ").trim();
    }
}