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

public class Configs_canEqual_173038449675 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11526;

    public Configs_canEqual_173038449675() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11526 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term11526, term11526.getClass(), "printToConsole", false);
        setBooleanField(term11526, term11526.getClass(), "disableUiUpdates", false);
        setField(term11526, term11526.getClass(), "printSymbol", null);
        setBooleanField(term11526, term11526.getClass(), "spriteExtracting", false);
        setBooleanField(term11526, term11526.getClass(), "roundPixels", false);
        setBooleanField(term11526, term11526.getClass(), "blur", false);
        setBooleanField(term11526, term11526.getClass(), "glow", false);
        setDoubleField(term11526, term11526.getClass(), "blurValue", 0.0);
        setDoubleField(term11526, term11526.getClass(), "glowValue", 0.0);
        setField(term11526, term11526.getClass(), "bgColor", null);
        setField(term11526, term11526.getClass(), "spriteColor", null);
        setField(term11526, term11526.getClass(), "planeColor", null);
        setField(term11526, term11526.getClass(), "bothColor", null);
        setBooleanField(term11526, term11526.getClass(), "quirkShift", false);
        setBooleanField(term11526, term11526.getClass(), "quirkJump", false);
        setBooleanField(term11526, term11526.getClass(), "quirkIncrementIndex", false);
        setBooleanField(term11526, term11526.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term11526, args);
    }

};


