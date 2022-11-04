package UsingExtends;

public class CodeRunner extends Repo implements Code{

    private String str;
    public CodeRunner(String str){
        super(str);
    }

    @Override
    public void duplicate() {
        cloneRepo();
    }

    @Override
    public void compile() {
        compileRepo();
    }
}
