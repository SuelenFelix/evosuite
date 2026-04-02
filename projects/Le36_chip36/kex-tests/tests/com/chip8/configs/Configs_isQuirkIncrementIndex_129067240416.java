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

public class Configs_isQuirkIncrementIndex_129067240416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8496;

    public Configs_isQuirkIncrementIndex_129067240416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8496 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term8496, term8496.getClass(), "printToConsole", true);
        setBooleanField(term8496, term8496.getClass(), "disableUiUpdates", false);
        setField(term8496, term8496.getClass(), "printSymbol", "#");
        setBooleanField(term8496, term8496.getClass(), "spriteExtracting", true);
        setBooleanField(term8496, term8496.getClass(), "roundPixels", true);
        setBooleanField(term8496, term8496.getClass(), "blur", false);
        setBooleanField(term8496, term8496.getClass(), "glow", false);
        setDoubleField(term8496, term8496.getClass(), "blurValue", 0.623231822150205);
        setDoubleField(term8496, term8496.getClass(), "glowValue", 0.09037487793444521);
        setField(term8496, term8496.getClass(), "bgColor", "TJmVBGfTML");
        setField(term8496, term8496.getClass(), "spriteColor", "tPlsykYBqO");
        setField(term8496, term8496.getClass(), "planeColor", "bLPjGVBhlX");
        setField(term8496, term8496.getClass(), "bothColor", "whBvTVIIlC");
        setBooleanField(term8496, term8496.getClass(), "quirkShift", false);
        setBooleanField(term8496, term8496.getClass(), "quirkJump", false);
        setBooleanField(term8496, term8496.getClass(), "quirkIncrementIndex", true);
        setBooleanField(term8496, term8496.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isQuirkIncrementIndex", argTypes, term8496, args);
    }

};


