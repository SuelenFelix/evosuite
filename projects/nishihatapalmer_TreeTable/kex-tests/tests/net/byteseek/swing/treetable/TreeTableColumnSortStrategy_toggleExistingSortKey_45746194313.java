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
import java.util.LinkedList;
import java.lang.Integer;

public class TreeTableColumnSortStrategy_toggleExistingSortKey_45746194313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21523;
     Object term21566;
     Object term21587;

    public TreeTableColumnSortStrategy_toggleExistingSortKey_45746194313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21590 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$NewSortKeyPosition");
        Field term21589 = ((Class) term21590).getDeclaredField((String) "ADD_TO_END");
        ((Field) term21589).setAccessible(true);
        Object enum43 = ((Field) term21589).get((Object) null);
        Class<? extends Object> term22002 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$UpdateSortKeyPosition");
        Field term22001 = ((Class) term22002).getDeclaredField((String) "KEEP_POSITION");
        ((Field) term22001).setAccessible(true);
        Object enum44 = ((Field) term22001).get((Object) null);
        Class<? extends Object> term22438 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$RemoveSortKeyAction");
        Field term22437 = ((Class) term22438).getDeclaredField((String) "REMOVE");
        ((Field) term22437).setAccessible(true);
        Object enum45 = ((Field) term22437).get((Object) null);
        term21523 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy"));
        setIntField(term21523, term21523.getClass(), "maximumSortKeys", 3);
        setField(term21523, term21523.getClass(), "newSortKeyPosition", enum43);
        setField(term21523, term21523.getClass(), "updateSortKeyPosition", enum44);
        setField(term21523, term21523.getClass(), "removeSortKeyAction", enum45);
        Object term21569 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term21571 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term21569, term21569.getClass(), "column", -344842608);
        setField(term21571, term21571.getClass(), "name", "");
        setIntField(term21571, term21571.getClass(), "ordinal", 1);
        setField(term21569, term21569.getClass(), "sortOrder", term21571);
        Object term21575 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term21577 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term21575, term21575.getClass(), "column", 941650513);
        setField(term21577, term21577.getClass(), "name", null);
        setIntField(term21577, term21577.getClass(), "ordinal", 2);
        setField(term21575, term21575.getClass(), "sortOrder", term21577);
        Object term21580 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term21580, term21580.getClass(), "column", 444029505);
        setField(term21580, term21580.getClass(), "sortOrder", null);
        term21566 = new LinkedList();
        ((LinkedList) term21566).add(term21569);
        ((LinkedList) term21566).add(term21575);
        ((LinkedList) term21566).add(term21580);
        ((LinkedList) term21566).add((Object)null);
        ((LinkedList) term21566).add((Object)null);
        term21587 = new Integer(-894662986);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term21566;
        args[1] = term21587;
        callMethod(klass, "toggleExistingSortKey", argTypes, term21523, args);
    }

};


