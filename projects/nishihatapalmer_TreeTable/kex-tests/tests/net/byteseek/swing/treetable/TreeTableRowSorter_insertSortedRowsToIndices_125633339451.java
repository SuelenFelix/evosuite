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

public class TreeTableRowSorter_insertSortedRowsToIndices_125633339451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104269;
     Object term104360;
     Object term104362;

    public TreeTableRowSorter_insertSortedRowsToIndices_125633339451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term104272 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term104274 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term104272, term104272.getClass(), "column", 1235809050);
        setField(term104274, term104274.getClass(), "name", null);
        setIntField(term104274, term104274.getClass(), "ordinal", 0);
        setField(term104272, term104272.getClass(), "sortOrder", term104274);
        Object term104276 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term104278 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term104276, term104276.getClass(), "column", 1370082921);
        setField(term104278, term104278.getClass(), "name", null);
        setIntField(term104278, term104278.getClass(), "ordinal", 1);
        setField(term104276, term104276.getClass(), "sortOrder", term104278);
        ArrayList term104270 = new ArrayList();
        ((ArrayList) term104270).add(term104272);
        ((ArrayList) term104270).add(term104276);
        ArrayList term104282 = new ArrayList();
        HashMap term104287 = new HashMap();
        Set<Object> term104364 =  ((Map) term104287).keySet();
        HashSet term104286 = new HashSet((Collection<? extends Object>) term104364);
        ArrayList term104312 = new ArrayList();
        ArrayList term104315 = new ArrayList();
        HashSet term104318 = new HashSet();
        term104269 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term104309 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 8);
        Object term104310 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term104311 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term104319 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 8);
        int[] term104320 = (int[]) newIntArray(2);
        Object term104325 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term104327 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term104328 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term104332 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term104333 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term104337 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term104338 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term104342 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term104343 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term104347 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term104348 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term104352 = (int[]) newIntArray(3);
        Object term104358 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term104359 = (Object[]) newArray("java.lang.Object", 0);
        setField(term104269, term104269.getClass(), "model", null);
        setField(term104269, term104269.getClass(), "sortKeys", term104270);
        setField(term104269, term104269.getClass(), "defaultSortKeys", term104282);
        setField(term104269, term104269.getClass(), "unsortableColumns", term104286);
        setField(term104269, term104269.getClass(), "nodeComparator", null);
        setField(term104269, term104269.getClass(), "sortStrategy", null);
        setField(term104311, term104311.getClass(), "model", null);
        setField(term104311, term104311.getClass(), "sortKeys", term104312);
        setField(term104311, term104311.getClass(), "defaultSortKeys", term104315);
        setField(term104311, term104311.getClass(), "unsortableColumns", term104318);
        setField(term104311, term104311.getClass(), "nodeComparator", null);
        setField(term104311, term104311.getClass(), "sortStrategy", null);
        setField(term104311, term104311.getClass(), "viewToModelIndex", term104319);
        setIntElement(term104320, 0, -1128091158);
        setIntElement(term104320, 1, 380526008);
        setField(term104311, term104311.getClass(), "modelToViewIndex", term104320);
        setIntField(term104311, term104311.getClass(), "lastRowCount", -285065370);
        setBooleanField(term104311, term104311.getClass(), "rebuildIndices", false);
        setField(term104325, term104325.getClass(), "listenerList", null);
        setField(term104311, term104311.getClass(), "listenerList", term104325);
        setField(term104310, term104310.getClass(), "rowSorter", term104311);
        setIntField(term104310, term104310.getClass(), "modelIndex", -1542216721);
        setElement(term104309, 0, term104310);
        setField(term104328, term104328.getClass(), "model", null);
        setField(term104328, term104328.getClass(), "sortKeys", null);
        setField(term104328, term104328.getClass(), "defaultSortKeys", null);
        setField(term104328, term104328.getClass(), "unsortableColumns", null);
        setField(term104328, term104328.getClass(), "nodeComparator", null);
        setField(term104328, term104328.getClass(), "sortStrategy", null);
        setField(term104328, term104328.getClass(), "viewToModelIndex", null);
        setField(term104328, term104328.getClass(), "modelToViewIndex", null);
        setIntField(term104328, term104328.getClass(), "lastRowCount", 0);
        setBooleanField(term104328, term104328.getClass(), "rebuildIndices", false);
        setField(term104328, term104328.getClass(), "listenerList", null);
        setField(term104327, term104327.getClass(), "rowSorter", term104328);
        setIntField(term104327, term104327.getClass(), "modelIndex", -311300330);
        setElement(term104309, 1, term104327);
        setField(term104333, term104333.getClass(), "model", null);
        setField(term104333, term104333.getClass(), "sortKeys", null);
        setField(term104333, term104333.getClass(), "defaultSortKeys", null);
        setField(term104333, term104333.getClass(), "unsortableColumns", null);
        setField(term104333, term104333.getClass(), "nodeComparator", null);
        setField(term104333, term104333.getClass(), "sortStrategy", null);
        setField(term104333, term104333.getClass(), "viewToModelIndex", null);
        setField(term104333, term104333.getClass(), "modelToViewIndex", null);
        setIntField(term104333, term104333.getClass(), "lastRowCount", 0);
        setBooleanField(term104333, term104333.getClass(), "rebuildIndices", false);
        setField(term104333, term104333.getClass(), "listenerList", null);
        setField(term104332, term104332.getClass(), "rowSorter", term104333);
        setIntField(term104332, term104332.getClass(), "modelIndex", 2114761003);
        setElement(term104309, 2, term104332);
        setElement(term104309, 3, term104310);
        setField(term104338, term104338.getClass(), "model", null);
        setField(term104338, term104338.getClass(), "sortKeys", null);
        setField(term104338, term104338.getClass(), "defaultSortKeys", null);
        setField(term104338, term104338.getClass(), "unsortableColumns", null);
        setField(term104338, term104338.getClass(), "nodeComparator", null);
        setField(term104338, term104338.getClass(), "sortStrategy", null);
        setField(term104338, term104338.getClass(), "viewToModelIndex", null);
        setField(term104338, term104338.getClass(), "modelToViewIndex", null);
        setIntField(term104338, term104338.getClass(), "lastRowCount", 0);
        setBooleanField(term104338, term104338.getClass(), "rebuildIndices", false);
        setField(term104338, term104338.getClass(), "listenerList", null);
        setField(term104337, term104337.getClass(), "rowSorter", term104338);
        setIntField(term104337, term104337.getClass(), "modelIndex", -655035002);
        setElement(term104309, 4, term104337);
        setField(term104343, term104343.getClass(), "model", null);
        setField(term104343, term104343.getClass(), "sortKeys", null);
        setField(term104343, term104343.getClass(), "defaultSortKeys", null);
        setField(term104343, term104343.getClass(), "unsortableColumns", null);
        setField(term104343, term104343.getClass(), "nodeComparator", null);
        setField(term104343, term104343.getClass(), "sortStrategy", null);
        setField(term104343, term104343.getClass(), "viewToModelIndex", null);
        setField(term104343, term104343.getClass(), "modelToViewIndex", null);
        setIntField(term104343, term104343.getClass(), "lastRowCount", 0);
        setBooleanField(term104343, term104343.getClass(), "rebuildIndices", false);
        setField(term104343, term104343.getClass(), "listenerList", null);
        setField(term104342, term104342.getClass(), "rowSorter", term104343);
        setIntField(term104342, term104342.getClass(), "modelIndex", 1525815085);
        setElement(term104309, 5, term104342);
        setField(term104348, term104348.getClass(), "model", null);
        setField(term104348, term104348.getClass(), "sortKeys", null);
        setField(term104348, term104348.getClass(), "defaultSortKeys", null);
        setField(term104348, term104348.getClass(), "unsortableColumns", null);
        setField(term104348, term104348.getClass(), "nodeComparator", null);
        setField(term104348, term104348.getClass(), "sortStrategy", null);
        setField(term104348, term104348.getClass(), "viewToModelIndex", null);
        setField(term104348, term104348.getClass(), "modelToViewIndex", null);
        setIntField(term104348, term104348.getClass(), "lastRowCount", 0);
        setBooleanField(term104348, term104348.getClass(), "rebuildIndices", false);
        setField(term104348, term104348.getClass(), "listenerList", null);
        setField(term104347, term104347.getClass(), "rowSorter", term104348);
        setIntField(term104347, term104347.getClass(), "modelIndex", 1966881264);
        setElement(term104309, 6, term104347);
        setElement(term104309, 7, term104347);
        setField(term104269, term104269.getClass(), "viewToModelIndex", term104309);
        setIntElement(term104352, 0, 1160936971);
        setIntElement(term104352, 1, 1258846008);
        setIntElement(term104352, 2, 702866958);
        setField(term104269, term104269.getClass(), "modelToViewIndex", term104352);
        setIntField(term104269, term104269.getClass(), "lastRowCount", 622731276);
        setBooleanField(term104269, term104269.getClass(), "rebuildIndices", true);
        setField(term104358, term104358.getClass(), "listenerList", term104359);
        setField(term104269, term104269.getClass(), "listenerList", term104358);
        term104360 = new Integer(-1302341502);
        term104362 = new Integer(1113574554);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term104360;
        args[1] = term104362;
        callMethod(klass, "insertSortedRowsToIndices", argTypes, term104269, args);
    }

};


