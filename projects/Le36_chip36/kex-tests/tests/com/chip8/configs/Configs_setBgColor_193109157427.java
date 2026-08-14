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

public class Configs_setBgColor_193109157427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9689;

    public Configs_setBgColor_193109157427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9689 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term9689, term9689.getClass(), "printToConsole", false);
        setBooleanField(term9689, term9689.getClass(), "disableUiUpdates", true);
        setField(term9689, term9689.getClass(), "printSymbol", "#");
        setBooleanField(term9689, term9689.getClass(), "spriteExtracting", false);
        setBooleanField(term9689, term9689.getClass(), "roundPixels", false);
        setBooleanField(term9689, term9689.getClass(), "blur", false);
        setBooleanField(term9689, term9689.getClass(), "glow", true);
        setDoubleField(term9689, term9689.getClass(), "blurValue", 0.9123572866833729);
        setDoubleField(term9689, term9689.getClass(), "glowValue", 0.40635376375558196);
        setField(term9689, term9689.getClass(), "bgColor", "OEXDRUKcFl");
        setField(term9689, term9689.getClass(), "spriteColor", "RYdKCNNMBR");
        setField(term9689, term9689.getClass(), "planeColor", "yGtHPyvYiQ");
        setField(term9689, term9689.getClass(), "bothColor", "MvRIxilFMJ");
        setBooleanField(term9689, term9689.getClass(), "quirkShift", true);
        setBooleanField(term9689, term9689.getClass(), "quirkJump", false);
        setBooleanField(term9689, term9689.getClass(), "quirkIncrementIndex", true);
        setBooleanField(term9689, term9689.getClass(), "quirkOrder", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iNwOJRBEjp";
        callMethod(klass, "setBgColor", argTypes, term9689, args);
    }

};


