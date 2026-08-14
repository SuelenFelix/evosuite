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
     Object term5946;
     Object term5989;
     Object term5991;

    public TreeTableColumnSortStrategy_buildNewSortKeys_16635927112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5995 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$NewSortKeyPosition");
        Field term5994 = ((Class) term5995).getDeclaredField((String) "ADD_TO_END");
        ((Field) term5994).setAccessible(true);
        Object enum7 = ((Field) term5994).get((Object) null);
        Class<? extends Object> term6407 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$UpdateSortKeyPosition");
        Field term6406 = ((Class) term6407).getDeclaredField((String) "KEEP_POSITION");
        ((Field) term6406).setAccessible(true);
        Object enum8 = ((Field) term6406).get((Object) null);
        Class<? extends Object> term6843 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$RemoveSortKeyAction");
        Field term6842 = ((Class) term6843).getDeclaredField((String) "REMOVE");
        ((Field) term6842).setAccessible(true);
        Object enum9 = ((Field) term6842).get((Object) null);
        term5946 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy"));
        setIntField(term5946, term5946.getClass(), "maximumSortKeys", 3);
        setField(term5946, term5946.getClass(), "newSortKeyPosition", enum7);
        setField(term5946, term5946.getClass(), "updateSortKeyPosition", enum8);
        setField(term5946, term5946.getClass(), "removeSortKeyAction", enum9);
        term5989 = new Integer(1114000454);
        term5991 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term5989;
        args[1] = term5991;
        callMethod(klass, "buildNewSortKeys", argTypes, term5946, args);
    }

};


