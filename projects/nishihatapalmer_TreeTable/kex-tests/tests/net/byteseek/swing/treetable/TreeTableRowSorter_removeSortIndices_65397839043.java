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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Integer;

public class TreeTableRowSorter_removeSortIndices_65397839043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103835;
     Object term103905;
     Object term103907;

    public TreeTableRowSorter_removeSortIndices_65397839043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term103836 = new ArrayList();
        ArrayList term103840 = new ArrayList();
        HashMap term103845 = new HashMap();
        Set<Object> term103909 =  ((Map) term103845).keySet();
        HashSet term103844 = new HashSet((Collection<? extends Object>) term103909);
        ArrayList term103862 = new ArrayList();
        ((ArrayList) term103862).add((Object)null);
        ((ArrayList) term103862).add((Object)null);
        ((ArrayList) term103862).add((Object)null);
        ((ArrayList) term103862).add((Object)null);
        ((ArrayList) term103862).add((Object)null);
        ArrayList term103865 = new ArrayList();
        HashSet term103868 = new HashSet();
        term103835 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term103859 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 5);
        Object term103860 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term103861 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term103869 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 8);
        int[] term103870 = (int[]) newIntArray(7);
        Object term103880 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term103882 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term103883 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term103887 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term103888 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term103892 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term103893 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term103897 = (int[]) newIntArray(3);
        Object term103903 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term103904 = (Object[]) newArray("java.lang.Object", 0);
        setField(term103835, term103835.getClass(), "model", null);
        setField(term103835, term103835.getClass(), "sortKeys", term103836);
        setField(term103835, term103835.getClass(), "defaultSortKeys", term103840);
        setField(term103835, term103835.getClass(), "unsortableColumns", term103844);
        setField(term103835, term103835.getClass(), "nodeComparator", null);
        setField(term103835, term103835.getClass(), "sortStrategy", null);
        setField(term103861, term103861.getClass(), "model", null);
        setField(term103861, term103861.getClass(), "sortKeys", term103862);
        setField(term103861, term103861.getClass(), "defaultSortKeys", term103865);
        setField(term103861, term103861.getClass(), "unsortableColumns", term103868);
        setField(term103861, term103861.getClass(), "nodeComparator", null);
        setField(term103861, term103861.getClass(), "sortStrategy", null);
        setField(term103861, term103861.getClass(), "viewToModelIndex", term103869);
        setIntElement(term103870, 0, -1242133071);
        setIntElement(term103870, 1, -455052015);
        setIntElement(term103870, 2, -1322797287);
        setIntElement(term103870, 3, -615198242);
        setIntElement(term103870, 4, -491132382);
        setIntElement(term103870, 5, 918882916);
        setIntElement(term103870, 6, 1544012770);
        setField(term103861, term103861.getClass(), "modelToViewIndex", term103870);
        setIntField(term103861, term103861.getClass(), "lastRowCount", 1922068039);
        setBooleanField(term103861, term103861.getClass(), "rebuildIndices", true);
        setField(term103880, term103880.getClass(), "listenerList", null);
        setField(term103861, term103861.getClass(), "listenerList", term103880);
        setField(term103860, term103860.getClass(), "rowSorter", term103861);
        setIntField(term103860, term103860.getClass(), "modelIndex", -410564443);
        setElement(term103859, 0, term103860);
        setField(term103883, term103883.getClass(), "model", null);
        setField(term103883, term103883.getClass(), "sortKeys", null);
        setField(term103883, term103883.getClass(), "defaultSortKeys", null);
        setField(term103883, term103883.getClass(), "unsortableColumns", null);
        setField(term103883, term103883.getClass(), "nodeComparator", null);
        setField(term103883, term103883.getClass(), "sortStrategy", null);
        setField(term103883, term103883.getClass(), "viewToModelIndex", null);
        setField(term103883, term103883.getClass(), "modelToViewIndex", null);
        setIntField(term103883, term103883.getClass(), "lastRowCount", 0);
        setBooleanField(term103883, term103883.getClass(), "rebuildIndices", false);
        setField(term103883, term103883.getClass(), "listenerList", null);
        setField(term103882, term103882.getClass(), "rowSorter", term103883);
        setIntField(term103882, term103882.getClass(), "modelIndex", 996017434);
        setElement(term103859, 1, term103882);
        setField(term103888, term103888.getClass(), "model", null);
        setField(term103888, term103888.getClass(), "sortKeys", null);
        setField(term103888, term103888.getClass(), "defaultSortKeys", null);
        setField(term103888, term103888.getClass(), "unsortableColumns", null);
        setField(term103888, term103888.getClass(), "nodeComparator", null);
        setField(term103888, term103888.getClass(), "sortStrategy", null);
        setField(term103888, term103888.getClass(), "viewToModelIndex", null);
        setField(term103888, term103888.getClass(), "modelToViewIndex", null);
        setIntField(term103888, term103888.getClass(), "lastRowCount", 0);
        setBooleanField(term103888, term103888.getClass(), "rebuildIndices", false);
        setField(term103888, term103888.getClass(), "listenerList", null);
        setField(term103887, term103887.getClass(), "rowSorter", term103888);
        setIntField(term103887, term103887.getClass(), "modelIndex", -1811706962);
        setElement(term103859, 2, term103887);
        setElement(term103859, 3, term103860);
        setField(term103893, term103893.getClass(), "model", null);
        setField(term103893, term103893.getClass(), "sortKeys", null);
        setField(term103893, term103893.getClass(), "defaultSortKeys", null);
        setField(term103893, term103893.getClass(), "unsortableColumns", null);
        setField(term103893, term103893.getClass(), "nodeComparator", null);
        setField(term103893, term103893.getClass(), "sortStrategy", null);
        setField(term103893, term103893.getClass(), "viewToModelIndex", null);
        setField(term103893, term103893.getClass(), "modelToViewIndex", null);
        setIntField(term103893, term103893.getClass(), "lastRowCount", 0);
        setBooleanField(term103893, term103893.getClass(), "rebuildIndices", false);
        setField(term103893, term103893.getClass(), "listenerList", null);
        setField(term103892, term103892.getClass(), "rowSorter", term103893);
        setIntField(term103892, term103892.getClass(), "modelIndex", 522501050);
        setElement(term103859, 4, term103892);
        setField(term103835, term103835.getClass(), "viewToModelIndex", term103859);
        setIntElement(term103897, 0, -983870300);
        setIntElement(term103897, 1, 360715062);
        setIntElement(term103897, 2, 1047409266);
        setField(term103835, term103835.getClass(), "modelToViewIndex", term103897);
        setIntField(term103835, term103835.getClass(), "lastRowCount", 1427248961);
        setBooleanField(term103835, term103835.getClass(), "rebuildIndices", false);
        setField(term103903, term103903.getClass(), "listenerList", term103904);
        setField(term103835, term103835.getClass(), "listenerList", term103903);
        term103905 = new Integer(1445291866);
        term103907 = new Integer(-139927812);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term103905;
        args[1] = term103907;
        callMethod(klass, "removeSortIndices", argTypes, term103835, args);
    }

};


