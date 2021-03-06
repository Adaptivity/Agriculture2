package com.teammetallurgy.agriculture;

import net.minecraft.block.Block;

import com.teammetallurgy.agriculture.block.BlockSalt;
import com.teammetallurgy.agriculture.block.plant.BlockCinnamon;
import com.teammetallurgy.agriculture.block.plant.BlockPeanut;
import com.teammetallurgy.agriculture.block.plant.BlockStrawberry;
import com.teammetallurgy.agriculture.block.plant.BlockVanilla;
import com.teammetallurgy.agriculture.machine.brewer.BlockBrewer;
import com.teammetallurgy.agriculture.machine.brewer.TileEntityBrewer;
import com.teammetallurgy.agriculture.machine.counter.BlockCounter;
import com.teammetallurgy.agriculture.machine.counter.TileEntityCounter;
import com.teammetallurgy.agriculture.machine.frier.BlockFrier;
import com.teammetallurgy.agriculture.machine.frier.TileEntityFrier;
import com.teammetallurgy.agriculture.machine.icebox.BlockIcebox;
import com.teammetallurgy.agriculture.machine.icebox.TileEntityIcebox;
import com.teammetallurgy.agriculture.machine.oven.BlockOven;
import com.teammetallurgy.agriculture.machine.oven.TileEntityOven;
import com.teammetallurgy.agriculture.machine.processor.BlockProcessor;
import com.teammetallurgy.agriculture.machine.processor.TileEntityProcessor;

import cpw.mods.fml.common.registry.GameRegistry;

public class BlockList
{

    public static Block brewer;
    public static Block counter;
    public static Block frier;
    public static Block icebox;
    public static Block oven;
    public static Block processor;
    public static Block salt;

    public static Block cinnamon;
    public static Block peanut;
    public static Block strawberry;
    public static Block vanilla;

    public static void preInit()
    {
        String modID = Agriculture.MODID.toLowerCase();

        // Machines

        String blockName = "brewer";
        brewer = new BlockBrewer().setBlockName(modID + "." + blockName);
        GameRegistry.registerBlock(brewer, blockName);
        GameRegistry.registerTileEntity(TileEntityBrewer.class, blockName);

        blockName = "counter";
        counter = new BlockCounter().setBlockName(modID + "." + blockName);
        GameRegistry.registerBlock(counter, blockName);
        GameRegistry.registerTileEntity(TileEntityCounter.class, blockName);

        blockName = "frier";
        frier = new BlockFrier().setBlockName(modID + "." + blockName);
        GameRegistry.registerBlock(frier, blockName);
        GameRegistry.registerTileEntity(TileEntityFrier.class, blockName);

        blockName = "icebox";
        icebox = new BlockIcebox().setBlockName(modID + "." + blockName);
        GameRegistry.registerBlock(icebox, blockName);
        GameRegistry.registerTileEntity(TileEntityIcebox.class, blockName);

        blockName = "oven";
        oven = new BlockOven().setBlockName(modID + "." + blockName);
        GameRegistry.registerBlock(oven, blockName);
        GameRegistry.registerTileEntity(TileEntityOven.class, blockName);

        blockName = "processor";
        processor = new BlockProcessor().setBlockName(modID + "." + blockName);
        GameRegistry.registerBlock(processor, blockName);
        GameRegistry.registerTileEntity(TileEntityProcessor.class, blockName);

        blockName = "salt";
        salt = new BlockSalt();
        GameRegistry.registerBlock(salt, blockName);

        // Plants
        blockName = "cinnamon";
        cinnamon = new BlockCinnamon();
        GameRegistry.registerBlock(cinnamon, blockName);

        blockName = "peanut";
        peanut = new BlockPeanut();
        GameRegistry.registerBlock(peanut, blockName);

        blockName = "strawberry";
        strawberry = new BlockStrawberry();
        GameRegistry.registerBlock(strawberry, blockName);

        blockName = "vanilla";
        vanilla = new BlockVanilla();
        GameRegistry.registerBlock(vanilla, blockName);

    }

}
