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

public class ColorOnFocusCustomizer_customize_13739448122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term420;

    public ColorOnFocusCustomizer_customize_13739448122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term420 = newInstance(Class.forName("io.codeworth.panelmatic.util.customizers.ColorOnFocusCustomizer"));
        Object term421 = newInstance(Class.forName("java.awt.Color"));
        Object term424 = newInstance(Class.forName("java.util.WeakHashMap"));
        Object[] term425 = (Object[]) newArray("java.util.WeakHashMap$Entry", 16);
        Object term429 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term430 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term433 = newInstance(Class.forName("io.codeworth.panelmatic.util.customizers.ColorOnFocusCustomizer$1"));
        setIntField(term421, term421.getClass(), "value", -129);
        setField(term421, term421.getClass(), "frgbvalue", null);
        setField(term421, term421.getClass(), "fvalue", null);
        setFloatField(term421, term421.getClass(), "falpha", 0.0F);
        setField(term421, term421.getClass(), "cs", null);
        setField(term420, term420.getClass(), "highlightColor", term421);
        setField(term424, term424.getClass(), "table", term425);
        setIntField(term424, term424.getClass(), "size", 0);
        setIntField(term424, term424.getClass(), "threshold", 12);
        setFloatField(term424, term424.getClass(), "loadFactor", 0.75F);
        setField(term429, term429.getClass(), "lock", term430);
        setField(term429, term429.getClass(), "head", null);
        setLongField(term429, term429.getClass(), "queueLength", 0L);
        setField(term424, term424.getClass(), "queue", term429);
        setIntField(term424, term424.getClass(), "modCount", 0);
        setField(term424, term424.getClass(), "entrySet", null);
        setField(term424, term424.getClass(), "keySet", null);
        setField(term424, term424.getClass(), "values", null);
        setField(term420, term420.getClass(), "prevColorMap", term424);
        setField(term433, term433.getClass(), "this$0", term420);
        setField(term420, term420.getClass(), "fl", term433);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.util.customizers.ColorOnFocusCustomizer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("javax.swing.JComponent");
        Object[] args = new Object[2];
        args[0] = "SzjVpOQTyS";
        args[1] = null;
        callMethod(klass, "customize", argTypes, term420, args);
    }

};


