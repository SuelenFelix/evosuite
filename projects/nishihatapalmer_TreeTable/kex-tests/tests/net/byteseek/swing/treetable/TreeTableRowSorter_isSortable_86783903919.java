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
     Object term100829;
     Object term100919;

    public TreeTableRowSorter_isSortable_86783903919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term100832 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term100834 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term100832, term100832.getClass(), "column", 1134565344);
        setField(term100834, term100834.getClass(), "name", null);
        setIntField(term100834, term100834.getClass(), "ordinal", 0);
        setField(term100832, term100832.getClass(), "sortOrder", term100834);
        Object term100836 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term100836, term100836.getClass(), "column", -1747434000);
        setField(term100836, term100836.getClass(), "sortOrder", term100834);
        Object term100838 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term100838, term100838.getClass(), "column", 1611620166);
        setField(term100838, term100838.getClass(), "sortOrder", term100834);
        Object term100840 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term100842 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term100840, term100840.getClass(), "column", 249657454);
        setField(term100842, term100842.getClass(), "name", null);
        setIntField(term100842, term100842.getClass(), "ordinal", 2);
        setField(term100840, term100840.getClass(), "sortOrder", term100842);
        Object term100844 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term100844, term100844.getClass(), "column", 1734630901);
        setField(term100844, term100844.getClass(), "sortOrder", term100834);
        Object term100846 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term100848 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term100846, term100846.getClass(), "column", -703815246);
        setField(term100848, term100848.getClass(), "name", null);
        setIntField(term100848, term100848.getClass(), "ordinal", 1);
        setField(term100846, term100846.getClass(), "sortOrder", term100848);
        Object term100850 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term100850, term100850.getClass(), "column", 157300746);
        setField(term100850, term100850.getClass(), "sortOrder", term100842);
        ArrayList term100830 = new ArrayList();
        ((ArrayList) term100830).add(term100832);
        ((ArrayList) term100830).add(term100836);
        ((ArrayList) term100830).add(term100838);
        ((ArrayList) term100830).add(term100840);
        ((ArrayList) term100830).add(term100844);
        ((ArrayList) term100830).add(term100846);
        ((ArrayList) term100830).add(term100850);
        ArrayList term100854 = new ArrayList();
        HashMap term100859 = new HashMap();
        Set<Object> term100921 =  ((Map) term100859).keySet();
        HashSet term100858 = new HashSet((Collection<? extends Object>) term100921);
        ArrayList term100880 = new ArrayList();
        ((ArrayList) term100880).add((Object)null);
        ((ArrayList) term100880).add((Object)null);
        ((ArrayList) term100880).add((Object)null);
        ((ArrayList) term100880).add((Object)null);
        ((ArrayList) term100880).add((Object)null);
        ((ArrayList) term100880).add((Object)null);
        ArrayList term100883 = new ArrayList();
        HashSet term100886 = new HashSet();
        ArrayList term100902 = new ArrayList();
        ((ArrayList) term100902).add((Object)null);
        ((ArrayList) term100902).add((Object)null);
        ((ArrayList) term100902).add((Object)null);
        ArrayList term100905 = new ArrayList();
        HashSet term100908 = new HashSet();
        term100829 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term100877 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 2);
        Object term100878 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term100879 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term100887 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 0);
        int[] term100888 = (int[]) newIntArray(7);
        Object term100898 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term100900 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term100901 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term100912 = (int[]) newIntArray(2);
        Object term100917 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term100918 = (Object[]) newArray("java.lang.Object", 0);
        setField(term100829, term100829.getClass(), "model", null);
        setField(term100829, term100829.getClass(), "sortKeys", term100830);
        setField(term100829, term100829.getClass(), "defaultSortKeys", term100854);
        setField(term100829, term100829.getClass(), "unsortableColumns", term100858);
        setField(term100829, term100829.getClass(), "nodeComparator", null);
        setField(term100829, term100829.getClass(), "sortStrategy", null);
        setField(term100879, term100879.getClass(), "model", null);
        setField(term100879, term100879.getClass(), "sortKeys", term100880);
        setField(term100879, term100879.getClass(), "defaultSortKeys", term100883);
        setField(term100879, term100879.getClass(), "unsortableColumns", term100886);
        setField(term100879, term100879.getClass(), "nodeComparator", null);
        setField(term100879, term100879.getClass(), "sortStrategy", null);
        setField(term100879, term100879.getClass(), "viewToModelIndex", term100887);
        setIntElement(term100888, 0, 478422495);
        setIntElement(term100888, 1, 1727771237);
        setIntElement(term100888, 2, 2033663549);
        setIntElement(term100888, 3, 1766479154);
        setIntElement(term100888, 4, 533171496);
        setIntElement(term100888, 5, 1369020869);
        setIntElement(term100888, 6, -1428947021);
        setField(term100879, term100879.getClass(), "modelToViewIndex", term100888);
        setIntField(term100879, term100879.getClass(), "lastRowCount", -134324004);
        setBooleanField(term100879, term100879.getClass(), "rebuildIndices", false);
        setField(term100898, term100898.getClass(), "listenerList", null);
        setField(term100879, term100879.getClass(), "listenerList", term100898);
        setField(term100878, term100878.getClass(), "rowSorter", term100879);
        setIntField(term100878, term100878.getClass(), "modelIndex", -1813266173);
        setElement(term100877, 0, term100878);
        setField(term100901, term100901.getClass(), "model", null);
        setField(term100901, term100901.getClass(), "sortKeys", term100902);
        setField(term100901, term100901.getClass(), "defaultSortKeys", term100905);
        setField(term100901, term100901.getClass(), "unsortableColumns", term100908);
        setField(term100901, term100901.getClass(), "nodeComparator", null);
        setField(term100901, term100901.getClass(), "sortStrategy", null);
        setField(term100901, term100901.getClass(), "viewToModelIndex", null);
        setField(term100901, term100901.getClass(), "modelToViewIndex", null);
        setIntField(term100901, term100901.getClass(), "lastRowCount", 0);
        setBooleanField(term100901, term100901.getClass(), "rebuildIndices", false);
        setField(term100901, term100901.getClass(), "listenerList", null);
        setField(term100900, term100900.getClass(), "rowSorter", term100901);
        setIntField(term100900, term100900.getClass(), "modelIndex", -1201819537);
        setElement(term100877, 1, term100900);
        setField(term100829, term100829.getClass(), "viewToModelIndex", term100877);
        setIntElement(term100912, 0, 2135922049);
        setIntElement(term100912, 1, -263876378);
        setField(term100829, term100829.getClass(), "modelToViewIndex", term100912);
        setIntField(term100829, term100829.getClass(), "lastRowCount", -755209283);
        setBooleanField(term100829, term100829.getClass(), "rebuildIndices", false);
        setField(term100917, term100917.getClass(), "listenerList", term100918);
        setField(term100829, term100829.getClass(), "listenerList", term100917);
        term100919 = new Integer(-616562794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term100919;
        callMethod(klass, "isSortable", argTypes, term100829, args);
    }

};


