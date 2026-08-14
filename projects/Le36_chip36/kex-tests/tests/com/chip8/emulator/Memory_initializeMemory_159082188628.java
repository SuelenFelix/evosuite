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
import java.lang.Short;
import java.lang.Byte;

public class Memory_initializeMemory_159082188628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5245498;
     Object term5245504;
     Object term5245506;

    public Memory_initializeMemory_159082188628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5245498 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        setField(term5245498, term5245498.getClass(), "v", null);
        setField(term5245498, term5245498.getClass(), "rpl", null);
        setField(term5245498, term5245498.getClass(), "audio", null);
        setShortField(term5245498, term5245498.getClass(), "pitch", (short) 0);
        setShortField(term5245498, term5245498.getClass(), "i", (short) 0);
        setShortField(term5245498, term5245498.getClass(), "pc", (short) 0);
        setField(term5245498, term5245498.getClass(), "ram", null);
        setByteField(term5245498, term5245498.getClass(), "delayTimer", (byte) 0);
        setByteField(term5245498, term5245498.getClass(), "soundTimer", (byte) 0);
        setField(term5245498, term5245498.getClass(), "stack", null);
        term5245504 = new Short((short) 0);
        term5245506 = new Byte((byte) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Memory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = short.class;
        argTypes[1] = byte.class;
        Object[] args = new Object[2];
        args[0] = term5245504;
        args[1] = term5245506;
        callMethod(klass, "initializeMemory", argTypes, term5245498, args);
    }

};


