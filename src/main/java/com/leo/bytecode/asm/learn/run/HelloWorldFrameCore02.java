package com.leo.bytecode.asm.learn.run;

import com.leo.bytecode.asm.learn.asm.commons.MethodStackMapFrame02Visitor;
import com.leo.bytecode.asm.learn.utils.FileUtils;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Opcodes;

public class HelloWorldFrameCore02 {
    public static void main(String[] args) {
        String relative_path = "sample/HelloWorld.class";
        String filepath = FileUtils.getFilePath(relative_path);
        byte[] bytes = FileUtils.readBytes(filepath);

        //（1）构建ClassReader
        ClassReader cr = new ClassReader(bytes);

        //（2）构建ClassVisitor
        int api = Opcodes.ASM9;
        ClassVisitor cv = new MethodStackMapFrame02Visitor(api, null, bytes);

        //（3）结合ClassReader和ClassVisitor
        int parsingOptions = ClassReader.EXPAND_FRAMES; // 注意，这里使用了EXPAND_FRAMES
        cr.accept(cv, parsingOptions);
    }
}