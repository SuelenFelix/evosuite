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
import java.lang.Boolean;

public class Configs_setQuirkJump_183140150732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10304;
     Object term10368;

    public Configs_setQuirkJump_183140150732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10304 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term10304, term10304.getClass(), "printToConsole", false);
        setBooleanField(term10304, term10304.getClass(), "disableUiUpdates", false);
        setField(term10304, term10304.getClass(), "printSymbol", "#");
        setBooleanField(term10304, term10304.getClass(), "spriteExtracting", true);
        setBooleanField(term10304, term10304.getClass(), "roundPixels", true);
        setBooleanField(term10304, term10304.getClass(), "blur", true);
        setBooleanField(term10304, term10304.getClass(), "glow", false);
        setDoubleField(term10304, term10304.getClass(), "blurValue", 0.44268490778872205);
        setDoubleField(term10304, term10304.getClass(), "glowValue", 0.7507333108648018);
        setField(term10304, term10304.getClass(), "bgColor", "wfaXBpWAUH");
        setField(term10304, term10304.getClass(), "spriteColor", "VMeAzAHwZj");
        setField(term10304, term10304.getClass(), "planeColor", "PznxWXsZME");
        setField(term10304, term10304.getClass(), "bothColor", "ZzIujlwVsw");
        setBooleanField(term10304, term10304.getClass(), "quirkShift", true);
        setBooleanField(term10304, term10304.getClass(), "quirkJump", true);
        setBooleanField(term10304, term10304.getClass(), "quirkIncrementIndex", true);
        setBooleanField(term10304, term10304.getClass(), "quirkOrder", false);
        term10368 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term10368;
        callMethod(klass, "setQuirkJump", argTypes, term10304, args);
    }

};


