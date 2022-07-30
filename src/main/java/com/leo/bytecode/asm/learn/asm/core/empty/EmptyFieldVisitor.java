package com.leo.bytecode.asm.learn.asm.core.empty;

import org.objectweb.asm.FieldVisitor;

public class EmptyFieldVisitor extends FieldVisitor {
    public EmptyFieldVisitor(int api, FieldVisitor fieldVisitor) {
        super(api, fieldVisitor);
    }
}
