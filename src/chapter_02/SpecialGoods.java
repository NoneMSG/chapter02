package chapter_02;

import mypackage.Goods;

public class SpecialGoods extends Goods {
	public void test(){
		//protected는 다른 패키여도 자식에서 접근 가능하다.
		super.price = 0;
	}
}
