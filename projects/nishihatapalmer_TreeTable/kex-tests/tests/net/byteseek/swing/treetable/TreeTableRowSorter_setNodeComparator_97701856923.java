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

public class TreeTableRowSorter_setNodeComparator_97701856923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101826;

    public TreeTableRowSorter_setNodeComparator_97701856923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term101829 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term101831 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term101829, term101829.getClass(), "column", -1235127374);
        setField(term101831, term101831.getClass(), "name", null);
        setIntField(term101831, term101831.getClass(), "ordinal", 0);
        setField(term101829, term101829.getClass(), "sortOrder", term101831);
        Object term101833 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term101835 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term101833, term101833.getClass(), "column", -2077814162);
        setField(term101835, term101835.getClass(), "name", null);
        setIntField(term101835, term101835.getClass(), "ordinal", 1);
        setField(term101833, term101833.getClass(), "sortOrder", term101835);
        Object term101837 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term101837, term101837.getClass(), "column", 444514470);
        setField(term101837, term101837.getClass(), "sortOrder", term101835);
        Object term101839 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term101841 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term101839, term101839.getClass(), "column", -147055177);
        setField(term101841, term101841.getClass(), "name", null);
        setIntField(term101841, term101841.getClass(), "ordinal", 2);
        setField(term101839, term101839.getClass(), "sortOrder", term101841);
        Object term101843 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term101843, term101843.getClass(), "column", 1979044375);
        setField(term101843, term101843.getClass(), "sortOrder", term101831);
        Object term101845 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term101845, term101845.getClass(), "column", 961252909);
        setField(term101845, term101845.getClass(), "sortOrder", term101835);
        Object term101847 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term101847, term101847.getClass(), "column", 1455842357);
        setField(term101847, term101847.getClass(), "sortOrder", term101835);
        Object term101849 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term101849, term101849.getClass(), "column", 1349806561);
        setField(term101849, term101849.getClass(), "sortOrder", term101835);
        Object term101851 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term101851, term101851.getClass(), "column", 923905351);
        setField(term101851, term101851.getClass(), "sortOrder", term101831);
        ArrayList term101827 = new ArrayList();
        ((ArrayList) term101827).add(term101829);
        ((ArrayList) term101827).add(term101833);
        ((ArrayList) term101827).add(term101837);
        ((ArrayList) term101827).add(term101839);
        ((ArrayList) term101827).add(term101843);
        ((ArrayList) term101827).add(term101845);
        ((ArrayList) term101827).add(term101847);
        ((ArrayList) term101827).add(term101849);
        ((ArrayList) term101827).add(term101851);
        ArrayList term101855 = new ArrayList();
        HashMap term101860 = new HashMap();
        Set<Object> term101913 =  ((Map) term101860).keySet();
        HashSet term101859 = new HashSet((Collection<? extends Object>) term101913);
        ArrayList term101885 = new ArrayList();
        ((ArrayList) term101885).add((Object)null);
        ((ArrayList) term101885).add((Object)null);
        ((ArrayList) term101885).add((Object)null);
        ((ArrayList) term101885).add((Object)null);
        ((ArrayList) term101885).add((Object)null);
        ((ArrayList) term101885).add((Object)null);
        ((ArrayList) term101885).add((Object)null);
        ((ArrayList) term101885).add((Object)null);
        ArrayList term101888 = new ArrayList();
        HashSet term101891 = new HashSet();
        term101826 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term101882 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 1);
        Object term101883 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term101884 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term101892 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 5);
        int[] term101893 = (int[]) newIntArray(4);
        Object term101900 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        int[] term101902 = (int[]) newIntArray(6);
        Object term101911 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term101912 = (Object[]) newArray("java.lang.Object", 0);
        setField(term101826, term101826.getClass(), "model", null);
        setField(term101826, term101826.getClass(), "sortKeys", term101827);
        setField(term101826, term101826.getClass(), "defaultSortKeys", term101855);
        setField(term101826, term101826.getClass(), "unsortableColumns", term101859);
        setField(term101826, term101826.getClass(), "nodeComparator", null);
        setField(term101826, term101826.getClass(), "sortStrategy", null);
        setField(term101884, term101884.getClass(), "model", null);
        setField(term101884, term101884.getClass(), "sortKeys", term101885);
        setField(term101884, term101884.getClass(), "defaultSortKeys", term101888);
        setField(term101884, term101884.getClass(), "unsortableColumns", term101891);
        setField(term101884, term101884.getClass(), "nodeComparator", null);
        setField(term101884, term101884.getClass(), "sortStrategy", null);
        setField(term101884, term101884.getClass(), "viewToModelIndex", term101892);
        setIntElement(term101893, 0, -784924879);
        setIntElement(term101893, 1, -1062027102);
        setIntElement(term101893, 2, 1763217806);
        setIntElement(term101893, 3, 1644949396);
        setField(term101884, term101884.getClass(), "modelToViewIndex", term101893);
        setIntField(term101884, term101884.getClass(), "lastRowCount", -2017073245);
        setBooleanField(term101884, term101884.getClass(), "rebuildIndices", false);
        setField(term101900, term101900.getClass(), "listenerList", null);
        setField(term101884, term101884.getClass(), "listenerList", term101900);
        setField(term101883, term101883.getClass(), "rowSorter", term101884);
        setIntField(term101883, term101883.getClass(), "modelIndex", 522440332);
        setElement(term101882, 0, term101883);
        setField(term101826, term101826.getClass(), "viewToModelIndex", term101882);
        setIntElement(term101902, 0, 1516598327);
        setIntElement(term101902, 1, 82353584);
        setIntElement(term101902, 2, -758778797);
        setIntElement(term101902, 3, 765680355);
        setIntElement(term101902, 4, -1012090049);
        setIntElement(term101902, 5, -2025214553);
        setField(term101826, term101826.getClass(), "modelToViewIndex", term101902);
        setIntField(term101826, term101826.getClass(), "lastRowCount", -154750730);
        setBooleanField(term101826, term101826.getClass(), "rebuildIndices", true);
        setField(term101911, term101911.getClass(), "listenerList", term101912);
        setField(term101826, term101826.getClass(), "listenerList", term101911);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setNodeComparator", argTypes, term101826, args);
    }

};


