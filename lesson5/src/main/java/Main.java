public class Main {
    public static void main(String[] args) {
        Handler handler = new BusyHandler();

        handler.link(new Server("main"))
                .link(new Server("reserve1"))
                .link(new Server("reserve2"))
                .link(handler);

        for (int i = 0; i < 10; i++) {
            final int temp = i;
            handler.handle(new Request() {
                @Override
                public String getData() {
                    return Integer.toString(temp);
                }
            });
        }
    }
}
