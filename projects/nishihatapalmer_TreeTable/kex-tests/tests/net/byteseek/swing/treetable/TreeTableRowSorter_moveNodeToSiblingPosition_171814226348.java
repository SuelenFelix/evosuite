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

public class TreeTableRowSorter_moveNodeToSiblingPosition_171814226348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103977;
     Object term104076;
     Object term104078;

    public TreeTableRowSorter_moveNodeToSiblingPosition_171814226348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term103980 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term103982 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term103980, term103980.getClass(), "column", 14181775);
        setField(term103982, term103982.getClass(), "name", null);
        setIntField(term103982, term103982.getClass(), "ordinal", 2);
        setField(term103980, term103980.getClass(), "sortOrder", term103982);
        Object term103984 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term103986 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term103984, term103984.getClass(), "column", 667778327);
        setField(term103986, term103986.getClass(), "name", null);
        setIntField(term103986, term103986.getClass(), "ordinal", 0);
        setField(term103984, term103984.getClass(), "sortOrder", term103986);
        Object term103988 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term103990 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term103988, term103988.getClass(), "column", 395074450);
        setField(term103990, term103990.getClass(), "name", null);
        setIntField(term103990, term103990.getClass(), "ordinal", 1);
        setField(term103988, term103988.getClass(), "sortOrder", term103990);
        ArrayList term103978 = new ArrayList();
        ((ArrayList) term103978).add(term103980);
        ((ArrayList) term103978).add(term103984);
        ((ArrayList) term103978).add(term103988);
        ArrayList term103994 = new ArrayList();
        HashMap term103999 = new HashMap();
        Set<Object> term104080 =  ((Map) term103999).keySet();
        HashSet term103998 = new HashSet((Collection<? extends Object>) term104080);
        ArrayList term104036 = new ArrayList();
        ((ArrayList) term104036).add((Object)null);
        ((ArrayList) term104036).add((Object)null);
        ((ArrayList) term104036).add((Object)null);
        ((ArrayList) term104036).add((Object)null);
        ((ArrayList) term104036).add((Object)null);
        ((ArrayList) term104036).add((Object)null);
        ArrayList term104039 = new ArrayList();
        HashSet term104042 = new HashSet();
        ArrayList term104051 = new ArrayList();
        ((ArrayList) term104051).add((Object)null);
        ((ArrayList) term104051).add((Object)null);
        ((ArrayList) term104051).add((Object)null);
        ArrayList term104054 = new ArrayList();
        HashSet term104057 = new HashSet();
        term103977 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term104033 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 3);
        Object term104034 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term104035 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term104043 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 2);
        int[] term104044 = (int[]) newIntArray(0);
        Object term104047 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term104049 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term104050 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term104061 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term104062 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term104066 = (int[]) newIntArray(5);
        Object term104074 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term104075 = (Object[]) newArray("java.lang.Object", 0);
        setField(term103977, term103977.getClass(), "model", null);
        setField(term103977, term103977.getClass(), "sortKeys", term103978);
        setField(term103977, term103977.getClass(), "defaultSortKeys", term103994);
        setField(term103977, term103977.getClass(), "unsortableColumns", term103998);
        setField(term103977, term103977.getClass(), "nodeComparator", null);
        setField(term103977, term103977.getClass(), "sortStrategy", null);
        setField(term104035, term104035.getClass(), "model", null);
        setField(term104035, term104035.getClass(), "sortKeys", term104036);
        setField(term104035, term104035.getClass(), "defaultSortKeys", term104039);
        setField(term104035, term104035.getClass(), "unsortableColumns", term104042);
        setField(term104035, term104035.getClass(), "nodeComparator", null);
        setField(term104035, term104035.getClass(), "sortStrategy", null);
        setField(term104035, term104035.getClass(), "viewToModelIndex", term104043);
        setField(term104035, term104035.getClass(), "modelToViewIndex", term104044);
        setIntField(term104035, term104035.getClass(), "lastRowCount", 1346331516);
        setBooleanField(term104035, term104035.getClass(), "rebuildIndices", true);
        setField(term104047, term104047.getClass(), "listenerList", null);
        setField(term104035, term104035.getClass(), "listenerList", term104047);
        setField(term104034, term104034.getClass(), "rowSorter", term104035);
        setIntField(term104034, term104034.getClass(), "modelIndex", 1018925421);
        setElement(term104033, 0, term104034);
        setField(term104050, term104050.getClass(), "model", null);
        setField(term104050, term104050.getClass(), "sortKeys", term104051);
        setField(term104050, term104050.getClass(), "defaultSortKeys", term104054);
        setField(term104050, term104050.getClass(), "unsortableColumns", term104057);
        setField(term104050, term104050.getClass(), "nodeComparator", null);
        setField(term104050, term104050.getClass(), "sortStrategy", null);
        setField(term104050, term104050.getClass(), "viewToModelIndex", null);
        setField(term104050, term104050.getClass(), "modelToViewIndex", null);
        setIntField(term104050, term104050.getClass(), "lastRowCount", 0);
        setBooleanField(term104050, term104050.getClass(), "rebuildIndices", false);
        setField(term104050, term104050.getClass(), "listenerList", null);
        setField(term104049, term104049.getClass(), "rowSorter", term104050);
        setIntField(term104049, term104049.getClass(), "modelIndex", -1658031378);
        setElement(term104033, 1, term104049);
        setField(term104062, term104062.getClass(), "model", null);
        setField(term104062, term104062.getClass(), "sortKeys", null);
        setField(term104062, term104062.getClass(), "defaultSortKeys", null);
        setField(term104062, term104062.getClass(), "unsortableColumns", null);
        setField(term104062, term104062.getClass(), "nodeComparator", null);
        setField(term104062, term104062.getClass(), "sortStrategy", null);
        setField(term104062, term104062.getClass(), "viewToModelIndex", null);
        setField(term104062, term104062.getClass(), "modelToViewIndex", null);
        setIntField(term104062, term104062.getClass(), "lastRowCount", 0);
        setBooleanField(term104062, term104062.getClass(), "rebuildIndices", false);
        setField(term104062, term104062.getClass(), "listenerList", null);
        setField(term104061, term104061.getClass(), "rowSorter", term104062);
        setIntField(term104061, term104061.getClass(), "modelIndex", -863483345);
        setElement(term104033, 2, term104061);
        setField(term103977, term103977.getClass(), "viewToModelIndex", term104033);
        setIntElement(term104066, 0, -1722702406);
        setIntElement(term104066, 1, 549278914);
        setIntElement(term104066, 2, -1490125498);
        setIntElement(term104066, 3, -1443119347);
        setIntElement(term104066, 4, 1962181481);
        setField(term103977, term103977.getClass(), "modelToViewIndex", term104066);
        setIntField(term103977, term103977.getClass(), "lastRowCount", 1798831879);
        setBooleanField(term103977, term103977.getClass(), "rebuildIndices", false);
        setField(term104074, term104074.getClass(), "listenerList", term104075);
        setField(term103977, term103977.getClass(), "listenerList", term104074);
        term104076 = new Integer(1393855580);
        term104078 = new Integer(-849064032);
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
        args[1] = term104076;
        args[2] = term104078;
        callMethod(klass, "moveNodeToSiblingPosition", argTypes, term103977, args);
    }

};


