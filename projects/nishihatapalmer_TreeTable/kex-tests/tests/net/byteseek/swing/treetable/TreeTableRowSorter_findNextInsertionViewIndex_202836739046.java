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

public class TreeTableRowSorter_findNextInsertionViewIndex_202836739046 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103796;
     Object term103878;
     Object term103880;

    public TreeTableRowSorter_findNextInsertionViewIndex_202836739046() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term103799 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term103801 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term103799, term103799.getClass(), "column", 4086209);
        setField(term103801, term103801.getClass(), "name", null);
        setIntField(term103801, term103801.getClass(), "ordinal", 2);
        setField(term103799, term103799.getClass(), "sortOrder", term103801);
        ArrayList term103797 = new ArrayList();
        ((ArrayList) term103797).add(term103799);
        ArrayList term103805 = new ArrayList();
        HashMap term103810 = new HashMap();
        Set<Object> term103882 =  ((Map) term103810).keySet();
        HashSet term103809 = new HashSet((Collection<? extends Object>) term103882);
        ArrayList term103831 = new ArrayList();
        ArrayList term103834 = new ArrayList();
        HashSet term103837 = new HashSet();
        ArrayList term103850 = new ArrayList();
        ((ArrayList) term103850).add((Object)null);
        ((ArrayList) term103850).add((Object)null);
        ((ArrayList) term103850).add((Object)null);
        ((ArrayList) term103850).add((Object)null);
        ((ArrayList) term103850).add((Object)null);
        ((ArrayList) term103850).add((Object)null);
        ((ArrayList) term103850).add((Object)null);
        ArrayList term103853 = new ArrayList();
        HashSet term103856 = new HashSet();
        term103796 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term103828 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 4);
        Object term103829 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term103830 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term103838 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 5);
        int[] term103839 = (int[]) newIntArray(4);
        Object term103846 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term103848 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term103849 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term103860 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term103861 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term103865 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term103866 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term103870 = (int[]) newIntArray(3);
        Object term103876 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term103877 = (Object[]) newArray("java.lang.Object", 0);
        setField(term103796, term103796.getClass(), "model", null);
        setField(term103796, term103796.getClass(), "sortKeys", term103797);
        setField(term103796, term103796.getClass(), "defaultSortKeys", term103805);
        setField(term103796, term103796.getClass(), "unsortableColumns", term103809);
        setField(term103796, term103796.getClass(), "nodeComparator", null);
        setField(term103796, term103796.getClass(), "sortStrategy", null);
        setField(term103830, term103830.getClass(), "model", null);
        setField(term103830, term103830.getClass(), "sortKeys", term103831);
        setField(term103830, term103830.getClass(), "defaultSortKeys", term103834);
        setField(term103830, term103830.getClass(), "unsortableColumns", term103837);
        setField(term103830, term103830.getClass(), "nodeComparator", null);
        setField(term103830, term103830.getClass(), "sortStrategy", null);
        setField(term103830, term103830.getClass(), "viewToModelIndex", term103838);
        setIntElement(term103839, 0, -1987364934);
        setIntElement(term103839, 1, 1364414277);
        setIntElement(term103839, 2, -961137606);
        setIntElement(term103839, 3, 795205527);
        setField(term103830, term103830.getClass(), "modelToViewIndex", term103839);
        setIntField(term103830, term103830.getClass(), "lastRowCount", 600958607);
        setBooleanField(term103830, term103830.getClass(), "rebuildIndices", false);
        setField(term103846, term103846.getClass(), "listenerList", null);
        setField(term103830, term103830.getClass(), "listenerList", term103846);
        setField(term103829, term103829.getClass(), "rowSorter", term103830);
        setIntField(term103829, term103829.getClass(), "modelIndex", 897159778);
        setElement(term103828, 0, term103829);
        setField(term103849, term103849.getClass(), "model", null);
        setField(term103849, term103849.getClass(), "sortKeys", term103850);
        setField(term103849, term103849.getClass(), "defaultSortKeys", term103853);
        setField(term103849, term103849.getClass(), "unsortableColumns", term103856);
        setField(term103849, term103849.getClass(), "nodeComparator", null);
        setField(term103849, term103849.getClass(), "sortStrategy", null);
        setField(term103849, term103849.getClass(), "viewToModelIndex", null);
        setField(term103849, term103849.getClass(), "modelToViewIndex", null);
        setIntField(term103849, term103849.getClass(), "lastRowCount", 0);
        setBooleanField(term103849, term103849.getClass(), "rebuildIndices", false);
        setField(term103849, term103849.getClass(), "listenerList", null);
        setField(term103848, term103848.getClass(), "rowSorter", term103849);
        setIntField(term103848, term103848.getClass(), "modelIndex", -1934934961);
        setElement(term103828, 1, term103848);
        setField(term103861, term103861.getClass(), "model", null);
        setField(term103861, term103861.getClass(), "sortKeys", null);
        setField(term103861, term103861.getClass(), "defaultSortKeys", null);
        setField(term103861, term103861.getClass(), "unsortableColumns", null);
        setField(term103861, term103861.getClass(), "nodeComparator", null);
        setField(term103861, term103861.getClass(), "sortStrategy", null);
        setField(term103861, term103861.getClass(), "viewToModelIndex", null);
        setField(term103861, term103861.getClass(), "modelToViewIndex", null);
        setIntField(term103861, term103861.getClass(), "lastRowCount", 0);
        setBooleanField(term103861, term103861.getClass(), "rebuildIndices", false);
        setField(term103861, term103861.getClass(), "listenerList", null);
        setField(term103860, term103860.getClass(), "rowSorter", term103861);
        setIntField(term103860, term103860.getClass(), "modelIndex", 2120054887);
        setElement(term103828, 2, term103860);
        setField(term103866, term103866.getClass(), "model", null);
        setField(term103866, term103866.getClass(), "sortKeys", null);
        setField(term103866, term103866.getClass(), "defaultSortKeys", null);
        setField(term103866, term103866.getClass(), "unsortableColumns", null);
        setField(term103866, term103866.getClass(), "nodeComparator", null);
        setField(term103866, term103866.getClass(), "sortStrategy", null);
        setField(term103866, term103866.getClass(), "viewToModelIndex", null);
        setField(term103866, term103866.getClass(), "modelToViewIndex", null);
        setIntField(term103866, term103866.getClass(), "lastRowCount", 0);
        setBooleanField(term103866, term103866.getClass(), "rebuildIndices", false);
        setField(term103866, term103866.getClass(), "listenerList", null);
        setField(term103865, term103865.getClass(), "rowSorter", term103866);
        setIntField(term103865, term103865.getClass(), "modelIndex", 2145648967);
        setElement(term103828, 3, term103865);
        setField(term103796, term103796.getClass(), "viewToModelIndex", term103828);
        setIntElement(term103870, 0, 2060624021);
        setIntElement(term103870, 1, -1853309523);
        setIntElement(term103870, 2, 241741655);
        setField(term103796, term103796.getClass(), "modelToViewIndex", term103870);
        setIntField(term103796, term103796.getClass(), "lastRowCount", -1062022366);
        setBooleanField(term103796, term103796.getClass(), "rebuildIndices", false);
        setField(term103876, term103876.getClass(), "listenerList", term103877);
        setField(term103796, term103796.getClass(), "listenerList", term103876);
        term103878 = new Integer(-1347618079);
        term103880 = new Integer(1510246255);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("javax.swing.tree.TreeNode");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term103878;
        args[2] = term103880;
        callMethod(klass, "findNextInsertionViewIndex", argTypes, term103796, args);
    }

};


