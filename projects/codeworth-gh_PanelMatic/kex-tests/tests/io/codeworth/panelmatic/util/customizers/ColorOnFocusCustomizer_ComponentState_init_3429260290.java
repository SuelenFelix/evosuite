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
import java.lang.Boolean;

public class ColorOnFocusCustomizer_ComponentState_init_3429260290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term376;
     Object term382;

    public ColorOnFocusCustomizer_ComponentState_init_3429260290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term376 = newInstance(Class.forName("java.awt.Color"));
        float[] term378 = (float[]) newFloatArray(1);
        float[] term380 = (float[]) newFloatArray(0);
        setIntField(term376, term376.getClass(), "value", -883034806);
        setFloatElement(term378, 0, 0.13238746F);
        setField(term376, term376.getClass(), "frgbvalue", term378);
        setField(term376, term376.getClass(), "fvalue", term380);
        setFloatField(term376, term376.getClass(), "falpha", 0.2707036F);
        setField(term376, term376.getClass(), "cs", null);
        term382 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.util.customizers.ColorOnFocusCustomizer$ComponentState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.awt.Color");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term376;
        args[1] = term382;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


