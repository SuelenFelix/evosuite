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
import java.lang.Boolean;

public class TreeTableRowSorter_setSortable_173592253920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100931;
     Object term101019;
     Object term101021;

    public TreeTableRowSorter_setSortable_173592253920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term100934 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term100936 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term100934, term100934.getClass(), "column", 750084083);
        setField(term100936, term100936.getClass(), "name", null);
        setIntField(term100936, term100936.getClass(), "ordinal", 1);
        setField(term100934, term100934.getClass(), "sortOrder", term100936);
        Object term100938 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term100940 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term100938, term100938.getClass(), "column", -1603460382);
        setField(term100940, term100940.getClass(), "name", null);
        setIntField(term100940, term100940.getClass(), "ordinal", 2);
        setField(term100938, term100938.getClass(), "sortOrder", term100940);
        ArrayList term100932 = new ArrayList();
        ((ArrayList) term100932).add(term100934);
        ((ArrayList) term100932).add(term100938);
        ArrayList term100944 = new ArrayList();
        HashMap term100949 = new HashMap();
        Set<Object> term101023 =  ((Map) term100949).keySet();
        HashSet term100948 = new HashSet((Collection<? extends Object>) term101023);
        ArrayList term100970 = new ArrayList();
        ((ArrayList) term100970).add((Object)null);
        ((ArrayList) term100970).add((Object)null);
        ((ArrayList) term100970).add((Object)null);
        ((ArrayList) term100970).add((Object)null);
        ArrayList term100973 = new ArrayList();
        HashSet term100976 = new HashSet();
        ArrayList term100991 = new ArrayList();
        ArrayList term100994 = new ArrayList();
        HashSet term100997 = new HashSet();
        term100931 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term100967 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 4);
        Object term100968 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term100969 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term100977 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 6);
        int[] term100978 = (int[]) newIntArray(6);
        Object term100987 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term100989 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term100990 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term101001 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term101002 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term101006 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term101007 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term101011 = (int[]) newIntArray(3);
        Object term101017 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term101018 = (Object[]) newArray("java.lang.Object", 0);
        setField(term100931, term100931.getClass(), "model", null);
        setField(term100931, term100931.getClass(), "sortKeys", term100932);
        setField(term100931, term100931.getClass(), "defaultSortKeys", term100944);
        setField(term100931, term100931.getClass(), "unsortableColumns", term100948);
        setField(term100931, term100931.getClass(), "nodeComparator", null);
        setField(term100931, term100931.getClass(), "sortStrategy", null);
        setField(term100969, term100969.getClass(), "model", null);
        setField(term100969, term100969.getClass(), "sortKeys", term100970);
        setField(term100969, term100969.getClass(), "defaultSortKeys", term100973);
        setField(term100969, term100969.getClass(), "unsortableColumns", term100976);
        setField(term100969, term100969.getClass(), "nodeComparator", null);
        setField(term100969, term100969.getClass(), "sortStrategy", null);
        setField(term100969, term100969.getClass(), "viewToModelIndex", term100977);
        setIntElement(term100978, 0, 879795058);
        setIntElement(term100978, 1, -1016087889);
        setIntElement(term100978, 2, 1968287557);
        setIntElement(term100978, 3, 1101385603);
        setIntElement(term100978, 4, 1980267589);
        setIntElement(term100978, 5, -2009434910);
        setField(term100969, term100969.getClass(), "modelToViewIndex", term100978);
        setIntField(term100969, term100969.getClass(), "lastRowCount", -374887532);
        setBooleanField(term100969, term100969.getClass(), "rebuildIndices", false);
        setField(term100987, term100987.getClass(), "listenerList", null);
        setField(term100969, term100969.getClass(), "listenerList", term100987);
        setField(term100968, term100968.getClass(), "rowSorter", term100969);
        setIntField(term100968, term100968.getClass(), "modelIndex", -165487736);
        setElement(term100967, 0, term100968);
        setField(term100990, term100990.getClass(), "model", null);
        setField(term100990, term100990.getClass(), "sortKeys", term100991);
        setField(term100990, term100990.getClass(), "defaultSortKeys", term100994);
        setField(term100990, term100990.getClass(), "unsortableColumns", term100997);
        setField(term100990, term100990.getClass(), "nodeComparator", null);
        setField(term100990, term100990.getClass(), "sortStrategy", null);
        setField(term100990, term100990.getClass(), "viewToModelIndex", null);
        setField(term100990, term100990.getClass(), "modelToViewIndex", null);
        setIntField(term100990, term100990.getClass(), "lastRowCount", 0);
        setBooleanField(term100990, term100990.getClass(), "rebuildIndices", false);
        setField(term100990, term100990.getClass(), "listenerList", null);
        setField(term100989, term100989.getClass(), "rowSorter", term100990);
        setIntField(term100989, term100989.getClass(), "modelIndex", -608393431);
        setElement(term100967, 1, term100989);
        setField(term101002, term101002.getClass(), "model", null);
        setField(term101002, term101002.getClass(), "sortKeys", null);
        setField(term101002, term101002.getClass(), "defaultSortKeys", null);
        setField(term101002, term101002.getClass(), "unsortableColumns", null);
        setField(term101002, term101002.getClass(), "nodeComparator", null);
        setField(term101002, term101002.getClass(), "sortStrategy", null);
        setField(term101002, term101002.getClass(), "viewToModelIndex", null);
        setField(term101002, term101002.getClass(), "modelToViewIndex", null);
        setIntField(term101002, term101002.getClass(), "lastRowCount", 0);
        setBooleanField(term101002, term101002.getClass(), "rebuildIndices", false);
        setField(term101002, term101002.getClass(), "listenerList", null);
        setField(term101001, term101001.getClass(), "rowSorter", term101002);
        setIntField(term101001, term101001.getClass(), "modelIndex", 298082829);
        setElement(term100967, 2, term101001);
        setField(term101007, term101007.getClass(), "model", null);
        setField(term101007, term101007.getClass(), "sortKeys", null);
        setField(term101007, term101007.getClass(), "defaultSortKeys", null);
        setField(term101007, term101007.getClass(), "unsortableColumns", null);
        setField(term101007, term101007.getClass(), "nodeComparator", null);
        setField(term101007, term101007.getClass(), "sortStrategy", null);
        setField(term101007, term101007.getClass(), "viewToModelIndex", null);
        setField(term101007, term101007.getClass(), "modelToViewIndex", null);
        setIntField(term101007, term101007.getClass(), "lastRowCount", 0);
        setBooleanField(term101007, term101007.getClass(), "rebuildIndices", false);
        setField(term101007, term101007.getClass(), "listenerList", null);
        setField(term101006, term101006.getClass(), "rowSorter", term101007);
        setIntField(term101006, term101006.getClass(), "modelIndex", -1494372780);
        setElement(term100967, 3, term101006);
        setField(term100931, term100931.getClass(), "viewToModelIndex", term100967);
        setIntElement(term101011, 0, 703799187);
        setIntElement(term101011, 1, -1305898281);
        setIntElement(term101011, 2, 140501130);
        setField(term100931, term100931.getClass(), "modelToViewIndex", term101011);
        setIntField(term100931, term100931.getClass(), "lastRowCount", -1458890291);
        setBooleanField(term100931, term100931.getClass(), "rebuildIndices", false);
        setField(term101017, term101017.getClass(), "listenerList", term101018);
        setField(term100931, term100931.getClass(), "listenerList", term101017);
        term101019 = new Integer(1016087323);
        term101021 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term101019;
        args[1] = term101021;
        callMethod(klass, "setSortable", argTypes, term100931, args);
    }

};


