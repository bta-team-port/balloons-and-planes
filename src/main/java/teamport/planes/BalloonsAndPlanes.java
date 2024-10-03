package teamport.planes;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.util.GameStartEntrypoint;


public class BalloonsAndPlanes implements ModInitializer, GameStartEntrypoint {
    public static final String MOD_ID = "planes";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {
        LOGGER.info("Ballons and Planes has been initialized.");
    }

	@Override
	public void beforeGameStart() {

	}

	@Override
	public void afterGameStart() {

	}
}
