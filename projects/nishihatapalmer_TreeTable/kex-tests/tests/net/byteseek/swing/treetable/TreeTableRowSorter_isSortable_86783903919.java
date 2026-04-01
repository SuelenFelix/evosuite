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

public class TreeTableRowSorter_isSortable_86783903919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101371;
     Object term101465;

    public TreeTableRowSorter_isSortable_86783903919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term101374 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term101376 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term101374, term101374.getClass(), "column", -600102466);
        setField(term101376, term101376.getClass(), "name", null);
        setIntField(term101376, term101376.getClass(), "ordinal", 0);
        setField(term101374, term101374.getClass(), "sortOrder", term101376);
        Object term101378 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term101378, term101378.getClass(), "column", -899986714);
        setField(term101378, term101378.getClass(), "sortOrder", term101376);
        Object term101380 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term101382 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term101380, term101380.getClass(), "column", 1307244466);
        setField(term101382, term101382.getClass(), "name", null);
        setIntField(term101382, term101382.getClass(), "ordinal", 2);
        setField(term101380, term101380.getClass(), "sortOrder", term101382);
        Object term101384 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term101386 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term101384, term101384.getClass(), "column", -252262096);
        setField(term101386, term101386.getClass(), "name", null);
        setIntField(term101386, term101386.getClass(), "ordinal", 1);
        setField(term101384, term101384.getClass(), "sortOrder", term101386);
        Object term101388 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term101388, term101388.getClass(), "column", -37129068);
        setField(term101388, term101388.getClass(), "sortOrder", term101376);
        ArrayList term101372 = new ArrayList();
        ((ArrayList) term101372).add(term101374);
        ((ArrayList) term101372).add(term101378);
        ((ArrayList) term101372).add(term101380);
        ((ArrayList) term101372).add(term101384);
        ((ArrayList) term101372).add(term101388);
        ArrayList term101392 = new ArrayList();
        HashMap term101397 = new HashMap();
        Set<Object> term101467 =  ((Map) term101397).keySet();
        HashSet term101396 = new HashSet((Collection<? extends Object>) term101467);
        ArrayList term101426 = new ArrayList();
        ((ArrayList) term101426).add((Object)null);
        ((ArrayList) term101426).add((Object)null);
        ((ArrayList) term101426).add((Object)null);
        ((ArrayList) term101426).add((Object)null);
        ((ArrayList) term101426).add((Object)null);
        ((ArrayList) term101426).add((Object)null);
        ((ArrayList) term101426).add((Object)null);
        ((ArrayList) term101426).add((Object)null);
        ((ArrayList) term101426).add((Object)null);
        ArrayList term101429 = new ArrayList();
        HashSet term101432 = new HashSet();
        ArrayList term101442 = new ArrayList();
        ((ArrayList) term101442).add((Object)null);
        ((ArrayList) term101442).add((Object)null);
        ((ArrayList) term101442).add((Object)null);
        ((ArrayList) term101442).add((Object)null);
        ((ArrayList) term101442).add((Object)null);
        ((ArrayList) term101442).add((Object)null);
        ((ArrayList) term101442).add((Object)null);
        ((ArrayList) term101442).add((Object)null);
        ArrayList term101445 = new ArrayList();
        HashSet term101448 = new HashSet();
        term101371 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term101423 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 2);
        Object term101424 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term101425 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term101433 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 6);
        int[] term101434 = (int[]) newIntArray(1);
        Object term101438 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term101440 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term101441 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term101452 = (int[]) newIntArray(8);
        Object term101463 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term101464 = (Object[]) newArray("java.lang.Object", 0);
        setField(term101371, term101371.getClass(), "model", null);
        setField(term101371, term101371.getClass(), "sortKeys", term101372);
        setField(term101371, term101371.getClass(), "defaultSortKeys", term101392);
        setField(term101371, term101371.getClass(), "unsortableColumns", term101396);
        setField(term101371, term101371.getClass(), "nodeComparator", null);
        setField(term101371, term101371.getClass(), "sortStrategy", null);
        setField(term101425, term101425.getClass(), "model", null);
        setField(term101425, term101425.getClass(), "sortKeys", term101426);
        setField(term101425, term101425.getClass(), "defaultSortKeys", term101429);
        setField(term101425, term101425.getClass(), "unsortableColumns", term101432);
        setField(term101425, term101425.getClass(), "nodeComparator", null);
        setField(term101425, term101425.getClass(), "sortStrategy", null);
        setField(term101425, term101425.getClass(), "viewToModelIndex", term101433);
        setIntElement(term101434, 0, -1626074989);
        setField(term101425, term101425.getClass(), "modelToViewIndex", term101434);
        setIntField(term101425, term101425.getClass(), "lastRowCount", -552272253);
        setBooleanField(term101425, term101425.getClass(), "rebuildIndices", false);
        setField(term101438, term101438.getClass(), "listenerList", null);
        setField(term101425, term101425.getClass(), "listenerList", term101438);
        setField(term101424, term101424.getClass(), "rowSorter", term101425);
        setIntField(term101424, term101424.getClass(), "modelIndex", -633523956);
        setElement(term101423, 0, term101424);
        setField(term101441, term101441.getClass(), "model", null);
        setField(term101441, term101441.getClass(), "sortKeys", term101442);
        setField(term101441, term101441.getClass(), "defaultSortKeys", term101445);
        setField(term101441, term101441.getClass(), "unsortableColumns", term101448);
        setField(term101441, term101441.getClass(), "nodeComparator", null);
        setField(term101441, term101441.getClass(), "sortStrategy", null);
        setField(term101441, term101441.getClass(), "viewToModelIndex", null);
        setField(term101441, term101441.getClass(), "modelToViewIndex", null);
        setIntField(term101441, term101441.getClass(), "lastRowCount", 0);
        setBooleanField(term101441, term101441.getClass(), "rebuildIndices", false);
        setField(term101441, term101441.getClass(), "listenerList", null);
        setField(term101440, term101440.getClass(), "rowSorter", term101441);
        setIntField(term101440, term101440.getClass(), "modelIndex", 1761540885);
        setElement(term101423, 1, term101440);
        setField(term101371, term101371.getClass(), "viewToModelIndex", term101423);
        setIntElement(term101452, 0, -168498989);
        setIntElement(term101452, 1, 388247095);
        setIntElement(term101452, 2, -1320402633);
        setIntElement(term101452, 3, 919602316);
        setIntElement(term101452, 4, 1833713431);
        setIntElement(term101452, 5, -706222608);
        setIntElement(term101452, 6, -2003607923);
        setIntElement(term101452, 7, 1378805929);
        setField(term101371, term101371.getClass(), "modelToViewIndex", term101452);
        setIntField(term101371, term101371.getClass(), "lastRowCount", 695052304);
        setBooleanField(term101371, term101371.getClass(), "rebuildIndices", true);
        setField(term101463, term101463.getClass(), "listenerList", term101464);
        setField(term101371, term101371.getClass(), "listenerList", term101463);
        term101465 = new Integer(-179937218);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term101465;
        callMethod(klass, "isSortable", argTypes, term101371, args);
    }

};


