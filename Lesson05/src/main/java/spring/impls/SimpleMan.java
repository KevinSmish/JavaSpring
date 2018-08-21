package spring.impls;

import spring.intarfaces.Lyricist;

public class SimpleMan implements Lyricist {

	@Override
	public String Generate() {
		return "Я человек простой, стихов не пишу";
	}

}
