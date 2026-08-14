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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Integer;

public class TreeTableRowSorter_checkInsertionPoint_8491938658 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105010;
     Object term105085;
     Object term105087;

    public TreeTableRowSorter_checkInsertionPoint_8491938658() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term105011 = new ArrayList();
        ArrayList term105015 = new ArrayList();
        HashMap term105020 = new HashMap();
        Set<Object> term105089 =  ((Map) term105020).keySet();
        HashSet term105019 = new HashSet((Collection<? extends Object>) term105089);
        ArrayList term105037 = new ArrayList();
        ((ArrayList) term105037).add((Object)null);
        ArrayList term105040 = new ArrayList();
        HashSet term105043 = new HashSet();
        ArrayList term105058 = new ArrayList();
        ((ArrayList) term105058).add((Object)null);
        ((ArrayList) term105058).add((Object)null);
        ArrayList term105061 = new ArrayList();
        HashSet term105064 = new HashSet();
        term105010 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term105034 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 7);
        Object term105035 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term105036 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term105044 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 5);
        int[] term105045 = (int[]) newIntArray(6);
        Object term105054 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term105056 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term105057 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term105068 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term105069 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term105073 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term105074 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term105078 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        int[] term105080 = (int[]) newIntArray(0);
        Object term105083 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term105084 = (Object[]) newArray("java.lang.Object", 0);
        setField(term105010, term105010.getClass(), "model", null);
        setField(term105010, term105010.getClass(), "sortKeys", term105011);
        setField(term105010, term105010.getClass(), "defaultSortKeys", term105015);
        setField(term105010, term105010.getClass(), "unsortableColumns", term105019);
        setField(term105010, term105010.getClass(), "nodeComparator", null);
        setField(term105010, term105010.getClass(), "sortStrategy", null);
        setField(term105036, term105036.getClass(), "model", null);
        setField(term105036, term105036.getClass(), "sortKeys", term105037);
        setField(term105036, term105036.getClass(), "defaultSortKeys", term105040);
        setField(term105036, term105036.getClass(), "unsortableColumns", term105043);
        setField(term105036, term105036.getClass(), "nodeComparator", null);
        setField(term105036, term105036.getClass(), "sortStrategy", null);
        setField(term105036, term105036.getClass(), "viewToModelIndex", term105044);
        setIntElement(term105045, 0, 272179554);
        setIntElement(term105045, 1, 1717711536);
        setIntElement(term105045, 2, -606339607);
        setIntElement(term105045, 3, 800440712);
        setIntElement(term105045, 4, -1976407622);
        setIntElement(term105045, 5, -552996061);
        setField(term105036, term105036.getClass(), "modelToViewIndex", term105045);
        setIntField(term105036, term105036.getClass(), "lastRowCount", -153013117);
        setBooleanField(term105036, term105036.getClass(), "rebuildIndices", false);
        setField(term105054, term105054.getClass(), "listenerList", null);
        setField(term105036, term105036.getClass(), "listenerList", term105054);
        setField(term105035, term105035.getClass(), "rowSorter", term105036);
        setIntField(term105035, term105035.getClass(), "modelIndex", 712181359);
        setElement(term105034, 0, term105035);
        setField(term105057, term105057.getClass(), "model", null);
        setField(term105057, term105057.getClass(), "sortKeys", term105058);
        setField(term105057, term105057.getClass(), "defaultSortKeys", term105061);
        setField(term105057, term105057.getClass(), "unsortableColumns", term105064);
        setField(term105057, term105057.getClass(), "nodeComparator", null);
        setField(term105057, term105057.getClass(), "sortStrategy", null);
        setField(term105057, term105057.getClass(), "viewToModelIndex", null);
        setField(term105057, term105057.getClass(), "modelToViewIndex", null);
        setIntField(term105057, term105057.getClass(), "lastRowCount", 0);
        setBooleanField(term105057, term105057.getClass(), "rebuildIndices", false);
        setField(term105057, term105057.getClass(), "listenerList", null);
        setField(term105056, term105056.getClass(), "rowSorter", term105057);
        setIntField(term105056, term105056.getClass(), "modelIndex", -1943255435);
        setElement(term105034, 1, term105056);
        setField(term105069, term105069.getClass(), "model", null);
        setField(term105069, term105069.getClass(), "sortKeys", null);
        setField(term105069, term105069.getClass(), "defaultSortKeys", null);
        setField(term105069, term105069.getClass(), "unsortableColumns", null);
        setField(term105069, term105069.getClass(), "nodeComparator", null);
        setField(term105069, term105069.getClass(), "sortStrategy", null);
        setField(term105069, term105069.getClass(), "viewToModelIndex", null);
        setField(term105069, term105069.getClass(), "modelToViewIndex", null);
        setIntField(term105069, term105069.getClass(), "lastRowCount", 0);
        setBooleanField(term105069, term105069.getClass(), "rebuildIndices", false);
        setField(term105069, term105069.getClass(), "listenerList", null);
        setField(term105068, term105068.getClass(), "rowSorter", term105069);
        setIntField(term105068, term105068.getClass(), "modelIndex", 868436312);
        setElement(term105034, 2, term105068);
        setField(term105074, term105074.getClass(), "model", null);
        setField(term105074, term105074.getClass(), "sortKeys", null);
        setField(term105074, term105074.getClass(), "defaultSortKeys", null);
        setField(term105074, term105074.getClass(), "unsortableColumns", null);
        setField(term105074, term105074.getClass(), "nodeComparator", null);
        setField(term105074, term105074.getClass(), "sortStrategy", null);
        setField(term105074, term105074.getClass(), "viewToModelIndex", null);
        setField(term105074, term105074.getClass(), "modelToViewIndex", null);
        setIntField(term105074, term105074.getClass(), "lastRowCount", 0);
        setBooleanField(term105074, term105074.getClass(), "rebuildIndices", false);
        setField(term105074, term105074.getClass(), "listenerList", null);
        setField(term105073, term105073.getClass(), "rowSorter", term105074);
        setIntField(term105073, term105073.getClass(), "modelIndex", 1737963071);
        setElement(term105034, 3, term105073);
        setField(term105078, term105078.getClass(), "rowSorter", term105057);
        setIntField(term105078, term105078.getClass(), "modelIndex", 6456997);
        setElement(term105034, 4, term105078);
        setElement(term105034, 5, term105073);
        setElement(term105034, 6, term105035);
        setField(term105010, term105010.getClass(), "viewToModelIndex", term105034);
        setField(term105010, term105010.getClass(), "modelToViewIndex", term105080);
        setIntField(term105010, term105010.getClass(), "lastRowCount", -797269627);
        setBooleanField(term105010, term105010.getClass(), "rebuildIndices", false);
        setField(term105083, term105083.getClass(), "listenerList", term105084);
        setField(term105010, term105010.getClass(), "listenerList", term105083);
        term105085 = new Integer(-224331928);
        term105087 = new Integer(-587857163);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term105085;
        args[1] = term105087;
        callMethod(klass, "checkInsertionPoint", argTypes, term105010, args);
    }

};


