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
import java.lang.Integer;

public class TreeTableHeaderRenderer_SortIconBorder_paintBorder_4541745277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117751;
     Object term117752;
     Object term117754;
     Object term117756;
     Object term117758;

    public TreeTableHeaderRenderer_SortIconBorder_paintBorder_4541745277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117751 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer$SortIconBorder"));
        setField(term117751, term117751.getClass(), "insets", null);
        setField(term117751, term117751.getClass(), "this$0", null);
        term117752 = new Integer(0);
        term117754 = new Integer(0);
        term117756 = new Integer(0);
        term117758 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer$SortIconBorder");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.awt.Component");
        argTypes[1] = Class.forName("java.awt.Graphics");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = term117752;
        args[3] = term117754;
        args[4] = term117756;
        args[5] = term117758;
        callMethod(klass, "paintBorder", argTypes, term117751, args);
    }

};


