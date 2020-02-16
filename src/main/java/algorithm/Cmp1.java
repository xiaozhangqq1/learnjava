package algorithm;

public class Cmp1 implements IntCompare {
    @Override
    public int compare(int a, int b) {
        if(a>b){
            return 1;
        }else if (a<b){
            return -1;
        }
        return 0;
    }
}
