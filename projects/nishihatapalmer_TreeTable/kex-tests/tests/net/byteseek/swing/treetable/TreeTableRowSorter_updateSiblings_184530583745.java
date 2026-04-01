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

public class TreeTableRowSorter_updateSiblings_184530583745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104048;
     Object term104131;

    public TreeTableRowSorter_updateSiblings_184530583745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term104051 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term104053 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term104051, term104051.getClass(), "column", -709130701);
        setField(term104053, term104053.getClass(), "name", null);
        setIntField(term104053, term104053.getClass(), "ordinal", 0);
        setField(term104051, term104051.getClass(), "sortOrder", term104053);
        Object term104055 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term104057 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term104055, term104055.getClass(), "column", 86144663);
        setField(term104057, term104057.getClass(), "name", null);
        setIntField(term104057, term104057.getClass(), "ordinal", 1);
        setField(term104055, term104055.getClass(), "sortOrder", term104057);
        Object term104059 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term104061 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term104059, term104059.getClass(), "column", -1480903995);
        setField(term104061, term104061.getClass(), "name", null);
        setIntField(term104061, term104061.getClass(), "ordinal", 2);
        setField(term104059, term104059.getClass(), "sortOrder", term104061);
        Object term104063 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term104063, term104063.getClass(), "column", -2111772603);
        setField(term104063, term104063.getClass(), "sortOrder", term104053);
        Object term104065 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term104065, term104065.getClass(), "column", 637942911);
        setField(term104065, term104065.getClass(), "sortOrder", term104057);
        Object term104067 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term104067, term104067.getClass(), "column", -395396657);
        setField(term104067, term104067.getClass(), "sortOrder", term104061);
        ArrayList term104049 = new ArrayList();
        ((ArrayList) term104049).add(term104051);
        ((ArrayList) term104049).add(term104055);
        ((ArrayList) term104049).add(term104059);
        ((ArrayList) term104049).add(term104063);
        ((ArrayList) term104049).add(term104065);
        ((ArrayList) term104049).add(term104067);
        ArrayList term104071 = new ArrayList();
        HashMap term104076 = new HashMap();
        Set<Object> term104133 =  ((Map) term104076).keySet();
        HashSet term104075 = new HashSet((Collection<? extends Object>) term104133);
        ArrayList term104089 = new ArrayList();
        ((ArrayList) term104089).add((Object)null);
        ((ArrayList) term104089).add((Object)null);
        ((ArrayList) term104089).add((Object)null);
        ((ArrayList) term104089).add((Object)null);
        ((ArrayList) term104089).add((Object)null);
        ((ArrayList) term104089).add((Object)null);
        ((ArrayList) term104089).add((Object)null);
        ((ArrayList) term104089).add((Object)null);
        ArrayList term104092 = new ArrayList();
        HashSet term104095 = new HashSet();
        ArrayList term104112 = new ArrayList();
        ((ArrayList) term104112).add((Object)null);
        ((ArrayList) term104112).add((Object)null);
        ((ArrayList) term104112).add((Object)null);
        ((ArrayList) term104112).add((Object)null);
        ((ArrayList) term104112).add((Object)null);
        ArrayList term104115 = new ArrayList();
        HashSet term104118 = new HashSet();
        term104048 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term104086 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 2);
        Object term104087 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term104088 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term104096 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 1);
        int[] term104097 = (int[]) newIntArray(8);
        Object term104108 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term104110 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term104111 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term104122 = (int[]) newIntArray(4);
        Object term104129 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term104130 = (Object[]) newArray("java.lang.Object", 0);
        setField(term104048, term104048.getClass(), "model", null);
        setField(term104048, term104048.getClass(), "sortKeys", term104049);
        setField(term104048, term104048.getClass(), "defaultSortKeys", term104071);
        setField(term104048, term104048.getClass(), "unsortableColumns", term104075);
        setField(term104048, term104048.getClass(), "nodeComparator", null);
        setField(term104048, term104048.getClass(), "sortStrategy", null);
        setField(term104088, term104088.getClass(), "model", null);
        setField(term104088, term104088.getClass(), "sortKeys", term104089);
        setField(term104088, term104088.getClass(), "defaultSortKeys", term104092);
        setField(term104088, term104088.getClass(), "unsortableColumns", term104095);
        setField(term104088, term104088.getClass(), "nodeComparator", null);
        setField(term104088, term104088.getClass(), "sortStrategy", null);
        setField(term104088, term104088.getClass(), "viewToModelIndex", term104096);
        setIntElement(term104097, 0, 145080354);
        setIntElement(term104097, 1, -2087321012);
        setIntElement(term104097, 2, -1613074612);
        setIntElement(term104097, 3, 1054908502);
        setIntElement(term104097, 4, -1226802566);
        setIntElement(term104097, 5, 1162813858);
        setIntElement(term104097, 6, 494596414);
        setIntElement(term104097, 7, 1226377461);
        setField(term104088, term104088.getClass(), "modelToViewIndex", term104097);
        setIntField(term104088, term104088.getClass(), "lastRowCount", -1540486514);
        setBooleanField(term104088, term104088.getClass(), "rebuildIndices", true);
        setField(term104108, term104108.getClass(), "listenerList", null);
        setField(term104088, term104088.getClass(), "listenerList", term104108);
        setField(term104087, term104087.getClass(), "rowSorter", term104088);
        setIntField(term104087, term104087.getClass(), "modelIndex", 1471031478);
        setElement(term104086, 0, term104087);
        setField(term104111, term104111.getClass(), "model", null);
        setField(term104111, term104111.getClass(), "sortKeys", term104112);
        setField(term104111, term104111.getClass(), "defaultSortKeys", term104115);
        setField(term104111, term104111.getClass(), "unsortableColumns", term104118);
        setField(term104111, term104111.getClass(), "nodeComparator", null);
        setField(term104111, term104111.getClass(), "sortStrategy", null);
        setField(term104111, term104111.getClass(), "viewToModelIndex", null);
        setField(term104111, term104111.getClass(), "modelToViewIndex", null);
        setIntField(term104111, term104111.getClass(), "lastRowCount", 0);
        setBooleanField(term104111, term104111.getClass(), "rebuildIndices", false);
        setField(term104111, term104111.getClass(), "listenerList", null);
        setField(term104110, term104110.getClass(), "rowSorter", term104111);
        setIntField(term104110, term104110.getClass(), "modelIndex", -334716487);
        setElement(term104086, 1, term104110);
        setField(term104048, term104048.getClass(), "viewToModelIndex", term104086);
        setIntElement(term104122, 0, -1739012814);
        setIntElement(term104122, 1, 1989014880);
        setIntElement(term104122, 2, -330280702);
        setIntElement(term104122, 3, -1858425735);
        setField(term104048, term104048.getClass(), "modelToViewIndex", term104122);
        setIntField(term104048, term104048.getClass(), "lastRowCount", 1818274550);
        setBooleanField(term104048, term104048.getClass(), "rebuildIndices", true);
        setField(term104129, term104129.getClass(), "listenerList", term104130);
        setField(term104048, term104048.getClass(), "listenerList", term104129);
        term104131 = new Integer(1044519085);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term104131;
        callMethod(klass, "updateSiblings", argTypes, term104048, args);
    }

};


