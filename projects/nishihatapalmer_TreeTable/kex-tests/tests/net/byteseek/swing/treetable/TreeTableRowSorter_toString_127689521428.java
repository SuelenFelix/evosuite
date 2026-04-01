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

public class TreeTableRowSorter_toString_127689521428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102374;

    public TreeTableRowSorter_toString_127689521428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term102377 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term102379 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term102377, term102377.getClass(), "column", -126399768);
        setField(term102379, term102379.getClass(), "name", null);
        setIntField(term102379, term102379.getClass(), "ordinal", 2);
        setField(term102377, term102377.getClass(), "sortOrder", term102379);
        ArrayList term102375 = new ArrayList();
        ((ArrayList) term102375).add(term102377);
        ArrayList term102383 = new ArrayList();
        HashMap term102388 = new HashMap();
        Set<Object> term102439 =  ((Map) term102388).keySet();
        HashSet term102387 = new HashSet((Collection<? extends Object>) term102439);
        ArrayList term102396 = new ArrayList();
        ((ArrayList) term102396).add((Object)null);
        ((ArrayList) term102396).add((Object)null);
        ((ArrayList) term102396).add((Object)null);
        ((ArrayList) term102396).add((Object)null);
        ((ArrayList) term102396).add((Object)null);
        ((ArrayList) term102396).add((Object)null);
        ArrayList term102399 = new ArrayList();
        HashSet term102402 = new HashSet();
        ArrayList term102415 = new ArrayList();
        ((ArrayList) term102415).add((Object)null);
        ArrayList term102418 = new ArrayList();
        HashSet term102421 = new HashSet();
        term102374 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term102393 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 3);
        Object term102394 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term102395 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term102403 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 6);
        int[] term102404 = (int[]) newIntArray(4);
        Object term102411 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term102413 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term102414 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term102425 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term102426 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term102430 = (int[]) newIntArray(4);
        Object term102437 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term102438 = (Object[]) newArray("java.lang.Object", 0);
        setField(term102374, term102374.getClass(), "model", null);
        setField(term102374, term102374.getClass(), "sortKeys", term102375);
        setField(term102374, term102374.getClass(), "defaultSortKeys", term102383);
        setField(term102374, term102374.getClass(), "unsortableColumns", term102387);
        setField(term102374, term102374.getClass(), "nodeComparator", null);
        setField(term102374, term102374.getClass(), "sortStrategy", null);
        setField(term102395, term102395.getClass(), "model", null);
        setField(term102395, term102395.getClass(), "sortKeys", term102396);
        setField(term102395, term102395.getClass(), "defaultSortKeys", term102399);
        setField(term102395, term102395.getClass(), "unsortableColumns", term102402);
        setField(term102395, term102395.getClass(), "nodeComparator", null);
        setField(term102395, term102395.getClass(), "sortStrategy", null);
        setField(term102395, term102395.getClass(), "viewToModelIndex", term102403);
        setIntElement(term102404, 0, 1253334988);
        setIntElement(term102404, 1, 1086709736);
        setIntElement(term102404, 2, -1606698075);
        setIntElement(term102404, 3, 90996421);
        setField(term102395, term102395.getClass(), "modelToViewIndex", term102404);
        setIntField(term102395, term102395.getClass(), "lastRowCount", -1805802783);
        setBooleanField(term102395, term102395.getClass(), "rebuildIndices", true);
        setField(term102411, term102411.getClass(), "listenerList", null);
        setField(term102395, term102395.getClass(), "listenerList", term102411);
        setField(term102394, term102394.getClass(), "rowSorter", term102395);
        setIntField(term102394, term102394.getClass(), "modelIndex", -529831900);
        setElement(term102393, 0, term102394);
        setField(term102414, term102414.getClass(), "model", null);
        setField(term102414, term102414.getClass(), "sortKeys", term102415);
        setField(term102414, term102414.getClass(), "defaultSortKeys", term102418);
        setField(term102414, term102414.getClass(), "unsortableColumns", term102421);
        setField(term102414, term102414.getClass(), "nodeComparator", null);
        setField(term102414, term102414.getClass(), "sortStrategy", null);
        setField(term102414, term102414.getClass(), "viewToModelIndex", null);
        setField(term102414, term102414.getClass(), "modelToViewIndex", null);
        setIntField(term102414, term102414.getClass(), "lastRowCount", 0);
        setBooleanField(term102414, term102414.getClass(), "rebuildIndices", false);
        setField(term102414, term102414.getClass(), "listenerList", null);
        setField(term102413, term102413.getClass(), "rowSorter", term102414);
        setIntField(term102413, term102413.getClass(), "modelIndex", 1574493440);
        setElement(term102393, 1, term102413);
        setField(term102426, term102426.getClass(), "model", null);
        setField(term102426, term102426.getClass(), "sortKeys", null);
        setField(term102426, term102426.getClass(), "defaultSortKeys", null);
        setField(term102426, term102426.getClass(), "unsortableColumns", null);
        setField(term102426, term102426.getClass(), "nodeComparator", null);
        setField(term102426, term102426.getClass(), "sortStrategy", null);
        setField(term102426, term102426.getClass(), "viewToModelIndex", null);
        setField(term102426, term102426.getClass(), "modelToViewIndex", null);
        setIntField(term102426, term102426.getClass(), "lastRowCount", 0);
        setBooleanField(term102426, term102426.getClass(), "rebuildIndices", false);
        setField(term102426, term102426.getClass(), "listenerList", null);
        setField(term102425, term102425.getClass(), "rowSorter", term102426);
        setIntField(term102425, term102425.getClass(), "modelIndex", 1854694585);
        setElement(term102393, 2, term102425);
        setField(term102374, term102374.getClass(), "viewToModelIndex", term102393);
        setIntElement(term102430, 0, -1260562836);
        setIntElement(term102430, 1, 694100722);
        setIntElement(term102430, 2, -680529431);
        setIntElement(term102430, 3, 212698793);
        setField(term102374, term102374.getClass(), "modelToViewIndex", term102430);
        setIntField(term102374, term102374.getClass(), "lastRowCount", 1169519385);
        setBooleanField(term102374, term102374.getClass(), "rebuildIndices", false);
        setField(term102437, term102437.getClass(), "listenerList", term102438);
        setField(term102374, term102374.getClass(), "listenerList", term102437);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term102374, args);
    }

};


