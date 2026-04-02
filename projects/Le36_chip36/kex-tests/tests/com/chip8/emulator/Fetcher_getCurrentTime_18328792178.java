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

public class Fetcher_getCurrentTime_18328792178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5824054;

    public Fetcher_getCurrentTime_18328792178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5834115 = new ArrayDeque();
        term5824054 = newInstance(Class.forName("com.chip8.emulator.Fetcher"));
        Object term5824056 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5824057 = (byte[]) newByteArray(16);
        byte[] term5824074 = (byte[]) newByteArray(16);
        byte[] term5824091 = (byte[]) newByteArray(16);
        byte[] term5824111 = (byte[]) newByteArray(65535);
        setShortField(term5824054, term5824054.getClass(), "opcode", (short) -23177);
        setField(term5824056, term5824056.getClass(), "v", term5824057);
        setField(term5824056, term5824056.getClass(), "rpl", term5824074);
        setByteElement(term5824091, 3, (byte) 32);
        setByteElement(term5824091, 4, (byte) 64);
        setByteElement(term5824091, 5, (byte) 32);
        setByteElement(term5824091, 7, (byte) 32);
        setByteElement(term5824091, 8, (byte) 64);
        setByteElement(term5824091, 9, (byte) 32);
        setByteElement(term5824091, 11, (byte) 32);
        setByteElement(term5824091, 12, (byte) 64);
        setByteElement(term5824091, 13, (byte) 32);
        setField(term5824056, term5824056.getClass(), "audio", term5824091);
        setShortField(term5824056, term5824056.getClass(), "pitch", (short) 64);
        setShortField(term5824056, term5824056.getClass(), "i", (short) -3853);
        setShortField(term5824056, term5824056.getClass(), "pc", (short) 512);
        setField(term5824056, term5824056.getClass(), "ram", term5824111);
        setByteField(term5824056, term5824056.getClass(), "delayTimer", (byte) -80);
        setByteField(term5824056, term5824056.getClass(), "soundTimer", (byte) -11);
        setField(term5824056, term5824056.getClass(), "stack", term5834115);
        setField(term5824054, term5824054.getClass(), "m", term5824056);
        setLongField(term5824054, term5824054.getClass(), "currentTime", -4924950707540628022L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Fetcher");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCurrentTime", argTypes, term5824054, args);
    }

};


