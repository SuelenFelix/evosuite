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

public class TreeTableRowSorter_buildViewToModelAsInts_150069623836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103183;

    public TreeTableRowSorter_buildViewToModelAsInts_150069623836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term103186 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term103188 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term103186, term103186.getClass(), "column", 1769496642);
        setField(term103188, term103188.getClass(), "name", null);
        setIntField(term103188, term103188.getClass(), "ordinal", 1);
        setField(term103186, term103186.getClass(), "sortOrder", term103188);
        Object term103190 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term103190, term103190.getClass(), "column", -947460705);
        setField(term103190, term103190.getClass(), "sortOrder", term103188);
        Object term103192 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term103192, term103192.getClass(), "column", -1435758764);
        setField(term103192, term103192.getClass(), "sortOrder", term103188);
        Object term103194 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term103196 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term103194, term103194.getClass(), "column", 752858379);
        setField(term103196, term103196.getClass(), "name", null);
        setIntField(term103196, term103196.getClass(), "ordinal", 2);
        setField(term103194, term103194.getClass(), "sortOrder", term103196);
        ArrayList term103184 = new ArrayList();
        ((ArrayList) term103184).add(term103186);
        ((ArrayList) term103184).add(term103190);
        ((ArrayList) term103184).add(term103192);
        ((ArrayList) term103184).add(term103194);
        ArrayList term103200 = new ArrayList();
        HashMap term103205 = new HashMap();
        Set<Object> term103276 =  ((Map) term103205).keySet();
        HashSet term103204 = new HashSet((Collection<? extends Object>) term103276);
        ArrayList term103234 = new ArrayList();
        ((ArrayList) term103234).add((Object)null);
        ((ArrayList) term103234).add((Object)null);
        ArrayList term103237 = new ArrayList();
        HashSet term103240 = new HashSet();
        ArrayList term103257 = new ArrayList();
        ((ArrayList) term103257).add((Object)null);
        ((ArrayList) term103257).add((Object)null);
        ((ArrayList) term103257).add((Object)null);
        ((ArrayList) term103257).add((Object)null);
        ((ArrayList) term103257).add((Object)null);
        ((ArrayList) term103257).add((Object)null);
        ArrayList term103260 = new ArrayList();
        HashSet term103263 = new HashSet();
        term103183 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term103231 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 2);
        Object term103232 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term103233 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term103241 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 1);
        int[] term103242 = (int[]) newIntArray(8);
        Object term103253 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term103255 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term103256 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term103267 = (int[]) newIntArray(4);
        Object term103274 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term103275 = (Object[]) newArray("java.lang.Object", 0);
        setField(term103183, term103183.getClass(), "model", null);
        setField(term103183, term103183.getClass(), "sortKeys", term103184);
        setField(term103183, term103183.getClass(), "defaultSortKeys", term103200);
        setField(term103183, term103183.getClass(), "unsortableColumns", term103204);
        setField(term103183, term103183.getClass(), "nodeComparator", null);
        setField(term103183, term103183.getClass(), "sortStrategy", null);
        setField(term103233, term103233.getClass(), "model", null);
        setField(term103233, term103233.getClass(), "sortKeys", term103234);
        setField(term103233, term103233.getClass(), "defaultSortKeys", term103237);
        setField(term103233, term103233.getClass(), "unsortableColumns", term103240);
        setField(term103233, term103233.getClass(), "nodeComparator", null);
        setField(term103233, term103233.getClass(), "sortStrategy", null);
        setField(term103233, term103233.getClass(), "viewToModelIndex", term103241);
        setIntElement(term103242, 0, -1472700822);
        setIntElement(term103242, 1, 1626670889);
        setIntElement(term103242, 2, -2117361140);
        setIntElement(term103242, 3, 407708341);
        setIntElement(term103242, 4, -287519200);
        setIntElement(term103242, 5, -1490696181);
        setIntElement(term103242, 6, 623717232);
        setIntElement(term103242, 7, -1413291732);
        setField(term103233, term103233.getClass(), "modelToViewIndex", term103242);
        setIntField(term103233, term103233.getClass(), "lastRowCount", 203264365);
        setBooleanField(term103233, term103233.getClass(), "rebuildIndices", true);
        setField(term103253, term103253.getClass(), "listenerList", null);
        setField(term103233, term103233.getClass(), "listenerList", term103253);
        setField(term103232, term103232.getClass(), "rowSorter", term103233);
        setIntField(term103232, term103232.getClass(), "modelIndex", -1066281036);
        setElement(term103231, 0, term103232);
        setField(term103256, term103256.getClass(), "model", null);
        setField(term103256, term103256.getClass(), "sortKeys", term103257);
        setField(term103256, term103256.getClass(), "defaultSortKeys", term103260);
        setField(term103256, term103256.getClass(), "unsortableColumns", term103263);
        setField(term103256, term103256.getClass(), "nodeComparator", null);
        setField(term103256, term103256.getClass(), "sortStrategy", null);
        setField(term103256, term103256.getClass(), "viewToModelIndex", null);
        setField(term103256, term103256.getClass(), "modelToViewIndex", null);
        setIntField(term103256, term103256.getClass(), "lastRowCount", 0);
        setBooleanField(term103256, term103256.getClass(), "rebuildIndices", false);
        setField(term103256, term103256.getClass(), "listenerList", null);
        setField(term103255, term103255.getClass(), "rowSorter", term103256);
        setIntField(term103255, term103255.getClass(), "modelIndex", 30837706);
        setElement(term103231, 1, term103255);
        setField(term103183, term103183.getClass(), "viewToModelIndex", term103231);
        setIntElement(term103267, 0, 379523101);
        setIntElement(term103267, 1, 1017354215);
        setIntElement(term103267, 2, 695330987);
        setIntElement(term103267, 3, -267289967);
        setField(term103183, term103183.getClass(), "modelToViewIndex", term103267);
        setIntField(term103183, term103183.getClass(), "lastRowCount", 773432822);
        setBooleanField(term103183, term103183.getClass(), "rebuildIndices", true);
        setField(term103274, term103274.getClass(), "listenerList", term103275);
        setField(term103183, term103183.getClass(), "listenerList", term103274);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "buildViewToModelAsInts", argTypes, term103183, args);
    }

};


