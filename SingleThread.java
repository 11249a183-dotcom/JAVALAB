class SingleThread {
    public static void main(String[] args) {

        System.out.println("Main thread started");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }

        System.out.println("Main thread ended");
    }
}