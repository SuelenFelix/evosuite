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

public class TreeTableRowSorter_createModelOrderRows_152621089337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102746;
     Object term102824;

    public TreeTableRowSorter_createModelOrderRows_152621089337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term102749 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term102751 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term102749, term102749.getClass(), "column", 61954667);
        setField(term102751, term102751.getClass(), "name", null);
        setIntField(term102751, term102751.getClass(), "ordinal", 0);
        setField(term102749, term102749.getClass(), "sortOrder", term102751);
        Object term102753 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term102755 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term102753, term102753.getClass(), "column", -919022885);
        setField(term102755, term102755.getClass(), "name", null);
        setIntField(term102755, term102755.getClass(), "ordinal", 2);
        setField(term102753, term102753.getClass(), "sortOrder", term102755);
        Object term102757 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term102759 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term102757, term102757.getClass(), "column", -1836286878);
        setField(term102759, term102759.getClass(), "name", null);
        setIntField(term102759, term102759.getClass(), "ordinal", 1);
        setField(term102757, term102757.getClass(), "sortOrder", term102759);
        Object term102761 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term102761, term102761.getClass(), "column", 276336694);
        setField(term102761, term102761.getClass(), "sortOrder", term102759);
        Object term102763 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term102763, term102763.getClass(), "column", 1627938506);
        setField(term102763, term102763.getClass(), "sortOrder", term102751);
        ArrayList term102747 = new ArrayList();
        ((ArrayList) term102747).add(term102749);
        ((ArrayList) term102747).add(term102753);
        ((ArrayList) term102747).add(term102757);
        ((ArrayList) term102747).add(term102761);
        ((ArrayList) term102747).add(term102763);
        ArrayList term102767 = new ArrayList();
        HashMap term102772 = new HashMap();
        Set<Object> term102826 =  ((Map) term102772).keySet();
        HashSet term102771 = new HashSet((Collection<? extends Object>) term102826);
        ArrayList term102797 = new ArrayList();
        ((ArrayList) term102797).add((Object)null);
        ((ArrayList) term102797).add((Object)null);
        ArrayList term102800 = new ArrayList();
        HashSet term102803 = new HashSet();
        term102746 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term102794 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 1);
        Object term102795 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term102796 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term102804 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 0);
        int[] term102805 = (int[]) newIntArray(6);
        Object term102814 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        int[] term102816 = (int[]) newIntArray(3);
        Object term102822 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term102823 = (Object[]) newArray("java.lang.Object", 0);
        setField(term102746, term102746.getClass(), "model", null);
        setField(term102746, term102746.getClass(), "sortKeys", term102747);
        setField(term102746, term102746.getClass(), "defaultSortKeys", term102767);
        setField(term102746, term102746.getClass(), "unsortableColumns", term102771);
        setField(term102746, term102746.getClass(), "nodeComparator", null);
        setField(term102746, term102746.getClass(), "sortStrategy", null);
        setField(term102796, term102796.getClass(), "model", null);
        setField(term102796, term102796.getClass(), "sortKeys", term102797);
        setField(term102796, term102796.getClass(), "defaultSortKeys", term102800);
        setField(term102796, term102796.getClass(), "unsortableColumns", term102803);
        setField(term102796, term102796.getClass(), "nodeComparator", null);
        setField(term102796, term102796.getClass(), "sortStrategy", null);
        setField(term102796, term102796.getClass(), "viewToModelIndex", term102804);
        setIntElement(term102805, 0, 198857801);
        setIntElement(term102805, 1, 1342884142);
        setIntElement(term102805, 2, -1454325068);
        setIntElement(term102805, 3, 346714653);
        setIntElement(term102805, 4, 2121928697);
        setIntElement(term102805, 5, -1741056571);
        setField(term102796, term102796.getClass(), "modelToViewIndex", term102805);
        setIntField(term102796, term102796.getClass(), "lastRowCount", 522501050);
        setBooleanField(term102796, term102796.getClass(), "rebuildIndices", true);
        setField(term102814, term102814.getClass(), "listenerList", null);
        setField(term102796, term102796.getClass(), "listenerList", term102814);
        setField(term102795, term102795.getClass(), "rowSorter", term102796);
        setIntField(term102795, term102795.getClass(), "modelIndex", 125432890);
        setElement(term102794, 0, term102795);
        setField(term102746, term102746.getClass(), "viewToModelIndex", term102794);
        setIntElement(term102816, 0, -197740561);
        setIntElement(term102816, 1, -1811706962);
        setIntElement(term102816, 2, -1242133071);
        setField(term102746, term102746.getClass(), "modelToViewIndex", term102816);
        setIntField(term102746, term102746.getClass(), "lastRowCount", -455052015);
        setBooleanField(term102746, term102746.getClass(), "rebuildIndices", true);
        setField(term102822, term102822.getClass(), "listenerList", term102823);
        setField(term102746, term102746.getClass(), "listenerList", term102822);
        term102824 = new Integer(-1322797287);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term102824;
        callMethod(klass, "createModelOrderRows", argTypes, term102746, args);
    }

};


