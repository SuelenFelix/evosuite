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

public class TreeTableRowSorter_sort_69210756733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102918;

    public TreeTableRowSorter_sort_69210756733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term102921 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term102923 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term102921, term102921.getClass(), "column", -1308902065);
        setField(term102923, term102923.getClass(), "name", null);
        setIntField(term102923, term102923.getClass(), "ordinal", 2);
        setField(term102921, term102921.getClass(), "sortOrder", term102923);
        Object term102925 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term102927 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term102925, term102925.getClass(), "column", 605255795);
        setField(term102927, term102927.getClass(), "name", null);
        setIntField(term102927, term102927.getClass(), "ordinal", 1);
        setField(term102925, term102925.getClass(), "sortOrder", term102927);
        ArrayList term102919 = new ArrayList();
        ((ArrayList) term102919).add(term102921);
        ((ArrayList) term102919).add(term102925);
        ArrayList term102931 = new ArrayList();
        HashMap term102936 = new HashMap();
        Set<Object> term103007 =  ((Map) term102936).keySet();
        HashSet term102935 = new HashSet((Collection<? extends Object>) term103007);
        ArrayList term102961 = new ArrayList();
        ArrayList term102964 = new ArrayList();
        HashSet term102967 = new HashSet();
        term102918 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term102958 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 8);
        Object term102959 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term102960 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term102968 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 8);
        int[] term102969 = (int[]) newIntArray(3);
        Object term102975 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term102977 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term102978 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term102982 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term102983 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term102987 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term102988 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term102992 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term102993 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term102997 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term102998 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term103002 = (int[]) newIntArray(0);
        Object term103005 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term103006 = (Object[]) newArray("java.lang.Object", 0);
        setField(term102918, term102918.getClass(), "model", null);
        setField(term102918, term102918.getClass(), "sortKeys", term102919);
        setField(term102918, term102918.getClass(), "defaultSortKeys", term102931);
        setField(term102918, term102918.getClass(), "unsortableColumns", term102935);
        setField(term102918, term102918.getClass(), "nodeComparator", null);
        setField(term102918, term102918.getClass(), "sortStrategy", null);
        setField(term102960, term102960.getClass(), "model", null);
        setField(term102960, term102960.getClass(), "sortKeys", term102961);
        setField(term102960, term102960.getClass(), "defaultSortKeys", term102964);
        setField(term102960, term102960.getClass(), "unsortableColumns", term102967);
        setField(term102960, term102960.getClass(), "nodeComparator", null);
        setField(term102960, term102960.getClass(), "sortStrategy", null);
        setField(term102960, term102960.getClass(), "viewToModelIndex", term102968);
        setIntElement(term102969, 0, -432987116);
        setIntElement(term102969, 1, 1483499310);
        setIntElement(term102969, 2, -1516568587);
        setField(term102960, term102960.getClass(), "modelToViewIndex", term102969);
        setIntField(term102960, term102960.getClass(), "lastRowCount", 1537690170);
        setBooleanField(term102960, term102960.getClass(), "rebuildIndices", false);
        setField(term102975, term102975.getClass(), "listenerList", null);
        setField(term102960, term102960.getClass(), "listenerList", term102975);
        setField(term102959, term102959.getClass(), "rowSorter", term102960);
        setIntField(term102959, term102959.getClass(), "modelIndex", 1133116994);
        setElement(term102958, 0, term102959);
        setField(term102978, term102978.getClass(), "model", null);
        setField(term102978, term102978.getClass(), "sortKeys", null);
        setField(term102978, term102978.getClass(), "defaultSortKeys", null);
        setField(term102978, term102978.getClass(), "unsortableColumns", null);
        setField(term102978, term102978.getClass(), "nodeComparator", null);
        setField(term102978, term102978.getClass(), "sortStrategy", null);
        setField(term102978, term102978.getClass(), "viewToModelIndex", null);
        setField(term102978, term102978.getClass(), "modelToViewIndex", null);
        setIntField(term102978, term102978.getClass(), "lastRowCount", 0);
        setBooleanField(term102978, term102978.getClass(), "rebuildIndices", false);
        setField(term102978, term102978.getClass(), "listenerList", null);
        setField(term102977, term102977.getClass(), "rowSorter", term102978);
        setIntField(term102977, term102977.getClass(), "modelIndex", -1195191239);
        setElement(term102958, 1, term102977);
        setField(term102983, term102983.getClass(), "model", null);
        setField(term102983, term102983.getClass(), "sortKeys", null);
        setField(term102983, term102983.getClass(), "defaultSortKeys", null);
        setField(term102983, term102983.getClass(), "unsortableColumns", null);
        setField(term102983, term102983.getClass(), "nodeComparator", null);
        setField(term102983, term102983.getClass(), "sortStrategy", null);
        setField(term102983, term102983.getClass(), "viewToModelIndex", null);
        setField(term102983, term102983.getClass(), "modelToViewIndex", null);
        setIntField(term102983, term102983.getClass(), "lastRowCount", 0);
        setBooleanField(term102983, term102983.getClass(), "rebuildIndices", false);
        setField(term102983, term102983.getClass(), "listenerList", null);
        setField(term102982, term102982.getClass(), "rowSorter", term102983);
        setIntField(term102982, term102982.getClass(), "modelIndex", -1482530168);
        setElement(term102958, 2, term102982);
        setElement(term102958, 3, term102959);
        setField(term102988, term102988.getClass(), "model", null);
        setField(term102988, term102988.getClass(), "sortKeys", null);
        setField(term102988, term102988.getClass(), "defaultSortKeys", null);
        setField(term102988, term102988.getClass(), "unsortableColumns", null);
        setField(term102988, term102988.getClass(), "nodeComparator", null);
        setField(term102988, term102988.getClass(), "sortStrategy", null);
        setField(term102988, term102988.getClass(), "viewToModelIndex", null);
        setField(term102988, term102988.getClass(), "modelToViewIndex", null);
        setIntField(term102988, term102988.getClass(), "lastRowCount", 0);
        setBooleanField(term102988, term102988.getClass(), "rebuildIndices", false);
        setField(term102988, term102988.getClass(), "listenerList", null);
        setField(term102987, term102987.getClass(), "rowSorter", term102988);
        setIntField(term102987, term102987.getClass(), "modelIndex", 1462297654);
        setElement(term102958, 4, term102987);
        setField(term102993, term102993.getClass(), "model", null);
        setField(term102993, term102993.getClass(), "sortKeys", null);
        setField(term102993, term102993.getClass(), "defaultSortKeys", null);
        setField(term102993, term102993.getClass(), "unsortableColumns", null);
        setField(term102993, term102993.getClass(), "nodeComparator", null);
        setField(term102993, term102993.getClass(), "sortStrategy", null);
        setField(term102993, term102993.getClass(), "viewToModelIndex", null);
        setField(term102993, term102993.getClass(), "modelToViewIndex", null);
        setIntField(term102993, term102993.getClass(), "lastRowCount", 0);
        setBooleanField(term102993, term102993.getClass(), "rebuildIndices", false);
        setField(term102993, term102993.getClass(), "listenerList", null);
        setField(term102992, term102992.getClass(), "rowSorter", term102993);
        setIntField(term102992, term102992.getClass(), "modelIndex", -2147297900);
        setElement(term102958, 5, term102992);
        setField(term102998, term102998.getClass(), "model", null);
        setField(term102998, term102998.getClass(), "sortKeys", null);
        setField(term102998, term102998.getClass(), "defaultSortKeys", null);
        setField(term102998, term102998.getClass(), "unsortableColumns", null);
        setField(term102998, term102998.getClass(), "nodeComparator", null);
        setField(term102998, term102998.getClass(), "sortStrategy", null);
        setField(term102998, term102998.getClass(), "viewToModelIndex", null);
        setField(term102998, term102998.getClass(), "modelToViewIndex", null);
        setIntField(term102998, term102998.getClass(), "lastRowCount", 0);
        setBooleanField(term102998, term102998.getClass(), "rebuildIndices", false);
        setField(term102998, term102998.getClass(), "listenerList", null);
        setField(term102997, term102997.getClass(), "rowSorter", term102998);
        setIntField(term102997, term102997.getClass(), "modelIndex", 1743438307);
        setElement(term102958, 6, term102997);
        setElement(term102958, 7, term102997);
        setField(term102918, term102918.getClass(), "viewToModelIndex", term102958);
        setField(term102918, term102918.getClass(), "modelToViewIndex", term103002);
        setIntField(term102918, term102918.getClass(), "lastRowCount", -470798982);
        setBooleanField(term102918, term102918.getClass(), "rebuildIndices", false);
        setField(term103005, term103005.getClass(), "listenerList", term103006);
        setField(term102918, term102918.getClass(), "listenerList", term103005);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "sort", argTypes, term102918, args);
    }

};


