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
import java.lang.Object;

public class ColorOnFocusCustomizer_1_init_1579541480 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88;

    public ColorOnFocusCustomizer_1_init_1579541480() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88 = newInstance(Class.forName("io.codeworth.panelmatic.util.customizers.ColorOnFocusCustomizer"));
        Object term89 = newInstance(Class.forName("java.awt.Color"));
        Object term92 = newInstance(Class.forName("java.util.WeakHashMap"));
        Object[] term93 = (Object[]) newArray("java.util.WeakHashMap$Entry", 16);
        Object term97 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term98 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term101 = newInstance(Class.forName("io.codeworth.panelmatic.util.customizers.ColorOnFocusCustomizer$1"));
        setIntField(term89, term89.getClass(), "value", -129);
        setField(term89, term89.getClass(), "frgbvalue", null);
        setField(term89, term89.getClass(), "fvalue", null);
        setFloatField(term89, term89.getClass(), "falpha", 0.0F);
        setField(term89, term89.getClass(), "cs", null);
        setField(term88, term88.getClass(), "highlightColor", term89);
        setField(term92, term92.getClass(), "table", term93);
        setIntField(term92, term92.getClass(), "size", 0);
        setIntField(term92, term92.getClass(), "threshold", 12);
        setFloatField(term92, term92.getClass(), "loadFactor", 0.75F);
        setField(term97, term97.getClass(), "lock", term98);
        setField(term97, term97.getClass(), "head", null);
        setLongField(term97, term97.getClass(), "queueLength", 0L);
        setField(term92, term92.getClass(), "queue", term97);
        setIntField(term92, term92.getClass(), "modCount", 0);
        setField(term92, term92.getClass(), "entrySet", null);
        setField(term92, term92.getClass(), "keySet", null);
        setField(term92, term92.getClass(), "values", null);
        setField(term88, term88.getClass(), "prevColorMap", term92);
        setField(term101, term101.getClass(), "this$0", term88);
        setField(term88, term88.getClass(), "fl", term101);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.util.customizers.ColorOnFocusCustomizer$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.codeworth.panelmatic.util.customizers.ColorOnFocusCustomizer");
        Object[] args = new Object[1];
        args[0] = term88;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


