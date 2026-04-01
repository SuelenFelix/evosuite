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

public class TreeCellRenderer_ExpandHandleBorder_paintBorder_19949016495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1682;
     Object term1683;
     Object term1685;
     Object term1687;
     Object term1689;

    public TreeCellRenderer_ExpandHandleBorder_paintBorder_19949016495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1682 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeCellRenderer$ExpandHandleBorder"));
        setField(term1682, term1682.getClass(), "this$0", null);
        term1683 = new Integer(0);
        term1685 = new Integer(0);
        term1687 = new Integer(0);
        term1689 = new Integer(0);
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
        args[2] = term1683;
        args[3] = term1685;
        args[4] = term1687;
        args[5] = term1689;
        callMethod(klass, "paintBorder", argTypes, term1682, args);
    }

};


