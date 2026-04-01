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

public class TreeTableRowSorter_buildViewToModelIndex_150161898434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103011;

    public TreeTableRowSorter_buildViewToModelIndex_150161898434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term103014 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term103016 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term103014, term103014.getClass(), "column", 1844345719);
        setField(term103016, term103016.getClass(), "name", null);
        setIntField(term103016, term103016.getClass(), "ordinal", 0);
        setField(term103014, term103014.getClass(), "sortOrder", term103016);
        Object term103018 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term103018, term103018.getClass(), "column", 1704024265);
        setField(term103018, term103018.getClass(), "sortOrder", term103016);
        Object term103020 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term103020, term103020.getClass(), "column", 501801161);
        setField(term103020, term103020.getClass(), "sortOrder", term103016);
        Object term103022 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term103024 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term103022, term103022.getClass(), "column", 2103971768);
        setField(term103024, term103024.getClass(), "name", null);
        setIntField(term103024, term103024.getClass(), "ordinal", 1);
        setField(term103022, term103022.getClass(), "sortOrder", term103024);
        ArrayList term103012 = new ArrayList();
        ((ArrayList) term103012).add(term103014);
        ((ArrayList) term103012).add(term103018);
        ((ArrayList) term103012).add(term103020);
        ((ArrayList) term103012).add(term103022);
        ArrayList term103028 = new ArrayList();
        HashMap term103033 = new HashMap();
        Set<Object> term103106 =  ((Map) term103033).keySet();
        HashSet term103032 = new HashSet((Collection<? extends Object>) term103106);
        ArrayList term103046 = new ArrayList();
        ((ArrayList) term103046).add((Object)null);
        ((ArrayList) term103046).add((Object)null);
        ((ArrayList) term103046).add((Object)null);
        ArrayList term103049 = new ArrayList();
        HashSet term103052 = new HashSet();
        ArrayList term103066 = new ArrayList();
        ArrayList term103069 = new ArrayList();
        HashSet term103072 = new HashSet();
        term103011 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term103043 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 8);
        Object term103044 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term103045 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term103053 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 4);
        int[] term103054 = (int[]) newIntArray(5);
        Object term103062 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term103064 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term103065 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term103076 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term103077 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term103081 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term103082 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term103086 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term103087 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term103091 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        int[] term103093 = (int[]) newIntArray(8);
        Object term103104 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term103105 = (Object[]) newArray("java.lang.Object", 0);
        setField(term103011, term103011.getClass(), "model", null);
        setField(term103011, term103011.getClass(), "sortKeys", term103012);
        setField(term103011, term103011.getClass(), "defaultSortKeys", term103028);
        setField(term103011, term103011.getClass(), "unsortableColumns", term103032);
        setField(term103011, term103011.getClass(), "nodeComparator", null);
        setField(term103011, term103011.getClass(), "sortStrategy", null);
        setField(term103045, term103045.getClass(), "model", null);
        setField(term103045, term103045.getClass(), "sortKeys", term103046);
        setField(term103045, term103045.getClass(), "defaultSortKeys", term103049);
        setField(term103045, term103045.getClass(), "unsortableColumns", term103052);
        setField(term103045, term103045.getClass(), "nodeComparator", null);
        setField(term103045, term103045.getClass(), "sortStrategy", null);
        setField(term103045, term103045.getClass(), "viewToModelIndex", term103053);
        setIntElement(term103054, 0, 1182911731);
        setIntElement(term103054, 1, 644726932);
        setIntElement(term103054, 2, -1515977761);
        setIntElement(term103054, 3, -1476037190);
        setIntElement(term103054, 4, -718204437);
        setField(term103045, term103045.getClass(), "modelToViewIndex", term103054);
        setIntField(term103045, term103045.getClass(), "lastRowCount", 468974358);
        setBooleanField(term103045, term103045.getClass(), "rebuildIndices", false);
        setField(term103062, term103062.getClass(), "listenerList", null);
        setField(term103045, term103045.getClass(), "listenerList", term103062);
        setField(term103044, term103044.getClass(), "rowSorter", term103045);
        setIntField(term103044, term103044.getClass(), "modelIndex", 346282818);
        setElement(term103043, 0, term103044);
        setField(term103065, term103065.getClass(), "model", null);
        setField(term103065, term103065.getClass(), "sortKeys", term103066);
        setField(term103065, term103065.getClass(), "defaultSortKeys", term103069);
        setField(term103065, term103065.getClass(), "unsortableColumns", term103072);
        setField(term103065, term103065.getClass(), "nodeComparator", null);
        setField(term103065, term103065.getClass(), "sortStrategy", null);
        setField(term103065, term103065.getClass(), "viewToModelIndex", null);
        setField(term103065, term103065.getClass(), "modelToViewIndex", null);
        setIntField(term103065, term103065.getClass(), "lastRowCount", 0);
        setBooleanField(term103065, term103065.getClass(), "rebuildIndices", false);
        setField(term103065, term103065.getClass(), "listenerList", null);
        setField(term103064, term103064.getClass(), "rowSorter", term103065);
        setIntField(term103064, term103064.getClass(), "modelIndex", -857876056);
        setElement(term103043, 1, term103064);
        setField(term103077, term103077.getClass(), "model", null);
        setField(term103077, term103077.getClass(), "sortKeys", null);
        setField(term103077, term103077.getClass(), "defaultSortKeys", null);
        setField(term103077, term103077.getClass(), "unsortableColumns", null);
        setField(term103077, term103077.getClass(), "nodeComparator", null);
        setField(term103077, term103077.getClass(), "sortStrategy", null);
        setField(term103077, term103077.getClass(), "viewToModelIndex", null);
        setField(term103077, term103077.getClass(), "modelToViewIndex", null);
        setIntField(term103077, term103077.getClass(), "lastRowCount", 0);
        setBooleanField(term103077, term103077.getClass(), "rebuildIndices", false);
        setField(term103077, term103077.getClass(), "listenerList", null);
        setField(term103076, term103076.getClass(), "rowSorter", term103077);
        setIntField(term103076, term103076.getClass(), "modelIndex", 1392910876);
        setElement(term103043, 2, term103076);
        setField(term103082, term103082.getClass(), "model", null);
        setField(term103082, term103082.getClass(), "sortKeys", null);
        setField(term103082, term103082.getClass(), "defaultSortKeys", null);
        setField(term103082, term103082.getClass(), "unsortableColumns", null);
        setField(term103082, term103082.getClass(), "nodeComparator", null);
        setField(term103082, term103082.getClass(), "sortStrategy", null);
        setField(term103082, term103082.getClass(), "viewToModelIndex", null);
        setField(term103082, term103082.getClass(), "modelToViewIndex", null);
        setIntField(term103082, term103082.getClass(), "lastRowCount", 0);
        setBooleanField(term103082, term103082.getClass(), "rebuildIndices", false);
        setField(term103082, term103082.getClass(), "listenerList", null);
        setField(term103081, term103081.getClass(), "rowSorter", term103082);
        setIntField(term103081, term103081.getClass(), "modelIndex", 1086383182);
        setElement(term103043, 3, term103081);
        setField(term103087, term103087.getClass(), "model", null);
        setField(term103087, term103087.getClass(), "sortKeys", null);
        setField(term103087, term103087.getClass(), "defaultSortKeys", null);
        setField(term103087, term103087.getClass(), "unsortableColumns", null);
        setField(term103087, term103087.getClass(), "nodeComparator", null);
        setField(term103087, term103087.getClass(), "sortStrategy", null);
        setField(term103087, term103087.getClass(), "viewToModelIndex", null);
        setField(term103087, term103087.getClass(), "modelToViewIndex", null);
        setIntField(term103087, term103087.getClass(), "lastRowCount", 0);
        setBooleanField(term103087, term103087.getClass(), "rebuildIndices", false);
        setField(term103087, term103087.getClass(), "listenerList", null);
        setField(term103086, term103086.getClass(), "rowSorter", term103087);
        setIntField(term103086, term103086.getClass(), "modelIndex", 1425319286);
        setElement(term103043, 4, term103086);
        setField(term103091, term103091.getClass(), "rowSorter", term103077);
        setIntField(term103091, term103091.getClass(), "modelIndex", 1729919228);
        setElement(term103043, 5, term103091);
        setElement(term103043, 6, term103086);
        setElement(term103043, 7, term103044);
        setField(term103011, term103011.getClass(), "viewToModelIndex", term103043);
        setIntElement(term103093, 0, 872351195);
        setIntElement(term103093, 1, -1664328399);
        setIntElement(term103093, 2, 1422430512);
        setIntElement(term103093, 3, 1796581482);
        setIntElement(term103093, 4, 1286440081);
        setIntElement(term103093, 5, -928538452);
        setIntElement(term103093, 6, -1313207353);
        setIntElement(term103093, 7, 402612318);
        setField(term103011, term103011.getClass(), "modelToViewIndex", term103093);
        setIntField(term103011, term103011.getClass(), "lastRowCount", -1628481565);
        setBooleanField(term103011, term103011.getClass(), "rebuildIndices", true);
        setField(term103104, term103104.getClass(), "listenerList", term103105);
        setField(term103011, term103011.getClass(), "listenerList", term103104);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "buildViewToModelIndex", argTypes, term103011, args);
    }

};


