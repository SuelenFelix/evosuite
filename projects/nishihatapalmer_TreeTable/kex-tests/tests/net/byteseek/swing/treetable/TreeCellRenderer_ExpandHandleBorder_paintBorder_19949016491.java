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

public class TreeCellRenderer_ExpandHandleBorder_paintBorder_19949016491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1671;
     Object term1672;
     Object term1674;
     Object term1676;
     Object term1678;

    public TreeCellRenderer_ExpandHandleBorder_paintBorder_19949016491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1671 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer$ExpandHandleBorder"));
        setField(term1671, term1671.getClass(), "this$0", null);
        term1672 = new Integer(1632125673);
        term1674 = new Integer(454281060);
        term1676 = new Integer(-1786399638);
        term1678 = new Integer(2055867847);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeCellRenderer$ExpandHandleBorder");
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
        args[2] = term1672;
        args[3] = term1674;
        args[4] = term1676;
        args[5] = term1678;
        callMethod(klass, "paintBorder", argTypes, term1671, args);
    }

};


