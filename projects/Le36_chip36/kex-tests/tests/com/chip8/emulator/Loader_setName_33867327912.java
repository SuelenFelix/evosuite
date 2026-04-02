package com.chip8.emulator;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.chip8.emulator.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayDeque;
import java.lang.String;

public class Loader_setName_33867327912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5489405;

    public Loader_setName_33867327912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5499485 = new ArrayDeque();
        Class<? extends Object> term5509603 = Class.forName((String) "java.io.File$PathStatus");
        Field term5509602 = ((Class) term5509603).getDeclaredField((String) "INVALID");
        ((Field) term5509602).setAccessible(true);
        Object enum28 = ((Field) term5509602).get((Object) null);
        term5489405 = newInstance(Class.forName("com.chip8.emulator.Loader"));
        byte[] term5489406 = (byte[]) newByteArray(7);
        Object term5489426 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5489427 = (byte[]) newByteArray(16);
        byte[] term5489444 = (byte[]) newByteArray(16);
        byte[] term5489461 = (byte[]) newByteArray(16);
        byte[] term5489481 = (byte[]) newByteArray(65535);
        Object term5499489 = newInstance(Class.forName("java.io.File"));
        setByteElement(term5489406, 0, (byte) -125);
        setByteElement(term5489406, 1, (byte) -126);
        setByteElement(term5489406, 2, (byte) 80);
        setByteElement(term5489406, 3, (byte) 118);
        setByteElement(term5489406, 4, (byte) -116);
        setByteElement(term5489406, 5, (byte) 85);
        setByteElement(term5489406, 6, (byte) 24);
        setField(term5489405, term5489405.getClass(), "bytes", term5489406);
        setField(term5489405, term5489405.getClass(), "name", "kyTUkLCRYm");
        setField(term5489426, term5489426.getClass(), "v", term5489427);
        setField(term5489426, term5489426.getClass(), "rpl", term5489444);
        setByteElement(term5489461, 3, (byte) 32);
        setByteElement(term5489461, 4, (byte) 64);
        setByteElement(term5489461, 5, (byte) 32);
        setByteElement(term5489461, 7, (byte) 32);
        setByteElement(term5489461, 8, (byte) 64);
        setByteElement(term5489461, 9, (byte) 32);
        setByteElement(term5489461, 11, (byte) 32);
        setByteElement(term5489461, 12, (byte) 64);
        setByteElement(term5489461, 13, (byte) 32);
        setField(term5489426, term5489426.getClass(), "audio", term5489461);
        setShortField(term5489426, term5489426.getClass(), "pitch", (short) 64);
        setShortField(term5489426, term5489426.getClass(), "i", (short) 26250);
        setShortField(term5489426, term5489426.getClass(), "pc", (short) 512);
        setField(term5489426, term5489426.getClass(), "ram", term5489481);
        setByteField(term5489426, term5489426.getClass(), "delayTimer", (byte) -51);
        setByteField(term5489426, term5489426.getClass(), "soundTimer", (byte) 123);
        setField(term5489426, term5489426.getClass(), "stack", term5499485);
        setField(term5489405, term5489405.getClass(), "memory", term5489426);
        setField(term5499489, term5499489.getClass(), "path", "oAotZgNUFH");
        setField(term5499489, term5499489.getClass(), "status", enum28);
        setIntField(term5499489, term5499489.getClass(), "prefixLength", -1631697577);
        setField(term5499489, term5499489.getClass(), "filePath", null);
        setField(term5489405, term5489405.getClass(), "loadedRom", term5499489);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Loader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TowhQcovXu";
        callMethod(klass, "setName", argTypes, term5489405, args);
    }

};


