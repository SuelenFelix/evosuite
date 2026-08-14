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

public class Memory_hashCode_19660241652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5245660;

    public Memory_hashCode_19660241652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5245660 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        setField(term5245660, term5245660.getClass(), "v", null);
        setField(term5245660, term5245660.getClass(), "rpl", null);
        setField(term5245660, term5245660.getClass(), "audio", null);
        setShortField(term5245660, term5245660.getClass(), "pitch", (short) 0);
        setShortField(term5245660, term5245660.getClass(), "i", (short) 0);
        setShortField(term5245660, term5245660.getClass(), "pc", (short) 0);
        setField(term5245660, term5245660.getClass(), "ram", null);
        setByteField(term5245660, term5245660.getClass(), "delayTimer", (byte) 0);
        setByteField(term5245660, term5245660.getClass(), "soundTimer", (byte) 0);
        setField(term5245660, term5245660.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Memory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term5245660, args);
    }

};


