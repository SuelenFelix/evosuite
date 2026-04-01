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

public class TreeTableRowSorter_getSortStrategy_98844769924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101924;

    public TreeTableRowSorter_getSortStrategy_98844769924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term101927 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term101929 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term101927, term101927.getClass(), "column", -2047179134);
        setField(term101929, term101929.getClass(), "name", null);
        setIntField(term101929, term101929.getClass(), "ordinal", 2);
        setField(term101927, term101927.getClass(), "sortOrder", term101929);
        Object term101931 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term101933 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term101931, term101931.getClass(), "column", 44908093);
        setField(term101933, term101933.getClass(), "name", null);
        setIntField(term101933, term101933.getClass(), "ordinal", 1);
        setField(term101931, term101931.getClass(), "sortOrder", term101933);
        Object term101935 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term101935, term101935.getClass(), "column", 887198203);
        setField(term101935, term101935.getClass(), "sortOrder", term101929);
        Object term101937 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term101939 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term101937, term101937.getClass(), "column", 12581312);
        setField(term101939, term101939.getClass(), "name", null);
        setIntField(term101939, term101939.getClass(), "ordinal", 0);
        setField(term101937, term101937.getClass(), "sortOrder", term101939);
        Object term101941 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term101941, term101941.getClass(), "column", 2087383644);
        setField(term101941, term101941.getClass(), "sortOrder", term101939);
        Object term101943 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term101943, term101943.getClass(), "column", 405527523);
        setField(term101943, term101943.getClass(), "sortOrder", term101929);
        Object term101945 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term101945, term101945.getClass(), "column", -1123526433);
        setField(term101945, term101945.getClass(), "sortOrder", term101933);
        ArrayList term101925 = new ArrayList();
        ((ArrayList) term101925).add(term101927);
        ((ArrayList) term101925).add(term101931);
        ((ArrayList) term101925).add(term101935);
        ((ArrayList) term101925).add(term101937);
        ((ArrayList) term101925).add(term101941);
        ((ArrayList) term101925).add(term101943);
        ((ArrayList) term101925).add(term101945);
        ArrayList term101949 = new ArrayList();
        HashMap term101954 = new HashMap();
        Set<Object> term102017 =  ((Map) term101954).keySet();
        HashSet term101953 = new HashSet((Collection<? extends Object>) term102017);
        ArrayList term101975 = new ArrayList();
        ((ArrayList) term101975).add((Object)null);
        ((ArrayList) term101975).add((Object)null);
        ((ArrayList) term101975).add((Object)null);
        ((ArrayList) term101975).add((Object)null);
        ArrayList term101978 = new ArrayList();
        HashSet term101981 = new HashSet();
        ArrayList term101994 = new ArrayList();
        ((ArrayList) term101994).add((Object)null);
        ((ArrayList) term101994).add((Object)null);
        ((ArrayList) term101994).add((Object)null);
        ((ArrayList) term101994).add((Object)null);
        ((ArrayList) term101994).add((Object)null);
        ((ArrayList) term101994).add((Object)null);
        ((ArrayList) term101994).add((Object)null);
        ArrayList term101997 = new ArrayList();
        HashSet term102000 = new HashSet();
        term101924 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term101972 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 3);
        Object term101973 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term101974 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term101982 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 0);
        int[] term101983 = (int[]) newIntArray(4);
        Object term101990 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term101992 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term101993 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term102004 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term102005 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term102009 = (int[]) newIntArray(3);
        Object term102015 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term102016 = (Object[]) newArray("java.lang.Object", 0);
        setField(term101924, term101924.getClass(), "model", null);
        setField(term101924, term101924.getClass(), "sortKeys", term101925);
        setField(term101924, term101924.getClass(), "defaultSortKeys", term101949);
        setField(term101924, term101924.getClass(), "unsortableColumns", term101953);
        setField(term101924, term101924.getClass(), "nodeComparator", null);
        setField(term101924, term101924.getClass(), "sortStrategy", null);
        setField(term101974, term101974.getClass(), "model", null);
        setField(term101974, term101974.getClass(), "sortKeys", term101975);
        setField(term101974, term101974.getClass(), "defaultSortKeys", term101978);
        setField(term101974, term101974.getClass(), "unsortableColumns", term101981);
        setField(term101974, term101974.getClass(), "nodeComparator", null);
        setField(term101974, term101974.getClass(), "sortStrategy", null);
        setField(term101974, term101974.getClass(), "viewToModelIndex", term101982);
        setIntElement(term101983, 0, -329141819);
        setIntElement(term101983, 1, -963204620);
        setIntElement(term101983, 2, 172898580);
        setIntElement(term101983, 3, -777833461);
        setField(term101974, term101974.getClass(), "modelToViewIndex", term101983);
        setIntField(term101974, term101974.getClass(), "lastRowCount", 1583691829);
        setBooleanField(term101974, term101974.getClass(), "rebuildIndices", false);
        setField(term101990, term101990.getClass(), "listenerList", null);
        setField(term101974, term101974.getClass(), "listenerList", term101990);
        setField(term101973, term101973.getClass(), "rowSorter", term101974);
        setIntField(term101973, term101973.getClass(), "modelIndex", -1468541076);
        setElement(term101972, 0, term101973);
        setField(term101993, term101993.getClass(), "model", null);
        setField(term101993, term101993.getClass(), "sortKeys", term101994);
        setField(term101993, term101993.getClass(), "defaultSortKeys", term101997);
        setField(term101993, term101993.getClass(), "unsortableColumns", term102000);
        setField(term101993, term101993.getClass(), "nodeComparator", null);
        setField(term101993, term101993.getClass(), "sortStrategy", null);
        setField(term101993, term101993.getClass(), "viewToModelIndex", null);
        setField(term101993, term101993.getClass(), "modelToViewIndex", null);
        setIntField(term101993, term101993.getClass(), "lastRowCount", 0);
        setBooleanField(term101993, term101993.getClass(), "rebuildIndices", false);
        setField(term101993, term101993.getClass(), "listenerList", null);
        setField(term101992, term101992.getClass(), "rowSorter", term101993);
        setIntField(term101992, term101992.getClass(), "modelIndex", -1796760393);
        setElement(term101972, 1, term101992);
        setField(term102005, term102005.getClass(), "model", null);
        setField(term102005, term102005.getClass(), "sortKeys", null);
        setField(term102005, term102005.getClass(), "defaultSortKeys", null);
        setField(term102005, term102005.getClass(), "unsortableColumns", null);
        setField(term102005, term102005.getClass(), "nodeComparator", null);
        setField(term102005, term102005.getClass(), "sortStrategy", null);
        setField(term102005, term102005.getClass(), "viewToModelIndex", null);
        setField(term102005, term102005.getClass(), "modelToViewIndex", null);
        setIntField(term102005, term102005.getClass(), "lastRowCount", 0);
        setBooleanField(term102005, term102005.getClass(), "rebuildIndices", false);
        setField(term102005, term102005.getClass(), "listenerList", null);
        setField(term102004, term102004.getClass(), "rowSorter", term102005);
        setIntField(term102004, term102004.getClass(), "modelIndex", -2099267271);
        setElement(term101972, 2, term102004);
        setField(term101924, term101924.getClass(), "viewToModelIndex", term101972);
        setIntElement(term102009, 0, 1134565344);
        setIntElement(term102009, 1, -1747434000);
        setIntElement(term102009, 2, 1611620166);
        setField(term101924, term101924.getClass(), "modelToViewIndex", term102009);
        setIntField(term101924, term101924.getClass(), "lastRowCount", 249657454);
        setBooleanField(term101924, term101924.getClass(), "rebuildIndices", false);
        setField(term102015, term102015.getClass(), "listenerList", term102016);
        setField(term101924, term101924.getClass(), "listenerList", term102015);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSortStrategy", argTypes, term101924, args);
    }

};


