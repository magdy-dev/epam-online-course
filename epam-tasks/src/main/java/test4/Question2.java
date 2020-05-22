package test4;
//Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте конструктор,
// инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра класса.
public class Question2 {
   private String name ;
    private String pass;


   public Question2(){
       this .name=name;
       this.pass=pass;
   }
    public Question2(String name, String pass){
        this.name=" welcome to epam";
        this.pass="1234567";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }


    public static void main (String args[]){
       Question2 question2=new Question2();
       question2.getName();
       question2.getPass();



    }
}
