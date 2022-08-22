package keiko403.botaniavillager.registry;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import keiko403.botaniavillager.mixin.VillagerProfessionInvoker;
import keiko403.botaniavillager.platform.CommonPlatformHelper;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.ConfiguredStructureTags;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.saveddata.maps.MapDecoration;

import java.util.function.Supplier;

public class BVProfessions {
    public static void init() {}

    //public static final Supplier<VillagerProfession> OCEANOGRAPHER = CommonPlatformHelper.registerProfession("oceanographer",
            //() -> VillagerProfessionInvoker.invokeConstructor("oceanographer", BVPoiTypes.OCEANOGRAPHER_POI.get(), ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_CARTOGRAPHER));


    //public static void fillTradeData() {
        // OCEANOGRAPHER TRADES
        //VillagerTrades.ItemListing[] oceanographerLevel1 = new VillagerTrades.ItemListing[]{
                //new VillagerTrades.EmeraldForItems(Items.PRISMARINE,14,16,2),
                //new VillagerTrades.ItemsForEmeralds(Items.SEA_LANTERN, 2, 4, 16, 1)
        //};
        //VillagerTrades.ItemListing[] oceanographerLevel2 = new VillagerTrades.ItemListing[]{
                //new VillagerTrades.EmeraldForItems(Items.PRISMARINE_BRICKS,14,16,10),
                //new VillagerTrades.ItemsForEmeralds(Items.SPONGE, 4, 2, 16, 5)
        //};
        //VillagerTrades.ItemListing[] oceanographerLevel3 = new VillagerTrades.ItemListing[]{
                //new VillagerTrades.EmeraldForItems(Items.DARK_PRISMARINE,12,16,20),
                //new VillagerTrades.TreasureMapForEmeralds(13, ConfiguredStructureTags.ON_TREASURE_MAPS, "filled_map.buried_treasure", MapDecoration.Type.RED_X, 12, 10)
        //};
        //VillagerTrades.ItemListing[] oceanographerLevel4 = new VillagerTrades.ItemListing[]{
                //new VillagerTrades.ItemsForEmeralds(Items.NAUTILUS_SHELL, 3, 1, 12, 15),
                //new VillagerTrades.ItemsForEmeralds(Items.HEART_OF_THE_SEA, 8, 1, 12, 15),
        //};
        //VillagerTrades.ItemListing[] oceanographerLevel5 = new VillagerTrades.ItemListing[]{
                //new VillagerTrades.ItemsForEmeralds(Items.TRIDENT, 32, 1, 2, 30)
        //};
        //VillagerTrades.TRADES.put(OCEANOGRAPHER.get(),toIntMap(ImmutableMap.of(1,oceanographerLevel1,2,oceanographerLevel2,3,oceanographerLevel3,4,oceanographerLevel4,5,oceanographerLevel5)));


    //}

    //private static Int2ObjectMap<VillagerTrades.ItemListing[]> toIntMap(ImmutableMap<Integer, VillagerTrades.ItemListing[]> p_221238_0_) {
        //return new Int2ObjectOpenHashMap<>(p_221238_0_);
    //}
}