package com.company;

public class Story {
    private Resident first;
    private Resident another;
    private Resident third;
    private Monster.Dragon dragon;


    public void AddFirst(Resident first) { this.first = first;}
    public void AddAnother(Resident another) { this.another = another;}
    public void AddThird(Resident third) { this.third = third;}
    public void AddDragon(Monster.Dragon dragon) { this.dragon = dragon;}




    public void go() {
        first.Wait();
        another.Wait();
        third.Wait();
        if (first.getWaitCondition() == WaitStatus.wait && another.getWaitCondition()==WaitStatus.wait && third.getWaitCondition()==WaitStatus.wait) {
            System.out.println(new Resident("Жители Змеевки").Wait());
            System.out.println(new He("Он").GoBack());

        }
        GossipStatus status = GossipStatus.spread;

        Gossip gossip = new Gossip();
        if(status == GossipStatus.spread) {
            System.out.println(gossip.Spread(status));
            System.out.println(new First("Одни").Speak(MonsterStatus.Baba_Yaga));
            System.out.println(new Another("Другие").Speak(MonsterStatus.Koshey));
            System.out.println(new Third("Третьи").Speak(MonsterStatus.Dragon));

        }
        EatStatus eatStatus = EatStatus.BabyBoy;
        System.out.println(dragon.Settle());

        if (eatStatus == EatStatus.BabyBoy){
            System.out.println(new Monster.Dragon("Дракон").Eat(EatStatus.BabyBoy));

        }
    }


}
