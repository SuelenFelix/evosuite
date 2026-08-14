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

public class Configs_setQuirkOrder_65836050734 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10518;
     Object term10582;

    public Configs_setQuirkOrder_65836050734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10518 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term10518, term10518.getClass(), "printToConsole", true);
        setBooleanField(term10518, term10518.getClass(), "disableUiUpdates", false);
        setField(term10518, term10518.getClass(), "printSymbol", "#");
        setBooleanField(term10518, term10518.getClass(), "spriteExtracting", true);
        setBooleanField(term10518, term10518.getClass(), "roundPixels", false);
        setBooleanField(term10518, term10518.getClass(), "blur", false);
        setBooleanField(term10518, term10518.getClass(), "glow", true);
        setDoubleField(term10518, term10518.getClass(), "blurValue", 0.9276995636844321);
        setDoubleField(term10518, term10518.getClass(), "glowValue", 0.7636130748477434);
        setField(term10518, term10518.getClass(), "bgColor", "GgZWSjxjyE");
        setField(term10518, term10518.getClass(), "spriteColor", "EeBVbzjcCI");
        setField(term10518, term10518.getClass(), "planeColor", "UfQtPRyWRC");
        setField(term10518, term10518.getClass(), "bothColor", "FPvxVzzSvD");
        setBooleanField(term10518, term10518.getClass(), "quirkShift", false);
        setBooleanField(term10518, term10518.getClass(), "quirkJump", true);
        setBooleanField(term10518, term10518.getClass(), "quirkIncrementIndex", true);
        setBooleanField(term10518, term10518.getClass(), "quirkOrder", true);
        term10582 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term10582;
        callMethod(klass, "setQuirkOrder", argTypes, term10518, args);
    }

};


