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

public class TreeTableRowSorter_setDefaultSortKeys_200268608627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101752;
     Object term101843;

    public TreeTableRowSorter_setDefaultSortKeys_200268608627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term101755 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term101757 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term101755, term101755.getClass(), "column", 1426800646);
        setField(term101757, term101757.getClass(), "name", null);
        setIntField(term101757, term101757.getClass(), "ordinal", 0);
        setField(term101755, term101755.getClass(), "sortOrder", term101757);
        Object term101759 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term101759, term101759.getClass(), "column", 954234820);
        setField(term101759, term101759.getClass(), "sortOrder", term101757);
        Object term101761 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term101761, term101761.getClass(), "column", 1047346538);
        setField(term101761, term101761.getClass(), "sortOrder", term101757);
        Object term101763 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term101763, term101763.getClass(), "column", 728436340);
        setField(term101763, term101763.getClass(), "sortOrder", term101757);
        Object term101765 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term101765, term101765.getClass(), "column", 1841731593);
        setField(term101765, term101765.getClass(), "sortOrder", term101757);
        Object term101767 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term101769 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term101767, term101767.getClass(), "column", -1854929057);
        setField(term101769, term101769.getClass(), "name", null);
        setIntField(term101769, term101769.getClass(), "ordinal", 2);
        setField(term101767, term101767.getClass(), "sortOrder", term101769);
        Object term101771 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term101771, term101771.getClass(), "column", 1703814701);
        setField(term101771, term101771.getClass(), "sortOrder", term101757);
        Object term101773 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term101773, term101773.getClass(), "column", 1370246522);
        setField(term101773, term101773.getClass(), "sortOrder", term101757);
        Object term101775 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term101775, term101775.getClass(), "column", -574611924);
        setField(term101775, term101775.getClass(), "sortOrder", term101757);
        ArrayList term101753 = new ArrayList();
        ((ArrayList) term101753).add(term101755);
        ((ArrayList) term101753).add(term101759);
        ((ArrayList) term101753).add(term101761);
        ((ArrayList) term101753).add(term101763);
        ((ArrayList) term101753).add(term101765);
        ((ArrayList) term101753).add(term101767);
        ((ArrayList) term101753).add(term101771);
        ((ArrayList) term101753).add(term101773);
        ((ArrayList) term101753).add(term101775);
        ArrayList term101779 = new ArrayList();
        HashMap term101784 = new HashMap();
        Set<Object> term101865 =  ((Map) term101784).keySet();
        HashSet term101783 = new HashSet((Collection<? extends Object>) term101865);
        ArrayList term101813 = new ArrayList();
        ((ArrayList) term101813).add((Object)null);
        ((ArrayList) term101813).add((Object)null);
        ((ArrayList) term101813).add((Object)null);
        ((ArrayList) term101813).add((Object)null);
        ((ArrayList) term101813).add((Object)null);
        ((ArrayList) term101813).add((Object)null);
        ((ArrayList) term101813).add((Object)null);
        ((ArrayList) term101813).add((Object)null);
        ArrayList term101816 = new ArrayList();
        HashSet term101819 = new HashSet();
        term101752 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term101810 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 1);
        Object term101811 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term101812 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term101820 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 8);
        int[] term101821 = (int[]) newIntArray(6);
        Object term101830 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        int[] term101832 = (int[]) newIntArray(6);
        Object term101841 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term101842 = (Object[]) newArray("java.lang.Object", 0);
        setField(term101752, term101752.getClass(), "model", null);
        setField(term101752, term101752.getClass(), "sortKeys", term101753);
        setField(term101752, term101752.getClass(), "defaultSortKeys", term101779);
        setField(term101752, term101752.getClass(), "unsortableColumns", term101783);
        setField(term101752, term101752.getClass(), "nodeComparator", null);
        setField(term101752, term101752.getClass(), "sortStrategy", null);
        setField(term101812, term101812.getClass(), "model", null);
        setField(term101812, term101812.getClass(), "sortKeys", term101813);
        setField(term101812, term101812.getClass(), "defaultSortKeys", term101816);
        setField(term101812, term101812.getClass(), "unsortableColumns", term101819);
        setField(term101812, term101812.getClass(), "nodeComparator", null);
        setField(term101812, term101812.getClass(), "sortStrategy", null);
        setField(term101812, term101812.getClass(), "viewToModelIndex", term101820);
        setIntElement(term101821, 0, 315910438);
        setIntElement(term101821, 1, -1673157821);
        setIntElement(term101821, 2, 1217804703);
        setIntElement(term101821, 3, -1981494102);
        setIntElement(term101821, 4, -2064148945);
        setIntElement(term101821, 5, 494400151);
        setField(term101812, term101812.getClass(), "modelToViewIndex", term101821);
        setIntField(term101812, term101812.getClass(), "lastRowCount", 1588058685);
        setBooleanField(term101812, term101812.getClass(), "rebuildIndices", false);
        setField(term101830, term101830.getClass(), "listenerList", null);
        setField(term101812, term101812.getClass(), "listenerList", term101830);
        setField(term101811, term101811.getClass(), "rowSorter", term101812);
        setIntField(term101811, term101811.getClass(), "modelIndex", 1677707412);
        setElement(term101810, 0, term101811);
        setField(term101752, term101752.getClass(), "viewToModelIndex", term101810);
        setIntElement(term101832, 0, -297367861);
        setIntElement(term101832, 1, -1133541490);
        setIntElement(term101832, 2, 942412391);
        setIntElement(term101832, 3, 751596480);
        setIntElement(term101832, 4, 1971485144);
        setIntElement(term101832, 5, 2059603512);
        setField(term101752, term101752.getClass(), "modelToViewIndex", term101832);
        setIntField(term101752, term101752.getClass(), "lastRowCount", -1308902065);
        setBooleanField(term101752, term101752.getClass(), "rebuildIndices", true);
        setField(term101841, term101841.getClass(), "listenerList", term101842);
        setField(term101752, term101752.getClass(), "listenerList", term101841);
        Object term101846 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term101848 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term101846, term101846.getClass(), "column", 605255795);
        setField(term101848, term101848.getClass(), "name", "");
        setIntField(term101848, term101848.getClass(), "ordinal", 1);
        setField(term101846, term101846.getClass(), "sortOrder", term101848);
        Object term101852 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term101852, term101852.getClass(), "column", 1743438307);
        setField(term101852, term101852.getClass(), "sortOrder", term101848);
        Object term101855 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term101855, term101855.getClass(), "column", -1122596893);
        setField(term101855, term101855.getClass(), "sortOrder", term101848);
        term101843 = new LinkedList();
        ((LinkedList) term101843).add(term101846);
        ((LinkedList) term101843).add(term101852);
        ((LinkedList) term101843).add(term101855);
        ((LinkedList) term101843).add((Object)null);
        ((LinkedList) term101843).add((Object)null);
        ((LinkedList) term101843).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term101843;
        callMethod(klass, "setDefaultSortKeys", argTypes, term101752, args);
    }

};


