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

public class Fetcher_incrementPC_579297833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5723479;

    public Fetcher_incrementPC_579297833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5733540 = new ArrayDeque();
        term5723479 = newInstance(Class.forName("com.chip8.emulator.Fetcher"));
        Object term5723481 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5723482 = (byte[]) newByteArray(16);
        byte[] term5723499 = (byte[]) newByteArray(16);
        byte[] term5723516 = (byte[]) newByteArray(16);
        byte[] term5723536 = (byte[]) newByteArray(65535);
        setShortField(term5723479, term5723479.getClass(), "opcode", (short) 11544);
        setField(term5723481, term5723481.getClass(), "v", term5723482);
        setField(term5723481, term5723481.getClass(), "rpl", term5723499);
        setByteElement(term5723516, 3, (byte) 32);
        setByteElement(term5723516, 4, (byte) 64);
        setByteElement(term5723516, 5, (byte) 32);
        setByteElement(term5723516, 7, (byte) 32);
        setByteElement(term5723516, 8, (byte) 64);
        setByteElement(term5723516, 9, (byte) 32);
        setByteElement(term5723516, 11, (byte) 32);
        setByteElement(term5723516, 12, (byte) 64);
        setByteElement(term5723516, 13, (byte) 32);
        setField(term5723481, term5723481.getClass(), "audio", term5723516);
        setShortField(term5723481, term5723481.getClass(), "pitch", (short) 64);
        setShortField(term5723481, term5723481.getClass(), "i", (short) -7381);
        setShortField(term5723481, term5723481.getClass(), "pc", (short) 512);
        setField(term5723481, term5723481.getClass(), "ram", term5723536);
        setByteField(term5723481, term5723481.getClass(), "delayTimer", (byte) 117);
        setByteField(term5723481, term5723481.getClass(), "soundTimer", (byte) -20);
        setField(term5723481, term5723481.getClass(), "stack", term5733540);
        setField(term5723479, term5723479.getClass(), "m", term5723481);
        setLongField(term5723479, term5723479.getClass(), "currentTime", 1597484336218508869L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Fetcher");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "incrementPC", argTypes, term5723479, args);
    }

};


