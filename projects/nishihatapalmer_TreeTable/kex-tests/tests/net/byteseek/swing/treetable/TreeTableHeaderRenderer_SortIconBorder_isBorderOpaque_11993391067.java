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

public class TreeTableHeaderRenderer_SortIconBorder_isBorderOpaque_11993391067 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118163;

    public TreeTableHeaderRenderer_SortIconBorder_isBorderOpaque_11993391067() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118163 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer$SortIconBorder"));
        Object term118164 = newInstance(Class.forName("java.awt.Insets"));
        setIntField(term118164, term118164.getClass(), "top", -15085966);
        setIntField(term118164, term118164.getClass(), "left", -1929631412);
        setIntField(term118164, term118164.getClass(), "bottom", 1014160441);
        setIntField(term118164, term118164.getClass(), "right", 975753484);
        setField(term118163, term118163.getClass(), "insets", term118164);
        setField(term118163, term118163.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer$SortIconBorder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBorderOpaque", argTypes, term118163, args);
    }

};


