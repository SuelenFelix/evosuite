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

public class TreeTableRowSorter_convertRowIndexToView_739573986 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99300;
     Object term99391;

    public TreeTableRowSorter_convertRowIndexToView_739573986() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term99303 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term99305 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term99303, term99303.getClass(), "column", 904607217);
        setField(term99305, term99305.getClass(), "name", null);
        setIntField(term99305, term99305.getClass(), "ordinal", 1);
        setField(term99303, term99303.getClass(), "sortOrder", term99305);
        Object term99307 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term99307, term99307.getClass(), "column", 434914590);
        setField(term99307, term99307.getClass(), "sortOrder", term99305);
        Object term99309 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term99309, term99309.getClass(), "column", 1983756621);
        setField(term99309, term99309.getClass(), "sortOrder", term99305);
        Object term99311 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term99313 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term99311, term99311.getClass(), "column", -2134711835);
        setField(term99313, term99313.getClass(), "name", null);
        setIntField(term99313, term99313.getClass(), "ordinal", 0);
        setField(term99311, term99311.getClass(), "sortOrder", term99313);
        Object term99315 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term99315, term99315.getClass(), "column", -1641244494);
        setField(term99315, term99315.getClass(), "sortOrder", term99305);
        Object term99317 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term99317, term99317.getClass(), "column", 1124282188);
        setField(term99317, term99317.getClass(), "sortOrder", term99313);
        Object term99319 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term99319, term99319.getClass(), "column", -489441521);
        setField(term99319, term99319.getClass(), "sortOrder", term99305);
        Object term99321 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term99323 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term99321, term99321.getClass(), "column", 225873732);
        setField(term99323, term99323.getClass(), "name", null);
        setIntField(term99323, term99323.getClass(), "ordinal", 2);
        setField(term99321, term99321.getClass(), "sortOrder", term99323);
        ArrayList term99301 = new ArrayList();
        ((ArrayList) term99301).add(term99303);
        ((ArrayList) term99301).add(term99307);
        ((ArrayList) term99301).add(term99309);
        ((ArrayList) term99301).add(term99311);
        ((ArrayList) term99301).add(term99315);
        ((ArrayList) term99301).add(term99317);
        ((ArrayList) term99301).add(term99319);
        ((ArrayList) term99301).add(term99321);
        ArrayList term99327 = new ArrayList();
        HashMap term99332 = new HashMap();
        Set<Object> term99393 =  ((Map) term99332).keySet();
        HashSet term99331 = new HashSet((Collection<? extends Object>) term99393);
        ArrayList term99361 = new ArrayList();
        ((ArrayList) term99361).add((Object)null);
        ((ArrayList) term99361).add((Object)null);
        ((ArrayList) term99361).add((Object)null);
        ((ArrayList) term99361).add((Object)null);
        ((ArrayList) term99361).add((Object)null);
        ArrayList term99364 = new ArrayList();
        HashSet term99367 = new HashSet();
        term99300 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term99358 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 2);
        Object term99359 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term99360 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term99368 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 9);
        int[] term99369 = (int[]) newIntArray(0);
        Object term99372 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term99374 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term99375 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term99379 = (int[]) newIntArray(7);
        Object term99389 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term99390 = (Object[]) newArray("java.lang.Object", 0);
        setField(term99300, term99300.getClass(), "model", null);
        setField(term99300, term99300.getClass(), "sortKeys", term99301);
        setField(term99300, term99300.getClass(), "defaultSortKeys", term99327);
        setField(term99300, term99300.getClass(), "unsortableColumns", term99331);
        setField(term99300, term99300.getClass(), "nodeComparator", null);
        setField(term99300, term99300.getClass(), "sortStrategy", null);
        setField(term99360, term99360.getClass(), "model", null);
        setField(term99360, term99360.getClass(), "sortKeys", term99361);
        setField(term99360, term99360.getClass(), "defaultSortKeys", term99364);
        setField(term99360, term99360.getClass(), "unsortableColumns", term99367);
        setField(term99360, term99360.getClass(), "nodeComparator", null);
        setField(term99360, term99360.getClass(), "sortStrategy", null);
        setField(term99360, term99360.getClass(), "viewToModelIndex", term99368);
        setField(term99360, term99360.getClass(), "modelToViewIndex", term99369);
        setIntField(term99360, term99360.getClass(), "lastRowCount", 1354781442);
        setBooleanField(term99360, term99360.getClass(), "rebuildIndices", false);
        setField(term99372, term99372.getClass(), "listenerList", null);
        setField(term99360, term99360.getClass(), "listenerList", term99372);
        setField(term99359, term99359.getClass(), "rowSorter", term99360);
        setIntField(term99359, term99359.getClass(), "modelIndex", -393590701);
        setElement(term99358, 0, term99359);
        setField(term99375, term99375.getClass(), "model", null);
        setField(term99375, term99375.getClass(), "sortKeys", null);
        setField(term99375, term99375.getClass(), "defaultSortKeys", null);
        setField(term99375, term99375.getClass(), "unsortableColumns", null);
        setField(term99375, term99375.getClass(), "nodeComparator", null);
        setField(term99375, term99375.getClass(), "sortStrategy", null);
        setField(term99375, term99375.getClass(), "viewToModelIndex", null);
        setField(term99375, term99375.getClass(), "modelToViewIndex", null);
        setIntField(term99375, term99375.getClass(), "lastRowCount", 0);
        setBooleanField(term99375, term99375.getClass(), "rebuildIndices", false);
        setField(term99375, term99375.getClass(), "listenerList", null);
        setField(term99374, term99374.getClass(), "rowSorter", term99375);
        setIntField(term99374, term99374.getClass(), "modelIndex", -819372164);
        setElement(term99358, 1, term99374);
        setField(term99300, term99300.getClass(), "viewToModelIndex", term99358);
        setIntElement(term99379, 0, 86344574);
        setIntElement(term99379, 1, -829441157);
        setIntElement(term99379, 2, -1489991025);
        setIntElement(term99379, 3, -1542979444);
        setIntElement(term99379, 4, -1130401612);
        setIntElement(term99379, 5, -316771104);
        setIntElement(term99379, 6, -1374527319);
        setField(term99300, term99300.getClass(), "modelToViewIndex", term99379);
        setIntField(term99300, term99300.getClass(), "lastRowCount", -1735276919);
        setBooleanField(term99300, term99300.getClass(), "rebuildIndices", false);
        setField(term99389, term99389.getClass(), "listenerList", term99390);
        setField(term99300, term99300.getClass(), "listenerList", term99389);
        term99391 = new Integer(-712023865);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term99391;
        callMethod(klass, "convertRowIndexToView", argTypes, term99300, args);
    }

};


