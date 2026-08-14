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
import java.lang.Long;

public class Fetcher_setCurrentTime_506460311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5904513;
     Object term5914579;

    public Fetcher_setCurrentTime_506460311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5914574 = new ArrayDeque();
        term5904513 = newInstance(Class.forName("com.chip8.emulator.Fetcher"));
        Object term5904515 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5904516 = (byte[]) newByteArray(16);
        byte[] term5904533 = (byte[]) newByteArray(16);
        byte[] term5904550 = (byte[]) newByteArray(16);
        byte[] term5904570 = (byte[]) newByteArray(65535);
        setShortField(term5904513, term5904513.getClass(), "opcode", (short) 15057);
        setField(term5904515, term5904515.getClass(), "v", term5904516);
        setField(term5904515, term5904515.getClass(), "rpl", term5904533);
        setByteElement(term5904550, 3, (byte) 32);
        setByteElement(term5904550, 4, (byte) 64);
        setByteElement(term5904550, 5, (byte) 32);
        setByteElement(term5904550, 7, (byte) 32);
        setByteElement(term5904550, 8, (byte) 64);
        setByteElement(term5904550, 9, (byte) 32);
        setByteElement(term5904550, 11, (byte) 32);
        setByteElement(term5904550, 12, (byte) 64);
        setByteElement(term5904550, 13, (byte) 32);
        setField(term5904515, term5904515.getClass(), "audio", term5904550);
        setShortField(term5904515, term5904515.getClass(), "pitch", (short) 64);
        setShortField(term5904515, term5904515.getClass(), "i", (short) 22591);
        setShortField(term5904515, term5904515.getClass(), "pc", (short) 512);
        setField(term5904515, term5904515.getClass(), "ram", term5904570);
        setByteField(term5904515, term5904515.getClass(), "delayTimer", (byte) 100);
        setByteField(term5904515, term5904515.getClass(), "soundTimer", (byte) 117);
        setField(term5904515, term5904515.getClass(), "stack", term5914574);
        setField(term5904513, term5904513.getClass(), "m", term5904515);
        setLongField(term5904513, term5904513.getClass(), "currentTime", -5386201758403679145L);
        term5914579 = new Long(-7268507582722666254L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Fetcher");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term5914579;
        callMethod(klass, "setCurrentTime", argTypes, term5904513, args);
    }

};


