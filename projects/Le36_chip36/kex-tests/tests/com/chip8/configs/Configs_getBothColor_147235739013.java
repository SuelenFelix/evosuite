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

public class Configs_getBothColor_147235739013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8181;

    public Configs_getBothColor_147235739013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8181 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term8181, term8181.getClass(), "printToConsole", true);
        setBooleanField(term8181, term8181.getClass(), "disableUiUpdates", false);
        setField(term8181, term8181.getClass(), "printSymbol", "#");
        setBooleanField(term8181, term8181.getClass(), "spriteExtracting", true);
        setBooleanField(term8181, term8181.getClass(), "roundPixels", true);
        setBooleanField(term8181, term8181.getClass(), "blur", false);
        setBooleanField(term8181, term8181.getClass(), "glow", true);
        setDoubleField(term8181, term8181.getClass(), "blurValue", 0.12764449157430724);
        setDoubleField(term8181, term8181.getClass(), "glowValue", 0.39446728256884744);
        setField(term8181, term8181.getClass(), "bgColor", "YRHGsAkhxb");
        setField(term8181, term8181.getClass(), "spriteColor", "ffYhPOzlUs");
        setField(term8181, term8181.getClass(), "planeColor", "MLqYREekMl");
        setField(term8181, term8181.getClass(), "bothColor", "ytSBIKXogI");
        setBooleanField(term8181, term8181.getClass(), "quirkShift", false);
        setBooleanField(term8181, term8181.getClass(), "quirkJump", false);
        setBooleanField(term8181, term8181.getClass(), "quirkIncrementIndex", true);
        setBooleanField(term8181, term8181.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBothColor", argTypes, term8181, args);
    }

};


