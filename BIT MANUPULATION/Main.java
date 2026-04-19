public class Main {

    static class BitManipulator {
        private int number;

        BitManipulator(int number) {
            this.number = number;
        }

        public int clearIthBit(int i) {
            return number & (~(1 << i));
        }
    }

    public static void main(String[] args) {
        BitManipulator obj = new BitManipulator(10);
        System.out.println(obj.clearIthBit(1));
    }
}
