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

public class TreeTableRowSorter_convertRowIndexToModel_18276368945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100020;
     Object term100115;

    public TreeTableRowSorter_convertRowIndexToModel_18276368945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term100021 = new ArrayList();
        ArrayList term100025 = new ArrayList();
        HashMap term100030 = new HashMap();
        Set<Object> term100117 =  ((Map) term100030).keySet();
        HashSet term100029 = new HashSet((Collection<? extends Object>) term100117);
        ArrayList term100059 = new ArrayList();
        ((ArrayList) term100059).add((Object)null);
        ((ArrayList) term100059).add((Object)null);
        ((ArrayList) term100059).add((Object)null);
        ((ArrayList) term100059).add((Object)null);
        ((ArrayList) term100059).add((Object)null);
        ArrayList term100062 = new ArrayList();
        HashSet term100065 = new HashSet();
        term100020 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term100056 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 8);
        Object term100057 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term100058 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term100066 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 8);
        int[] term100067 = (int[]) newIntArray(9);
        Object term100079 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term100081 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term100082 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term100086 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term100087 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term100091 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term100092 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term100096 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term100097 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term100101 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term100102 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term100106 = (int[]) newIntArray(4);
        Object term100113 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term100114 = (Object[]) newArray("java.lang.Object", 0);
        setField(term100020, term100020.getClass(), "model", null);
        setField(term100020, term100020.getClass(), "sortKeys", term100021);
        setField(term100020, term100020.getClass(), "defaultSortKeys", term100025);
        setField(term100020, term100020.getClass(), "unsortableColumns", term100029);
        setField(term100020, term100020.getClass(), "nodeComparator", null);
        setField(term100020, term100020.getClass(), "sortStrategy", null);
        setField(term100058, term100058.getClass(), "model", null);
        setField(term100058, term100058.getClass(), "sortKeys", term100059);
        setField(term100058, term100058.getClass(), "defaultSortKeys", term100062);
        setField(term100058, term100058.getClass(), "unsortableColumns", term100065);
        setField(term100058, term100058.getClass(), "nodeComparator", null);
        setField(term100058, term100058.getClass(), "sortStrategy", null);
        setField(term100058, term100058.getClass(), "viewToModelIndex", term100066);
        setIntElement(term100067, 0, -944986533);
        setIntElement(term100067, 1, 1894454926);
        setIntElement(term100067, 2, 1415142780);
        setIntElement(term100067, 3, -574105759);
        setIntElement(term100067, 4, -1165271567);
        setIntElement(term100067, 5, 376834234);
        setIntElement(term100067, 6, -1911972560);
        setIntElement(term100067, 7, -642716895);
        setIntElement(term100067, 8, 1743398246);
        setField(term100058, term100058.getClass(), "modelToViewIndex", term100067);
        setIntField(term100058, term100058.getClass(), "lastRowCount", -934658823);
        setBooleanField(term100058, term100058.getClass(), "rebuildIndices", true);
        setField(term100079, term100079.getClass(), "listenerList", null);
        setField(term100058, term100058.getClass(), "listenerList", term100079);
        setField(term100057, term100057.getClass(), "rowSorter", term100058);
        setIntField(term100057, term100057.getClass(), "modelIndex", 1632177303);
        setElement(term100056, 0, term100057);
        setField(term100082, term100082.getClass(), "model", null);
        setField(term100082, term100082.getClass(), "sortKeys", null);
        setField(term100082, term100082.getClass(), "defaultSortKeys", null);
        setField(term100082, term100082.getClass(), "unsortableColumns", null);
        setField(term100082, term100082.getClass(), "nodeComparator", null);
        setField(term100082, term100082.getClass(), "sortStrategy", null);
        setField(term100082, term100082.getClass(), "viewToModelIndex", null);
        setField(term100082, term100082.getClass(), "modelToViewIndex", null);
        setIntField(term100082, term100082.getClass(), "lastRowCount", 0);
        setBooleanField(term100082, term100082.getClass(), "rebuildIndices", false);
        setField(term100082, term100082.getClass(), "listenerList", null);
        setField(term100081, term100081.getClass(), "rowSorter", term100082);
        setIntField(term100081, term100081.getClass(), "modelIndex", -802592348);
        setElement(term100056, 1, term100081);
        setField(term100087, term100087.getClass(), "model", null);
        setField(term100087, term100087.getClass(), "sortKeys", null);
        setField(term100087, term100087.getClass(), "defaultSortKeys", null);
        setField(term100087, term100087.getClass(), "unsortableColumns", null);
        setField(term100087, term100087.getClass(), "nodeComparator", null);
        setField(term100087, term100087.getClass(), "sortStrategy", null);
        setField(term100087, term100087.getClass(), "viewToModelIndex", null);
        setField(term100087, term100087.getClass(), "modelToViewIndex", null);
        setIntField(term100087, term100087.getClass(), "lastRowCount", 0);
        setBooleanField(term100087, term100087.getClass(), "rebuildIndices", false);
        setField(term100087, term100087.getClass(), "listenerList", null);
        setField(term100086, term100086.getClass(), "rowSorter", term100087);
        setIntField(term100086, term100086.getClass(), "modelIndex", 598635505);
        setElement(term100056, 2, term100086);
        setElement(term100056, 3, term100057);
        setField(term100092, term100092.getClass(), "model", null);
        setField(term100092, term100092.getClass(), "sortKeys", null);
        setField(term100092, term100092.getClass(), "defaultSortKeys", null);
        setField(term100092, term100092.getClass(), "unsortableColumns", null);
        setField(term100092, term100092.getClass(), "nodeComparator", null);
        setField(term100092, term100092.getClass(), "sortStrategy", null);
        setField(term100092, term100092.getClass(), "viewToModelIndex", null);
        setField(term100092, term100092.getClass(), "modelToViewIndex", null);
        setIntField(term100092, term100092.getClass(), "lastRowCount", 0);
        setBooleanField(term100092, term100092.getClass(), "rebuildIndices", false);
        setField(term100092, term100092.getClass(), "listenerList", null);
        setField(term100091, term100091.getClass(), "rowSorter", term100092);
        setIntField(term100091, term100091.getClass(), "modelIndex", 654195547);
        setElement(term100056, 4, term100091);
        setField(term100097, term100097.getClass(), "model", null);
        setField(term100097, term100097.getClass(), "sortKeys", null);
        setField(term100097, term100097.getClass(), "defaultSortKeys", null);
        setField(term100097, term100097.getClass(), "unsortableColumns", null);
        setField(term100097, term100097.getClass(), "nodeComparator", null);
        setField(term100097, term100097.getClass(), "sortStrategy", null);
        setField(term100097, term100097.getClass(), "viewToModelIndex", null);
        setField(term100097, term100097.getClass(), "modelToViewIndex", null);
        setIntField(term100097, term100097.getClass(), "lastRowCount", 0);
        setBooleanField(term100097, term100097.getClass(), "rebuildIndices", false);
        setField(term100097, term100097.getClass(), "listenerList", null);
        setField(term100096, term100096.getClass(), "rowSorter", term100097);
        setIntField(term100096, term100096.getClass(), "modelIndex", -658524954);
        setElement(term100056, 5, term100096);
        setField(term100102, term100102.getClass(), "model", null);
        setField(term100102, term100102.getClass(), "sortKeys", null);
        setField(term100102, term100102.getClass(), "defaultSortKeys", null);
        setField(term100102, term100102.getClass(), "unsortableColumns", null);
        setField(term100102, term100102.getClass(), "nodeComparator", null);
        setField(term100102, term100102.getClass(), "sortStrategy", null);
        setField(term100102, term100102.getClass(), "viewToModelIndex", null);
        setField(term100102, term100102.getClass(), "modelToViewIndex", null);
        setIntField(term100102, term100102.getClass(), "lastRowCount", 0);
        setBooleanField(term100102, term100102.getClass(), "rebuildIndices", false);
        setField(term100102, term100102.getClass(), "listenerList", null);
        setField(term100101, term100101.getClass(), "rowSorter", term100102);
        setIntField(term100101, term100101.getClass(), "modelIndex", -179238712);
        setElement(term100056, 6, term100101);
        setElement(term100056, 7, term100101);
        setField(term100020, term100020.getClass(), "viewToModelIndex", term100056);
        setIntElement(term100106, 0, -1576584269);
        setIntElement(term100106, 1, 1474899591);
        setIntElement(term100106, 2, 297582552);
        setIntElement(term100106, 3, -1485916498);
        setField(term100020, term100020.getClass(), "modelToViewIndex", term100106);
        setIntField(term100020, term100020.getClass(), "lastRowCount", 722787672);
        setBooleanField(term100020, term100020.getClass(), "rebuildIndices", false);
        setField(term100113, term100113.getClass(), "listenerList", term100114);
        setField(term100020, term100020.getClass(), "listenerList", term100113);
        term100115 = new Integer(2077491675);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term100115;
        callMethod(klass, "convertRowIndexToModel", argTypes, term100020, args);
    }

};


