
public class InterfaceExample {

    public static void main(String[] args) {

       // Account ac=new Account();
       
       Account ac1, ac2;
       
       ac1=new SavingAccount();
       ac2=new CurrentAccount();
       
       ac1.openAccount();
       
       ac2.openAccount();
        
    }
}
