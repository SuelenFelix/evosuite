package net.byteseek.swing.treetable;

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
import static net.byteseek.swing.treetable.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TreeTableHeaderRenderer_SortIconBorder_getBorderInsets_334848265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117739;

    public TreeTableHeaderRenderer_SortIconBorder_getBorderInsets_334848265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117739 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer$SortIconBorder"));
        Object term117740 = newInstance(Class.forName("java.awt.Insets"));
        setIntField(term117740, term117740.getClass(), "top", -1724900201);
        setIntField(term117740, term117740.getClass(), "left", -758523003);
        setIntField(term117740, term117740.getClass(), "bottom", 1567184195);
        setIntField(term117740, term117740.getClass(), "right", 63595623);
        setField(term117739, term117739.getClass(), "insets", term117740);
        setField(term117739, term117739.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer$SortIconBorder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Component");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getBorderInsets", argTypes, term117739, args);
    }

};


