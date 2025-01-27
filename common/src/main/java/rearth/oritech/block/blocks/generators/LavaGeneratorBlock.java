package rearth.oritech.block.blocks.generators;

import net.minecraft.block.entity.BlockEntity;
import org.jetbrains.annotations.NotNull;
import rearth.oritech.block.base.block.MultiblockMachine;
import rearth.oritech.block.entity.generators.LavaGeneratorEntity;

public class LavaGeneratorBlock extends MultiblockMachine {
    public LavaGeneratorBlock(Settings settings) {
        super(settings);
    }
    
    @Override
    public @NotNull Class<? extends BlockEntity> getBlockEntityType() {
        return LavaGeneratorEntity.class;
    }
}
