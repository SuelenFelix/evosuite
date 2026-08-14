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

public class TreeTableRowSorter_getFilteredChildIndex_71493958450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104153;

    public TreeTableRowSorter_getFilteredChildIndex_71493958450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term104156 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term104158 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term104156, term104156.getClass(), "column", 99032275);
        setField(term104158, term104158.getClass(), "name", null);
        setIntField(term104158, term104158.getClass(), "ordinal", 0);
        setField(term104156, term104156.getClass(), "sortOrder", term104158);
        Object term104160 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term104160, term104160.getClass(), "column", 794098686);
        setField(term104160, term104160.getClass(), "sortOrder", term104158);
        Object term104162 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term104164 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term104162, term104162.getClass(), "column", -1671524013);
        setField(term104164, term104164.getClass(), "name", null);
        setIntField(term104164, term104164.getClass(), "ordinal", 1);
        setField(term104162, term104162.getClass(), "sortOrder", term104164);
        Object term104166 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term104168 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term104166, term104166.getClass(), "column", -438794741);
        setField(term104168, term104168.getClass(), "name", null);
        setIntField(term104168, term104168.getClass(), "ordinal", 2);
        setField(term104166, term104166.getClass(), "sortOrder", term104168);
        Object term104170 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term104170, term104170.getClass(), "column", -1400834481);
        setField(term104170, term104170.getClass(), "sortOrder", term104158);
        Object term104172 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term104172, term104172.getClass(), "column", 957091706);
        setField(term104172, term104172.getClass(), "sortOrder", term104164);
        ArrayList term104154 = new ArrayList();
        ((ArrayList) term104154).add(term104156);
        ((ArrayList) term104154).add(term104160);
        ((ArrayList) term104154).add(term104162);
        ((ArrayList) term104154).add(term104166);
        ((ArrayList) term104154).add(term104170);
        ((ArrayList) term104154).add(term104172);
        ArrayList term104176 = new ArrayList();
        HashMap term104181 = new HashMap();
        Set<Object> term104264 =  ((Map) term104181).keySet();
        HashSet term104180 = new HashSet((Collection<? extends Object>) term104264);
        ArrayList term104218 = new ArrayList();
        ((ArrayList) term104218).add((Object)null);
        ((ArrayList) term104218).add((Object)null);
        ((ArrayList) term104218).add((Object)null);
        ArrayList term104221 = new ArrayList();
        HashSet term104224 = new HashSet();
        ArrayList term104237 = new ArrayList();
        ((ArrayList) term104237).add((Object)null);
        ((ArrayList) term104237).add((Object)null);
        ((ArrayList) term104237).add((Object)null);
        ((ArrayList) term104237).add((Object)null);
        ((ArrayList) term104237).add((Object)null);
        ((ArrayList) term104237).add((Object)null);
        ((ArrayList) term104237).add((Object)null);
        ArrayList term104240 = new ArrayList();
        HashSet term104243 = new HashSet();
        term104153 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term104215 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 7);
        Object term104216 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term104217 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term104225 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 5);
        int[] term104226 = (int[]) newIntArray(4);
        Object term104233 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term104235 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term104236 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term104247 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term104248 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term104252 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term104253 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term104257 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        int[] term104259 = (int[]) newIntArray(0);
        Object term104262 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term104263 = (Object[]) newArray("java.lang.Object", 0);
        setField(term104153, term104153.getClass(), "model", null);
        setField(term104153, term104153.getClass(), "sortKeys", term104154);
        setField(term104153, term104153.getClass(), "defaultSortKeys", term104176);
        setField(term104153, term104153.getClass(), "unsortableColumns", term104180);
        setField(term104153, term104153.getClass(), "nodeComparator", null);
        setField(term104153, term104153.getClass(), "sortStrategy", null);
        setField(term104217, term104217.getClass(), "model", null);
        setField(term104217, term104217.getClass(), "sortKeys", term104218);
        setField(term104217, term104217.getClass(), "defaultSortKeys", term104221);
        setField(term104217, term104217.getClass(), "unsortableColumns", term104224);
        setField(term104217, term104217.getClass(), "nodeComparator", null);
        setField(term104217, term104217.getClass(), "sortStrategy", null);
        setField(term104217, term104217.getClass(), "viewToModelIndex", term104225);
        setIntElement(term104226, 0, 673153263);
        setIntElement(term104226, 1, -1355715967);
        setIntElement(term104226, 2, -972516789);
        setIntElement(term104226, 3, 720077443);
        setField(term104217, term104217.getClass(), "modelToViewIndex", term104226);
        setIntField(term104217, term104217.getClass(), "lastRowCount", -884523977);
        setBooleanField(term104217, term104217.getClass(), "rebuildIndices", false);
        setField(term104233, term104233.getClass(), "listenerList", null);
        setField(term104217, term104217.getClass(), "listenerList", term104233);
        setField(term104216, term104216.getClass(), "rowSorter", term104217);
        setIntField(term104216, term104216.getClass(), "modelIndex", -1396233580);
        setElement(term104215, 0, term104216);
        setField(term104236, term104236.getClass(), "model", null);
        setField(term104236, term104236.getClass(), "sortKeys", term104237);
        setField(term104236, term104236.getClass(), "defaultSortKeys", term104240);
        setField(term104236, term104236.getClass(), "unsortableColumns", term104243);
        setField(term104236, term104236.getClass(), "nodeComparator", null);
        setField(term104236, term104236.getClass(), "sortStrategy", null);
        setField(term104236, term104236.getClass(), "viewToModelIndex", null);
        setField(term104236, term104236.getClass(), "modelToViewIndex", null);
        setIntField(term104236, term104236.getClass(), "lastRowCount", 0);
        setBooleanField(term104236, term104236.getClass(), "rebuildIndices", false);
        setField(term104236, term104236.getClass(), "listenerList", null);
        setField(term104235, term104235.getClass(), "rowSorter", term104236);
        setIntField(term104235, term104235.getClass(), "modelIndex", -654234892);
        setElement(term104215, 1, term104235);
        setField(term104248, term104248.getClass(), "model", null);
        setField(term104248, term104248.getClass(), "sortKeys", null);
        setField(term104248, term104248.getClass(), "defaultSortKeys", null);
        setField(term104248, term104248.getClass(), "unsortableColumns", null);
        setField(term104248, term104248.getClass(), "nodeComparator", null);
        setField(term104248, term104248.getClass(), "sortStrategy", null);
        setField(term104248, term104248.getClass(), "viewToModelIndex", null);
        setField(term104248, term104248.getClass(), "modelToViewIndex", null);
        setIntField(term104248, term104248.getClass(), "lastRowCount", 0);
        setBooleanField(term104248, term104248.getClass(), "rebuildIndices", false);
        setField(term104248, term104248.getClass(), "listenerList", null);
        setField(term104247, term104247.getClass(), "rowSorter", term104248);
        setIntField(term104247, term104247.getClass(), "modelIndex", -50930731);
        setElement(term104215, 2, term104247);
        setField(term104253, term104253.getClass(), "model", null);
        setField(term104253, term104253.getClass(), "sortKeys", null);
        setField(term104253, term104253.getClass(), "defaultSortKeys", null);
        setField(term104253, term104253.getClass(), "unsortableColumns", null);
        setField(term104253, term104253.getClass(), "nodeComparator", null);
        setField(term104253, term104253.getClass(), "sortStrategy", null);
        setField(term104253, term104253.getClass(), "viewToModelIndex", null);
        setField(term104253, term104253.getClass(), "modelToViewIndex", null);
        setIntField(term104253, term104253.getClass(), "lastRowCount", 0);
        setBooleanField(term104253, term104253.getClass(), "rebuildIndices", false);
        setField(term104253, term104253.getClass(), "listenerList", null);
        setField(term104252, term104252.getClass(), "rowSorter", term104253);
        setIntField(term104252, term104252.getClass(), "modelIndex", -1067876039);
        setElement(term104215, 3, term104252);
        setField(term104257, term104257.getClass(), "rowSorter", term104217);
        setIntField(term104257, term104257.getClass(), "modelIndex", -1143749623);
        setElement(term104215, 4, term104257);
        setElement(term104215, 5, term104257);
        setElement(term104215, 6, term104247);
        setField(term104153, term104153.getClass(), "viewToModelIndex", term104215);
        setField(term104153, term104153.getClass(), "modelToViewIndex", term104259);
        setIntField(term104153, term104153.getClass(), "lastRowCount", 1961561878);
        setBooleanField(term104153, term104153.getClass(), "rebuildIndices", true);
        setField(term104262, term104262.getClass(), "listenerList", term104263);
        setField(term104153, term104153.getClass(), "listenerList", term104262);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("javax.swing.tree.TreeNode");
        argTypes[1] = Class.forName("javax.swing.tree.TreeNode");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "getFilteredChildIndex", argTypes, term104153, args);
    }

};


