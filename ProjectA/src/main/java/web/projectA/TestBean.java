package web.projectA;

public class TestBean {
    private String name;
    public TestBean(String name) {
        this.name = name;
    }
    public String GetName(){
        return name;
    }
    public void SetName(String name){
        this.name = name;
    }
}
