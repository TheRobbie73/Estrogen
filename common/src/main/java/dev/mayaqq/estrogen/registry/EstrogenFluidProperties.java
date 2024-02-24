package dev.mayaqq.estrogen.registry;

import dev.mayaqq.estrogen.Estrogen;
import dev.mayaqq.estrogen.utils.EstrogenColors;
import earth.terrarium.botarium.common.registry.fluid.FluidData;
import earth.terrarium.botarium.common.registry.fluid.FluidProperties;
import earth.terrarium.botarium.common.registry.fluid.FluidRegistry;
import net.minecraft.resources.ResourceLocation;

public class EstrogenFluidProperties {

    public static final FluidRegistry FLUID_PROPERTIES = new FluidRegistry(Estrogen.MOD_ID);

    public static final FluidData MOLTEN_SLIME = FLUID_PROPERTIES.register("molten_slime", FluidProperties.create()
            .still(Estrogen.id("block/blank_lava/blank_lava_still"))
            .flowing(Estrogen.id("block/blank_lava/blank_lava_flow"))
            .overlay(Estrogen.id("block/blank_lava/blank_lava_flow"))
            .temperature(1300)
            .tintColor(EstrogenColors.MOLTEN_SLIME.value)
            .canConvertToSource(false)
    );

    public static final FluidData TESTOSTERONE_MIXTURE = FLUID_PROPERTIES.register("testosterone_mixture", FluidProperties.create()
            .still(new ResourceLocation("minecraft", "block/water_still"))
            .flowing(new ResourceLocation("minecraft", "block/water_flow"))
            .overlay(new ResourceLocation("minecraft", "block/water_flow"))
            .tintColor(EstrogenColors.TESTOSTERONE_MIXTURE.value)
            .canConvertToSource(false)
    );

    public static final FluidData LIQUID_ESTROGEN = FLUID_PROPERTIES.register("liquid_estrogen", FluidProperties.create()
            .still(Estrogen.id("block/liquid_estrogen/liquid_estrogen_still"))
            .flowing(Estrogen.id("block/liquid_estrogen/liquid_estrogen_flow"))
            .overlay(Estrogen.id("block/liquid_estrogen/liquid_estrogen_flow"))
            .canConvertToSource(false)
    );

    public static final FluidData FILTRATED_HORSE_URINE = FLUID_PROPERTIES.register("filtrated_horse_urine", FluidProperties.create()
            .still(new ResourceLocation("minecraft", "block/water_still"))
            .flowing(new ResourceLocation("minecraft", "block/water_flow"))
            .overlay(new ResourceLocation("minecraft", "block/water_flow"))
            .tintColor(EstrogenColors.FILTRATED_HORSE_URINE.value)
            .canConvertToSource(false)
    );

    public static final FluidData HORSE_URINE = FLUID_PROPERTIES.register("horse_urine", FluidProperties.create()
            .still(new ResourceLocation("minecraft", "block/water_still"))
            .flowing(new ResourceLocation("minecraft", "block/water_flow"))
            .overlay(new ResourceLocation("minecraft", "block/water_flow"))
            .tintColor(EstrogenColors.HORSE_URINE.value)
            .canConvertToSource(false)
    );

    public static final FluidData MOLTEN_AMETHYST = FLUID_PROPERTIES.register("molten_amethyst", FluidProperties.create()
            .still(Estrogen.id("block/blank_lava/blank_lava_still"))
            .flowing(Estrogen.id("block/blank_lava/blank_lava_flow"))
            .overlay(Estrogen.id("block/blank_lava/blank_lava_flow"))
            .temperature(1300)
            .tintColor(EstrogenColors.MOLTEN_AMETHYST.value)
            .canConvertToSource(false)
    );
}