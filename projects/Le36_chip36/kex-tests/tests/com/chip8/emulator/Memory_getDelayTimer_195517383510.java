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

public class Memory_getDelayTimer_195517383510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4903514;

    public Memory_getDelayTimer_195517383510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term4913573 = new ArrayDeque();
        term4903514 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term4903515 = (byte[]) newByteArray(16);
        byte[] term4903532 = (byte[]) newByteArray(16);
        byte[] term4903549 = (byte[]) newByteArray(16);
        byte[] term4903569 = (byte[]) newByteArray(65535);
        setField(term4903514, term4903514.getClass(), "v", term4903515);
        setField(term4903514, term4903514.getClass(), "rpl", term4903532);
        setByteElement(term4903549, 3, (byte) 32);
        setByteElement(term4903549, 4, (byte) 64);
        setByteElement(term4903549, 5, (byte) 32);
        setByteElement(term4903549, 7, (byte) 32);
        setByteElement(term4903549, 8, (byte) 64);
        setByteElement(term4903549, 9, (byte) 32);
        setByteElement(term4903549, 11, (byte) 32);
        setByteElement(term4903549, 12, (byte) 64);
        setByteElement(term4903549, 13, (byte) 32);
        setField(term4903514, term4903514.getClass(), "audio", term4903549);
        setShortField(term4903514, term4903514.getClass(), "pitch", (short) 64);
        setShortField(term4903514, term4903514.getClass(), "i", (short) 7947);
        setShortField(term4903514, term4903514.getClass(), "pc", (short) 512);
        setField(term4903514, term4903514.getClass(), "ram", term4903569);
        setByteField(term4903514, term4903514.getClass(), "delayTimer", (byte) 19);
        setByteField(term4903514, term4903514.getClass(), "soundTimer", (byte) 95);
        setField(term4903514, term4903514.getClass(), "stack", term4913573);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Memory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDelayTimer", argTypes, term4903514, args);
    }

};


