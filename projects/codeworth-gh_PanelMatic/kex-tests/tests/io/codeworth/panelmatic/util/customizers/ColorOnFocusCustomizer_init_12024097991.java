package io.codeworth.panelmatic.util.customizers;

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
import static io.codeworth.panelmatic.util.customizers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ColorOnFocusCustomizer_init_12024097991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term395;

    public ColorOnFocusCustomizer_init_12024097991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term395 = newInstance(Class.forName("java.awt.Color"));
        float[] term397 = (float[]) newFloatArray(2);
        float[] term400 = (float[]) newFloatArray(8);
        setIntField(term395, term395.getClass(), "value", 1585847225);
        setFloatElement(term397, 0, 0.3455959F);
        setFloatElement(term397, 1, 0.09123778F);
        setField(term395, term395.getClass(), "frgbvalue", term397);
        setFloatElement(term400, 0, 0.5523636F);
        setFloatElement(term400, 1, 0.8564069F);
        setFloatElement(term400, 2, 0.5446086F);
        setFloatElement(term400, 3, 0.5254275F);
        setFloatElement(term400, 4, 0.2857073F);
        setFloatElement(term400, 5, 0.6880585F);
        setFloatElement(term400, 6, 0.40176582F);
        setFloatElement(term400, 7, 0.8783184F);
        setField(term395, term395.getClass(), "fvalue", term400);
        setFloatField(term395, term395.getClass(), "falpha", 0.26413453F);
        setField(term395, term395.getClass(), "cs", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.util.customizers.ColorOnFocusCustomizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Color");
        Object[] args = new Object[1];
        args[0] = term395;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


