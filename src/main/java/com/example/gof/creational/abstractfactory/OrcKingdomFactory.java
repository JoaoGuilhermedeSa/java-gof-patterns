package com.example.gof.creational.abstractfactory;

public class OrcKingdomFactory implements KingdomFactory {
    @Override
    public King createKing() {
        return new OrcKing();
    }

    @Override
    public Castle createCastle() {
        return new OrcCastle();
    }
}
