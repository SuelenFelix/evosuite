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

public class TreeTableRowSorter_updateSortIndices_58013137944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103600;
     Object term103689;

    public TreeTableRowSorter_updateSortIndices_58013137944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term103603 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term103605 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term103603, term103603.getClass(), "column", 720814309);
        setField(term103605, term103605.getClass(), "name", null);
        setIntField(term103605, term103605.getClass(), "ordinal", 1);
        setField(term103603, term103603.getClass(), "sortOrder", term103605);
        ArrayList term103601 = new ArrayList();
        ((ArrayList) term103601).add(term103603);
        ArrayList term103609 = new ArrayList();
        HashMap term103614 = new HashMap();
        Set<Object> term103691 =  ((Map) term103614).keySet();
        HashSet term103613 = new HashSet((Collection<? extends Object>) term103691);
        ArrayList term103643 = new ArrayList();
        ((ArrayList) term103643).add((Object)null);
        ((ArrayList) term103643).add((Object)null);
        ((ArrayList) term103643).add((Object)null);
        ArrayList term103646 = new ArrayList();
        HashSet term103649 = new HashSet();
        ArrayList term103666 = new ArrayList();
        ((ArrayList) term103666).add((Object)null);
        ((ArrayList) term103666).add((Object)null);
        ((ArrayList) term103666).add((Object)null);
        ((ArrayList) term103666).add((Object)null);
        ((ArrayList) term103666).add((Object)null);
        ((ArrayList) term103666).add((Object)null);
        ((ArrayList) term103666).add((Object)null);
        ((ArrayList) term103666).add((Object)null);
        ArrayList term103669 = new ArrayList();
        HashSet term103672 = new HashSet();
        term103600 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term103640 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 3);
        Object term103641 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term103642 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term103650 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 2);
        int[] term103651 = (int[]) newIntArray(8);
        Object term103662 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term103664 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term103665 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term103676 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term103677 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term103681 = (int[]) newIntArray(3);
        Object term103687 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term103688 = (Object[]) newArray("java.lang.Object", 0);
        setField(term103600, term103600.getClass(), "model", null);
        setField(term103600, term103600.getClass(), "sortKeys", term103601);
        setField(term103600, term103600.getClass(), "defaultSortKeys", term103609);
        setField(term103600, term103600.getClass(), "unsortableColumns", term103613);
        setField(term103600, term103600.getClass(), "nodeComparator", null);
        setField(term103600, term103600.getClass(), "sortStrategy", null);
        setField(term103642, term103642.getClass(), "model", null);
        setField(term103642, term103642.getClass(), "sortKeys", term103643);
        setField(term103642, term103642.getClass(), "defaultSortKeys", term103646);
        setField(term103642, term103642.getClass(), "unsortableColumns", term103649);
        setField(term103642, term103642.getClass(), "nodeComparator", null);
        setField(term103642, term103642.getClass(), "sortStrategy", null);
        setField(term103642, term103642.getClass(), "viewToModelIndex", term103650);
        setIntElement(term103651, 0, -187311406);
        setIntElement(term103651, 1, 1496632406);
        setIntElement(term103651, 2, 1858277277);
        setIntElement(term103651, 3, 2145928130);
        setIntElement(term103651, 4, -1095947031);
        setIntElement(term103651, 5, 1504187156);
        setIntElement(term103651, 6, -1713723083);
        setIntElement(term103651, 7, -1337690242);
        setField(term103642, term103642.getClass(), "modelToViewIndex", term103651);
        setIntField(term103642, term103642.getClass(), "lastRowCount", 264872152);
        setBooleanField(term103642, term103642.getClass(), "rebuildIndices", true);
        setField(term103662, term103662.getClass(), "listenerList", null);
        setField(term103642, term103642.getClass(), "listenerList", term103662);
        setField(term103641, term103641.getClass(), "rowSorter", term103642);
        setIntField(term103641, term103641.getClass(), "modelIndex", 1645751151);
        setElement(term103640, 0, term103641);
        setField(term103665, term103665.getClass(), "model", null);
        setField(term103665, term103665.getClass(), "sortKeys", term103666);
        setField(term103665, term103665.getClass(), "defaultSortKeys", term103669);
        setField(term103665, term103665.getClass(), "unsortableColumns", term103672);
        setField(term103665, term103665.getClass(), "nodeComparator", null);
        setField(term103665, term103665.getClass(), "sortStrategy", null);
        setField(term103665, term103665.getClass(), "viewToModelIndex", null);
        setField(term103665, term103665.getClass(), "modelToViewIndex", null);
        setIntField(term103665, term103665.getClass(), "lastRowCount", 0);
        setBooleanField(term103665, term103665.getClass(), "rebuildIndices", false);
        setField(term103665, term103665.getClass(), "listenerList", null);
        setField(term103664, term103664.getClass(), "rowSorter", term103665);
        setIntField(term103664, term103664.getClass(), "modelIndex", -2117930201);
        setElement(term103640, 1, term103664);
        setField(term103677, term103677.getClass(), "model", null);
        setField(term103677, term103677.getClass(), "sortKeys", null);
        setField(term103677, term103677.getClass(), "defaultSortKeys", null);
        setField(term103677, term103677.getClass(), "unsortableColumns", null);
        setField(term103677, term103677.getClass(), "nodeComparator", null);
        setField(term103677, term103677.getClass(), "sortStrategy", null);
        setField(term103677, term103677.getClass(), "viewToModelIndex", null);
        setField(term103677, term103677.getClass(), "modelToViewIndex", null);
        setIntField(term103677, term103677.getClass(), "lastRowCount", 0);
        setBooleanField(term103677, term103677.getClass(), "rebuildIndices", false);
        setField(term103677, term103677.getClass(), "listenerList", null);
        setField(term103676, term103676.getClass(), "rowSorter", term103677);
        setIntField(term103676, term103676.getClass(), "modelIndex", 1839150896);
        setElement(term103640, 2, term103676);
        setField(term103600, term103600.getClass(), "viewToModelIndex", term103640);
        setIntElement(term103681, 0, -1487860516);
        setIntElement(term103681, 1, 784631129);
        setIntElement(term103681, 2, 658285959);
        setField(term103600, term103600.getClass(), "modelToViewIndex", term103681);
        setIntField(term103600, term103600.getClass(), "lastRowCount", -89362706);
        setBooleanField(term103600, term103600.getClass(), "rebuildIndices", false);
        setField(term103687, term103687.getClass(), "listenerList", term103688);
        setField(term103600, term103600.getClass(), "listenerList", term103687);
        term103689 = new Integer(341388367);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term103689;
        callMethod(klass, "updateSortIndices", argTypes, term103600, args);
    }

};


