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

public class Configs_isBlur_4369820666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7446;

    public Configs_isBlur_4369820666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7446 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term7446, term7446.getClass(), "printToConsole", false);
        setBooleanField(term7446, term7446.getClass(), "disableUiUpdates", false);
        setField(term7446, term7446.getClass(), "printSymbol", "#");
        setBooleanField(term7446, term7446.getClass(), "spriteExtracting", true);
        setBooleanField(term7446, term7446.getClass(), "roundPixels", false);
        setBooleanField(term7446, term7446.getClass(), "blur", false);
        setBooleanField(term7446, term7446.getClass(), "glow", true);
        setDoubleField(term7446, term7446.getClass(), "blurValue", 0.8819646072665548);
        setDoubleField(term7446, term7446.getClass(), "glowValue", 0.5412182593116958);
        setField(term7446, term7446.getClass(), "bgColor", "OclPbYPkcH");
        setField(term7446, term7446.getClass(), "spriteColor", "IoAlmYsBwc");
        setField(term7446, term7446.getClass(), "planeColor", "TEParAifyi");
        setField(term7446, term7446.getClass(), "bothColor", "OWDIEULEFu");
        setBooleanField(term7446, term7446.getClass(), "quirkShift", false);
        setBooleanField(term7446, term7446.getClass(), "quirkJump", false);
        setBooleanField(term7446, term7446.getClass(), "quirkIncrementIndex", false);
        setBooleanField(term7446, term7446.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBlur", argTypes, term7446, args);
    }

};


