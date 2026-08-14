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

public class Configs_setBothColor_163511483030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10070;

    public Configs_setBothColor_163511483030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10070 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term10070, term10070.getClass(), "printToConsole", true);
        setBooleanField(term10070, term10070.getClass(), "disableUiUpdates", false);
        setField(term10070, term10070.getClass(), "printSymbol", "#");
        setBooleanField(term10070, term10070.getClass(), "spriteExtracting", false);
        setBooleanField(term10070, term10070.getClass(), "roundPixels", false);
        setBooleanField(term10070, term10070.getClass(), "blur", false);
        setBooleanField(term10070, term10070.getClass(), "glow", false);
        setDoubleField(term10070, term10070.getClass(), "blurValue", 0.841460835734741);
        setDoubleField(term10070, term10070.getClass(), "glowValue", 0.7859316615744082);
        setField(term10070, term10070.getClass(), "bgColor", "mLUZFTfjle");
        setField(term10070, term10070.getClass(), "spriteColor", "xIeFjkHkOe");
        setField(term10070, term10070.getClass(), "planeColor", "SdCKLMIYnX");
        setField(term10070, term10070.getClass(), "bothColor", "OJJtVNPyKZ");
        setBooleanField(term10070, term10070.getClass(), "quirkShift", false);
        setBooleanField(term10070, term10070.getClass(), "quirkJump", false);
        setBooleanField(term10070, term10070.getClass(), "quirkIncrementIndex", true);
        setBooleanField(term10070, term10070.getClass(), "quirkOrder", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "AKNapTAfmD";
        callMethod(klass, "setBothColor", argTypes, term10070, args);
    }

};


