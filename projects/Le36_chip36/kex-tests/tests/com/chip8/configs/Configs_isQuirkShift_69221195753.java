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

public class Configs_isQuirkShift_69221195753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11216;

    public Configs_isQuirkShift_69221195753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11216 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term11216, term11216.getClass(), "printToConsole", false);
        setBooleanField(term11216, term11216.getClass(), "disableUiUpdates", false);
        setField(term11216, term11216.getClass(), "printSymbol", null);
        setBooleanField(term11216, term11216.getClass(), "spriteExtracting", false);
        setBooleanField(term11216, term11216.getClass(), "roundPixels", false);
        setBooleanField(term11216, term11216.getClass(), "blur", false);
        setBooleanField(term11216, term11216.getClass(), "glow", false);
        setDoubleField(term11216, term11216.getClass(), "blurValue", 0.0);
        setDoubleField(term11216, term11216.getClass(), "glowValue", 0.0);
        setField(term11216, term11216.getClass(), "bgColor", null);
        setField(term11216, term11216.getClass(), "spriteColor", null);
        setField(term11216, term11216.getClass(), "planeColor", null);
        setField(term11216, term11216.getClass(), "bothColor", null);
        setBooleanField(term11216, term11216.getClass(), "quirkShift", false);
        setBooleanField(term11216, term11216.getClass(), "quirkJump", false);
        setBooleanField(term11216, term11216.getClass(), "quirkIncrementIndex", false);
        setBooleanField(term11216, term11216.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isQuirkShift", argTypes, term11216, args);
    }

};


