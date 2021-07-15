public class Server extends Handler {

    private final String name;
    private final double probability = 0.9;

    public Server(String name) {
       this.name = name;
    }

    @Override
    public void handle(Request request) {
        if(isBusy()) {
            System.out.printf("Сервер %s занят\n", name);
            super.handle(request);
        }
        else {
            System.out.printf("Сервер %s обрабатывает запрос %s\n",
                    name, request.getData());
        }
    }

    private boolean isBusy() {
        return Math.random() < probability;
    }
}

