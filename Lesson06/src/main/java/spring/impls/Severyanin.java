package spring.impls;

import spring.intarfaces.Lyricist;

public class Severyanin implements Lyricist {

	@Override
	public String Generate() {
		return "Это было у моря, где ажурная пена,\r\n" + "Где встречается редко городской экипаж…\r\n"
				+ "Королева играла — в башне замка — Шопена,\r\n" + "И, внимая Шопену, полюбил её паж. ";
	}

}
