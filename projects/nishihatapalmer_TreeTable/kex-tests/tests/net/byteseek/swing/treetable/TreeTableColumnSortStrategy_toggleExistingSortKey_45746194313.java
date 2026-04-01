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
     Object term21527;
     Object term21570;
     Object term21591;

    public TreeTableColumnSortStrategy_toggleExistingSortKey_45746194313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21594 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$NewSortKeyPosition");
        Field term21593 = ((Class) term21594).getDeclaredField((String) "ADD_TO_END");
        ((Field) term21593).setAccessible(true);
        Object enum43 = ((Field) term21593).get((Object) null);
        Class<? extends Object> term22006 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$UpdateSortKeyPosition");
        Field term22005 = ((Class) term22006).getDeclaredField((String) "KEEP_POSITION");
        ((Field) term22005).setAccessible(true);
        Object enum44 = ((Field) term22005).get((Object) null);
        Class<? extends Object> term22442 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$RemoveSortKeyAction");
        Field term22441 = ((Class) term22442).getDeclaredField((String) "REMOVE");
        ((Field) term22441).setAccessible(true);
        Object enum45 = ((Field) term22441).get((Object) null);
        term21527 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy"));
        setIntField(term21527, term21527.getClass(), "maximumSortKeys", 3);
        setField(term21527, term21527.getClass(), "newSortKeyPosition", enum43);
        setField(term21527, term21527.getClass(), "updateSortKeyPosition", enum44);
        setField(term21527, term21527.getClass(), "removeSortKeyAction", enum45);
        Object term21573 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term21575 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term21573, term21573.getClass(), "column", -344842608);
        setField(term21575, term21575.getClass(), "name", "");
        setIntField(term21575, term21575.getClass(), "ordinal", 1);
        setField(term21573, term21573.getClass(), "sortOrder", term21575);
        Object term21579 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term21581 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term21579, term21579.getClass(), "column", 941650513);
        setField(term21581, term21581.getClass(), "name", null);
        setIntField(term21581, term21581.getClass(), "ordinal", 2);
        setField(term21579, term21579.getClass(), "sortOrder", term21581);
        Object term21584 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term21584, term21584.getClass(), "column", 444029505);
        setField(term21584, term21584.getClass(), "sortOrder", null);
        term21570 = new LinkedList();
        ((LinkedList) term21570).add(term21573);
        ((LinkedList) term21570).add(term21579);
        ((LinkedList) term21570).add(term21584);
        ((LinkedList) term21570).add((Object)null);
        ((LinkedList) term21570).add((Object)null);
        term21591 = new Integer(-894662986);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term21570;
        args[1] = term21591;
        callMethod(klass, "toggleExistingSortKey", argTypes, term21527, args);
    }

};


