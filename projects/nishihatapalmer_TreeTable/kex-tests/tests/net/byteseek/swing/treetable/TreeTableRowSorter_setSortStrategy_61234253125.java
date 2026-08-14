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

public class TreeTableRowSorter_setSortStrategy_61234253125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101548;

    public TreeTableRowSorter_setSortStrategy_61234253125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term101551 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term101553 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term101551, term101551.getClass(), "column", -945759470);
        setField(term101553, term101553.getClass(), "name", null);
        setIntField(term101553, term101553.getClass(), "ordinal", 0);
        setField(term101551, term101551.getClass(), "sortOrder", term101553);
        Object term101555 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term101557 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term101555, term101555.getClass(), "column", 657342039);
        setField(term101557, term101557.getClass(), "name", null);
        setIntField(term101557, term101557.getClass(), "ordinal", 2);
        setField(term101555, term101555.getClass(), "sortOrder", term101557);
        Object term101559 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term101559, term101559.getClass(), "column", 1483999606);
        setField(term101559, term101559.getClass(), "sortOrder", term101553);
        Object term101561 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term101561, term101561.getClass(), "column", 1871761182);
        setField(term101561, term101561.getClass(), "sortOrder", term101557);
        ArrayList term101549 = new ArrayList();
        ((ArrayList) term101549).add(term101551);
        ((ArrayList) term101549).add(term101555);
        ((ArrayList) term101549).add(term101559);
        ((ArrayList) term101549).add(term101561);
        ArrayList term101565 = new ArrayList();
        HashMap term101570 = new HashMap();
        Set<Object> term101644 =  ((Map) term101570).keySet();
        HashSet term101569 = new HashSet((Collection<? extends Object>) term101644);
        ArrayList term101607 = new ArrayList();
        ((ArrayList) term101607).add((Object)null);
        ArrayList term101610 = new ArrayList();
        HashSet term101613 = new HashSet();
        ArrayList term101623 = new ArrayList();
        ((ArrayList) term101623).add((Object)null);
        ((ArrayList) term101623).add((Object)null);
        ((ArrayList) term101623).add((Object)null);
        ((ArrayList) term101623).add((Object)null);
        ArrayList term101626 = new ArrayList();
        HashSet term101629 = new HashSet();
        term101548 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term101604 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 2);
        Object term101605 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term101606 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term101614 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 4);
        int[] term101615 = (int[]) newIntArray(1);
        Object term101619 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term101621 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term101622 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term101633 = (int[]) newIntArray(6);
        Object term101642 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term101643 = (Object[]) newArray("java.lang.Object", 0);
        setField(term101548, term101548.getClass(), "model", null);
        setField(term101548, term101548.getClass(), "sortKeys", term101549);
        setField(term101548, term101548.getClass(), "defaultSortKeys", term101565);
        setField(term101548, term101548.getClass(), "unsortableColumns", term101569);
        setField(term101548, term101548.getClass(), "nodeComparator", null);
        setField(term101548, term101548.getClass(), "sortStrategy", null);
        setField(term101606, term101606.getClass(), "model", null);
        setField(term101606, term101606.getClass(), "sortKeys", term101607);
        setField(term101606, term101606.getClass(), "defaultSortKeys", term101610);
        setField(term101606, term101606.getClass(), "unsortableColumns", term101613);
        setField(term101606, term101606.getClass(), "nodeComparator", null);
        setField(term101606, term101606.getClass(), "sortStrategy", null);
        setField(term101606, term101606.getClass(), "viewToModelIndex", term101614);
        setIntElement(term101615, 0, 1768195761);
        setField(term101606, term101606.getClass(), "modelToViewIndex", term101615);
        setIntField(term101606, term101606.getClass(), "lastRowCount", -1382661134);
        setBooleanField(term101606, term101606.getClass(), "rebuildIndices", false);
        setField(term101619, term101619.getClass(), "listenerList", null);
        setField(term101606, term101606.getClass(), "listenerList", term101619);
        setField(term101605, term101605.getClass(), "rowSorter", term101606);
        setIntField(term101605, term101605.getClass(), "modelIndex", -1042022818);
        setElement(term101604, 0, term101605);
        setField(term101622, term101622.getClass(), "model", null);
        setField(term101622, term101622.getClass(), "sortKeys", term101623);
        setField(term101622, term101622.getClass(), "defaultSortKeys", term101626);
        setField(term101622, term101622.getClass(), "unsortableColumns", term101629);
        setField(term101622, term101622.getClass(), "nodeComparator", null);
        setField(term101622, term101622.getClass(), "sortStrategy", null);
        setField(term101622, term101622.getClass(), "viewToModelIndex", null);
        setField(term101622, term101622.getClass(), "modelToViewIndex", null);
        setIntField(term101622, term101622.getClass(), "lastRowCount", 0);
        setBooleanField(term101622, term101622.getClass(), "rebuildIndices", false);
        setField(term101622, term101622.getClass(), "listenerList", null);
        setField(term101621, term101621.getClass(), "rowSorter", term101622);
        setIntField(term101621, term101621.getClass(), "modelIndex", 317372051);
        setElement(term101604, 1, term101621);
        setField(term101548, term101548.getClass(), "viewToModelIndex", term101604);
        setIntElement(term101633, 0, 892170444);
        setIntElement(term101633, 1, -82417507);
        setIntElement(term101633, 2, -511400358);
        setIntElement(term101633, 3, -742178468);
        setIntElement(term101633, 4, 694989162);
        setIntElement(term101633, 5, -65504209);
        setField(term101548, term101548.getClass(), "modelToViewIndex", term101633);
        setIntField(term101548, term101548.getClass(), "lastRowCount", 1745199030);
        setBooleanField(term101548, term101548.getClass(), "rebuildIndices", false);
        setField(term101642, term101642.getClass(), "listenerList", term101643);
        setField(term101548, term101548.getClass(), "listenerList", term101642);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$ColumnSortStrategy");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSortStrategy", argTypes, term101548, args);
    }

};


