import com.anatas.terracotta.gateway.Gateway;

public class Main {
    public static void main(String... args) throws Exception {
        if (args.length == 0) {
            System.err.println("No enough arguments: Service host_ip port");
            System.err.println("                 or: Gateway port");
            System.exit(-1);
        }
        if (args[0].equalsIgnoreCase("gateway")) {
            if (args.length != 2) {
                System.err.println("No enough arguments: Gateway port");
                System.exit(-1);
            }
            Gateway gateway = new Gateway(Integer.parseInt(args[1]));
        } else if (args[0].equalsIgnoreCase("service")) {
            if (args.length != 3) {
                System.err.println("No enough arguments: Service host_ip port");
                System.exit(-1);
            }
            Service service = new Service(args[1], Integer.parseInt(args[2]));
        } else {
            System.err.println("No command " + args[0] + " found.");
        }
    }
}
