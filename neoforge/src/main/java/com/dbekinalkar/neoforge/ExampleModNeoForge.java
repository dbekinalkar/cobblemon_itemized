package com.dbekinalkar.neoforge;

import net.neoforged.fml.common.Mod;

import com.dbekinalkar.ExampleMod;

@Mod(ExampleMod.MOD_ID)
public final class ExampleModNeoForge {
    public ExampleModNeoForge() {
        // Run our common setup.
        ExampleMod.init();
    }
}
