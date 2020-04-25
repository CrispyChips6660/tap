package potatocult.tap.energy;

import net.minecraft.nbt.CompoundNBT;
import net.minecraftforge.energy.EnergyStorage;

public class TapEnergyStorage extends EnergyStorage {

    public TapEnergyStorage(int capacity) {
        super(capacity, capacity, capacity, 0);
    }

    public TapEnergyStorage(int capacity, int maxTransfer) {
        super(capacity, maxTransfer, maxTransfer, 0);
    }

    public TapEnergyStorage(int capacity, int maxReceive, int maxExtract) {
        super(capacity, maxReceive, maxExtract, 0);
    }

    public TapEnergyStorage(int capacity, int maxReceive, int maxExtract, int energy) {
        super(capacity, maxReceive, maxExtract, energy);
    }

    @Override
    public int receiveEnergy(int maxReceive, boolean simulate) {
        return super.receiveEnergy(maxReceive, simulate);
    }

    @Override
    public int extractEnergy(int maxExtract, boolean simulate) {
        return super.extractEnergy(maxExtract, simulate);
    }

    @Override
    public int getEnergyStored() {
        return super.getEnergyStored();
    }

    @Override
    public int getMaxEnergyStored() {
        return super.getMaxEnergyStored();
    }

    @Override
    public boolean canExtract() {
        return super.canExtract();
    }

    @Override
    public boolean canReceive() {
        return super.canReceive();
    }

    public void ReadFromNbt(CompoundNBT compound) {
        this.energy = compound.getInt("Energy");
        this.energy = compound.getInt("Capacity");
        this.energy = compound.getInt("MaxRecieve");
        this.energy = compound.getInt("MaxExtract");
    }

    public void WriteToNBT(CompoundNBT compound) {
        compound.putInt("Energy", this.energy);
        compound.putInt("Capacity", this.energy);
        compound.putInt("MaxRecieve", this.energy);
        compound.putInt("MaxExtract", this.energy);
    }
}
