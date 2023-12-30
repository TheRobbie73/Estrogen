package dev.mayaqq.estrogen.registry.common;

import com.simibubi.create.Create;
import com.simibubi.create.content.kinetics.BlockStressDefaults;
import com.simibubi.create.foundation.data.AssetLookup;
import com.simibubi.create.foundation.data.SharedProperties;
import com.tterrag.registrate.util.entry.BlockEntry;
import dev.mayaqq.estrogen.registry.common.blocks.CentrifugeBlock;

import static com.simibubi.create.foundation.data.ModelGen.customItemModel;
import static dev.mayaqq.estrogen.Estrogen.REGISTRATE;

public class EstrogenBlocks {

    static {
        REGISTRATE.setCreativeTab(EstrogenItems.ESTROGEN_GROUP_KEY);
    }

    public static final BlockEntry<CentrifugeBlock> CENTRIFUGE = REGISTRATE.block("centrifuge", CentrifugeBlock::new)
            .initialProperties(SharedProperties::copperMetal)
            .properties(p -> p.mapColor(MapColor.ORANGE))
            .blockstate((c, p) -> p.simpleBlock(c.getEntry(), AssetLookup.partialBaseModel(c, p)))
            .transform(BlockStressDefaults.setImpact(8.0))
            .item()
            .transform(customItemModel())
            .addLayer(() -> RenderLayer::getCutout)
            .register();

    public static void register() {}
}