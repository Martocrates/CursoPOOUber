package JAVA;

public class User extends Account {

    public User(Integer id, String name, String document, String email, String password) {
        super(id, name, document, email, password);

        //TODO Auto-generated constructor stub
    }
    public void ImprimirUsuario(){
        System.out.println(name+"Es un usuario ");
    }
}
