// 5. Replace Multiple Spaces with a Single Space
class SpaceReplacer {
    public static void main(String[] args) {
        System.out.println(replace("This    is  an example    with multiple      spaces."));
    }

    public static String replace(String text) {
        return text.replaceAll("\\s+", " ");
    }
}