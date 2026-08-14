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

public class TreeTableRowSorter_clearSortIndices_1452740532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102233;

    public TreeTableRowSorter_clearSortIndices_1452740532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term102236 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term102238 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term102236, term102236.getClass(), "column", 1810754549);
        setField(term102238, term102238.getClass(), "name", null);
        setIntField(term102238, term102238.getClass(), "ordinal", 2);
        setField(term102236, term102236.getClass(), "sortOrder", term102238);
        Object term102240 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term102242 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term102240, term102240.getClass(), "column", 338342107);
        setField(term102242, term102242.getClass(), "name", null);
        setIntField(term102242, term102242.getClass(), "ordinal", 1);
        setField(term102240, term102240.getClass(), "sortOrder", term102242);
        ArrayList term102234 = new ArrayList();
        ((ArrayList) term102234).add(term102236);
        ((ArrayList) term102234).add(term102240);
        ArrayList term102246 = new ArrayList();
        HashMap term102251 = new HashMap();
        Set<Object> term102302 =  ((Map) term102251).keySet();
        HashSet term102250 = new HashSet((Collection<? extends Object>) term102302);
        ArrayList term102259 = new ArrayList();
        ((ArrayList) term102259).add((Object)null);
        ArrayList term102262 = new ArrayList();
        HashSet term102265 = new HashSet();
        ArrayList term102279 = new ArrayList();
        ((ArrayList) term102279).add((Object)null);
        ArrayList term102282 = new ArrayList();
        HashSet term102285 = new HashSet();
        term102233 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term102256 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 2);
        Object term102257 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term102258 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term102266 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 7);
        int[] term102267 = (int[]) newIntArray(5);
        Object term102275 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term102277 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term102278 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term102289 = (int[]) newIntArray(8);
        Object term102300 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term102301 = (Object[]) newArray("java.lang.Object", 0);
        setField(term102233, term102233.getClass(), "model", null);
        setField(term102233, term102233.getClass(), "sortKeys", term102234);
        setField(term102233, term102233.getClass(), "defaultSortKeys", term102246);
        setField(term102233, term102233.getClass(), "unsortableColumns", term102250);
        setField(term102233, term102233.getClass(), "nodeComparator", null);
        setField(term102233, term102233.getClass(), "sortStrategy", null);
        setField(term102258, term102258.getClass(), "model", null);
        setField(term102258, term102258.getClass(), "sortKeys", term102259);
        setField(term102258, term102258.getClass(), "defaultSortKeys", term102262);
        setField(term102258, term102258.getClass(), "unsortableColumns", term102265);
        setField(term102258, term102258.getClass(), "nodeComparator", null);
        setField(term102258, term102258.getClass(), "sortStrategy", null);
        setField(term102258, term102258.getClass(), "viewToModelIndex", term102266);
        setIntElement(term102267, 0, 1691516034);
        setIntElement(term102267, 1, 335681723);
        setIntElement(term102267, 2, -773707674);
        setIntElement(term102267, 3, 383244929);
        setIntElement(term102267, 4, -2114034003);
        setField(term102258, term102258.getClass(), "modelToViewIndex", term102267);
        setIntField(term102258, term102258.getClass(), "lastRowCount", 207213904);
        setBooleanField(term102258, term102258.getClass(), "rebuildIndices", true);
        setField(term102275, term102275.getClass(), "listenerList", null);
        setField(term102258, term102258.getClass(), "listenerList", term102275);
        setField(term102257, term102257.getClass(), "rowSorter", term102258);
        setIntField(term102257, term102257.getClass(), "modelIndex", -484303394);
        setElement(term102256, 0, term102257);
        setField(term102278, term102278.getClass(), "model", null);
        setField(term102278, term102278.getClass(), "sortKeys", term102279);
        setField(term102278, term102278.getClass(), "defaultSortKeys", term102282);
        setField(term102278, term102278.getClass(), "unsortableColumns", term102285);
        setField(term102278, term102278.getClass(), "nodeComparator", null);
        setField(term102278, term102278.getClass(), "sortStrategy", null);
        setField(term102278, term102278.getClass(), "viewToModelIndex", null);
        setField(term102278, term102278.getClass(), "modelToViewIndex", null);
        setIntField(term102278, term102278.getClass(), "lastRowCount", 0);
        setBooleanField(term102278, term102278.getClass(), "rebuildIndices", false);
        setField(term102278, term102278.getClass(), "listenerList", null);
        setField(term102277, term102277.getClass(), "rowSorter", term102278);
        setIntField(term102277, term102277.getClass(), "modelIndex", -31125530);
        setElement(term102256, 1, term102277);
        setField(term102233, term102233.getClass(), "viewToModelIndex", term102256);
        setIntElement(term102289, 0, 1909773180);
        setIntElement(term102289, 1, -970417907);
        setIntElement(term102289, 2, 1097894139);
        setIntElement(term102289, 3, 390256347);
        setIntElement(term102289, 4, 1471619998);
        setIntElement(term102289, 5, -1623489521);
        setIntElement(term102289, 6, 1179937517);
        setIntElement(term102289, 7, 200150950);
        setField(term102233, term102233.getClass(), "modelToViewIndex", term102289);
        setIntField(term102233, term102233.getClass(), "lastRowCount", -366198044);
        setBooleanField(term102233, term102233.getClass(), "rebuildIndices", false);
        setField(term102300, term102300.getClass(), "listenerList", term102301);
        setField(term102233, term102233.getClass(), "listenerList", term102300);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearSortIndices", argTypes, term102233, args);
    }

};


