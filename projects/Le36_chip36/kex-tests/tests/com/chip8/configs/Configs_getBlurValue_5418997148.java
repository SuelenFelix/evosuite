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

public class Configs_getBlurValue_5418997148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7656;

    public Configs_getBlurValue_5418997148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7656 = newInstance(Class.forName("com.chip8.configs.Configs"));
        setBooleanField(term7656, term7656.getClass(), "printToConsole", true);
        setBooleanField(term7656, term7656.getClass(), "disableUiUpdates", true);
        setField(term7656, term7656.getClass(), "printSymbol", "#");
        setBooleanField(term7656, term7656.getClass(), "spriteExtracting", false);
        setBooleanField(term7656, term7656.getClass(), "roundPixels", false);
        setBooleanField(term7656, term7656.getClass(), "blur", false);
        setBooleanField(term7656, term7656.getClass(), "glow", true);
        setDoubleField(term7656, term7656.getClass(), "blurValue", 0.11577948268926874);
        setDoubleField(term7656, term7656.getClass(), "glowValue", 0.5617009352394552);
        setField(term7656, term7656.getClass(), "bgColor", "Ghbwtircqb");
        setField(term7656, term7656.getClass(), "spriteColor", "xrwlQZdwCp");
        setField(term7656, term7656.getClass(), "planeColor", "IDCWpPLRkE");
        setField(term7656, term7656.getClass(), "bothColor", "nyiiPDVjAc");
        setBooleanField(term7656, term7656.getClass(), "quirkShift", true);
        setBooleanField(term7656, term7656.getClass(), "quirkJump", false);
        setBooleanField(term7656, term7656.getClass(), "quirkIncrementIndex", true);
        setBooleanField(term7656, term7656.getClass(), "quirkOrder", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.Configs");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBlurValue", argTypes, term7656, args);
    }

};


