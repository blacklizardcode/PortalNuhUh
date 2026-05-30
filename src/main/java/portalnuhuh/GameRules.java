package portalnuhuh;

import net.fabricmc.fabric.api.gamerule.v1.GameRuleBuilder;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.gamerules.GameRule;
import net.minecraft.world.level.gamerules.GameRuleCategory;

public class GameRules {
    public static final GameRule<Boolean> enableNetherPortal = GameRuleBuilder
        .forBoolean(false)
        .category(GameRuleCategory.MISC)
        .buildAndRegister(Identifier.fromNamespaceAndPath(PortalNuhUh.MOD_ID, "enable_nether_portal"));
    public static final GameRule<Boolean> enableEndPortal = GameRuleBuilder
        .forBoolean(false)
        .category(GameRuleCategory.MISC)
        .buildAndRegister(Identifier.fromNamespaceAndPath(PortalNuhUh.MOD_ID, "enable_end_portal"));
    public static void init() {
        return;
    } 
}
