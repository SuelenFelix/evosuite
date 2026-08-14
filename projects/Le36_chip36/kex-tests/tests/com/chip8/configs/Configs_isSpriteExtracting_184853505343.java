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

public class Configs_isSpriteExtracting_184853505343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11086;

    public Configs_isSpriteExtracting_184853505343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11086 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term11086, term11086.getClass(), "printToConsole", false);
        setBooleanField(term11086, term11086.getClass(), "disableUiUpdates", false);
        setField(term11086, term11086.getClass(), "printSymbol", null);
        setBooleanField(term11086, term11086.getClass(), "spriteExtracting", false);
        setBooleanField(term11086, term11086.getClass(), "roundPixels", false);
        setBooleanField(term11086, term11086.getClass(), "blur", false);
        setBooleanField(term11086, term11086.getClass(), "glow", false);
        setDoubleField(term11086, term11086.getClass(), "blurValue", 0.0);
        setDoubleField(term11086, term11086.getClass(), "glowValue", 0.0);
        setField(term11086, term11086.getClass(), "bgColor", null);
        setField(term11086, term11086.getClass(), "spriteColor", null);
        setField(term11086, term11086.getClass(), "planeColor", null);
        setField(term11086, term11086.getClass(), "bothColor", null);
        setBooleanField(term11086, term11086.getClass(), "quirkShift", false);
        setBooleanField(term11086, term11086.getClass(), "quirkJump", false);
        setBooleanField(term11086, term11086.getClass(), "quirkIncrementIndex", false);
        setBooleanField(term11086, term11086.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSpriteExtracting", argTypes, term11086, args);
    }

};


