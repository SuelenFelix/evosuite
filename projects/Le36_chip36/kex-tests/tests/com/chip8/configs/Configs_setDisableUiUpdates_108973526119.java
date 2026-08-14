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

public class Configs_setDisableUiUpdates_108973526119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8813;
     Object term8877;

    public Configs_setDisableUiUpdates_108973526119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8813 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term8813, term8813.getClass(), "printToConsole", true);
        setBooleanField(term8813, term8813.getClass(), "disableUiUpdates", false);
        setField(term8813, term8813.getClass(), "printSymbol", "#");
        setBooleanField(term8813, term8813.getClass(), "spriteExtracting", false);
        setBooleanField(term8813, term8813.getClass(), "roundPixels", false);
        setBooleanField(term8813, term8813.getClass(), "blur", false);
        setBooleanField(term8813, term8813.getClass(), "glow", false);
        setDoubleField(term8813, term8813.getClass(), "blurValue", 0.7080134263823477);
        setDoubleField(term8813, term8813.getClass(), "glowValue", 0.6059734092898602);
        setField(term8813, term8813.getClass(), "bgColor", "wGmYcqUkgE");
        setField(term8813, term8813.getClass(), "spriteColor", "idgaQsnJpQ");
        setField(term8813, term8813.getClass(), "planeColor", "VgZnGoIFwQ");
        setField(term8813, term8813.getClass(), "bothColor", "jUbSRrkrYZ");
        setBooleanField(term8813, term8813.getClass(), "quirkShift", false);
        setBooleanField(term8813, term8813.getClass(), "quirkJump", true);
        setBooleanField(term8813, term8813.getClass(), "quirkIncrementIndex", false);
        setBooleanField(term8813, term8813.getClass(), "quirkOrder", false);
        term8877 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term8877;
        callMethod(klass, "setDisableUiUpdates", argTypes, term8813, args);
    }

};


