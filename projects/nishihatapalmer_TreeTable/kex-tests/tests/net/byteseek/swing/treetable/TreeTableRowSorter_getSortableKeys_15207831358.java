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
import java.util.LinkedList;

public class TreeTableRowSorter_getSortableKeys_15207831358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100303;
     Object term100381;

    public TreeTableRowSorter_getSortableKeys_15207831358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term100306 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term100308 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term100306, term100306.getClass(), "column", 797015478);
        setField(term100308, term100308.getClass(), "name", null);
        setIntField(term100308, term100308.getClass(), "ordinal", 1);
        setField(term100306, term100306.getClass(), "sortOrder", term100308);
        ArrayList term100304 = new ArrayList();
        ((ArrayList) term100304).add(term100306);
        ArrayList term100312 = new ArrayList();
        HashMap term100317 = new HashMap();
        Set<Object> term100384 =  ((Map) term100317).keySet();
        HashSet term100316 = new HashSet((Collection<? extends Object>) term100384);
        ArrayList term100354 = new ArrayList();
        ((ArrayList) term100354).add((Object)null);
        ((ArrayList) term100354).add((Object)null);
        ((ArrayList) term100354).add((Object)null);
        ((ArrayList) term100354).add((Object)null);
        ArrayList term100357 = new ArrayList();
        HashSet term100360 = new HashSet();
        term100303 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term100351 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 1);
        Object term100352 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term100353 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term100361 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 1);
        int[] term100362 = (int[]) newIntArray(1);
        Object term100366 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        int[] term100368 = (int[]) newIntArray(8);
        Object term100379 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term100380 = (Object[]) newArray("java.lang.Object", 0);
        setField(term100303, term100303.getClass(), "model", null);
        setField(term100303, term100303.getClass(), "sortKeys", term100304);
        setField(term100303, term100303.getClass(), "defaultSortKeys", term100312);
        setField(term100303, term100303.getClass(), "unsortableColumns", term100316);
        setField(term100303, term100303.getClass(), "nodeComparator", null);
        setField(term100303, term100303.getClass(), "sortStrategy", null);
        setField(term100353, term100353.getClass(), "model", null);
        setField(term100353, term100353.getClass(), "sortKeys", term100354);
        setField(term100353, term100353.getClass(), "defaultSortKeys", term100357);
        setField(term100353, term100353.getClass(), "unsortableColumns", term100360);
        setField(term100353, term100353.getClass(), "nodeComparator", null);
        setField(term100353, term100353.getClass(), "sortStrategy", null);
        setField(term100353, term100353.getClass(), "viewToModelIndex", term100361);
        setIntElement(term100362, 0, 953741504);
        setField(term100353, term100353.getClass(), "modelToViewIndex", term100362);
        setIntField(term100353, term100353.getClass(), "lastRowCount", 1389452261);
        setBooleanField(term100353, term100353.getClass(), "rebuildIndices", false);
        setField(term100366, term100366.getClass(), "listenerList", null);
        setField(term100353, term100353.getClass(), "listenerList", term100366);
        setField(term100352, term100352.getClass(), "rowSorter", term100353);
        setIntField(term100352, term100352.getClass(), "modelIndex", 1615957955);
        setElement(term100351, 0, term100352);
        setField(term100303, term100303.getClass(), "viewToModelIndex", term100351);
        setIntElement(term100368, 0, 1779370220);
        setIntElement(term100368, 1, -1716046610);
        setIntElement(term100368, 2, 65264024);
        setIntElement(term100368, 3, -252449812);
        setIntElement(term100368, 4, -1885268968);
        setIntElement(term100368, 5, 277855691);
        setIntElement(term100368, 6, 675891483);
        setIntElement(term100368, 7, -317900470);
        setField(term100303, term100303.getClass(), "modelToViewIndex", term100368);
        setIntField(term100303, term100303.getClass(), "lastRowCount", -979568);
        setBooleanField(term100303, term100303.getClass(), "rebuildIndices", false);
        setField(term100379, term100379.getClass(), "listenerList", term100380);
        setField(term100303, term100303.getClass(), "listenerList", term100379);
        term100381 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term100381;
        callMethod(klass, "getSortableKeys", argTypes, term100303, args);
    }

};


