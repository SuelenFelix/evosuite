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
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Integer;

public class TreeTableRowSorter_SortRow_setModelIndex_4165060103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369846;
     Object term369908;

    public TreeTableRowSorter_SortRow_setModelIndex_4165060103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term369850 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term369850, term369850.getClass(), "column", 916507296);
        setField(term369850, term369850.getClass(), "sortOrder", null);
        Object term369852 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term369852, term369852.getClass(), "column", 1307887729);
        setField(term369852, term369852.getClass(), "sortOrder", null);
        Object term369854 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term369854, term369854.getClass(), "column", 1628336669);
        setField(term369854, term369854.getClass(), "sortOrder", null);
        Object term369856 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term369856, term369856.getClass(), "column", 466807421);
        setField(term369856, term369856.getClass(), "sortOrder", null);
        Object term369858 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term369858, term369858.getClass(), "column", -407675703);
        setField(term369858, term369858.getClass(), "sortOrder", null);
        Object term369860 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term369860, term369860.getClass(), "column", -429960516);
        setField(term369860, term369860.getClass(), "sortOrder", null);
        Object term369862 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term369862, term369862.getClass(), "column", -630727180);
        setField(term369862, term369862.getClass(), "sortOrder", null);
        Object term369864 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term369864, term369864.getClass(), "column", -1234361060);
        setField(term369864, term369864.getClass(), "sortOrder", null);
        Object term369866 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term369866, term369866.getClass(), "column", -267520884);
        setField(term369866, term369866.getClass(), "sortOrder", null);
        ArrayList term369848 = new ArrayList();
        ((ArrayList) term369848).add(term369850);
        ((ArrayList) term369848).add(term369852);
        ((ArrayList) term369848).add(term369854);
        ((ArrayList) term369848).add(term369856);
        ((ArrayList) term369848).add(term369858);
        ((ArrayList) term369848).add(term369860);
        ((ArrayList) term369848).add(term369862);
        ((ArrayList) term369848).add(term369864);
        ((ArrayList) term369848).add(term369866);
        ArrayList term369870 = new ArrayList();
        HashMap term369875 = new HashMap();
        Set<Object> term369910 =  ((Map) term369875).keySet();
        HashSet term369874 = new HashSet((Collection<? extends Object>) term369910);
        term369846 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term369847 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term369881 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 6);
        Object term369882 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term369883 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term369887 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term369888 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term369892 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term369893 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term369897 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term369898 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term369902 = (int[]) newIntArray(0);
        Object term369905 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term369906 = (Object[]) newArray("java.lang.Object", 0);
        setField(term369847, term369847.getClass(), "model", null);
        setField(term369847, term369847.getClass(), "sortKeys", term369848);
        setField(term369847, term369847.getClass(), "defaultSortKeys", term369870);
        setField(term369847, term369847.getClass(), "unsortableColumns", term369874);
        setField(term369847, term369847.getClass(), "nodeComparator", null);
        setField(term369847, term369847.getClass(), "sortStrategy", null);
        setField(term369883, term369883.getClass(), "model", null);
        setField(term369883, term369883.getClass(), "sortKeys", null);
        setField(term369883, term369883.getClass(), "defaultSortKeys", null);
        setField(term369883, term369883.getClass(), "unsortableColumns", null);
        setField(term369883, term369883.getClass(), "nodeComparator", null);
        setField(term369883, term369883.getClass(), "sortStrategy", null);
        setField(term369883, term369883.getClass(), "viewToModelIndex", null);
        setField(term369883, term369883.getClass(), "modelToViewIndex", null);
        setIntField(term369883, term369883.getClass(), "lastRowCount", -594861500);
        setBooleanField(term369883, term369883.getClass(), "rebuildIndices", false);
        setField(term369883, term369883.getClass(), "listenerList", null);
        setField(term369882, term369882.getClass(), "rowSorter", term369883);
        setIntField(term369882, term369882.getClass(), "modelIndex", 1731562923);
        setElement(term369881, 0, term369882);
        setField(term369888, term369888.getClass(), "model", null);
        setField(term369888, term369888.getClass(), "sortKeys", null);
        setField(term369888, term369888.getClass(), "defaultSortKeys", null);
        setField(term369888, term369888.getClass(), "unsortableColumns", null);
        setField(term369888, term369888.getClass(), "nodeComparator", null);
        setField(term369888, term369888.getClass(), "sortStrategy", null);
        setField(term369888, term369888.getClass(), "viewToModelIndex", null);
        setField(term369888, term369888.getClass(), "modelToViewIndex", null);
        setIntField(term369888, term369888.getClass(), "lastRowCount", 0);
        setBooleanField(term369888, term369888.getClass(), "rebuildIndices", false);
        setField(term369888, term369888.getClass(), "listenerList", null);
        setField(term369887, term369887.getClass(), "rowSorter", term369888);
        setIntField(term369887, term369887.getClass(), "modelIndex", 33467458);
        setElement(term369881, 1, term369887);
        setField(term369893, term369893.getClass(), "model", null);
        setField(term369893, term369893.getClass(), "sortKeys", null);
        setField(term369893, term369893.getClass(), "defaultSortKeys", null);
        setField(term369893, term369893.getClass(), "unsortableColumns", null);
        setField(term369893, term369893.getClass(), "nodeComparator", null);
        setField(term369893, term369893.getClass(), "sortStrategy", null);
        setField(term369893, term369893.getClass(), "viewToModelIndex", null);
        setField(term369893, term369893.getClass(), "modelToViewIndex", null);
        setIntField(term369893, term369893.getClass(), "lastRowCount", 0);
        setBooleanField(term369893, term369893.getClass(), "rebuildIndices", false);
        setField(term369893, term369893.getClass(), "listenerList", null);
        setField(term369892, term369892.getClass(), "rowSorter", term369893);
        setIntField(term369892, term369892.getClass(), "modelIndex", 1729034001);
        setElement(term369881, 2, term369892);
        setField(term369898, term369898.getClass(), "model", null);
        setField(term369898, term369898.getClass(), "sortKeys", null);
        setField(term369898, term369898.getClass(), "defaultSortKeys", null);
        setField(term369898, term369898.getClass(), "unsortableColumns", null);
        setField(term369898, term369898.getClass(), "nodeComparator", null);
        setField(term369898, term369898.getClass(), "sortStrategy", null);
        setField(term369898, term369898.getClass(), "viewToModelIndex", null);
        setField(term369898, term369898.getClass(), "modelToViewIndex", null);
        setIntField(term369898, term369898.getClass(), "lastRowCount", 0);
        setBooleanField(term369898, term369898.getClass(), "rebuildIndices", false);
        setField(term369898, term369898.getClass(), "listenerList", null);
        setField(term369897, term369897.getClass(), "rowSorter", term369898);
        setIntField(term369897, term369897.getClass(), "modelIndex", 1094810824);
        setElement(term369881, 3, term369897);
        setElement(term369881, 4, term369882);
        setElement(term369881, 5, term369882);
        setField(term369847, term369847.getClass(), "viewToModelIndex", term369881);
        setField(term369847, term369847.getClass(), "modelToViewIndex", term369902);
        setIntField(term369847, term369847.getClass(), "lastRowCount", -1746471324);
        setBooleanField(term369847, term369847.getClass(), "rebuildIndices", true);
        setField(term369905, term369905.getClass(), "listenerList", term369906);
        setField(term369847, term369847.getClass(), "listenerList", term369905);
        setField(term369846, term369846.getClass(), "rowSorter", term369847);
        setIntField(term369846, term369846.getClass(), "modelIndex", 844485803);
        term369908 = new Integer(-1373407191);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term369908;
        callMethod(klass, "setModelIndex", argTypes, term369846, args);
    }

};


