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

public class TreeTableRowSorter_getFilteredChildIndex_71493958450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104591;

    public TreeTableRowSorter_getFilteredChildIndex_71493958450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term104594 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term104596 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term104594, term104594.getClass(), "column", -1408615666);
        setField(term104596, term104596.getClass(), "name", null);
        setIntField(term104596, term104596.getClass(), "ordinal", 2);
        setField(term104594, term104594.getClass(), "sortOrder", term104596);
        Object term104598 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term104598, term104598.getClass(), "column", -502299598);
        setField(term104598, term104598.getClass(), "sortOrder", term104596);
        Object term104600 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term104602 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term104600, term104600.getClass(), "column", -516287593);
        setField(term104602, term104602.getClass(), "name", null);
        setIntField(term104602, term104602.getClass(), "ordinal", 0);
        setField(term104600, term104600.getClass(), "sortOrder", term104602);
        Object term104604 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term104604, term104604.getClass(), "column", -187311406);
        setField(term104604, term104604.getClass(), "sortOrder", term104602);
        Object term104606 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term104608 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term104606, term104606.getClass(), "column", 1496632406);
        setField(term104608, term104608.getClass(), "name", null);
        setIntField(term104608, term104608.getClass(), "ordinal", 1);
        setField(term104606, term104606.getClass(), "sortOrder", term104608);
        Object term104610 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term104610, term104610.getClass(), "column", 1858277277);
        setField(term104610, term104610.getClass(), "sortOrder", term104602);
        ArrayList term104592 = new ArrayList();
        ((ArrayList) term104592).add(term104594);
        ((ArrayList) term104592).add(term104598);
        ((ArrayList) term104592).add(term104600);
        ((ArrayList) term104592).add(term104604);
        ((ArrayList) term104592).add(term104606);
        ((ArrayList) term104592).add(term104610);
        ArrayList term104614 = new ArrayList();
        HashMap term104619 = new HashMap();
        Set<Object> term104669 =  ((Map) term104619).keySet();
        HashSet term104618 = new HashSet((Collection<? extends Object>) term104669);
        ArrayList term104636 = new ArrayList();
        ArrayList term104639 = new ArrayList();
        HashSet term104642 = new HashSet();
        ArrayList term104654 = new ArrayList();
        ((ArrayList) term104654).add((Object)null);
        ArrayList term104657 = new ArrayList();
        HashSet term104660 = new HashSet();
        term104591 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term104633 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 2);
        Object term104634 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term104635 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term104643 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 6);
        int[] term104644 = (int[]) newIntArray(3);
        Object term104650 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term104652 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term104653 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term104664 = (int[]) newIntArray(0);
        Object term104667 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term104668 = (Object[]) newArray("java.lang.Object", 0);
        setField(term104591, term104591.getClass(), "model", null);
        setField(term104591, term104591.getClass(), "sortKeys", term104592);
        setField(term104591, term104591.getClass(), "defaultSortKeys", term104614);
        setField(term104591, term104591.getClass(), "unsortableColumns", term104618);
        setField(term104591, term104591.getClass(), "nodeComparator", null);
        setField(term104591, term104591.getClass(), "sortStrategy", null);
        setField(term104635, term104635.getClass(), "model", null);
        setField(term104635, term104635.getClass(), "sortKeys", term104636);
        setField(term104635, term104635.getClass(), "defaultSortKeys", term104639);
        setField(term104635, term104635.getClass(), "unsortableColumns", term104642);
        setField(term104635, term104635.getClass(), "nodeComparator", null);
        setField(term104635, term104635.getClass(), "sortStrategy", null);
        setField(term104635, term104635.getClass(), "viewToModelIndex", term104643);
        setIntElement(term104644, 0, 1645751151);
        setIntElement(term104644, 1, -2117930201);
        setIntElement(term104644, 2, 1839150896);
        setField(term104635, term104635.getClass(), "modelToViewIndex", term104644);
        setIntField(term104635, term104635.getClass(), "lastRowCount", -1487860516);
        setBooleanField(term104635, term104635.getClass(), "rebuildIndices", true);
        setField(term104650, term104650.getClass(), "listenerList", null);
        setField(term104635, term104635.getClass(), "listenerList", term104650);
        setField(term104634, term104634.getClass(), "rowSorter", term104635);
        setIntField(term104634, term104634.getClass(), "modelIndex", 784631129);
        setElement(term104633, 0, term104634);
        setField(term104653, term104653.getClass(), "model", null);
        setField(term104653, term104653.getClass(), "sortKeys", term104654);
        setField(term104653, term104653.getClass(), "defaultSortKeys", term104657);
        setField(term104653, term104653.getClass(), "unsortableColumns", term104660);
        setField(term104653, term104653.getClass(), "nodeComparator", null);
        setField(term104653, term104653.getClass(), "sortStrategy", null);
        setField(term104653, term104653.getClass(), "viewToModelIndex", null);
        setField(term104653, term104653.getClass(), "modelToViewIndex", null);
        setIntField(term104653, term104653.getClass(), "lastRowCount", 0);
        setBooleanField(term104653, term104653.getClass(), "rebuildIndices", false);
        setField(term104653, term104653.getClass(), "listenerList", null);
        setField(term104652, term104652.getClass(), "rowSorter", term104653);
        setIntField(term104652, term104652.getClass(), "modelIndex", 658285959);
        setElement(term104633, 1, term104652);
        setField(term104591, term104591.getClass(), "viewToModelIndex", term104633);
        setField(term104591, term104591.getClass(), "modelToViewIndex", term104664);
        setIntField(term104591, term104591.getClass(), "lastRowCount", -89362706);
        setBooleanField(term104591, term104591.getClass(), "rebuildIndices", false);
        setField(term104667, term104667.getClass(), "listenerList", term104668);
        setField(term104591, term104591.getClass(), "listenerList", term104667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("javax.swing.tree.TreeNode");
        argTypes[1] = Class.forName("javax.swing.tree.TreeNode");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "getFilteredChildIndex", argTypes, term104591, args);
    }

};


