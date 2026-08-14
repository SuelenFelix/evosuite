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

public class TreeTableRowSorter_rowsUpdated_50941863716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100483;
     Object term100583;
     Object term100585;

    public TreeTableRowSorter_rowsUpdated_50941863716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term100486 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term100488 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term100486, term100486.getClass(), "column", -1017617829);
        setField(term100488, term100488.getClass(), "name", null);
        setIntField(term100488, term100488.getClass(), "ordinal", 2);
        setField(term100486, term100486.getClass(), "sortOrder", term100488);
        Object term100490 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term100490, term100490.getClass(), "column", 270928865);
        setField(term100490, term100490.getClass(), "sortOrder", term100488);
        Object term100492 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term100494 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term100492, term100492.getClass(), "column", -308526089);
        setField(term100494, term100494.getClass(), "name", null);
        setIntField(term100494, term100494.getClass(), "ordinal", 0);
        setField(term100492, term100492.getClass(), "sortOrder", term100494);
        Object term100496 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term100496, term100496.getClass(), "column", -359675864);
        setField(term100496, term100496.getClass(), "sortOrder", term100488);
        Object term100498 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term100498, term100498.getClass(), "column", -1671982964);
        setField(term100498, term100498.getClass(), "sortOrder", term100488);
        Object term100500 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term100500, term100500.getClass(), "column", 776218451);
        setField(term100500, term100500.getClass(), "sortOrder", term100494);
        Object term100502 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term100502, term100502.getClass(), "column", -1362132929);
        setField(term100502, term100502.getClass(), "sortOrder", term100488);
        ArrayList term100484 = new ArrayList();
        ((ArrayList) term100484).add(term100486);
        ((ArrayList) term100484).add(term100490);
        ((ArrayList) term100484).add(term100492);
        ((ArrayList) term100484).add(term100496);
        ((ArrayList) term100484).add(term100498);
        ((ArrayList) term100484).add(term100500);
        ((ArrayList) term100484).add(term100502);
        ArrayList term100506 = new ArrayList();
        HashMap term100511 = new HashMap();
        Set<Object> term100587 =  ((Map) term100511).keySet();
        HashSet term100510 = new HashSet((Collection<? extends Object>) term100587);
        ArrayList term100540 = new ArrayList();
        ((ArrayList) term100540).add((Object)null);
        ArrayList term100543 = new ArrayList();
        HashSet term100546 = new HashSet();
        ArrayList term100555 = new ArrayList();
        ((ArrayList) term100555).add((Object)null);
        ((ArrayList) term100555).add((Object)null);
        ((ArrayList) term100555).add((Object)null);
        ArrayList term100558 = new ArrayList();
        HashSet term100561 = new HashSet();
        term100483 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term100537 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 3);
        Object term100538 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term100539 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term100547 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 5);
        int[] term100548 = (int[]) newIntArray(0);
        Object term100551 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term100553 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term100554 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term100565 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term100566 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term100570 = (int[]) newIntArray(8);
        Object term100581 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term100582 = (Object[]) newArray("java.lang.Object", 0);
        setField(term100483, term100483.getClass(), "model", null);
        setField(term100483, term100483.getClass(), "sortKeys", term100484);
        setField(term100483, term100483.getClass(), "defaultSortKeys", term100506);
        setField(term100483, term100483.getClass(), "unsortableColumns", term100510);
        setField(term100483, term100483.getClass(), "nodeComparator", null);
        setField(term100483, term100483.getClass(), "sortStrategy", null);
        setField(term100539, term100539.getClass(), "model", null);
        setField(term100539, term100539.getClass(), "sortKeys", term100540);
        setField(term100539, term100539.getClass(), "defaultSortKeys", term100543);
        setField(term100539, term100539.getClass(), "unsortableColumns", term100546);
        setField(term100539, term100539.getClass(), "nodeComparator", null);
        setField(term100539, term100539.getClass(), "sortStrategy", null);
        setField(term100539, term100539.getClass(), "viewToModelIndex", term100547);
        setField(term100539, term100539.getClass(), "modelToViewIndex", term100548);
        setIntField(term100539, term100539.getClass(), "lastRowCount", 241725499);
        setBooleanField(term100539, term100539.getClass(), "rebuildIndices", true);
        setField(term100551, term100551.getClass(), "listenerList", null);
        setField(term100539, term100539.getClass(), "listenerList", term100551);
        setField(term100538, term100538.getClass(), "rowSorter", term100539);
        setIntField(term100538, term100538.getClass(), "modelIndex", 823179298);
        setElement(term100537, 0, term100538);
        setField(term100554, term100554.getClass(), "model", null);
        setField(term100554, term100554.getClass(), "sortKeys", term100555);
        setField(term100554, term100554.getClass(), "defaultSortKeys", term100558);
        setField(term100554, term100554.getClass(), "unsortableColumns", term100561);
        setField(term100554, term100554.getClass(), "nodeComparator", null);
        setField(term100554, term100554.getClass(), "sortStrategy", null);
        setField(term100554, term100554.getClass(), "viewToModelIndex", null);
        setField(term100554, term100554.getClass(), "modelToViewIndex", null);
        setIntField(term100554, term100554.getClass(), "lastRowCount", 0);
        setBooleanField(term100554, term100554.getClass(), "rebuildIndices", false);
        setField(term100554, term100554.getClass(), "listenerList", null);
        setField(term100553, term100553.getClass(), "rowSorter", term100554);
        setIntField(term100553, term100553.getClass(), "modelIndex", 1174484848);
        setElement(term100537, 1, term100553);
        setField(term100566, term100566.getClass(), "model", null);
        setField(term100566, term100566.getClass(), "sortKeys", null);
        setField(term100566, term100566.getClass(), "defaultSortKeys", null);
        setField(term100566, term100566.getClass(), "unsortableColumns", null);
        setField(term100566, term100566.getClass(), "nodeComparator", null);
        setField(term100566, term100566.getClass(), "sortStrategy", null);
        setField(term100566, term100566.getClass(), "viewToModelIndex", null);
        setField(term100566, term100566.getClass(), "modelToViewIndex", null);
        setIntField(term100566, term100566.getClass(), "lastRowCount", 0);
        setBooleanField(term100566, term100566.getClass(), "rebuildIndices", false);
        setField(term100566, term100566.getClass(), "listenerList", null);
        setField(term100565, term100565.getClass(), "rowSorter", term100566);
        setIntField(term100565, term100565.getClass(), "modelIndex", 939889496);
        setElement(term100537, 2, term100565);
        setField(term100483, term100483.getClass(), "viewToModelIndex", term100537);
        setIntElement(term100570, 0, -495242269);
        setIntElement(term100570, 1, 932810106);
        setIntElement(term100570, 2, -2138801137);
        setIntElement(term100570, 3, -1470115841);
        setIntElement(term100570, 4, 480909331);
        setIntElement(term100570, 5, -2024983877);
        setIntElement(term100570, 6, 1757149811);
        setIntElement(term100570, 7, 1505375686);
        setField(term100483, term100483.getClass(), "modelToViewIndex", term100570);
        setIntField(term100483, term100483.getClass(), "lastRowCount", -132005524);
        setBooleanField(term100483, term100483.getClass(), "rebuildIndices", false);
        setField(term100581, term100581.getClass(), "listenerList", term100582);
        setField(term100483, term100483.getClass(), "listenerList", term100581);
        term100583 = new Integer(-1235127374);
        term100585 = new Integer(-2077814162);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term100583;
        args[1] = term100585;
        callMethod(klass, "rowsUpdated", argTypes, term100483, args);
    }

};


