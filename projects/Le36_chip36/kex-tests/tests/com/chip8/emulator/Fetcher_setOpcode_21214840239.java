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
import java.lang.Short;

public class Fetcher_setOpcode_21214840239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5844169;
     Object term5854235;

    public Fetcher_setOpcode_21214840239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term5854230 = new ArrayDeque();
        term5844169 = newInstance(Class.forName("com.chip8.emulator.Fetcher"));
        Object term5844171 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        byte[] term5844172 = (byte[]) newByteArray(16);
        byte[] term5844189 = (byte[]) newByteArray(16);
        byte[] term5844206 = (byte[]) newByteArray(16);
        byte[] term5844226 = (byte[]) newByteArray(65535);
        setShortField(term5844169, term5844169.getClass(), "opcode", (short) 23461);
        setField(term5844171, term5844171.getClass(), "v", term5844172);
        setField(term5844171, term5844171.getClass(), "rpl", term5844189);
        setByteElement(term5844206, 3, (byte) 32);
        setByteElement(term5844206, 4, (byte) 64);
        setByteElement(term5844206, 5, (byte) 32);
        setByteElement(term5844206, 7, (byte) 32);
        setByteElement(term5844206, 8, (byte) 64);
        setByteElement(term5844206, 9, (byte) 32);
        setByteElement(term5844206, 11, (byte) 32);
        setByteElement(term5844206, 12, (byte) 64);
        setByteElement(term5844206, 13, (byte) 32);
        setField(term5844171, term5844171.getClass(), "audio", term5844206);
        setShortField(term5844171, term5844171.getClass(), "pitch", (short) 64);
        setShortField(term5844171, term5844171.getClass(), "i", (short) 315);
        setShortField(term5844171, term5844171.getClass(), "pc", (short) 512);
        setField(term5844171, term5844171.getClass(), "ram", term5844226);
        setByteField(term5844171, term5844171.getClass(), "delayTimer", (byte) -33);
        setByteField(term5844171, term5844171.getClass(), "soundTimer", (byte) 58);
        setField(term5844171, term5844171.getClass(), "stack", term5854230);
        setField(term5844169, term5844169.getClass(), "m", term5844171);
        setLongField(term5844169, term5844169.getClass(), "currentTime", -4393710401270724527L);
        term5854235 = new Short((short) -19766);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Fetcher");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = short.class;
        Object[] args = new Object[1];
        args[0] = term5854235;
        callMethod(klass, "setOpcode", argTypes, term5844169, args);
    }

};


