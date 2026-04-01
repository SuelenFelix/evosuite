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

public class TreeTableRowSorter_toggleSortOrder_8126681774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99923;
     Object term100010;

    public TreeTableRowSorter_toggleSortOrder_8126681774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term99926 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term99928 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term99926, term99926.getClass(), "column", 2059896693);
        setField(term99928, term99928.getClass(), "name", null);
        setIntField(term99928, term99928.getClass(), "ordinal", 1);
        setField(term99926, term99926.getClass(), "sortOrder", term99928);
        Object term99930 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term99932 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term99930, term99930.getClass(), "column", 2109912812);
        setField(term99932, term99932.getClass(), "name", null);
        setIntField(term99932, term99932.getClass(), "ordinal", 2);
        setField(term99930, term99930.getClass(), "sortOrder", term99932);
        Object term99934 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term99934, term99934.getClass(), "column", 1841286431);
        setField(term99934, term99934.getClass(), "sortOrder", term99928);
        ArrayList term99924 = new ArrayList();
        ((ArrayList) term99924).add(term99926);
        ((ArrayList) term99924).add(term99930);
        ((ArrayList) term99924).add(term99934);
        ArrayList term99938 = new ArrayList();
        HashMap term99943 = new HashMap();
        Set<Object> term100012 =  ((Map) term99943).keySet();
        HashSet term99942 = new HashSet((Collection<? extends Object>) term100012);
        ArrayList term99968 = new ArrayList();
        ((ArrayList) term99968).add((Object)null);
        ((ArrayList) term99968).add((Object)null);
        ((ArrayList) term99968).add((Object)null);
        ((ArrayList) term99968).add((Object)null);
        ((ArrayList) term99968).add((Object)null);
        ((ArrayList) term99968).add((Object)null);
        ((ArrayList) term99968).add((Object)null);
        ArrayList term99971 = new ArrayList();
        HashSet term99974 = new HashSet();
        ArrayList term99984 = new ArrayList();
        ((ArrayList) term99984).add((Object)null);
        ((ArrayList) term99984).add((Object)null);
        ArrayList term99987 = new ArrayList();
        HashSet term99990 = new HashSet();
        term99923 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term99965 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 3);
        Object term99966 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term99967 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term99975 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 3);
        int[] term99976 = (int[]) newIntArray(1);
        Object term99980 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term99982 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term99983 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term99994 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term99995 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term99999 = (int[]) newIntArray(6);
        Object term100008 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term100009 = (Object[]) newArray("java.lang.Object", 0);
        setField(term99923, term99923.getClass(), "model", null);
        setField(term99923, term99923.getClass(), "sortKeys", term99924);
        setField(term99923, term99923.getClass(), "defaultSortKeys", term99938);
        setField(term99923, term99923.getClass(), "unsortableColumns", term99942);
        setField(term99923, term99923.getClass(), "nodeComparator", null);
        setField(term99923, term99923.getClass(), "sortStrategy", null);
        setField(term99967, term99967.getClass(), "model", null);
        setField(term99967, term99967.getClass(), "sortKeys", term99968);
        setField(term99967, term99967.getClass(), "defaultSortKeys", term99971);
        setField(term99967, term99967.getClass(), "unsortableColumns", term99974);
        setField(term99967, term99967.getClass(), "nodeComparator", null);
        setField(term99967, term99967.getClass(), "sortStrategy", null);
        setField(term99967, term99967.getClass(), "viewToModelIndex", term99975);
        setIntElement(term99976, 0, 1460702778);
        setField(term99967, term99967.getClass(), "modelToViewIndex", term99976);
        setIntField(term99967, term99967.getClass(), "lastRowCount", -1398142433);
        setBooleanField(term99967, term99967.getClass(), "rebuildIndices", true);
        setField(term99980, term99980.getClass(), "listenerList", null);
        setField(term99967, term99967.getClass(), "listenerList", term99980);
        setField(term99966, term99966.getClass(), "rowSorter", term99967);
        setIntField(term99966, term99966.getClass(), "modelIndex", -1112119058);
        setElement(term99965, 0, term99966);
        setField(term99983, term99983.getClass(), "model", null);
        setField(term99983, term99983.getClass(), "sortKeys", term99984);
        setField(term99983, term99983.getClass(), "defaultSortKeys", term99987);
        setField(term99983, term99983.getClass(), "unsortableColumns", term99990);
        setField(term99983, term99983.getClass(), "nodeComparator", null);
        setField(term99983, term99983.getClass(), "sortStrategy", null);
        setField(term99983, term99983.getClass(), "viewToModelIndex", null);
        setField(term99983, term99983.getClass(), "modelToViewIndex", null);
        setIntField(term99983, term99983.getClass(), "lastRowCount", 0);
        setBooleanField(term99983, term99983.getClass(), "rebuildIndices", false);
        setField(term99983, term99983.getClass(), "listenerList", null);
        setField(term99982, term99982.getClass(), "rowSorter", term99983);
        setIntField(term99982, term99982.getClass(), "modelIndex", 2073858334);
        setElement(term99965, 1, term99982);
        setField(term99995, term99995.getClass(), "model", null);
        setField(term99995, term99995.getClass(), "sortKeys", null);
        setField(term99995, term99995.getClass(), "defaultSortKeys", null);
        setField(term99995, term99995.getClass(), "unsortableColumns", null);
        setField(term99995, term99995.getClass(), "nodeComparator", null);
        setField(term99995, term99995.getClass(), "sortStrategy", null);
        setField(term99995, term99995.getClass(), "viewToModelIndex", null);
        setField(term99995, term99995.getClass(), "modelToViewIndex", null);
        setIntField(term99995, term99995.getClass(), "lastRowCount", 0);
        setBooleanField(term99995, term99995.getClass(), "rebuildIndices", false);
        setField(term99995, term99995.getClass(), "listenerList", null);
        setField(term99994, term99994.getClass(), "rowSorter", term99995);
        setIntField(term99994, term99994.getClass(), "modelIndex", -1693535639);
        setElement(term99965, 2, term99994);
        setField(term99923, term99923.getClass(), "viewToModelIndex", term99965);
        setIntElement(term99999, 0, 1344744036);
        setIntElement(term99999, 1, -98060427);
        setIntElement(term99999, 2, -1272268399);
        setIntElement(term99999, 3, 1120271104);
        setIntElement(term99999, 4, -128435804);
        setIntElement(term99999, 5, 2136158480);
        setField(term99923, term99923.getClass(), "modelToViewIndex", term99999);
        setIntField(term99923, term99923.getClass(), "lastRowCount", 2118747457);
        setBooleanField(term99923, term99923.getClass(), "rebuildIndices", true);
        setField(term100008, term100008.getClass(), "listenerList", term100009);
        setField(term99923, term99923.getClass(), "listenerList", term100008);
        term100010 = new Integer(1868344256);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term100010;
        callMethod(klass, "toggleSortOrder", argTypes, term99923, args);
    }

};


