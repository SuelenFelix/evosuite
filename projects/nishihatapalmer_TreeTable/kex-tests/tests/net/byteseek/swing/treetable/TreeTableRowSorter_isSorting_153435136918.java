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

public class TreeTableRowSorter_isSorting_153435136918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101248;

    public TreeTableRowSorter_isSorting_153435136918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term101251 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term101253 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term101251, term101251.getClass(), "column", 1064185088);
        setField(term101253, term101253.getClass(), "name", null);
        setIntField(term101253, term101253.getClass(), "ordinal", 2);
        setField(term101251, term101251.getClass(), "sortOrder", term101253);
        Object term101255 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term101257 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term101255, term101255.getClass(), "column", -1249782654);
        setField(term101257, term101257.getClass(), "name", null);
        setIntField(term101257, term101257.getClass(), "ordinal", 0);
        setField(term101255, term101255.getClass(), "sortOrder", term101257);
        Object term101259 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term101259, term101259.getClass(), "column", 399302934);
        setField(term101259, term101259.getClass(), "sortOrder", term101257);
        Object term101261 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term101261, term101261.getClass(), "column", -1823255084);
        setField(term101261, term101261.getClass(), "sortOrder", term101253);
        Object term101263 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term101263, term101263.getClass(), "column", 793345010);
        setField(term101263, term101263.getClass(), "sortOrder", term101253);
        Object term101265 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term101267 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term101265, term101265.getClass(), "column", -2092117838);
        setField(term101267, term101267.getClass(), "name", null);
        setIntField(term101267, term101267.getClass(), "ordinal", 1);
        setField(term101265, term101265.getClass(), "sortOrder", term101267);
        Object term101269 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term101269, term101269.getClass(), "column", 1524590776);
        setField(term101269, term101269.getClass(), "sortOrder", term101257);
        Object term101271 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term101271, term101271.getClass(), "column", 1523896653);
        setField(term101271, term101271.getClass(), "sortOrder", term101253);
        Object term101273 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term101273, term101273.getClass(), "column", -1731921726);
        setField(term101273, term101273.getClass(), "sortOrder", term101267);
        ArrayList term101249 = new ArrayList();
        ((ArrayList) term101249).add(term101251);
        ((ArrayList) term101249).add(term101255);
        ((ArrayList) term101249).add(term101259);
        ((ArrayList) term101249).add(term101261);
        ((ArrayList) term101249).add(term101263);
        ((ArrayList) term101249).add(term101265);
        ((ArrayList) term101249).add(term101269);
        ((ArrayList) term101249).add(term101271);
        ((ArrayList) term101249).add(term101273);
        ArrayList term101277 = new ArrayList();
        HashMap term101282 = new HashMap();
        Set<Object> term101364 =  ((Map) term101282).keySet();
        HashSet term101281 = new HashSet((Collection<? extends Object>) term101364);
        ArrayList term101323 = new ArrayList();
        ((ArrayList) term101323).add((Object)null);
        ((ArrayList) term101323).add((Object)null);
        ((ArrayList) term101323).add((Object)null);
        ((ArrayList) term101323).add((Object)null);
        ((ArrayList) term101323).add((Object)null);
        ArrayList term101326 = new ArrayList();
        HashSet term101329 = new HashSet();
        ArrayList term101343 = new ArrayList();
        ((ArrayList) term101343).add((Object)null);
        ((ArrayList) term101343).add((Object)null);
        ((ArrayList) term101343).add((Object)null);
        ((ArrayList) term101343).add((Object)null);
        ((ArrayList) term101343).add((Object)null);
        ArrayList term101346 = new ArrayList();
        HashSet term101349 = new HashSet();
        term101248 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term101320 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 3);
        Object term101321 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term101322 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term101330 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 4);
        int[] term101331 = (int[]) newIntArray(5);
        Object term101339 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term101341 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term101342 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term101353 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term101354 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term101358 = (int[]) newIntArray(1);
        Object term101362 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term101363 = (Object[]) newArray("java.lang.Object", 0);
        setField(term101248, term101248.getClass(), "model", null);
        setField(term101248, term101248.getClass(), "sortKeys", term101249);
        setField(term101248, term101248.getClass(), "defaultSortKeys", term101277);
        setField(term101248, term101248.getClass(), "unsortableColumns", term101281);
        setField(term101248, term101248.getClass(), "nodeComparator", null);
        setField(term101248, term101248.getClass(), "sortStrategy", null);
        setField(term101322, term101322.getClass(), "model", null);
        setField(term101322, term101322.getClass(), "sortKeys", term101323);
        setField(term101322, term101322.getClass(), "defaultSortKeys", term101326);
        setField(term101322, term101322.getClass(), "unsortableColumns", term101329);
        setField(term101322, term101322.getClass(), "nodeComparator", null);
        setField(term101322, term101322.getClass(), "sortStrategy", null);
        setField(term101322, term101322.getClass(), "viewToModelIndex", term101330);
        setIntElement(term101331, 0, -1549603566);
        setIntElement(term101331, 1, 1077223540);
        setIntElement(term101331, 2, -1823813592);
        setIntElement(term101331, 3, -1644358555);
        setIntElement(term101331, 4, -388591034);
        setField(term101322, term101322.getClass(), "modelToViewIndex", term101331);
        setIntField(term101322, term101322.getClass(), "lastRowCount", -1270258033);
        setBooleanField(term101322, term101322.getClass(), "rebuildIndices", false);
        setField(term101339, term101339.getClass(), "listenerList", null);
        setField(term101322, term101322.getClass(), "listenerList", term101339);
        setField(term101321, term101321.getClass(), "rowSorter", term101322);
        setIntField(term101321, term101321.getClass(), "modelIndex", 1677994069);
        setElement(term101320, 0, term101321);
        setField(term101342, term101342.getClass(), "model", null);
        setField(term101342, term101342.getClass(), "sortKeys", term101343);
        setField(term101342, term101342.getClass(), "defaultSortKeys", term101346);
        setField(term101342, term101342.getClass(), "unsortableColumns", term101349);
        setField(term101342, term101342.getClass(), "nodeComparator", null);
        setField(term101342, term101342.getClass(), "sortStrategy", null);
        setField(term101342, term101342.getClass(), "viewToModelIndex", null);
        setField(term101342, term101342.getClass(), "modelToViewIndex", null);
        setIntField(term101342, term101342.getClass(), "lastRowCount", 0);
        setBooleanField(term101342, term101342.getClass(), "rebuildIndices", false);
        setField(term101342, term101342.getClass(), "listenerList", null);
        setField(term101341, term101341.getClass(), "rowSorter", term101342);
        setIntField(term101341, term101341.getClass(), "modelIndex", -439999692);
        setElement(term101320, 1, term101341);
        setField(term101354, term101354.getClass(), "model", null);
        setField(term101354, term101354.getClass(), "sortKeys", null);
        setField(term101354, term101354.getClass(), "defaultSortKeys", null);
        setField(term101354, term101354.getClass(), "unsortableColumns", null);
        setField(term101354, term101354.getClass(), "nodeComparator", null);
        setField(term101354, term101354.getClass(), "sortStrategy", null);
        setField(term101354, term101354.getClass(), "viewToModelIndex", null);
        setField(term101354, term101354.getClass(), "modelToViewIndex", null);
        setIntField(term101354, term101354.getClass(), "lastRowCount", 0);
        setBooleanField(term101354, term101354.getClass(), "rebuildIndices", false);
        setField(term101354, term101354.getClass(), "listenerList", null);
        setField(term101353, term101353.getClass(), "rowSorter", term101354);
        setIntField(term101353, term101353.getClass(), "modelIndex", 924095007);
        setElement(term101320, 2, term101353);
        setField(term101248, term101248.getClass(), "viewToModelIndex", term101320);
        setIntElement(term101358, 0, 1302110708);
        setField(term101248, term101248.getClass(), "modelToViewIndex", term101358);
        setIntField(term101248, term101248.getClass(), "lastRowCount", 594705497);
        setBooleanField(term101248, term101248.getClass(), "rebuildIndices", false);
        setField(term101362, term101362.getClass(), "listenerList", term101363);
        setField(term101248, term101248.getClass(), "listenerList", term101362);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSorting", argTypes, term101248, args);
    }

};


