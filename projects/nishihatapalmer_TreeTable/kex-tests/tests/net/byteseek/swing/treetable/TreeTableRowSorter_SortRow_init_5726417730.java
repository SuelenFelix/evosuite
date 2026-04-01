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

public class TreeTableRowSorter_SortRow_init_5726417730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369553;
     Object term369646;

    public TreeTableRowSorter_SortRow_init_5726417730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term369556 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term369558 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term369556, term369556.getClass(), "column", 1104795023);
        setField(term369558, term369558.getClass(), "name", null);
        setIntField(term369558, term369558.getClass(), "ordinal", 0);
        setField(term369556, term369556.getClass(), "sortOrder", term369558);
        Object term369560 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term369562 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term369560, term369560.getClass(), "column", -1833777337);
        setField(term369562, term369562.getClass(), "name", null);
        setIntField(term369562, term369562.getClass(), "ordinal", 1);
        setField(term369560, term369560.getClass(), "sortOrder", term369562);
        Object term369564 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term369566 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term369564, term369564.getClass(), "column", -2068333492);
        setField(term369566, term369566.getClass(), "name", null);
        setIntField(term369566, term369566.getClass(), "ordinal", 2);
        setField(term369564, term369564.getClass(), "sortOrder", term369566);
        Object term369568 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term369568, term369568.getClass(), "column", 1892862475);
        setField(term369568, term369568.getClass(), "sortOrder", term369558);
        ArrayList term369554 = new ArrayList();
        ((ArrayList) term369554).add(term369556);
        ((ArrayList) term369554).add(term369560);
        ((ArrayList) term369554).add(term369564);
        ((ArrayList) term369554).add(term369568);
        ArrayList term369572 = new ArrayList();
        HashMap term369577 = new HashMap();
        Set<Object> term369648 =  ((Map) term369577).keySet();
        HashSet term369576 = new HashSet((Collection<? extends Object>) term369648);
        ArrayList term369602 = new ArrayList();
        ArrayList term369605 = new ArrayList();
        HashSet term369608 = new HashSet();
        ArrayList term369624 = new ArrayList();
        ((ArrayList) term369624).add((Object)null);
        ((ArrayList) term369624).add((Object)null);
        ((ArrayList) term369624).add((Object)null);
        ((ArrayList) term369624).add((Object)null);
        ((ArrayList) term369624).add((Object)null);
        ((ArrayList) term369624).add((Object)null);
        ((ArrayList) term369624).add((Object)null);
        ((ArrayList) term369624).add((Object)null);
        ((ArrayList) term369624).add((Object)null);
        ArrayList term369627 = new ArrayList();
        HashSet term369630 = new HashSet();
        term369553 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term369599 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 3);
        Object term369600 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term369601 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term369609 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 7);
        int[] term369610 = (int[]) newIntArray(7);
        Object term369620 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term369622 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term369623 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term369634 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term369635 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term369639 = (int[]) newIntArray(2);
        Object term369644 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term369645 = (Object[]) newArray("java.lang.Object", 0);
        setField(term369553, term369553.getClass(), "model", null);
        setField(term369553, term369553.getClass(), "sortKeys", term369554);
        setField(term369553, term369553.getClass(), "defaultSortKeys", term369572);
        setField(term369553, term369553.getClass(), "unsortableColumns", term369576);
        setField(term369553, term369553.getClass(), "nodeComparator", null);
        setField(term369553, term369553.getClass(), "sortStrategy", null);
        setField(term369601, term369601.getClass(), "model", null);
        setField(term369601, term369601.getClass(), "sortKeys", term369602);
        setField(term369601, term369601.getClass(), "defaultSortKeys", term369605);
        setField(term369601, term369601.getClass(), "unsortableColumns", term369608);
        setField(term369601, term369601.getClass(), "nodeComparator", null);
        setField(term369601, term369601.getClass(), "sortStrategy", null);
        setField(term369601, term369601.getClass(), "viewToModelIndex", term369609);
        setIntElement(term369610, 0, 325391588);
        setIntElement(term369610, 1, 1443046313);
        setIntElement(term369610, 2, 1055117337);
        setIntElement(term369610, 3, -705616896);
        setIntElement(term369610, 4, 1057965724);
        setIntElement(term369610, 5, 2134707657);
        setIntElement(term369610, 6, -357630956);
        setField(term369601, term369601.getClass(), "modelToViewIndex", term369610);
        setIntField(term369601, term369601.getClass(), "lastRowCount", -1068878345);
        setBooleanField(term369601, term369601.getClass(), "rebuildIndices", false);
        setField(term369620, term369620.getClass(), "listenerList", null);
        setField(term369601, term369601.getClass(), "listenerList", term369620);
        setField(term369600, term369600.getClass(), "rowSorter", term369601);
        setIntField(term369600, term369600.getClass(), "modelIndex", 1386128235);
        setElement(term369599, 0, term369600);
        setField(term369623, term369623.getClass(), "model", null);
        setField(term369623, term369623.getClass(), "sortKeys", term369624);
        setField(term369623, term369623.getClass(), "defaultSortKeys", term369627);
        setField(term369623, term369623.getClass(), "unsortableColumns", term369630);
        setField(term369623, term369623.getClass(), "nodeComparator", null);
        setField(term369623, term369623.getClass(), "sortStrategy", null);
        setField(term369623, term369623.getClass(), "viewToModelIndex", null);
        setField(term369623, term369623.getClass(), "modelToViewIndex", null);
        setIntField(term369623, term369623.getClass(), "lastRowCount", 0);
        setBooleanField(term369623, term369623.getClass(), "rebuildIndices", false);
        setField(term369623, term369623.getClass(), "listenerList", null);
        setField(term369622, term369622.getClass(), "rowSorter", term369623);
        setIntField(term369622, term369622.getClass(), "modelIndex", -1047109164);
        setElement(term369599, 1, term369622);
        setField(term369635, term369635.getClass(), "model", null);
        setField(term369635, term369635.getClass(), "sortKeys", null);
        setField(term369635, term369635.getClass(), "defaultSortKeys", null);
        setField(term369635, term369635.getClass(), "unsortableColumns", null);
        setField(term369635, term369635.getClass(), "nodeComparator", null);
        setField(term369635, term369635.getClass(), "sortStrategy", null);
        setField(term369635, term369635.getClass(), "viewToModelIndex", null);
        setField(term369635, term369635.getClass(), "modelToViewIndex", null);
        setIntField(term369635, term369635.getClass(), "lastRowCount", 0);
        setBooleanField(term369635, term369635.getClass(), "rebuildIndices", false);
        setField(term369635, term369635.getClass(), "listenerList", null);
        setField(term369634, term369634.getClass(), "rowSorter", term369635);
        setIntField(term369634, term369634.getClass(), "modelIndex", -1650626012);
        setElement(term369599, 2, term369634);
        setField(term369553, term369553.getClass(), "viewToModelIndex", term369599);
        setIntElement(term369639, 0, -2045231879);
        setIntElement(term369639, 1, 1678025090);
        setField(term369553, term369553.getClass(), "modelToViewIndex", term369639);
        setIntField(term369553, term369553.getClass(), "lastRowCount", 714453255);
        setBooleanField(term369553, term369553.getClass(), "rebuildIndices", true);
        setField(term369644, term369644.getClass(), "listenerList", term369645);
        setField(term369553, term369553.getClass(), "listenerList", term369644);
        term369646 = new Integer(2096762388);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term369553;
        args[1] = term369646;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


