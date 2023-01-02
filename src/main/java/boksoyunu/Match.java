package boksoyunu;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run(){
        if (isCheck()){
            while (this.f1.health> 0 && this.f2.health>0){
                System.out.println("===========YENI ROUND===========");
if (isF1Attack()){//f1 mi baslayacak true ise f1 attack önce
    if (f1Attack()) break;
    if (f2Attack()) break;

}else {//false ise f2 attack önce
    if (f2Attack())break;

    if (f1Attack())break;


     }printScore();


            }
        }else{
            System.out.println("Sporcularin sikletleri uymuyor");
        }


    }public boolean isF1Attack(){
        //%50 ihtimal ile f1 mi baslayacak
        if ((int)(Math.random()*100)%2==1){
            return true;
        }else
            return false;
    }public boolean f1Attack(){//f1 attack
        this.f2.health= this.f1.hit(this.f2);
        return isWin();


    }
    public boolean f2Attack(){
        //f2 attack
          this.f1.health= this.f2.hit(this.f1);
          return isWin();
    }
    boolean isCheck(){
        return(this.f1.weight>= minWeight && this.f1.weight<=maxWeight)&& (this.f2.weight>= minWeight && this.f2.weight<=maxWeight);
    }
    boolean isWin(){
        if (this.f1.health==0){
            System.out.println(f2.name+" kazandi !");
            return true;
        }if (this.f2.health==0){
            System.out.println(f1.name+" kazandi!");
            return true;
        }return false;
    } public void printScore() {
        System.out.println("------------");
        System.out.println(this.f1.name + " Kalan Can \t:" + this.f1.health);
        System.out.println(this.f2.name + " Kalan Can \t:" + this.f2.health);
    }


    }

