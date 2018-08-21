package spring.impls;

import org.springframework.stereotype.Component;

import spring.intarfaces.Lyricist;

@Component("LyricistBean1")
public class Poushkin implements Lyricist {

	@Override
	public String Generate() {
		return "Я помню чудное мгновенье:\r\n" + "Передо мной явилась ты,\r\n" + "Как мимолетное виденье,\r\n"
				+ "Как гений чистой красоты.";
	}

}
