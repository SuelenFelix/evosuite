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

public class Configs_getPlaneColor_443711912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8076;

    public Configs_getPlaneColor_443711912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8076 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term8076, term8076.getClass(), "printToConsole", false);
        setBooleanField(term8076, term8076.getClass(), "disableUiUpdates", true);
        setField(term8076, term8076.getClass(), "printSymbol", "#");
        setBooleanField(term8076, term8076.getClass(), "spriteExtracting", true);
        setBooleanField(term8076, term8076.getClass(), "roundPixels", false);
        setBooleanField(term8076, term8076.getClass(), "blur", true);
        setBooleanField(term8076, term8076.getClass(), "glow", false);
        setDoubleField(term8076, term8076.getClass(), "blurValue", 0.07417792024383196);
        setDoubleField(term8076, term8076.getClass(), "glowValue", 0.686293604788188);
        setField(term8076, term8076.getClass(), "bgColor", "UiUYnPrcCi");
        setField(term8076, term8076.getClass(), "spriteColor", "UoYtihxVaS");
        setField(term8076, term8076.getClass(), "planeColor", "JDswTTCZHV");
        setField(term8076, term8076.getClass(), "bothColor", "onpbIeEKoi");
        setBooleanField(term8076, term8076.getClass(), "quirkShift", true);
        setBooleanField(term8076, term8076.getClass(), "quirkJump", false);
        setBooleanField(term8076, term8076.getClass(), "quirkIncrementIndex", false);
        setBooleanField(term8076, term8076.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlaneColor", argTypes, term8076, args);
    }

};


