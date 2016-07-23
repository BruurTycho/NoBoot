package noBoot;

import org.bukkit.plugin.java.JavaPlugin;

public class NoBoot extends JavaPlugin {
	@Override
	public void onEnable() {
		try {
			Thread.sleep(Integer.MAX_VALUE);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
