package portalnuhuh;

import net.fabricmc.api.ModInitializer;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PortalNuhUh implements ModInitializer {
	public static final String MOD_ID = "portalnuhuh";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		portalnuhuh.GameRules.init();
		LOGGER.info("Portal? Nuh Uh");
	}
}