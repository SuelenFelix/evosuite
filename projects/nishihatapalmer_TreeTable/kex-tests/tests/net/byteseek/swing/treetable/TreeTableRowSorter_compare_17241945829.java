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
     Object term102448;
     Object term102545;
     Object term102547;

    public TreeTableRowSorter_compare_17241945829() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term102451 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term102453 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term102451, term102451.getClass(), "column", 1846078344);
        setField(term102453, term102453.getClass(), "name", null);
        setIntField(term102453, term102453.getClass(), "ordinal", 2);
        setField(term102451, term102451.getClass(), "sortOrder", term102453);
        Object term102455 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term102457 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term102455, term102455.getClass(), "column", 1692543802);
        setField(term102457, term102457.getClass(), "name", null);
        setIntField(term102457, term102457.getClass(), "ordinal", 0);
        setField(term102455, term102455.getClass(), "sortOrder", term102457);
        ArrayList term102449 = new ArrayList();
        ((ArrayList) term102449).add(term102451);
        ((ArrayList) term102449).add(term102455);
        ArrayList term102461 = new ArrayList();
        HashMap term102466 = new HashMap();
        Set<Object> term102549 =  ((Map) term102466).keySet();
        HashSet term102465 = new HashSet((Collection<? extends Object>) term102549);
        ArrayList term102499 = new ArrayList();
        ((ArrayList) term102499).add((Object)null);
        ArrayList term102502 = new ArrayList();
        HashSet term102505 = new HashSet();
        ArrayList term102515 = new ArrayList();
        ((ArrayList) term102515).add((Object)null);
        ((ArrayList) term102515).add((Object)null);
        ((ArrayList) term102515).add((Object)null);
        ((ArrayList) term102515).add((Object)null);
        ((ArrayList) term102515).add((Object)null);
        ((ArrayList) term102515).add((Object)null);
        ((ArrayList) term102515).add((Object)null);
        ((ArrayList) term102515).add((Object)null);
        ArrayList term102518 = new ArrayList();
        HashSet term102521 = new HashSet();
        term102448 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term102496 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 4);
        Object term102497 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term102498 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term102506 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 6);
        int[] term102507 = (int[]) newIntArray(1);
        Object term102511 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term102513 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term102514 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term102525 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term102526 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term102530 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        int[] term102532 = (int[]) newIntArray(8);
        Object term102543 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term102544 = (Object[]) newArray("java.lang.Object", 0);
        setField(term102448, term102448.getClass(), "model", null);
        setField(term102448, term102448.getClass(), "sortKeys", term102449);
        setField(term102448, term102448.getClass(), "defaultSortKeys", term102461);
        setField(term102448, term102448.getClass(), "unsortableColumns", term102465);
        setField(term102448, term102448.getClass(), "nodeComparator", null);
        setField(term102448, term102448.getClass(), "sortStrategy", null);
        setField(term102498, term102498.getClass(), "model", null);
        setField(term102498, term102498.getClass(), "sortKeys", term102499);
        setField(term102498, term102498.getClass(), "defaultSortKeys", term102502);
        setField(term102498, term102498.getClass(), "unsortableColumns", term102505);
        setField(term102498, term102498.getClass(), "nodeComparator", null);
        setField(term102498, term102498.getClass(), "sortStrategy", null);
        setField(term102498, term102498.getClass(), "viewToModelIndex", term102506);
        setIntElement(term102507, 0, 680714112);
        setField(term102498, term102498.getClass(), "modelToViewIndex", term102507);
        setIntField(term102498, term102498.getClass(), "lastRowCount", 385297023);
        setBooleanField(term102498, term102498.getClass(), "rebuildIndices", true);
        setField(term102511, term102511.getClass(), "listenerList", null);
        setField(term102498, term102498.getClass(), "listenerList", term102511);
        setField(term102497, term102497.getClass(), "rowSorter", term102498);
        setIntField(term102497, term102497.getClass(), "modelIndex", -134092543);
        setElement(term102496, 0, term102497);
        setField(term102514, term102514.getClass(), "model", null);
        setField(term102514, term102514.getClass(), "sortKeys", term102515);
        setField(term102514, term102514.getClass(), "defaultSortKeys", term102518);
        setField(term102514, term102514.getClass(), "unsortableColumns", term102521);
        setField(term102514, term102514.getClass(), "nodeComparator", null);
        setField(term102514, term102514.getClass(), "sortStrategy", null);
        setField(term102514, term102514.getClass(), "viewToModelIndex", null);
        setField(term102514, term102514.getClass(), "modelToViewIndex", null);
        setIntField(term102514, term102514.getClass(), "lastRowCount", 0);
        setBooleanField(term102514, term102514.getClass(), "rebuildIndices", false);
        setField(term102514, term102514.getClass(), "listenerList", null);
        setField(term102513, term102513.getClass(), "rowSorter", term102514);
        setIntField(term102513, term102513.getClass(), "modelIndex", -1703642288);
        setElement(term102496, 1, term102513);
        setField(term102526, term102526.getClass(), "model", null);
        setField(term102526, term102526.getClass(), "sortKeys", null);
        setField(term102526, term102526.getClass(), "defaultSortKeys", null);
        setField(term102526, term102526.getClass(), "unsortableColumns", null);
        setField(term102526, term102526.getClass(), "nodeComparator", null);
        setField(term102526, term102526.getClass(), "sortStrategy", null);
        setField(term102526, term102526.getClass(), "viewToModelIndex", null);
        setField(term102526, term102526.getClass(), "modelToViewIndex", null);
        setIntField(term102526, term102526.getClass(), "lastRowCount", 0);
        setBooleanField(term102526, term102526.getClass(), "rebuildIndices", false);
        setField(term102526, term102526.getClass(), "listenerList", null);
        setField(term102525, term102525.getClass(), "rowSorter", term102526);
        setIntField(term102525, term102525.getClass(), "modelIndex", 2075139747);
        setElement(term102496, 2, term102525);
        setField(term102530, term102530.getClass(), "rowSorter", term102514);
        setIntField(term102530, term102530.getClass(), "modelIndex", 2092881418);
        setElement(term102496, 3, term102530);
        setField(term102448, term102448.getClass(), "viewToModelIndex", term102496);
        setIntElement(term102532, 0, 1732410866);
        setIntElement(term102532, 1, 1084102599);
        setIntElement(term102532, 2, -1743503755);
        setIntElement(term102532, 3, 1641342112);
        setIntElement(term102532, 4, -1551790945);
        setIntElement(term102532, 5, 2039538484);
        setIntElement(term102532, 6, 1235736068);
        setIntElement(term102532, 7, 329424176);
        setField(term102448, term102448.getClass(), "modelToViewIndex", term102532);
        setIntField(term102448, term102448.getClass(), "lastRowCount", -1897199214);
        setBooleanField(term102448, term102448.getClass(), "rebuildIndices", false);
        setField(term102543, term102543.getClass(), "listenerList", term102544);
        setField(term102448, term102448.getClass(), "listenerList", term102543);
        term102545 = new Integer(-1016478729);
        term102547 = new Integer(-206889003);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term102545;
        args[1] = term102547;
        callMethod(klass, "compare", argTypes, term102448, args);
    }

};


