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

public class TreeTableHeaderRenderer_SortIconBorder_setNoNumber_7501148374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118150;

    public TreeTableHeaderRenderer_SortIconBorder_setNoNumber_7501148374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118150 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer$SortIconBorder"));
        Object term118151 = newInstance(Class.forName("java.awt.Insets"));
        setIntField(term118151, term118151.getClass(), "top", 1532355365);
        setIntField(term118151, term118151.getClass(), "left", -156316508);
        setIntField(term118151, term118151.getClass(), "bottom", -1304449497);
        setIntField(term118151, term118151.getClass(), "right", -80320412);
        setField(term118150, term118150.getClass(), "insets", term118151);
        setField(term118150, term118150.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableHeaderRenderer$SortIconBorder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setNoNumber", argTypes, term118150, args);
    }

};


