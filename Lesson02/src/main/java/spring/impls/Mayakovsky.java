package spring.impls;

import spring.intarfaces.Lyricist;

public class Mayakovsky implements Lyricist {

	@Override
	public String Generate() {
		return "А вы\r\n" + "ноктюрн сыграть\r\n" + "могли бы\r\n" + "на флейте водосточных труб?";
	}

}
