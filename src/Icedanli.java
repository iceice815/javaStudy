/**
 * Created by iceice on 2018/5/3.
 */
public class Icedanli {
    private Boolean update = new Boolean(false);
    private int count =0;
    private static Icedanli icedanli = null;
    private Icedanli(){}
    public static synchronized Icedanli getInstance(){
        if(icedanli ==null ){
            icedanli = new Icedanli();
        }
        return icedanli;
    }

    public Boolean getUpdate() {
        return update;
    }

    public void setUpdate(Boolean update) {
        this.update = update;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = this.count+count;
    }
    public static void main(String[] args){
        Icedanli dl1 = Icedanli.getInstance();
        dl1.setUpdate(true);
        dl1.setCount(2);
        Icedanli dl2 = Icedanli.getInstance();
        System.out.println(dl2.getUpdate());
        System.out.println(dl2.getCount());
    }
}
