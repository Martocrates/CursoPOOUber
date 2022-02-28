package JAVA;


public class Driver extends Account {

    public Driver(Integer id, String name, String document, String email, String password) {
        super(id, name, document, email, password);

        //TODO Auto-generated constructor stub
    }
    public void ImprimirUsuario(){
        System.out.println("El usuario"+name+"es un condcutor");
    }
}
