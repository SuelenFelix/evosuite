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

public class DefaultValues_setPrintToConsole_113235768267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6719;
     Object term6731;

    public DefaultValues_setPrintToConsole_113235768267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6719 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term6719, term6719.getClass(), "rebindLayout", null);
        setField(term6719, term6719.getClass(), "mouseKbLayout", null);
        setField(term6719, term6719.getClass(), "bgColor", null);
        setField(term6719, term6719.getClass(), "spriteColor", null);
        setField(term6719, term6719.getClass(), "planeColor", null);
        setField(term6719, term6719.getClass(), "bothColor", null);
        setField(term6719, term6719.getClass(), "printSymbol", null);
        setBooleanField(term6719, term6719.getClass(), "printToConsole", false);
        setBooleanField(term6719, term6719.getClass(), "disableUiUpdates", false);
        setBooleanField(term6719, term6719.getClass(), "roundPixels", false);
        setBooleanField(term6719, term6719.getClass(), "blur", false);
        setBooleanField(term6719, term6719.getClass(), "glow", false);
        setDoubleField(term6719, term6719.getClass(), "blurValue", 0.0);
        setDoubleField(term6719, term6719.getClass(), "glowValue", 0.0);
        setBooleanField(term6719, term6719.getClass(), "quirkShift", false);
        setBooleanField(term6719, term6719.getClass(), "quirkJump", false);
        setBooleanField(term6719, term6719.getClass(), "quirkIndex", false);
        setBooleanField(term6719, term6719.getClass(), "quirkOrder", false);
        term6731 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term6731;
        callMethod(klass, "setPrintToConsole", argTypes, term6719, args);
    }

};


