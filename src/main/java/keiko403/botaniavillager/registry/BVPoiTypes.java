package keiko403.botaniavillager.registry;

import com.google.common.collect.ImmutableSet;
import keiko403.botaniavillager.mixin.PoiTypeInvoker;
import keiko403.botaniavillager.platform.CommonPlatformHelper;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Set;
import java.util.function.Supplier;

public class BVPoiTypes {
    public static void init() {}

    //public static final Supplier<PoiType> OCEANOGRAPHER_POI = CommonPlatformHelper.registerPoiType("oceanographer", () -> PoiTypeInvoker.invokeConstructor("oceanographer", getBlockStates(BVBlocks.OCEANOGRAPHY_TABLE), 1, 1));
    
    private static Set<BlockState> getBlockStates(Supplier<Block> block) {
        return ImmutableSet.copyOf(block.get().getStateDefinition().getPossibleStates());
    }
}