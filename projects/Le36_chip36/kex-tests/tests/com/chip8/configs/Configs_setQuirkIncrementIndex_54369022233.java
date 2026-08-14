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

public class Configs_setQuirkIncrementIndex_54369022233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10411;
     Object term10475;

    public Configs_setQuirkIncrementIndex_54369022233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10411 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term10411, term10411.getClass(), "printToConsole", false);
        setBooleanField(term10411, term10411.getClass(), "disableUiUpdates", true);
        setField(term10411, term10411.getClass(), "printSymbol", "#");
        setBooleanField(term10411, term10411.getClass(), "spriteExtracting", false);
        setBooleanField(term10411, term10411.getClass(), "roundPixels", false);
        setBooleanField(term10411, term10411.getClass(), "blur", true);
        setBooleanField(term10411, term10411.getClass(), "glow", false);
        setDoubleField(term10411, term10411.getClass(), "blurValue", 0.007493740494434409);
        setDoubleField(term10411, term10411.getClass(), "glowValue", 0.29172553321356776);
        setField(term10411, term10411.getClass(), "bgColor", "LWyEaeIyAo");
        setField(term10411, term10411.getClass(), "spriteColor", "yVMkkQhvmN");
        setField(term10411, term10411.getClass(), "planeColor", "mvrkADEgpp");
        setField(term10411, term10411.getClass(), "bothColor", "pXOkjyeIRb");
        setBooleanField(term10411, term10411.getClass(), "quirkShift", false);
        setBooleanField(term10411, term10411.getClass(), "quirkJump", true);
        setBooleanField(term10411, term10411.getClass(), "quirkIncrementIndex", false);
        setBooleanField(term10411, term10411.getClass(), "quirkOrder", false);
        term10475 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term10475;
        callMethod(klass, "setQuirkIncrementIndex", argTypes, term10411, args);
    }

};


