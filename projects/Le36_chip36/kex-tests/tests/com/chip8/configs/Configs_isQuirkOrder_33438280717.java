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

public class Configs_isQuirkOrder_33438280717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8601;

    public Configs_isQuirkOrder_33438280717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8601 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term8601, term8601.getClass(), "printToConsole", false);
        setBooleanField(term8601, term8601.getClass(), "disableUiUpdates", false);
        setField(term8601, term8601.getClass(), "printSymbol", "#");
        setBooleanField(term8601, term8601.getClass(), "spriteExtracting", false);
        setBooleanField(term8601, term8601.getClass(), "roundPixels", true);
        setBooleanField(term8601, term8601.getClass(), "blur", false);
        setBooleanField(term8601, term8601.getClass(), "glow", false);
        setDoubleField(term8601, term8601.getClass(), "blurValue", 0.6561919196821765);
        setDoubleField(term8601, term8601.getClass(), "glowValue", 0.7330178886612495);
        setField(term8601, term8601.getClass(), "bgColor", "IgRJUzaCwW");
        setField(term8601, term8601.getClass(), "spriteColor", "JUmudUmaaV");
        setField(term8601, term8601.getClass(), "planeColor", "KoyGrUJeJW");
        setField(term8601, term8601.getClass(), "bothColor", "HqBOwkVqjD");
        setBooleanField(term8601, term8601.getClass(), "quirkShift", true);
        setBooleanField(term8601, term8601.getClass(), "quirkJump", true);
        setBooleanField(term8601, term8601.getClass(), "quirkIncrementIndex", false);
        setBooleanField(term8601, term8601.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isQuirkOrder", argTypes, term8601, args);
    }

};


