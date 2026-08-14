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

public class TreeTableRowSorter_compare_17241945829 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101975;
     Object term102067;
     Object term102069;

    public TreeTableRowSorter_compare_17241945829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term101978 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term101980 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term101978, term101978.getClass(), "column", 468974358);
        setField(term101980, term101980.getClass(), "name", null);
        setIntField(term101980, term101980.getClass(), "ordinal", 2);
        setField(term101978, term101978.getClass(), "sortOrder", term101980);
        Object term101982 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term101982, term101982.getClass(), "column", 346282818);
        setField(term101982, term101982.getClass(), "sortOrder", term101980);
        Object term101984 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term101986 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term101984, term101984.getClass(), "column", -857876056);
        setField(term101986, term101986.getClass(), "name", null);
        setIntField(term101986, term101986.getClass(), "ordinal", 1);
        setField(term101984, term101984.getClass(), "sortOrder", term101986);
        Object term101988 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term101990 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term101988, term101988.getClass(), "column", 1392910876);
        setField(term101990, term101990.getClass(), "name", null);
        setIntField(term101990, term101990.getClass(), "ordinal", 0);
        setField(term101988, term101988.getClass(), "sortOrder", term101990);
        Object term101992 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term101992, term101992.getClass(), "column", 1086383182);
        setField(term101992, term101992.getClass(), "sortOrder", term101990);
        Object term101994 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term101994, term101994.getClass(), "column", 1425319286);
        setField(term101994, term101994.getClass(), "sortOrder", term101990);
        Object term101996 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term101996, term101996.getClass(), "column", 1729919228);
        setField(term101996, term101996.getClass(), "sortOrder", term101986);
        ArrayList term101976 = new ArrayList();
        ((ArrayList) term101976).add(term101978);
        ((ArrayList) term101976).add(term101982);
        ((ArrayList) term101976).add(term101984);
        ((ArrayList) term101976).add(term101988);
        ((ArrayList) term101976).add(term101992);
        ((ArrayList) term101976).add(term101994);
        ((ArrayList) term101976).add(term101996);
        ArrayList term102000 = new ArrayList();
        HashMap term102005 = new HashMap();
        Set<Object> term102071 =  ((Map) term102005).keySet();
        HashSet term102004 = new HashSet((Collection<? extends Object>) term102071);
        ArrayList term102026 = new ArrayList();
        ((ArrayList) term102026).add((Object)null);
        ((ArrayList) term102026).add((Object)null);
        ((ArrayList) term102026).add((Object)null);
        ((ArrayList) term102026).add((Object)null);
        ArrayList term102029 = new ArrayList();
        HashSet term102032 = new HashSet();
        ArrayList term102047 = new ArrayList();
        ((ArrayList) term102047).add((Object)null);
        ((ArrayList) term102047).add((Object)null);
        ((ArrayList) term102047).add((Object)null);
        ((ArrayList) term102047).add((Object)null);
        ((ArrayList) term102047).add((Object)null);
        ((ArrayList) term102047).add((Object)null);
        ((ArrayList) term102047).add((Object)null);
        ((ArrayList) term102047).add((Object)null);
        ((ArrayList) term102047).add((Object)null);
        ArrayList term102050 = new ArrayList();
        HashSet term102053 = new HashSet();
        term101975 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term102023 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 2);
        Object term102024 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term102025 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term102033 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 2);
        int[] term102034 = (int[]) newIntArray(6);
        Object term102043 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term102045 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term102046 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term102057 = (int[]) newIntArray(5);
        Object term102065 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term102066 = (Object[]) newArray("java.lang.Object", 0);
        setField(term101975, term101975.getClass(), "model", null);
        setField(term101975, term101975.getClass(), "sortKeys", term101976);
        setField(term101975, term101975.getClass(), "defaultSortKeys", term102000);
        setField(term101975, term101975.getClass(), "unsortableColumns", term102004);
        setField(term101975, term101975.getClass(), "nodeComparator", null);
        setField(term101975, term101975.getClass(), "sortStrategy", null);
        setField(term102025, term102025.getClass(), "model", null);
        setField(term102025, term102025.getClass(), "sortKeys", term102026);
        setField(term102025, term102025.getClass(), "defaultSortKeys", term102029);
        setField(term102025, term102025.getClass(), "unsortableColumns", term102032);
        setField(term102025, term102025.getClass(), "nodeComparator", null);
        setField(term102025, term102025.getClass(), "sortStrategy", null);
        setField(term102025, term102025.getClass(), "viewToModelIndex", term102033);
        setIntElement(term102034, 0, -928538452);
        setIntElement(term102034, 1, -1313207353);
        setIntElement(term102034, 2, 402612318);
        setIntElement(term102034, 3, -1628481565);
        setIntElement(term102034, 4, -217226756);
        setIntElement(term102034, 5, 1608000247);
        setField(term102025, term102025.getClass(), "modelToViewIndex", term102034);
        setIntField(term102025, term102025.getClass(), "lastRowCount", 1354560887);
        setBooleanField(term102025, term102025.getClass(), "rebuildIndices", true);
        setField(term102043, term102043.getClass(), "listenerList", null);
        setField(term102025, term102025.getClass(), "listenerList", term102043);
        setField(term102024, term102024.getClass(), "rowSorter", term102025);
        setIntField(term102024, term102024.getClass(), "modelIndex", -749474542);
        setElement(term102023, 0, term102024);
        setField(term102046, term102046.getClass(), "model", null);
        setField(term102046, term102046.getClass(), "sortKeys", term102047);
        setField(term102046, term102046.getClass(), "defaultSortKeys", term102050);
        setField(term102046, term102046.getClass(), "unsortableColumns", term102053);
        setField(term102046, term102046.getClass(), "nodeComparator", null);
        setField(term102046, term102046.getClass(), "sortStrategy", null);
        setField(term102046, term102046.getClass(), "viewToModelIndex", null);
        setField(term102046, term102046.getClass(), "modelToViewIndex", null);
        setIntField(term102046, term102046.getClass(), "lastRowCount", 0);
        setBooleanField(term102046, term102046.getClass(), "rebuildIndices", false);
        setField(term102046, term102046.getClass(), "listenerList", null);
        setField(term102045, term102045.getClass(), "rowSorter", term102046);
        setIntField(term102045, term102045.getClass(), "modelIndex", -47907780);
        setElement(term102023, 1, term102045);
        setField(term101975, term101975.getClass(), "viewToModelIndex", term102023);
        setIntElement(term102057, 0, 1131462369);
        setIntElement(term102057, 1, -1161206731);
        setIntElement(term102057, 2, -992847709);
        setIntElement(term102057, 3, 1125156671);
        setIntElement(term102057, 4, 1203107925);
        setField(term101975, term101975.getClass(), "modelToViewIndex", term102057);
        setIntField(term101975, term101975.getClass(), "lastRowCount", 1825448944);
        setBooleanField(term101975, term101975.getClass(), "rebuildIndices", true);
        setField(term102065, term102065.getClass(), "listenerList", term102066);
        setField(term101975, term101975.getClass(), "listenerList", term102065);
        term102067 = new Integer(1769496642);
        term102069 = new Integer(-947460705);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term102067;
        args[1] = term102069;
        callMethod(klass, "compare", argTypes, term101975, args);
    }

};


