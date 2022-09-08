package game;

import view.IBackground;

public class Background implements IBackground {

	private String icon = "";
	
	public Background(String icon) {
		this.icon = icon;
	}
	
	@Override
	public String getImagePath() {
		return icon;
	}

}
