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

public class TreeTableRowSorter_getRebuildIndices_39726003138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103425;

    public TreeTableRowSorter_getRebuildIndices_39726003138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term103428 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term103430 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term103428, term103428.getClass(), "column", 1435572720);
        setField(term103430, term103430.getClass(), "name", null);
        setIntField(term103430, term103430.getClass(), "ordinal", 1);
        setField(term103428, term103428.getClass(), "sortOrder", term103430);
        Object term103432 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term103434 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term103432, term103432.getClass(), "column", 1437618365);
        setField(term103434, term103434.getClass(), "name", null);
        setIntField(term103434, term103434.getClass(), "ordinal", 2);
        setField(term103432, term103432.getClass(), "sortOrder", term103434);
        ArrayList term103426 = new ArrayList();
        ((ArrayList) term103426).add(term103428);
        ((ArrayList) term103426).add(term103432);
        ArrayList term103438 = new ArrayList();
        HashMap term103443 = new HashMap();
        Set<Object> term103494 =  ((Map) term103443).keySet();
        HashSet term103442 = new HashSet((Collection<? extends Object>) term103494);
        ArrayList term103451 = new ArrayList();
        ((ArrayList) term103451).add((Object)null);
        ((ArrayList) term103451).add((Object)null);
        ((ArrayList) term103451).add((Object)null);
        ((ArrayList) term103451).add((Object)null);
        ((ArrayList) term103451).add((Object)null);
        ((ArrayList) term103451).add((Object)null);
        ArrayList term103454 = new ArrayList();
        HashSet term103457 = new HashSet();
        term103425 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term103448 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 6);
        Object term103449 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term103450 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term103458 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 9);
        int[] term103459 = (int[]) newIntArray(3);
        Object term103465 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term103467 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term103468 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term103472 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term103473 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term103477 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term103478 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term103482 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term103483 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term103487 = (int[]) newIntArray(2);
        Object term103492 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term103493 = (Object[]) newArray("java.lang.Object", 0);
        setField(term103425, term103425.getClass(), "model", null);
        setField(term103425, term103425.getClass(), "sortKeys", term103426);
        setField(term103425, term103425.getClass(), "defaultSortKeys", term103438);
        setField(term103425, term103425.getClass(), "unsortableColumns", term103442);
        setField(term103425, term103425.getClass(), "nodeComparator", null);
        setField(term103425, term103425.getClass(), "sortStrategy", null);
        setField(term103450, term103450.getClass(), "model", null);
        setField(term103450, term103450.getClass(), "sortKeys", term103451);
        setField(term103450, term103450.getClass(), "defaultSortKeys", term103454);
        setField(term103450, term103450.getClass(), "unsortableColumns", term103457);
        setField(term103450, term103450.getClass(), "nodeComparator", null);
        setField(term103450, term103450.getClass(), "sortStrategy", null);
        setField(term103450, term103450.getClass(), "viewToModelIndex", term103458);
        setIntElement(term103459, 0, 1223703911);
        setIntElement(term103459, 1, -1824905298);
        setIntElement(term103459, 2, -2062724184);
        setField(term103450, term103450.getClass(), "modelToViewIndex", term103459);
        setIntField(term103450, term103450.getClass(), "lastRowCount", -716654499);
        setBooleanField(term103450, term103450.getClass(), "rebuildIndices", true);
        setField(term103465, term103465.getClass(), "listenerList", null);
        setField(term103450, term103450.getClass(), "listenerList", term103465);
        setField(term103449, term103449.getClass(), "rowSorter", term103450);
        setIntField(term103449, term103449.getClass(), "modelIndex", 1641117123);
        setElement(term103448, 0, term103449);
        setField(term103468, term103468.getClass(), "model", null);
        setField(term103468, term103468.getClass(), "sortKeys", null);
        setField(term103468, term103468.getClass(), "defaultSortKeys", null);
        setField(term103468, term103468.getClass(), "unsortableColumns", null);
        setField(term103468, term103468.getClass(), "nodeComparator", null);
        setField(term103468, term103468.getClass(), "sortStrategy", null);
        setField(term103468, term103468.getClass(), "viewToModelIndex", null);
        setField(term103468, term103468.getClass(), "modelToViewIndex", null);
        setIntField(term103468, term103468.getClass(), "lastRowCount", 0);
        setBooleanField(term103468, term103468.getClass(), "rebuildIndices", false);
        setField(term103468, term103468.getClass(), "listenerList", null);
        setField(term103467, term103467.getClass(), "rowSorter", term103468);
        setIntField(term103467, term103467.getClass(), "modelIndex", 646610000);
        setElement(term103448, 1, term103467);
        setElement(term103448, 2, term103449);
        setField(term103473, term103473.getClass(), "model", null);
        setField(term103473, term103473.getClass(), "sortKeys", null);
        setField(term103473, term103473.getClass(), "defaultSortKeys", null);
        setField(term103473, term103473.getClass(), "unsortableColumns", null);
        setField(term103473, term103473.getClass(), "nodeComparator", null);
        setField(term103473, term103473.getClass(), "sortStrategy", null);
        setField(term103473, term103473.getClass(), "viewToModelIndex", null);
        setField(term103473, term103473.getClass(), "modelToViewIndex", null);
        setIntField(term103473, term103473.getClass(), "lastRowCount", 0);
        setBooleanField(term103473, term103473.getClass(), "rebuildIndices", false);
        setField(term103473, term103473.getClass(), "listenerList", null);
        setField(term103472, term103472.getClass(), "rowSorter", term103473);
        setIntField(term103472, term103472.getClass(), "modelIndex", -223786928);
        setElement(term103448, 3, term103472);
        setField(term103478, term103478.getClass(), "model", null);
        setField(term103478, term103478.getClass(), "sortKeys", null);
        setField(term103478, term103478.getClass(), "defaultSortKeys", null);
        setField(term103478, term103478.getClass(), "unsortableColumns", null);
        setField(term103478, term103478.getClass(), "nodeComparator", null);
        setField(term103478, term103478.getClass(), "sortStrategy", null);
        setField(term103478, term103478.getClass(), "viewToModelIndex", null);
        setField(term103478, term103478.getClass(), "modelToViewIndex", null);
        setIntField(term103478, term103478.getClass(), "lastRowCount", 0);
        setBooleanField(term103478, term103478.getClass(), "rebuildIndices", false);
        setField(term103478, term103478.getClass(), "listenerList", null);
        setField(term103477, term103477.getClass(), "rowSorter", term103478);
        setIntField(term103477, term103477.getClass(), "modelIndex", -750603024);
        setElement(term103448, 4, term103477);
        setField(term103483, term103483.getClass(), "model", null);
        setField(term103483, term103483.getClass(), "sortKeys", null);
        setField(term103483, term103483.getClass(), "defaultSortKeys", null);
        setField(term103483, term103483.getClass(), "unsortableColumns", null);
        setField(term103483, term103483.getClass(), "nodeComparator", null);
        setField(term103483, term103483.getClass(), "sortStrategy", null);
        setField(term103483, term103483.getClass(), "viewToModelIndex", null);
        setField(term103483, term103483.getClass(), "modelToViewIndex", null);
        setIntField(term103483, term103483.getClass(), "lastRowCount", 0);
        setBooleanField(term103483, term103483.getClass(), "rebuildIndices", false);
        setField(term103483, term103483.getClass(), "listenerList", null);
        setField(term103482, term103482.getClass(), "rowSorter", term103483);
        setIntField(term103482, term103482.getClass(), "modelIndex", -575810668);
        setElement(term103448, 5, term103482);
        setField(term103425, term103425.getClass(), "viewToModelIndex", term103448);
        setIntElement(term103487, 0, -1084408453);
        setIntElement(term103487, 1, -1466822773);
        setField(term103425, term103425.getClass(), "modelToViewIndex", term103487);
        setIntField(term103425, term103425.getClass(), "lastRowCount", -230022261);
        setBooleanField(term103425, term103425.getClass(), "rebuildIndices", true);
        setField(term103492, term103492.getClass(), "listenerList", term103493);
        setField(term103425, term103425.getClass(), "listenerList", term103492);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRebuildIndices", argTypes, term103425, args);
    }

};


