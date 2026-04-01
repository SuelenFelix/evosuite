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
import java.lang.Integer;

public class TreeTableHeaderRenderer_SortIconBorder_paintBorder_4541745272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118130;
     Object term118136;
     Object term118138;
     Object term118140;
     Object term118142;

    public TreeTableHeaderRenderer_SortIconBorder_paintBorder_4541745272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118130 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer$SortIconBorder"));
        Object term118131 = newInstance(Class.forName("java.awt.Insets"));
        setIntField(term118131, term118131.getClass(), "top", 1712273163);
        setIntField(term118131, term118131.getClass(), "left", 234306621);
        setIntField(term118131, term118131.getClass(), "bottom", 1025525602);
        setIntField(term118131, term118131.getClass(), "right", 1669406334);
        setField(term118130, term118130.getClass(), "insets", term118131);
        setField(term118130, term118130.getClass(), "this$0", null);
        term118136 = new Integer(-780862464);
        term118138 = new Integer(2014099129);
        term118140 = new Integer(-1024382698);
        term118142 = new Integer(-168406824);
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
        args[2] = term118136;
        args[3] = term118138;
        args[4] = term118140;
        args[5] = term118142;
        callMethod(klass, "paintBorder", argTypes, term118130, args);
    }

};


