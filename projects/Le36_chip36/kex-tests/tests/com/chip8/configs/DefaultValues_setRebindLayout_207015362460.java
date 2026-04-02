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

public class DefaultValues_setRebindLayout_207015362460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6635;

    public DefaultValues_setRebindLayout_207015362460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6635 = newInstance(Class.forName("com.chip8.configs.DefaultValues"));
        setField(term6635, term6635.getClass(), "rebindLayout", null);
        setField(term6635, term6635.getClass(), "mouseKbLayout", null);
        setField(term6635, term6635.getClass(), "bgColor", null);
        setField(term6635, term6635.getClass(), "spriteColor", null);
        setField(term6635, term6635.getClass(), "planeColor", null);
        setField(term6635, term6635.getClass(), "bothColor", null);
        setField(term6635, term6635.getClass(), "printSymbol", null);
        setBooleanField(term6635, term6635.getClass(), "printToConsole", false);
        setBooleanField(term6635, term6635.getClass(), "disableUiUpdates", false);
        setBooleanField(term6635, term6635.getClass(), "roundPixels", false);
        setBooleanField(term6635, term6635.getClass(), "blur", false);
        setBooleanField(term6635, term6635.getClass(), "glow", false);
        setDoubleField(term6635, term6635.getClass(), "blurValue", 0.0);
        setDoubleField(term6635, term6635.getClass(), "glowValue", 0.0);
        setBooleanField(term6635, term6635.getClass(), "quirkShift", false);
        setBooleanField(term6635, term6635.getClass(), "quirkJump", false);
        setBooleanField(term6635, term6635.getClass(), "quirkIndex", false);
        setBooleanField(term6635, term6635.getClass(), "quirkOrder", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.chip8.configs.DefaultValues");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setRebindLayout", argTypes, term6635, args);
    }

};


