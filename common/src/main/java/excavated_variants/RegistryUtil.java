package excavated_variants;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

public class RegistryUtil {
    @ExpectPlatform
    @Nullable
    public static Block getBlockById(ResourceLocation rl) {
        throw new AssertionError();
    }
}