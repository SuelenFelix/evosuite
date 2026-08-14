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

public class TreeTableRowSorter_setNodeComparator_97701856923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101285;

    public TreeTableRowSorter_setNodeComparator_97701856923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term101288 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term101290 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term101288, term101288.getClass(), "column", 1701819905);
        setField(term101290, term101290.getClass(), "name", null);
        setIntField(term101290, term101290.getClass(), "ordinal", 0);
        setField(term101288, term101288.getClass(), "sortOrder", term101290);
        Object term101292 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term101294 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term101292, term101292.getClass(), "column", 1721418943);
        setField(term101294, term101294.getClass(), "name", null);
        setIntField(term101294, term101294.getClass(), "ordinal", 2);
        setField(term101292, term101292.getClass(), "sortOrder", term101294);
        Object term101296 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term101296, term101296.getClass(), "column", -111082612);
        setField(term101296, term101296.getClass(), "sortOrder", term101290);
        Object term101298 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term101298, term101298.getClass(), "column", 1253334988);
        setField(term101298, term101298.getClass(), "sortOrder", term101294);
        Object term101300 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term101300, term101300.getClass(), "column", 1086709736);
        setField(term101300, term101300.getClass(), "sortOrder", term101290);
        Object term101302 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term101304 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term101302, term101302.getClass(), "column", -1606698075);
        setField(term101304, term101304.getClass(), "name", null);
        setIntField(term101304, term101304.getClass(), "ordinal", 1);
        setField(term101302, term101302.getClass(), "sortOrder", term101304);
        Object term101306 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term101306, term101306.getClass(), "column", 90996421);
        setField(term101306, term101306.getClass(), "sortOrder", term101304);
        Object term101308 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term101308, term101308.getClass(), "column", -1805802783);
        setField(term101308, term101308.getClass(), "sortOrder", term101304);
        ArrayList term101286 = new ArrayList();
        ((ArrayList) term101286).add(term101288);
        ((ArrayList) term101286).add(term101292);
        ((ArrayList) term101286).add(term101296);
        ((ArrayList) term101286).add(term101298);
        ((ArrayList) term101286).add(term101300);
        ((ArrayList) term101286).add(term101302);
        ((ArrayList) term101286).add(term101306);
        ((ArrayList) term101286).add(term101308);
        ArrayList term101312 = new ArrayList();
        HashMap term101317 = new HashMap();
        Set<Object> term101384 =  ((Map) term101317).keySet();
        HashSet term101316 = new HashSet((Collection<? extends Object>) term101384);
        ArrayList term101334 = new ArrayList();
        ArrayList term101337 = new ArrayList();
        HashSet term101340 = new HashSet();
        ArrayList term101358 = new ArrayList();
        ((ArrayList) term101358).add((Object)null);
        ((ArrayList) term101358).add((Object)null);
        ArrayList term101361 = new ArrayList();
        HashSet term101364 = new HashSet();
        term101285 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term101331 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 4);
        Object term101332 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term101333 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term101341 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 2);
        int[] term101342 = (int[]) newIntArray(9);
        Object term101354 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term101356 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term101357 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term101368 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term101369 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term101373 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term101374 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term101378 = (int[]) newIntArray(1);
        Object term101382 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term101383 = (Object[]) newArray("java.lang.Object", 0);
        setField(term101285, term101285.getClass(), "model", null);
        setField(term101285, term101285.getClass(), "sortKeys", term101286);
        setField(term101285, term101285.getClass(), "defaultSortKeys", term101312);
        setField(term101285, term101285.getClass(), "unsortableColumns", term101316);
        setField(term101285, term101285.getClass(), "nodeComparator", null);
        setField(term101285, term101285.getClass(), "sortStrategy", null);
        setField(term101333, term101333.getClass(), "model", null);
        setField(term101333, term101333.getClass(), "sortKeys", term101334);
        setField(term101333, term101333.getClass(), "defaultSortKeys", term101337);
        setField(term101333, term101333.getClass(), "unsortableColumns", term101340);
        setField(term101333, term101333.getClass(), "nodeComparator", null);
        setField(term101333, term101333.getClass(), "sortStrategy", null);
        setField(term101333, term101333.getClass(), "viewToModelIndex", term101341);
        setIntElement(term101342, 0, 1854694585);
        setIntElement(term101342, 1, -1260562836);
        setIntElement(term101342, 2, 694100722);
        setIntElement(term101342, 3, -680529431);
        setIntElement(term101342, 4, 212698793);
        setIntElement(term101342, 5, 1169519385);
        setIntElement(term101342, 6, 1846078344);
        setIntElement(term101342, 7, 1692543802);
        setIntElement(term101342, 8, 376341151);
        setField(term101333, term101333.getClass(), "modelToViewIndex", term101342);
        setIntField(term101333, term101333.getClass(), "lastRowCount", -1607267243);
        setBooleanField(term101333, term101333.getClass(), "rebuildIndices", true);
        setField(term101354, term101354.getClass(), "listenerList", null);
        setField(term101333, term101333.getClass(), "listenerList", term101354);
        setField(term101332, term101332.getClass(), "rowSorter", term101333);
        setIntField(term101332, term101332.getClass(), "modelIndex", 1641377218);
        setElement(term101331, 0, term101332);
        setField(term101357, term101357.getClass(), "model", null);
        setField(term101357, term101357.getClass(), "sortKeys", term101358);
        setField(term101357, term101357.getClass(), "defaultSortKeys", term101361);
        setField(term101357, term101357.getClass(), "unsortableColumns", term101364);
        setField(term101357, term101357.getClass(), "nodeComparator", null);
        setField(term101357, term101357.getClass(), "sortStrategy", null);
        setField(term101357, term101357.getClass(), "viewToModelIndex", null);
        setField(term101357, term101357.getClass(), "modelToViewIndex", null);
        setIntField(term101357, term101357.getClass(), "lastRowCount", 0);
        setBooleanField(term101357, term101357.getClass(), "rebuildIndices", false);
        setField(term101357, term101357.getClass(), "listenerList", null);
        setField(term101356, term101356.getClass(), "rowSorter", term101357);
        setIntField(term101356, term101356.getClass(), "modelIndex", 1235375204);
        setElement(term101331, 1, term101356);
        setField(term101369, term101369.getClass(), "model", null);
        setField(term101369, term101369.getClass(), "sortKeys", null);
        setField(term101369, term101369.getClass(), "defaultSortKeys", null);
        setField(term101369, term101369.getClass(), "unsortableColumns", null);
        setField(term101369, term101369.getClass(), "nodeComparator", null);
        setField(term101369, term101369.getClass(), "sortStrategy", null);
        setField(term101369, term101369.getClass(), "viewToModelIndex", null);
        setField(term101369, term101369.getClass(), "modelToViewIndex", null);
        setIntField(term101369, term101369.getClass(), "lastRowCount", 0);
        setBooleanField(term101369, term101369.getClass(), "rebuildIndices", false);
        setField(term101369, term101369.getClass(), "listenerList", null);
        setField(term101368, term101368.getClass(), "rowSorter", term101369);
        setIntField(term101368, term101368.getClass(), "modelIndex", 258334639);
        setElement(term101331, 2, term101368);
        setField(term101374, term101374.getClass(), "model", null);
        setField(term101374, term101374.getClass(), "sortKeys", null);
        setField(term101374, term101374.getClass(), "defaultSortKeys", null);
        setField(term101374, term101374.getClass(), "unsortableColumns", null);
        setField(term101374, term101374.getClass(), "nodeComparator", null);
        setField(term101374, term101374.getClass(), "sortStrategy", null);
        setField(term101374, term101374.getClass(), "viewToModelIndex", null);
        setField(term101374, term101374.getClass(), "modelToViewIndex", null);
        setIntField(term101374, term101374.getClass(), "lastRowCount", 0);
        setBooleanField(term101374, term101374.getClass(), "rebuildIndices", false);
        setField(term101374, term101374.getClass(), "listenerList", null);
        setField(term101373, term101373.getClass(), "rowSorter", term101374);
        setIntField(term101373, term101373.getClass(), "modelIndex", 1432187207);
        setElement(term101331, 3, term101373);
        setField(term101285, term101285.getClass(), "viewToModelIndex", term101331);
        setIntElement(term101378, 0, -91068927);
        setField(term101285, term101285.getClass(), "modelToViewIndex", term101378);
        setIntField(term101285, term101285.getClass(), "lastRowCount", 680714112);
        setBooleanField(term101285, term101285.getClass(), "rebuildIndices", true);
        setField(term101382, term101382.getClass(), "listenerList", term101383);
        setField(term101285, term101285.getClass(), "listenerList", term101382);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setNodeComparator", argTypes, term101285, args);
    }

};


