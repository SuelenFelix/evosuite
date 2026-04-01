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

public class TreeTableRowSorter_findNextInsertionViewIndex_202836739046 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104146;
     Object term104239;
     Object term104241;

    public TreeTableRowSorter_findNextInsertionViewIndex_202836739046() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term104149 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term104151 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term104149, term104149.getClass(), "column", 2095699770);
        setField(term104151, term104151.getClass(), "name", null);
        setIntField(term104151, term104151.getClass(), "ordinal", 0);
        setField(term104149, term104149.getClass(), "sortOrder", term104151);
        Object term104153 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term104153, term104153.getClass(), "column", -1365904757);
        setField(term104153, term104153.getClass(), "sortOrder", term104151);
        Object term104155 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term104155, term104155.getClass(), "column", -1487263349);
        setField(term104155, term104155.getClass(), "sortOrder", term104151);
        ArrayList term104147 = new ArrayList();
        ((ArrayList) term104147).add(term104149);
        ((ArrayList) term104147).add(term104153);
        ((ArrayList) term104147).add(term104155);
        ArrayList term104159 = new ArrayList();
        HashMap term104164 = new HashMap();
        Set<Object> term104243 =  ((Map) term104164).keySet();
        HashSet term104163 = new HashSet((Collection<? extends Object>) term104243);
        ArrayList term104197 = new ArrayList();
        ((ArrayList) term104197).add((Object)null);
        ((ArrayList) term104197).add((Object)null);
        ((ArrayList) term104197).add((Object)null);
        ArrayList term104200 = new ArrayList();
        HashSet term104203 = new HashSet();
        ArrayList term104212 = new ArrayList();
        ((ArrayList) term104212).add((Object)null);
        ArrayList term104215 = new ArrayList();
        HashSet term104218 = new HashSet();
        term104146 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term104194 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 5);
        Object term104195 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term104196 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term104204 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 7);
        int[] term104205 = (int[]) newIntArray(0);
        Object term104208 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term104210 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term104211 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term104222 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term104223 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term104227 = (int[]) newIntArray(7);
        Object term104237 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term104238 = (Object[]) newArray("java.lang.Object", 0);
        setField(term104146, term104146.getClass(), "model", null);
        setField(term104146, term104146.getClass(), "sortKeys", term104147);
        setField(term104146, term104146.getClass(), "defaultSortKeys", term104159);
        setField(term104146, term104146.getClass(), "unsortableColumns", term104163);
        setField(term104146, term104146.getClass(), "nodeComparator", null);
        setField(term104146, term104146.getClass(), "sortStrategy", null);
        setField(term104196, term104196.getClass(), "model", null);
        setField(term104196, term104196.getClass(), "sortKeys", term104197);
        setField(term104196, term104196.getClass(), "defaultSortKeys", term104200);
        setField(term104196, term104196.getClass(), "unsortableColumns", term104203);
        setField(term104196, term104196.getClass(), "nodeComparator", null);
        setField(term104196, term104196.getClass(), "sortStrategy", null);
        setField(term104196, term104196.getClass(), "viewToModelIndex", term104204);
        setField(term104196, term104196.getClass(), "modelToViewIndex", term104205);
        setIntField(term104196, term104196.getClass(), "lastRowCount", -1498422654);
        setBooleanField(term104196, term104196.getClass(), "rebuildIndices", false);
        setField(term104208, term104208.getClass(), "listenerList", null);
        setField(term104196, term104196.getClass(), "listenerList", term104208);
        setField(term104195, term104195.getClass(), "rowSorter", term104196);
        setIntField(term104195, term104195.getClass(), "modelIndex", -1499829233);
        setElement(term104194, 0, term104195);
        setField(term104211, term104211.getClass(), "model", null);
        setField(term104211, term104211.getClass(), "sortKeys", term104212);
        setField(term104211, term104211.getClass(), "defaultSortKeys", term104215);
        setField(term104211, term104211.getClass(), "unsortableColumns", term104218);
        setField(term104211, term104211.getClass(), "nodeComparator", null);
        setField(term104211, term104211.getClass(), "sortStrategy", null);
        setField(term104211, term104211.getClass(), "viewToModelIndex", null);
        setField(term104211, term104211.getClass(), "modelToViewIndex", null);
        setIntField(term104211, term104211.getClass(), "lastRowCount", 0);
        setBooleanField(term104211, term104211.getClass(), "rebuildIndices", false);
        setField(term104211, term104211.getClass(), "listenerList", null);
        setField(term104210, term104210.getClass(), "rowSorter", term104211);
        setIntField(term104210, term104210.getClass(), "modelIndex", -888855662);
        setElement(term104194, 1, term104210);
        setField(term104223, term104223.getClass(), "model", null);
        setField(term104223, term104223.getClass(), "sortKeys", null);
        setField(term104223, term104223.getClass(), "defaultSortKeys", null);
        setField(term104223, term104223.getClass(), "unsortableColumns", null);
        setField(term104223, term104223.getClass(), "nodeComparator", null);
        setField(term104223, term104223.getClass(), "sortStrategy", null);
        setField(term104223, term104223.getClass(), "viewToModelIndex", null);
        setField(term104223, term104223.getClass(), "modelToViewIndex", null);
        setIntField(term104223, term104223.getClass(), "lastRowCount", 0);
        setBooleanField(term104223, term104223.getClass(), "rebuildIndices", false);
        setField(term104223, term104223.getClass(), "listenerList", null);
        setField(term104222, term104222.getClass(), "rowSorter", term104223);
        setIntField(term104222, term104222.getClass(), "modelIndex", -1483966656);
        setElement(term104194, 2, term104222);
        setElement(term104194, 3, term104210);
        setElement(term104194, 4, term104195);
        setField(term104146, term104146.getClass(), "viewToModelIndex", term104194);
        setIntElement(term104227, 0, -334260786);
        setIntElement(term104227, 1, -765890956);
        setIntElement(term104227, 2, -214452542);
        setIntElement(term104227, 3, -21429773);
        setIntElement(term104227, 4, 1774728742);
        setIntElement(term104227, 5, -1822211508);
        setIntElement(term104227, 6, -177243872);
        setField(term104146, term104146.getClass(), "modelToViewIndex", term104227);
        setIntField(term104146, term104146.getClass(), "lastRowCount", 1485047282);
        setBooleanField(term104146, term104146.getClass(), "rebuildIndices", false);
        setField(term104237, term104237.getClass(), "listenerList", term104238);
        setField(term104146, term104146.getClass(), "listenerList", term104237);
        term104239 = new Integer(1624190794);
        term104241 = new Integer(-773608881);
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
        args[1] = term104239;
        args[2] = term104241;
        callMethod(klass, "findNextInsertionViewIndex", argTypes, term104146, args);
    }

};


