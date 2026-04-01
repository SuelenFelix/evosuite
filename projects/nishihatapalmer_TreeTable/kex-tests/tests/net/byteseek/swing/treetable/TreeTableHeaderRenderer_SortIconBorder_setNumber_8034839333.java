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

public class TreeTableHeaderRenderer_SortIconBorder_setNumber_8034839333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118144;

    public TreeTableHeaderRenderer_SortIconBorder_setNumber_8034839333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118144 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer$SortIconBorder"));
        Object term118145 = newInstance(Class.forName("java.awt.Insets"));
        setIntField(term118145, term118145.getClass(), "top", 2063577636);
        setIntField(term118145, term118145.getClass(), "left", 1680632578);
        setIntField(term118145, term118145.getClass(), "bottom", 511399994);
        setIntField(term118145, term118145.getClass(), "right", 2094923086);
        setField(term118144, term118144.getClass(), "insets", term118145);
        setField(term118144, term118144.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer$SortIconBorder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Graphics");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setNumber", argTypes, term118144, args);
    }

};


