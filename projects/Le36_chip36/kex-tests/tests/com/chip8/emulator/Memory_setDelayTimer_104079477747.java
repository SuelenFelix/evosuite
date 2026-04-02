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
import java.lang.Byte;

public class Memory_setDelayTimer_104079477747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5245626;
     Object term5245632;

    public Memory_setDelayTimer_104079477747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5245626 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        setField(term5245626, term5245626.getClass(), "v", null);
        setField(term5245626, term5245626.getClass(), "rpl", null);
        setField(term5245626, term5245626.getClass(), "audio", null);
        setShortField(term5245626, term5245626.getClass(), "pitch", (short) 0);
        setShortField(term5245626, term5245626.getClass(), "i", (short) 0);
        setShortField(term5245626, term5245626.getClass(), "pc", (short) 0);
        setField(term5245626, term5245626.getClass(), "ram", null);
        setByteField(term5245626, term5245626.getClass(), "delayTimer", (byte) 0);
        setByteField(term5245626, term5245626.getClass(), "soundTimer", (byte) 0);
        setField(term5245626, term5245626.getClass(), "stack", null);
        term5245632 = new Byte((byte) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Memory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = byte.class;
        Object[] args = new Object[1];
        args[0] = term5245632;
        callMethod(klass, "setDelayTimer", argTypes, term5245626, args);
    }

};


