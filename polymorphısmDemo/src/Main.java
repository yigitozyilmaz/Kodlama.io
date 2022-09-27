public class Main { //Çok biçimlilik

    public static void main(String[] args) {
//        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new DatabaseLogger(), new ConsoleLogger()};
//        for (BaseLogger logger : loggers) {
//            logger.log("Log Mesajı");
//        }
        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.Add();
    }
}
