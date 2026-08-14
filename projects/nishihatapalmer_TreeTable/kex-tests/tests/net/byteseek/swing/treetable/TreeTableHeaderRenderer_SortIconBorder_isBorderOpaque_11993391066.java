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

public class TreeTableHeaderRenderer_SortIconBorder_isBorderOpaque_11993391066 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117745;

    public TreeTableHeaderRenderer_SortIconBorder_isBorderOpaque_11993391066() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117745 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer$SortIconBorder"));
        Object term117746 = newInstance(Class.forName("java.awt.Insets"));
        setIntField(term117746, term117746.getClass(), "top", 1764150991);
        setIntField(term117746, term117746.getClass(), "left", 944653455);
        setIntField(term117746, term117746.getClass(), "bottom", -1819474400);
        setIntField(term117746, term117746.getClass(), "right", 783684648);
        setField(term117745, term117745.getClass(), "insets", term117746);
        setField(term117745, term117745.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer$SortIconBorder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBorderOpaque", argTypes, term117745, args);
    }

};


