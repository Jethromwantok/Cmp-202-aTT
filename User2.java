public class User2 {
    String name;
    String password;

    String login(){
        return "Logged In";
    }
    String register(){
        if (name.equals("") || password.equals("")) {
            return "Can't be empty";
        }else{
            return "Success";
        }
    }
    public static void main(String[] args){
        User2 Jethro = new User2();
        System.out.println(Jethro.login());
        System.out.println(Jethro.register());
    }
}
