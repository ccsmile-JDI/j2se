package j2se;

public class Hero {
	String name;
	float hp;
	float armor;
	int moveSpeed;
	int deadTimes;//���˶��ٴ�
	int killTimes;//ɱ����
	int assitantTimes;//����
	int money;//��Ǯ
	int lastHit;//������
	int attackSpeed;//�����ٶ�
	String wordAfterKill;// ɱ�˺�˵�Ļ�
    String wordAfterKilled;// ��ɱ��˵�Ļ�
    //�Ӷ���
    void keng(){
    	System.out.println("�Ӷ���");
    }
    //��ȡ����
    float getArmor(){
    	return armor;
    }
    //����
    void addSpeed(int speed){
    	moveSpeed = moveSpeed + speed;
    }
    //����
    void legendary(){
    	System.out.println(this.name+"������");
    }
    //��ȡѪ��
    float getHp(){
    	return hp;
    }
    //��Ѫ
    void recovery(float blood){
    	System.out.println(this.name+"ǰѪ����"+this.getHp());
    	System.out.println("�ظ�"+blood+"Ѫ��");
    	hp = hp + blood;
    	System.out.println(this.name+"����Ѫ����"+this.getHp());
    }
    
	public static void main(String[] args) {
		Hero garen = new Hero();
		garen.name = "����";
		garen.hp = 616.28f;
		garen.armor = 27.536f;
		garen.moveSpeed = 350;
		garen.addSpeed(100);
		garen.recovery(100f);
		
		Hero teemo = new Hero();
		teemo.name = "��Ī";
        teemo.hp = 383f;
        teemo.armor = 14f;
        teemo.moveSpeed = 330;
        teemo.legendary();
	}
}
