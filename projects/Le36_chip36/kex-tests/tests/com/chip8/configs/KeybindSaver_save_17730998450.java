package com.chip8.configs;

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
import static com.chip8.configs.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class KeybindSaver_save_17730998450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11607;
     Object term11608;

    public KeybindSaver_save_17730998450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11607 = newInstance(Class.forName("com.chip8.configs.KeybindSaver"));
        term11608 = (Object[]) newArray("java.lang.String", 5);
        setElement(term11608, 0, "PapWxkhEWe");
        setElement(term11608, 1, "smnHEqRFRx");
        setElement(term11608, 2, "XYtryyobou");
        setElement(term11608, 3, "OYbzXylRWW");
        setElement(term11608, 4, "DSNsTGYXDF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.KeybindSaver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term11608;
        callMethod(klass, "save", argTypes, term11607, args);
    }

};


