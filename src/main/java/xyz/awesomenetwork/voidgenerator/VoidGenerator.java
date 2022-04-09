package xyz.awesomenetwork.voidgenerator;

import java.util.Random;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.generator.ChunkGenerator;

public class VoidGenerator extends ChunkGenerator {
    // I know this method is deprecated but the server shouted at me for not using it
    @Override
    public ChunkData generateChunkData(World world, Random random, int chunkX, int chunkZ, BiomeGrid biome) {
        ChunkData chunkData = createChunkData(world);
        chunkData.setRegion(0, 0, 0, 16, chunkData.getMaxHeight(), 16, Material.AIR);
        return chunkData;
    }

    @Override
    public boolean canSpawn(World world, int x, int y) {
        return true;
    }

    @Override
    public Location getFixedSpawnLocation(World world, Random random) {
        return new Location(world, 0.0, 60.0, 0.0);
    }
}
