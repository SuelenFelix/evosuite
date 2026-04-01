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

public class TreeTableColumnSortStrategy_toString_182348719411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18919;

    public TreeTableColumnSortStrategy_toString_182348719411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18963 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$NewSortKeyPosition");
        Field term18962 = ((Class) term18963).getDeclaredField((String) "ADD_TO_END");
        ((Field) term18962).setAccessible(true);
        Object enum37 = ((Field) term18962).get((Object) null);
        Class<? extends Object> term19375 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$UpdateSortKeyPosition");
        Field term19374 = ((Class) term19375).getDeclaredField((String) "KEEP_POSITION");
        ((Field) term19374).setAccessible(true);
        Object enum38 = ((Field) term19374).get((Object) null);
        Class<? extends Object> term19811 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$RemoveSortKeyAction");
        Field term19810 = ((Class) term19811).getDeclaredField((String) "REMOVE");
        ((Field) term19810).setAccessible(true);
        Object enum39 = ((Field) term19810).get((Object) null);
        term18919 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy"));
        setIntField(term18919, term18919.getClass(), "maximumSortKeys", 3);
        setField(term18919, term18919.getClass(), "newSortKeyPosition", enum37);
        setField(term18919, term18919.getClass(), "updateSortKeyPosition", enum38);
        setField(term18919, term18919.getClass(), "removeSortKeyAction", enum39);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term18919, args);
    }

};


