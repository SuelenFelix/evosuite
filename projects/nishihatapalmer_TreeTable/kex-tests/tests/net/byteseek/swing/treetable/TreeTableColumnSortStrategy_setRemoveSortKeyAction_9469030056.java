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

public class TreeTableColumnSortStrategy_setRemoveSortKeyAction_9469030056 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11561;
     Object enum23;

    public TreeTableColumnSortStrategy_setRemoveSortKeyAction_9469030056() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11619 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$NewSortKeyPosition");
        Field term11618 = ((Class) term11619).getDeclaredField((String) "ADD_TO_END");
        ((Field) term11618).setAccessible(true);
        Object enum20 = ((Field) term11618).get((Object) null);
        Class<? extends Object> term12031 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$UpdateSortKeyPosition");
        Field term12030 = ((Class) term12031).getDeclaredField((String) "KEEP_POSITION");
        ((Field) term12030).setAccessible(true);
        Object enum21 = ((Field) term12030).get((Object) null);
        Class<? extends Object> term12467 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$RemoveSortKeyAction");
        Field term12466 = ((Class) term12467).getDeclaredField((String) "REMOVE");
        ((Field) term12466).setAccessible(true);
        Object enum22 = ((Field) term12466).get((Object) null);
        term11561 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy"));
        setIntField(term11561, term11561.getClass(), "maximumSortKeys", 3);
        setField(term11561, term11561.getClass(), "newSortKeyPosition", enum20);
        setField(term11561, term11561.getClass(), "updateSortKeyPosition", enum21);
        setField(term11561, term11561.getClass(), "removeSortKeyAction", enum22);
        Class<? extends Object> term12872 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$RemoveSortKeyAction");
        Field term12871 = ((Class) term12872).getDeclaredField((String) "REMOVE_ALL");
        ((Field) term12871).setAccessible(true);
        enum23 = ((Field) term12871).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy$RemoveSortKeyAction");
        Object[] args = new Object[1];
        args[0] = enum23;
        callMethod(klass, "setRemoveSortKeyAction", argTypes, term11561, args);
    }

};


