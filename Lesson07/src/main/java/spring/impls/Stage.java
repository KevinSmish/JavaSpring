package spring.impls;

import spring.intarfaces.Lyricist;

public class Stage {
	private Lyricist lyr1;
	private Lyricist lyr2;

	public void setLyr1(Lyricist lyr1) {
		this.lyr1 = lyr1;
	}

	public void setLyr2(Lyricist lyr2) {
		this.lyr2 = lyr2;
	}

	public void Act() {
		System.out.println("Первый поэт:");
		System.out.println(lyr1.Generate());

		System.out.println();
		System.out.println("Второй поэт:");
		System.out.println(lyr2.Generate());

		System.out.println();

		System.out.print("В литературной дуэли победил ");
		if (Math.random() < 0.1) {
			System.out.println("Первый поэт.");
		} else {
			System.out.println("Второй поэт.");
		}
	}
}
