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

public class TreeTableRowSorter_buildSortIndices_45040260430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102083;

    public TreeTableRowSorter_buildSortIndices_45040260430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term102086 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term102088 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term102086, term102086.getClass(), "column", -1435758764);
        setField(term102088, term102088.getClass(), "name", null);
        setIntField(term102088, term102088.getClass(), "ordinal", 2);
        setField(term102086, term102086.getClass(), "sortOrder", term102088);
        Object term102090 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term102092 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term102090, term102090.getClass(), "column", 752858379);
        setField(term102092, term102092.getClass(), "name", null);
        setIntField(term102092, term102092.getClass(), "ordinal", 1);
        setField(term102090, term102090.getClass(), "sortOrder", term102092);
        Object term102094 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term102094, term102094.getClass(), "column", -370819357);
        setField(term102094, term102094.getClass(), "sortOrder", term102088);
        Object term102096 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term102096, term102096.getClass(), "column", -71819242);
        setField(term102096, term102096.getClass(), "sortOrder", term102092);
        Object term102098 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term102098, term102098.getClass(), "column", 1268893136);
        setField(term102098, term102098.getClass(), "sortOrder", term102092);
        ArrayList term102084 = new ArrayList();
        ((ArrayList) term102084).add(term102086);
        ((ArrayList) term102084).add(term102090);
        ((ArrayList) term102084).add(term102094);
        ((ArrayList) term102084).add(term102096);
        ((ArrayList) term102084).add(term102098);
        ArrayList term102102 = new ArrayList();
        HashMap term102107 = new HashMap();
        Set<Object> term102156 =  ((Map) term102107).keySet();
        HashSet term102106 = new HashSet((Collection<? extends Object>) term102156);
        ArrayList term102132 = new ArrayList();
        ArrayList term102135 = new ArrayList();
        HashSet term102138 = new HashSet();
        term102083 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term102129 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 1);
        Object term102130 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term102131 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term102139 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 2);
        int[] term102140 = (int[]) newIntArray(6);
        Object term102149 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        int[] term102151 = (int[]) newIntArray(0);
        Object term102154 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term102155 = (Object[]) newArray("java.lang.Object", 0);
        setField(term102083, term102083.getClass(), "model", null);
        setField(term102083, term102083.getClass(), "sortKeys", term102084);
        setField(term102083, term102083.getClass(), "defaultSortKeys", term102102);
        setField(term102083, term102083.getClass(), "unsortableColumns", term102106);
        setField(term102083, term102083.getClass(), "nodeComparator", null);
        setField(term102083, term102083.getClass(), "sortStrategy", null);
        setField(term102131, term102131.getClass(), "model", null);
        setField(term102131, term102131.getClass(), "sortKeys", term102132);
        setField(term102131, term102131.getClass(), "defaultSortKeys", term102135);
        setField(term102131, term102131.getClass(), "unsortableColumns", term102138);
        setField(term102131, term102131.getClass(), "nodeComparator", null);
        setField(term102131, term102131.getClass(), "sortStrategy", null);
        setField(term102131, term102131.getClass(), "viewToModelIndex", term102139);
        setIntElement(term102140, 0, -2117361140);
        setIntElement(term102140, 1, 407708341);
        setIntElement(term102140, 2, -287519200);
        setIntElement(term102140, 3, -1490696181);
        setIntElement(term102140, 4, 623717232);
        setIntElement(term102140, 5, -1413291732);
        setField(term102131, term102131.getClass(), "modelToViewIndex", term102140);
        setIntField(term102131, term102131.getClass(), "lastRowCount", 203264365);
        setBooleanField(term102131, term102131.getClass(), "rebuildIndices", true);
        setField(term102149, term102149.getClass(), "listenerList", null);
        setField(term102131, term102131.getClass(), "listenerList", term102149);
        setField(term102130, term102130.getClass(), "rowSorter", term102131);
        setIntField(term102130, term102130.getClass(), "modelIndex", -1066281036);
        setElement(term102129, 0, term102130);
        setField(term102083, term102083.getClass(), "viewToModelIndex", term102129);
        setField(term102083, term102083.getClass(), "modelToViewIndex", term102151);
        setIntField(term102083, term102083.getClass(), "lastRowCount", 30837706);
        setBooleanField(term102083, term102083.getClass(), "rebuildIndices", true);
        setField(term102154, term102154.getClass(), "listenerList", term102155);
        setField(term102083, term102083.getClass(), "listenerList", term102154);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "buildSortIndices", argTypes, term102083, args);
    }

};


