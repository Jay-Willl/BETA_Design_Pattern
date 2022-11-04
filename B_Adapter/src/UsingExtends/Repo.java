package UsingExtends;

public class Repo {
    private String str;

    public Repo(String str){
        this.str = str;
    }

    public void cloneRepo(){
        System.out.println("cloneRepo");
    }

    public void compileRepo(){
        System.out.println("compileRepo");
    }
}
