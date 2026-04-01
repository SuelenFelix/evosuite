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
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Integer;

public class TreeTableRowSorter_insertSortIndices_110781260740 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103579;
     Object term103619;
     Object term103621;

    public TreeTableRowSorter_insertSortIndices_110781260740() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term103582 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term103584 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term103582, term103582.getClass(), "column", -2014792457);
        setField(term103584, term103584.getClass(), "name", null);
        setIntField(term103584, term103584.getClass(), "ordinal", 1);
        setField(term103582, term103582.getClass(), "sortOrder", term103584);
        Object term103586 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term103586, term103586.getClass(), "column", 1957633116);
        setField(term103586, term103586.getClass(), "sortOrder", term103584);
        Object term103588 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term103588, term103588.getClass(), "column", 1428598210);
        setField(term103588, term103588.getClass(), "sortOrder", term103584);
        Object term103590 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term103592 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term103590, term103590.getClass(), "column", 1071776561);
        setField(term103592, term103592.getClass(), "name", null);
        setIntField(term103592, term103592.getClass(), "ordinal", 2);
        setField(term103590, term103590.getClass(), "sortOrder", term103592);
        Object term103594 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term103594, term103594.getClass(), "column", 1846399918);
        setField(term103594, term103594.getClass(), "sortOrder", term103592);
        Object term103596 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term103596, term103596.getClass(), "column", 35388821);
        setField(term103596, term103596.getClass(), "sortOrder", term103584);
        Object term103598 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term103598, term103598.getClass(), "column", -598803400);
        setField(term103598, term103598.getClass(), "sortOrder", term103592);
        ArrayList term103580 = new ArrayList();
        ((ArrayList) term103580).add(term103582);
        ((ArrayList) term103580).add(term103586);
        ((ArrayList) term103580).add(term103588);
        ((ArrayList) term103580).add(term103590);
        ((ArrayList) term103580).add(term103594);
        ((ArrayList) term103580).add(term103596);
        ((ArrayList) term103580).add(term103598);
        ArrayList term103602 = new ArrayList();
        HashMap term103607 = new HashMap();
        Set<Object> term103623 =  ((Map) term103607).keySet();
        HashSet term103606 = new HashSet((Collection<? extends Object>) term103623);
        term103579 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term103612 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 0);
        int[] term103613 = (int[]) newIntArray(1);
        Object term103617 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term103618 = (Object[]) newArray("java.lang.Object", 0);
        setField(term103579, term103579.getClass(), "model", null);
        setField(term103579, term103579.getClass(), "sortKeys", term103580);
        setField(term103579, term103579.getClass(), "defaultSortKeys", term103602);
        setField(term103579, term103579.getClass(), "unsortableColumns", term103606);
        setField(term103579, term103579.getClass(), "nodeComparator", null);
        setField(term103579, term103579.getClass(), "sortStrategy", null);
        setField(term103579, term103579.getClass(), "viewToModelIndex", term103612);
        setIntElement(term103613, 0, 25560022);
        setField(term103579, term103579.getClass(), "modelToViewIndex", term103613);
        setIntField(term103579, term103579.getClass(), "lastRowCount", -1090136985);
        setBooleanField(term103579, term103579.getClass(), "rebuildIndices", true);
        setField(term103617, term103617.getClass(), "listenerList", term103618);
        setField(term103579, term103579.getClass(), "listenerList", term103617);
        term103619 = new Integer(-355574894);
        term103621 = new Integer(1866941633);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term103619;
        args[1] = term103621;
        callMethod(klass, "insertSortIndices", argTypes, term103579, args);
    }

};


