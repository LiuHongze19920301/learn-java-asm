package com.leo.bytecode.asm.learn.drawing.theme.table;

import com.leo.bytecode.asm.learn.drawing.canvas.Drawable;
import com.leo.bytecode.asm.learn.drawing.canvas.TextAlign;

public class FixedWidthOneLineTable extends OneLineTable implements Drawable {
    public final int fixedWidth;

    public FixedWidthOneLineTable(String[][] matrix, TextAlign align, int fixedWidth) {
        super(matrix, align);
        this.fixedWidth = fixedWidth;
    }

    @Override
    protected int getCellLength(int row, int col) {
        return fixedWidth;
    }
}
