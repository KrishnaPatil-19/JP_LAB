package command.line.apps;

import friends.info.Friend; //importing Friend class from aforementioned package to use its functionalities & providing a layer of abstraction.

import java.time.LocalDate;

public class E_PackageDemo {
    public static void main(String[] args) {
        Friend Iyer = new Friend("Tushar N Chaudhari", LocalDate.of(2003,12,21), true);
        Iyer.displayInfo();
    }
}
