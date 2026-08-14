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

public class TreeTableColumnSortStrategy_addNewSortKey_68444544912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20211;
     Object term20254;
     Object term20268;

    public TreeTableColumnSortStrategy_addNewSortKey_68444544912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20271 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$NewSortKeyPosition");
        Field term20270 = ((Class) term20271).getDeclaredField((String) "ADD_TO_END");
        ((Field) term20270).setAccessible(true);
        Object enum40 = ((Field) term20270).get((Object) null);
        Class<? extends Object> term20683 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$UpdateSortKeyPosition");
        Field term20682 = ((Class) term20683).getDeclaredField((String) "KEEP_POSITION");
        ((Field) term20682).setAccessible(true);
        Object enum41 = ((Field) term20682).get((Object) null);
        Class<? extends Object> term21119 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$RemoveSortKeyAction");
        Field term21118 = ((Class) term21119).getDeclaredField((String) "REMOVE");
        ((Field) term21118).setAccessible(true);
        Object enum42 = ((Field) term21118).get((Object) null);
        term20211 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy"));
        setIntField(term20211, term20211.getClass(), "maximumSortKeys", 3);
        setField(term20211, term20211.getClass(), "newSortKeyPosition", enum40);
        setField(term20211, term20211.getClass(), "updateSortKeyPosition", enum41);
        setField(term20211, term20211.getClass(), "removeSortKeyAction", enum42);
        Object term20257 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term20259 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term20257, term20257.getClass(), "column", -1772434990);
        setField(term20259, term20259.getClass(), "name", "");
        setIntField(term20259, term20259.getClass(), "ordinal", 1);
        setField(term20257, term20257.getClass(), "sortOrder", term20259);
        Object term20263 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term20265 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term20263, term20263.getClass(), "column", -1845499264);
        setField(term20265, term20265.getClass(), "name", null);
        setIntField(term20265, term20265.getClass(), "ordinal", 2);
        setField(term20263, term20263.getClass(), "sortOrder", term20265);
        term20254 = new LinkedList();
        ((LinkedList) term20254).add(term20257);
        ((LinkedList) term20254).add(term20263);
        term20268 = new Integer(-505439934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term20254;
        args[1] = term20268;
        callMethod(klass, "addNewSortKey", argTypes, term20211, args);
    }

};


