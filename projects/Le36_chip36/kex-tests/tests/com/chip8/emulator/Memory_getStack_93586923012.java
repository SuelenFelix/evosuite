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
import java.util.ArrayDeque;

public class Memory_getStack_93586923012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4943738;

    public Memory_getStack_93586923012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term4953797 = new ArrayDeque();
        term4943738 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term4943739 = (byte[]) newByteArray(16);
        byte[] term4943756 = (byte[]) newByteArray(16);
        byte[] term4943773 = (byte[]) newByteArray(16);
        byte[] term4943793 = (byte[]) newByteArray(65535);
        setField(term4943738, term4943738.getClass(), "v", term4943739);
        setField(term4943738, term4943738.getClass(), "rpl", term4943756);
        setByteElement(term4943773, 3, (byte) 32);
        setByteElement(term4943773, 4, (byte) 64);
        setByteElement(term4943773, 5, (byte) 32);
        setByteElement(term4943773, 7, (byte) 32);
        setByteElement(term4943773, 8, (byte) 64);
        setByteElement(term4943773, 9, (byte) 32);
        setByteElement(term4943773, 11, (byte) 32);
        setByteElement(term4943773, 12, (byte) 64);
        setByteElement(term4943773, 13, (byte) 32);
        setField(term4943738, term4943738.getClass(), "audio", term4943773);
        setShortField(term4943738, term4943738.getClass(), "pitch", (short) 64);
        setShortField(term4943738, term4943738.getClass(), "i", (short) -12703);
        setShortField(term4943738, term4943738.getClass(), "pc", (short) 512);
        setField(term4943738, term4943738.getClass(), "ram", term4943793);
        setByteField(term4943738, term4943738.getClass(), "delayTimer", (byte) 121);
        setByteField(term4943738, term4943738.getClass(), "soundTimer", (byte) 83);
        setField(term4943738, term4943738.getClass(), "stack", term4953797);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Memory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStack", argTypes, term4943738, args);
    }

};


