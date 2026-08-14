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

public class TreeTableRowSorter_findPreviousInsertionViewIndex_83522442247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103890;
     Object term103965;
     Object term103967;

    public TreeTableRowSorter_findPreviousInsertionViewIndex_83522442247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term103893 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term103895 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term103893, term103893.getClass(), "column", -515631808);
        setField(term103895, term103895.getClass(), "name", null);
        setIntField(term103895, term103895.getClass(), "ordinal", 1);
        setField(term103893, term103893.getClass(), "sortOrder", term103895);
        Object term103897 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term103897, term103897.getClass(), "column", 1546701347);
        setField(term103897, term103897.getClass(), "sortOrder", term103895);
        Object term103899 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term103901 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term103899, term103899.getClass(), "column", -111931851);
        setField(term103901, term103901.getClass(), "name", null);
        setIntField(term103901, term103901.getClass(), "ordinal", 2);
        setField(term103899, term103899.getClass(), "sortOrder", term103901);
        Object term103903 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term103905 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term103903, term103903.getClass(), "column", -251696516);
        setField(term103905, term103905.getClass(), "name", null);
        setIntField(term103905, term103905.getClass(), "ordinal", 0);
        setField(term103903, term103903.getClass(), "sortOrder", term103905);
        Object term103907 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term103907, term103907.getClass(), "column", 1075321384);
        setField(term103907, term103907.getClass(), "sortOrder", term103905);
        Object term103909 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term103909, term103909.getClass(), "column", -1726073541);
        setField(term103909, term103909.getClass(), "sortOrder", term103901);
        Object term103911 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term103911, term103911.getClass(), "column", 406945977);
        setField(term103911, term103911.getClass(), "sortOrder", term103905);
        ArrayList term103891 = new ArrayList();
        ((ArrayList) term103891).add(term103893);
        ((ArrayList) term103891).add(term103897);
        ((ArrayList) term103891).add(term103899);
        ((ArrayList) term103891).add(term103903);
        ((ArrayList) term103891).add(term103907);
        ((ArrayList) term103891).add(term103909);
        ((ArrayList) term103891).add(term103911);
        ArrayList term103915 = new ArrayList();
        HashMap term103920 = new HashMap();
        Set<Object> term103969 =  ((Map) term103920).keySet();
        HashSet term103919 = new HashSet((Collection<? extends Object>) term103969);
        ArrayList term103928 = new ArrayList();
        ((ArrayList) term103928).add((Object)null);
        ArrayList term103931 = new ArrayList();
        HashSet term103934 = new HashSet();
        ArrayList term103943 = new ArrayList();
        ((ArrayList) term103943).add((Object)null);
        ((ArrayList) term103943).add((Object)null);
        ArrayList term103946 = new ArrayList();
        HashSet term103949 = new HashSet();
        term103890 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term103925 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 2);
        Object term103926 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term103927 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term103935 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 5);
        int[] term103936 = (int[]) newIntArray(0);
        Object term103939 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term103941 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term103942 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term103953 = (int[]) newIntArray(7);
        Object term103963 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term103964 = (Object[]) newArray("java.lang.Object", 0);
        setField(term103890, term103890.getClass(), "model", null);
        setField(term103890, term103890.getClass(), "sortKeys", term103891);
        setField(term103890, term103890.getClass(), "defaultSortKeys", term103915);
        setField(term103890, term103890.getClass(), "unsortableColumns", term103919);
        setField(term103890, term103890.getClass(), "nodeComparator", null);
        setField(term103890, term103890.getClass(), "sortStrategy", null);
        setField(term103927, term103927.getClass(), "model", null);
        setField(term103927, term103927.getClass(), "sortKeys", term103928);
        setField(term103927, term103927.getClass(), "defaultSortKeys", term103931);
        setField(term103927, term103927.getClass(), "unsortableColumns", term103934);
        setField(term103927, term103927.getClass(), "nodeComparator", null);
        setField(term103927, term103927.getClass(), "sortStrategy", null);
        setField(term103927, term103927.getClass(), "viewToModelIndex", term103935);
        setField(term103927, term103927.getClass(), "modelToViewIndex", term103936);
        setIntField(term103927, term103927.getClass(), "lastRowCount", 464966803);
        setBooleanField(term103927, term103927.getClass(), "rebuildIndices", true);
        setField(term103939, term103939.getClass(), "listenerList", null);
        setField(term103927, term103927.getClass(), "listenerList", term103939);
        setField(term103926, term103926.getClass(), "rowSorter", term103927);
        setIntField(term103926, term103926.getClass(), "modelIndex", -246618392);
        setElement(term103925, 0, term103926);
        setField(term103942, term103942.getClass(), "model", null);
        setField(term103942, term103942.getClass(), "sortKeys", term103943);
        setField(term103942, term103942.getClass(), "defaultSortKeys", term103946);
        setField(term103942, term103942.getClass(), "unsortableColumns", term103949);
        setField(term103942, term103942.getClass(), "nodeComparator", null);
        setField(term103942, term103942.getClass(), "sortStrategy", null);
        setField(term103942, term103942.getClass(), "viewToModelIndex", null);
        setField(term103942, term103942.getClass(), "modelToViewIndex", null);
        setIntField(term103942, term103942.getClass(), "lastRowCount", 0);
        setBooleanField(term103942, term103942.getClass(), "rebuildIndices", false);
        setField(term103942, term103942.getClass(), "listenerList", null);
        setField(term103941, term103941.getClass(), "rowSorter", term103942);
        setIntField(term103941, term103941.getClass(), "modelIndex", 1472246167);
        setElement(term103925, 1, term103941);
        setField(term103890, term103890.getClass(), "viewToModelIndex", term103925);
        setIntElement(term103953, 0, 1008555478);
        setIntElement(term103953, 1, 1346386442);
        setIntElement(term103953, 2, 1904559758);
        setIntElement(term103953, 3, 610850630);
        setIntElement(term103953, 4, 170509161);
        setIntElement(term103953, 5, 491497994);
        setIntElement(term103953, 6, 1997288643);
        setField(term103890, term103890.getClass(), "modelToViewIndex", term103953);
        setIntField(term103890, term103890.getClass(), "lastRowCount", -378961519);
        setBooleanField(term103890, term103890.getClass(), "rebuildIndices", false);
        setField(term103963, term103963.getClass(), "listenerList", term103964);
        setField(term103890, term103890.getClass(), "listenerList", term103963);
        term103965 = new Integer(-400280008);
        term103967 = new Integer(-1191957775);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("javax.swing.tree.TreeNode");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term103965;
        args[2] = term103967;
        callMethod(klass, "findPreviousInsertionViewIndex", argTypes, term103890, args);
    }

};


