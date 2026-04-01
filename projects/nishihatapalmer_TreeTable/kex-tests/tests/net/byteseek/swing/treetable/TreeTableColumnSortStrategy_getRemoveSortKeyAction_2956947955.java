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
import java.lang.String;
import java.lang.Object;

public class TreeTableColumnSortStrategy_getRemoveSortKeyAction_2956947955 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10269;

    public TreeTableColumnSortStrategy_getRemoveSortKeyAction_2956947955() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10313 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$NewSortKeyPosition");
        Field term10312 = ((Class) term10313).getDeclaredField((String) "ADD_TO_END");
        ((Field) term10312).setAccessible(true);
        Object enum17 = ((Field) term10312).get((Object) null);
        Class<? extends Object> term10725 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$UpdateSortKeyPosition");
        Field term10724 = ((Class) term10725).getDeclaredField((String) "KEEP_POSITION");
        ((Field) term10724).setAccessible(true);
        Object enum18 = ((Field) term10724).get((Object) null);
        Class<? extends Object> term11161 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$RemoveSortKeyAction");
        Field term11160 = ((Class) term11161).getDeclaredField((String) "REMOVE");
        ((Field) term11160).setAccessible(true);
        Object enum19 = ((Field) term11160).get((Object) null);
        term10269 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy"));
        setIntField(term10269, term10269.getClass(), "maximumSortKeys", 3);
        setField(term10269, term10269.getClass(), "newSortKeyPosition", enum17);
        setField(term10269, term10269.getClass(), "updateSortKeyPosition", enum18);
        setField(term10269, term10269.getClass(), "removeSortKeyAction", enum19);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRemoveSortKeyAction", argTypes, term10269, args);
    }

};


