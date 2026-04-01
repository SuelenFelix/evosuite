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
import java.lang.Integer;
import java.util.LinkedList;

public class TreeTableColumnSortStrategy_buildNewSortKeys_16635927112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5950;
     Object term5993;
     Object term5995;

    public TreeTableColumnSortStrategy_buildNewSortKeys_16635927112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5999 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$NewSortKeyPosition");
        Field term5998 = ((Class) term5999).getDeclaredField((String) "ADD_TO_END");
        ((Field) term5998).setAccessible(true);
        Object enum7 = ((Field) term5998).get((Object) null);
        Class<? extends Object> term6411 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$UpdateSortKeyPosition");
        Field term6410 = ((Class) term6411).getDeclaredField((String) "KEEP_POSITION");
        ((Field) term6410).setAccessible(true);
        Object enum8 = ((Field) term6410).get((Object) null);
        Class<? extends Object> term6847 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$RemoveSortKeyAction");
        Field term6846 = ((Class) term6847).getDeclaredField((String) "REMOVE");
        ((Field) term6846).setAccessible(true);
        Object enum9 = ((Field) term6846).get((Object) null);
        term5950 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy"));
        setIntField(term5950, term5950.getClass(), "maximumSortKeys", 3);
        setField(term5950, term5950.getClass(), "newSortKeyPosition", enum7);
        setField(term5950, term5950.getClass(), "updateSortKeyPosition", enum8);
        setField(term5950, term5950.getClass(), "removeSortKeyAction", enum9);
        term5993 = new Integer(1114000454);
        term5995 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term5993;
        args[1] = term5995;
        callMethod(klass, "buildNewSortKeys", argTypes, term5950, args);
    }

};


