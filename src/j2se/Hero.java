package j2se;

public class Hero {
	String name;
	float hp;
	float armor;
	int moveSpeed;
	int deadTimes;//送了多少次
	int killTimes;//杀人数
	int assitantTimes;//助攻
	int money;//金钱
	int lastHit;//补刀数
	int attackSpeed;//攻击速度
	String wordAfterKill;// 杀人后说的话
    String wordAfterKilled;// 被杀后说的话
    //坑队友
    void keng(){
    	System.out.println("坑队友");
    }
    //获取护甲
    float getArmor(){
    	return armor;
    }
    //加速
    void addSpeed(int speed){
    	moveSpeed = moveSpeed + speed;
    }
    //超神
    void legendary(){
    	System.out.println(this.name+"超神了");
    }
    //获取血量
    float getHp(){
    	return hp;
    }
    //回血
    void recovery(float blood){
    	System.out.println(this.name+"前血量："+this.getHp());
    	System.out.println("回复"+blood+"血量");
    	hp = hp + blood;
    	System.out.println(this.name+"现在血量："+this.getHp());
    }
    
	public static void main(String[] args) {
		Hero garen = new Hero();
		garen.name = "盖伦";
		garen.hp = 616.28f;
		garen.armor = 27.536f;
		garen.moveSpeed = 350;
		garen.addSpeed(100);
		garen.recovery(100f);
		
		Hero teemo = new Hero();
		teemo.name = "提莫";
        teemo.hp = 383f;
        teemo.armor = 14f;
        teemo.moveSpeed = 330;
        teemo.legendary();
	}
}
