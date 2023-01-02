package boksoyunu;

public class Runner {
    public static void main(String[] args) {
        Fighter f1=new Fighter("A",12,120,100,100);
        Fighter f2=new Fighter("B",15,85,85,50);

        Match match=new Match(f1,f2,85,100);
        match.run();

    }
}
