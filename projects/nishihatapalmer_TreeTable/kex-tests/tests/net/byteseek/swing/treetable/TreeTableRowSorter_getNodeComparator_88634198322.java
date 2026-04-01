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

public class TreeTableRowSorter_getNodeComparator_88634198322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101704;

    public TreeTableRowSorter_getNodeComparator_88634198322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term101707 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term101709 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term101707, term101707.getClass(), "column", -1147965121);
        setField(term101709, term101709.getClass(), "name", null);
        setIntField(term101709, term101709.getClass(), "ordinal", 0);
        setField(term101707, term101707.getClass(), "sortOrder", term101709);
        Object term101711 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term101711, term101711.getClass(), "column", -867099093);
        setField(term101711, term101711.getClass(), "sortOrder", term101709);
        ArrayList term101705 = new ArrayList();
        ((ArrayList) term101705).add(term101707);
        ((ArrayList) term101705).add(term101711);
        ArrayList term101715 = new ArrayList();
        HashMap term101720 = new HashMap();
        Set<Object> term101808 =  ((Map) term101720).keySet();
        HashSet term101719 = new HashSet((Collection<? extends Object>) term101808);
        ArrayList term101753 = new ArrayList();
        ((ArrayList) term101753).add((Object)null);
        ((ArrayList) term101753).add((Object)null);
        ((ArrayList) term101753).add((Object)null);
        ((ArrayList) term101753).add((Object)null);
        ((ArrayList) term101753).add((Object)null);
        ((ArrayList) term101753).add((Object)null);
        ArrayList term101756 = new ArrayList();
        HashSet term101759 = new HashSet();
        term101704 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term101750 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 7);
        Object term101751 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term101752 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term101760 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 9);
        int[] term101761 = (int[]) newIntArray(9);
        Object term101773 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term101775 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term101776 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term101780 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term101781 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term101785 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term101786 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term101790 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term101791 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term101795 = (int[]) newIntArray(8);
        Object term101806 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term101807 = (Object[]) newArray("java.lang.Object", 0);
        setField(term101704, term101704.getClass(), "model", null);
        setField(term101704, term101704.getClass(), "sortKeys", term101705);
        setField(term101704, term101704.getClass(), "defaultSortKeys", term101715);
        setField(term101704, term101704.getClass(), "unsortableColumns", term101719);
        setField(term101704, term101704.getClass(), "nodeComparator", null);
        setField(term101704, term101704.getClass(), "sortStrategy", null);
        setField(term101752, term101752.getClass(), "model", null);
        setField(term101752, term101752.getClass(), "sortKeys", term101753);
        setField(term101752, term101752.getClass(), "defaultSortKeys", term101756);
        setField(term101752, term101752.getClass(), "unsortableColumns", term101759);
        setField(term101752, term101752.getClass(), "nodeComparator", null);
        setField(term101752, term101752.getClass(), "sortStrategy", null);
        setField(term101752, term101752.getClass(), "viewToModelIndex", term101760);
        setIntElement(term101761, 0, -1362132929);
        setIntElement(term101761, 1, 1267740164);
        setIntElement(term101761, 2, 1363887997);
        setIntElement(term101761, 3, -1744763945);
        setIntElement(term101761, 4, 852281447);
        setIntElement(term101761, 5, 1248430530);
        setIntElement(term101761, 6, -1911828505);
        setIntElement(term101761, 7, 241725499);
        setIntElement(term101761, 8, 823179298);
        setField(term101752, term101752.getClass(), "modelToViewIndex", term101761);
        setIntField(term101752, term101752.getClass(), "lastRowCount", 1174484848);
        setBooleanField(term101752, term101752.getClass(), "rebuildIndices", false);
        setField(term101773, term101773.getClass(), "listenerList", null);
        setField(term101752, term101752.getClass(), "listenerList", term101773);
        setField(term101751, term101751.getClass(), "rowSorter", term101752);
        setIntField(term101751, term101751.getClass(), "modelIndex", 939889496);
        setElement(term101750, 0, term101751);
        setField(term101776, term101776.getClass(), "model", null);
        setField(term101776, term101776.getClass(), "sortKeys", null);
        setField(term101776, term101776.getClass(), "defaultSortKeys", null);
        setField(term101776, term101776.getClass(), "unsortableColumns", null);
        setField(term101776, term101776.getClass(), "nodeComparator", null);
        setField(term101776, term101776.getClass(), "sortStrategy", null);
        setField(term101776, term101776.getClass(), "viewToModelIndex", null);
        setField(term101776, term101776.getClass(), "modelToViewIndex", null);
        setIntField(term101776, term101776.getClass(), "lastRowCount", 0);
        setBooleanField(term101776, term101776.getClass(), "rebuildIndices", false);
        setField(term101776, term101776.getClass(), "listenerList", null);
        setField(term101775, term101775.getClass(), "rowSorter", term101776);
        setIntField(term101775, term101775.getClass(), "modelIndex", -1671982964);
        setElement(term101750, 1, term101775);
        setElement(term101750, 2, term101751);
        setField(term101781, term101781.getClass(), "model", null);
        setField(term101781, term101781.getClass(), "sortKeys", null);
        setField(term101781, term101781.getClass(), "defaultSortKeys", null);
        setField(term101781, term101781.getClass(), "unsortableColumns", null);
        setField(term101781, term101781.getClass(), "nodeComparator", null);
        setField(term101781, term101781.getClass(), "sortStrategy", null);
        setField(term101781, term101781.getClass(), "viewToModelIndex", null);
        setField(term101781, term101781.getClass(), "modelToViewIndex", null);
        setIntField(term101781, term101781.getClass(), "lastRowCount", 0);
        setBooleanField(term101781, term101781.getClass(), "rebuildIndices", false);
        setField(term101781, term101781.getClass(), "listenerList", null);
        setField(term101780, term101780.getClass(), "rowSorter", term101781);
        setIntField(term101780, term101780.getClass(), "modelIndex", 270928865);
        setElement(term101750, 3, term101780);
        setField(term101786, term101786.getClass(), "model", null);
        setField(term101786, term101786.getClass(), "sortKeys", null);
        setField(term101786, term101786.getClass(), "defaultSortKeys", null);
        setField(term101786, term101786.getClass(), "unsortableColumns", null);
        setField(term101786, term101786.getClass(), "nodeComparator", null);
        setField(term101786, term101786.getClass(), "sortStrategy", null);
        setField(term101786, term101786.getClass(), "viewToModelIndex", null);
        setField(term101786, term101786.getClass(), "modelToViewIndex", null);
        setIntField(term101786, term101786.getClass(), "lastRowCount", 0);
        setBooleanField(term101786, term101786.getClass(), "rebuildIndices", false);
        setField(term101786, term101786.getClass(), "listenerList", null);
        setField(term101785, term101785.getClass(), "rowSorter", term101786);
        setIntField(term101785, term101785.getClass(), "modelIndex", -435079567);
        setElement(term101750, 4, term101785);
        setField(term101791, term101791.getClass(), "model", null);
        setField(term101791, term101791.getClass(), "sortKeys", null);
        setField(term101791, term101791.getClass(), "defaultSortKeys", null);
        setField(term101791, term101791.getClass(), "unsortableColumns", null);
        setField(term101791, term101791.getClass(), "nodeComparator", null);
        setField(term101791, term101791.getClass(), "sortStrategy", null);
        setField(term101791, term101791.getClass(), "viewToModelIndex", null);
        setField(term101791, term101791.getClass(), "modelToViewIndex", null);
        setIntField(term101791, term101791.getClass(), "lastRowCount", 0);
        setBooleanField(term101791, term101791.getClass(), "rebuildIndices", false);
        setField(term101791, term101791.getClass(), "listenerList", null);
        setField(term101790, term101790.getClass(), "rowSorter", term101791);
        setIntField(term101790, term101790.getClass(), "modelIndex", 2039815750);
        setElement(term101750, 5, term101790);
        setElement(term101750, 6, term101790);
        setField(term101704, term101704.getClass(), "viewToModelIndex", term101750);
        setIntElement(term101795, 0, -495242269);
        setIntElement(term101795, 1, 932810106);
        setIntElement(term101795, 2, -2138801137);
        setIntElement(term101795, 3, -1470115841);
        setIntElement(term101795, 4, 480909331);
        setIntElement(term101795, 5, -2024983877);
        setIntElement(term101795, 6, 1757149811);
        setIntElement(term101795, 7, 1505375686);
        setField(term101704, term101704.getClass(), "modelToViewIndex", term101795);
        setIntField(term101704, term101704.getClass(), "lastRowCount", -132005524);
        setBooleanField(term101704, term101704.getClass(), "rebuildIndices", true);
        setField(term101806, term101806.getClass(), "listenerList", term101807);
        setField(term101704, term101704.getClass(), "listenerList", term101806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNodeComparator", argTypes, term101704, args);
    }

};


