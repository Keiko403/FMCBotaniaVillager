package keiko403.botaniavillager.registry;

import keiko403.botaniavillager.BotaniaVillager;
import keiko403.botaniavillager.platform.CommonPlatformHelper;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Supplier;

public class BVBlocks {
    public static void init() {}

    //public static final Supplier<Block> OCEANOGRAPHY_TABLE = registerBlock("oceanography_table", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CARTOGRAPHY_TABLE)));
    
    public static <T extends Block> Supplier<T> registerBlock(String name, Supplier<T> block) {
        Supplier<T> toReturn = CommonPlatformHelper.registerBlock(name, block);
        CommonPlatformHelper.registerItem(name, () -> new BlockItem(toReturn.get(), new Item.Properties().tab(BotaniaVillager.TAB)));
        return toReturn;
    }
}