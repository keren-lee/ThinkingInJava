package cn.com.tyung.exam_4;

public class HorrorShow {
	
	static void u(Monster m) {
		m.menace();
	}
	
	static void v(DangerousMonster dm) {
		dm.menace();
		dm.destory();
	}
	
	static void w(Lethal l) {
		l.kill();
	}
	
	public static void main(String[] args) {
		DangerousMonster dm = new DragonZilla();
		u(dm);
		v(dm);
		Vampire vm = new VeryBadVampire();
		u(vm);
		v(vm);
		w(vm);
	}
}
