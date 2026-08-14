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

public class TreeTableRowSorter_getSortKeys_2016667239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99644;

    public TreeTableRowSorter_getSortKeys_2016667239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term99647 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term99649 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term99647, term99647.getClass(), "column", 760218111);
        setField(term99649, term99649.getClass(), "name", null);
        setIntField(term99649, term99649.getClass(), "ordinal", 2);
        setField(term99647, term99647.getClass(), "sortOrder", term99649);
        Object term99651 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term99651, term99651.getClass(), "column", -1986366126);
        setField(term99651, term99651.getClass(), "sortOrder", term99649);
        Object term99653 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term99655 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term99653, term99653.getClass(), "column", -1963228619);
        setField(term99655, term99655.getClass(), "name", null);
        setIntField(term99655, term99655.getClass(), "ordinal", 0);
        setField(term99653, term99653.getClass(), "sortOrder", term99655);
        ArrayList term99645 = new ArrayList();
        ((ArrayList) term99645).add(term99647);
        ((ArrayList) term99645).add(term99651);
        ((ArrayList) term99645).add(term99653);
        ArrayList term99659 = new ArrayList();
        HashMap term99664 = new HashMap();
        Set<Object> term99742 =  ((Map) term99664).keySet();
        HashSet term99663 = new HashSet((Collection<? extends Object>) term99742);
        ArrayList term99701 = new ArrayList();
        ((ArrayList) term99701).add((Object)null);
        ((ArrayList) term99701).add((Object)null);
        ((ArrayList) term99701).add((Object)null);
        ((ArrayList) term99701).add((Object)null);
        ((ArrayList) term99701).add((Object)null);
        ArrayList term99704 = new ArrayList();
        HashSet term99707 = new HashSet();
        term99644 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term99698 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 3);
        Object term99699 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term99700 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term99708 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 8);
        int[] term99709 = (int[]) newIntArray(8);
        Object term99720 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term99722 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term99723 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term99727 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term99728 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term99732 = (int[]) newIntArray(5);
        Object term99740 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term99741 = (Object[]) newArray("java.lang.Object", 0);
        setField(term99644, term99644.getClass(), "model", null);
        setField(term99644, term99644.getClass(), "sortKeys", term99645);
        setField(term99644, term99644.getClass(), "defaultSortKeys", term99659);
        setField(term99644, term99644.getClass(), "unsortableColumns", term99663);
        setField(term99644, term99644.getClass(), "nodeComparator", null);
        setField(term99644, term99644.getClass(), "sortStrategy", null);
        setField(term99700, term99700.getClass(), "model", null);
        setField(term99700, term99700.getClass(), "sortKeys", term99701);
        setField(term99700, term99700.getClass(), "defaultSortKeys", term99704);
        setField(term99700, term99700.getClass(), "unsortableColumns", term99707);
        setField(term99700, term99700.getClass(), "nodeComparator", null);
        setField(term99700, term99700.getClass(), "sortStrategy", null);
        setField(term99700, term99700.getClass(), "viewToModelIndex", term99708);
        setIntElement(term99709, 0, 196952878);
        setIntElement(term99709, 1, 802673242);
        setIntElement(term99709, 2, -1808638031);
        setIntElement(term99709, 3, -1514240086);
        setIntElement(term99709, 4, 2052244839);
        setIntElement(term99709, 5, -1763480506);
        setIntElement(term99709, 6, -1541297110);
        setIntElement(term99709, 7, -1581464804);
        setField(term99700, term99700.getClass(), "modelToViewIndex", term99709);
        setIntField(term99700, term99700.getClass(), "lastRowCount", -1954937310);
        setBooleanField(term99700, term99700.getClass(), "rebuildIndices", true);
        setField(term99720, term99720.getClass(), "listenerList", null);
        setField(term99700, term99700.getClass(), "listenerList", term99720);
        setField(term99699, term99699.getClass(), "rowSorter", term99700);
        setIntField(term99699, term99699.getClass(), "modelIndex", -460657407);
        setElement(term99698, 0, term99699);
        setField(term99723, term99723.getClass(), "model", null);
        setField(term99723, term99723.getClass(), "sortKeys", null);
        setField(term99723, term99723.getClass(), "defaultSortKeys", null);
        setField(term99723, term99723.getClass(), "unsortableColumns", null);
        setField(term99723, term99723.getClass(), "nodeComparator", null);
        setField(term99723, term99723.getClass(), "sortStrategy", null);
        setField(term99723, term99723.getClass(), "viewToModelIndex", null);
        setField(term99723, term99723.getClass(), "modelToViewIndex", null);
        setIntField(term99723, term99723.getClass(), "lastRowCount", 0);
        setBooleanField(term99723, term99723.getClass(), "rebuildIndices", false);
        setField(term99723, term99723.getClass(), "listenerList", null);
        setField(term99722, term99722.getClass(), "rowSorter", term99723);
        setIntField(term99722, term99722.getClass(), "modelIndex", 941003590);
        setElement(term99698, 1, term99722);
        setField(term99728, term99728.getClass(), "model", null);
        setField(term99728, term99728.getClass(), "sortKeys", null);
        setField(term99728, term99728.getClass(), "defaultSortKeys", null);
        setField(term99728, term99728.getClass(), "unsortableColumns", null);
        setField(term99728, term99728.getClass(), "nodeComparator", null);
        setField(term99728, term99728.getClass(), "sortStrategy", null);
        setField(term99728, term99728.getClass(), "viewToModelIndex", null);
        setField(term99728, term99728.getClass(), "modelToViewIndex", null);
        setIntField(term99728, term99728.getClass(), "lastRowCount", 0);
        setBooleanField(term99728, term99728.getClass(), "rebuildIndices", false);
        setField(term99728, term99728.getClass(), "listenerList", null);
        setField(term99727, term99727.getClass(), "rowSorter", term99728);
        setIntField(term99727, term99727.getClass(), "modelIndex", -2126539433);
        setElement(term99698, 2, term99727);
        setField(term99644, term99644.getClass(), "viewToModelIndex", term99698);
        setIntElement(term99732, 0, -1825624890);
        setIntElement(term99732, 1, 413214164);
        setIntElement(term99732, 2, 355911655);
        setIntElement(term99732, 3, 1811833766);
        setIntElement(term99732, 4, 735987104);
        setField(term99644, term99644.getClass(), "modelToViewIndex", term99732);
        setIntField(term99644, term99644.getClass(), "lastRowCount", -1784072578);
        setBooleanField(term99644, term99644.getClass(), "rebuildIndices", true);
        setField(term99740, term99740.getClass(), "listenerList", term99741);
        setField(term99644, term99644.getClass(), "listenerList", term99740);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSortKeys", argTypes, term99644, args);
    }

};


