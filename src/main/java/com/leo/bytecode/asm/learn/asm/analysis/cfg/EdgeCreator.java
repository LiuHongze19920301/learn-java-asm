package com.leo.bytecode.asm.learn.asm.analysis.cfg;

public interface EdgeCreator {
    void newControlFlowEdge(int insn, int successor);

    void newControlFlowExceptionEdge(int insn, int successor, boolean npe);
}