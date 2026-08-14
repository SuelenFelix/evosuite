package io.github.moacirrf.netbeans.markdown.ui.preview;

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
import static io.github.moacirrf.netbeans.markdown.ui.preview.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ThemeResolver_toRGB_6814246685 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59;

    public ThemeResolver_toRGB_6814246685() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59 = newInstance(Class.forName("java.awt.Color"));
        float[] term61 = (float[]) newFloatArray(9);
        float[] term71 = (float[]) newFloatArray(0);
        setIntField(term59, term59.getClass(), "value", 568599855);
        setFloatElement(term61, 0, 0.13238746F);
        setFloatElement(term61, 1, 0.2707036F);
        setFloatElement(term61, 2, 0.3455959F);
        setFloatElement(term61, 3, 0.09123778F);
        setFloatElement(term61, 4, 0.5523636F);
        setFloatElement(term61, 5, 0.8564069F);
        setFloatElement(term61, 6, 0.5446086F);
        setFloatElement(term61, 7, 0.5254275F);
        setFloatElement(term61, 8, 0.2857073F);
        setField(term59, term59.getClass(), "frgbvalue", term61);
        setField(term59, term59.getClass(), "fvalue", term71);
        setFloatField(term59, term59.getClass(), "falpha", 0.6880585F);
        setField(term59, term59.getClass(), "cs", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.ThemeResolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Color");
        Object[] args = new Object[1];
        args[0] = term59;
        callMethod(klass, "toRGB", argTypes, null, args);
    }

};


