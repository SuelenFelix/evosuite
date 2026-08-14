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

public class Memory_getAudio_36962786932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5245530;

    public Memory_getAudio_36962786932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5245530 = newInstance(Class.forName("com.chip8.emulator.Memory"));
        setField(term5245530, term5245530.getClass(), "v", null);
        setField(term5245530, term5245530.getClass(), "rpl", null);
        setField(term5245530, term5245530.getClass(), "audio", null);
        setShortField(term5245530, term5245530.getClass(), "pitch", (short) 0);
        setShortField(term5245530, term5245530.getClass(), "i", (short) 0);
        setShortField(term5245530, term5245530.getClass(), "pc", (short) 0);
        setField(term5245530, term5245530.getClass(), "ram", null);
        setByteField(term5245530, term5245530.getClass(), "delayTimer", (byte) 0);
        setByteField(term5245530, term5245530.getClass(), "soundTimer", (byte) 0);
        setField(term5245530, term5245530.getClass(), "stack", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.emulator.Memory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAudio", argTypes, term5245530, args);
    }

};


