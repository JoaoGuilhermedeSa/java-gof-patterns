package com.example.gof.creational.abstractfactory;

public class ElfKingdomFactory implements KingdomFactory {
    @Override
    public King createKing() {
        return new ElfKing();
    }

    @Override
    public Castle createCastle() {
        return new ElfCastle();
    }
}
