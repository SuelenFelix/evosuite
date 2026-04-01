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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Integer;

public class TreeTableRowSorter_rowsUpdated_50757159517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101149;
     Object term101233;
     Object term101235;
     Object term101237;

    public TreeTableRowSorter_rowsUpdated_50757159517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term101150 = new ArrayList();
        ArrayList term101154 = new ArrayList();
        HashMap term101159 = new HashMap();
        Set<Object> term101239 =  ((Map) term101159).keySet();
        HashSet term101158 = new HashSet((Collection<? extends Object>) term101239);
        ArrayList term101180 = new ArrayList();
        ((ArrayList) term101180).add((Object)null);
        ((ArrayList) term101180).add((Object)null);
        ((ArrayList) term101180).add((Object)null);
        ((ArrayList) term101180).add((Object)null);
        ArrayList term101183 = new ArrayList();
        HashSet term101186 = new HashSet();
        ArrayList term101203 = new ArrayList();
        ((ArrayList) term101203).add((Object)null);
        ((ArrayList) term101203).add((Object)null);
        ArrayList term101206 = new ArrayList();
        HashSet term101209 = new HashSet();
        term101149 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term101177 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 5);
        Object term101178 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term101179 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term101187 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 2);
        int[] term101188 = (int[]) newIntArray(8);
        Object term101199 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term101201 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term101202 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term101213 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term101214 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term101218 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term101219 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term101223 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term101224 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term101228 = (int[]) newIntArray(0);
        Object term101231 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term101232 = (Object[]) newArray("java.lang.Object", 0);
        setField(term101149, term101149.getClass(), "model", null);
        setField(term101149, term101149.getClass(), "sortKeys", term101150);
        setField(term101149, term101149.getClass(), "defaultSortKeys", term101154);
        setField(term101149, term101149.getClass(), "unsortableColumns", term101158);
        setField(term101149, term101149.getClass(), "nodeComparator", null);
        setField(term101149, term101149.getClass(), "sortStrategy", null);
        setField(term101179, term101179.getClass(), "model", null);
        setField(term101179, term101179.getClass(), "sortKeys", term101180);
        setField(term101179, term101179.getClass(), "defaultSortKeys", term101183);
        setField(term101179, term101179.getClass(), "unsortableColumns", term101186);
        setField(term101179, term101179.getClass(), "nodeComparator", null);
        setField(term101179, term101179.getClass(), "sortStrategy", null);
        setField(term101179, term101179.getClass(), "viewToModelIndex", term101187);
        setIntElement(term101188, 0, 1068256001);
        setIntElement(term101188, 1, 1139078354);
        setIntElement(term101188, 2, -691164974);
        setIntElement(term101188, 3, -761675396);
        setIntElement(term101188, 4, -1954860951);
        setIntElement(term101188, 5, -2078879114);
        setIntElement(term101188, 6, -1186882318);
        setIntElement(term101188, 7, 1077647088);
        setField(term101179, term101179.getClass(), "modelToViewIndex", term101188);
        setIntField(term101179, term101179.getClass(), "lastRowCount", -705176810);
        setBooleanField(term101179, term101179.getClass(), "rebuildIndices", true);
        setField(term101199, term101199.getClass(), "listenerList", null);
        setField(term101179, term101179.getClass(), "listenerList", term101199);
        setField(term101178, term101178.getClass(), "rowSorter", term101179);
        setIntField(term101178, term101178.getClass(), "modelIndex", -1584779593);
        setElement(term101177, 0, term101178);
        setField(term101202, term101202.getClass(), "model", null);
        setField(term101202, term101202.getClass(), "sortKeys", term101203);
        setField(term101202, term101202.getClass(), "defaultSortKeys", term101206);
        setField(term101202, term101202.getClass(), "unsortableColumns", term101209);
        setField(term101202, term101202.getClass(), "nodeComparator", null);
        setField(term101202, term101202.getClass(), "sortStrategy", null);
        setField(term101202, term101202.getClass(), "viewToModelIndex", null);
        setField(term101202, term101202.getClass(), "modelToViewIndex", null);
        setIntField(term101202, term101202.getClass(), "lastRowCount", 0);
        setBooleanField(term101202, term101202.getClass(), "rebuildIndices", false);
        setField(term101202, term101202.getClass(), "listenerList", null);
        setField(term101201, term101201.getClass(), "rowSorter", term101202);
        setIntField(term101201, term101201.getClass(), "modelIndex", 303007547);
        setElement(term101177, 1, term101201);
        setField(term101214, term101214.getClass(), "model", null);
        setField(term101214, term101214.getClass(), "sortKeys", null);
        setField(term101214, term101214.getClass(), "defaultSortKeys", null);
        setField(term101214, term101214.getClass(), "unsortableColumns", null);
        setField(term101214, term101214.getClass(), "nodeComparator", null);
        setField(term101214, term101214.getClass(), "sortStrategy", null);
        setField(term101214, term101214.getClass(), "viewToModelIndex", null);
        setField(term101214, term101214.getClass(), "modelToViewIndex", null);
        setIntField(term101214, term101214.getClass(), "lastRowCount", 0);
        setBooleanField(term101214, term101214.getClass(), "rebuildIndices", false);
        setField(term101214, term101214.getClass(), "listenerList", null);
        setField(term101213, term101213.getClass(), "rowSorter", term101214);
        setIntField(term101213, term101213.getClass(), "modelIndex", 1498738343);
        setElement(term101177, 2, term101213);
        setField(term101219, term101219.getClass(), "model", null);
        setField(term101219, term101219.getClass(), "sortKeys", null);
        setField(term101219, term101219.getClass(), "defaultSortKeys", null);
        setField(term101219, term101219.getClass(), "unsortableColumns", null);
        setField(term101219, term101219.getClass(), "nodeComparator", null);
        setField(term101219, term101219.getClass(), "sortStrategy", null);
        setField(term101219, term101219.getClass(), "viewToModelIndex", null);
        setField(term101219, term101219.getClass(), "modelToViewIndex", null);
        setIntField(term101219, term101219.getClass(), "lastRowCount", 0);
        setBooleanField(term101219, term101219.getClass(), "rebuildIndices", false);
        setField(term101219, term101219.getClass(), "listenerList", null);
        setField(term101218, term101218.getClass(), "rowSorter", term101219);
        setIntField(term101218, term101218.getClass(), "modelIndex", -1635571857);
        setElement(term101177, 3, term101218);
        setField(term101224, term101224.getClass(), "model", null);
        setField(term101224, term101224.getClass(), "sortKeys", null);
        setField(term101224, term101224.getClass(), "defaultSortKeys", null);
        setField(term101224, term101224.getClass(), "unsortableColumns", null);
        setField(term101224, term101224.getClass(), "nodeComparator", null);
        setField(term101224, term101224.getClass(), "sortStrategy", null);
        setField(term101224, term101224.getClass(), "viewToModelIndex", null);
        setField(term101224, term101224.getClass(), "modelToViewIndex", null);
        setIntField(term101224, term101224.getClass(), "lastRowCount", 0);
        setBooleanField(term101224, term101224.getClass(), "rebuildIndices", false);
        setField(term101224, term101224.getClass(), "listenerList", null);
        setField(term101223, term101223.getClass(), "rowSorter", term101224);
        setIntField(term101223, term101223.getClass(), "modelIndex", 1407309162);
        setElement(term101177, 4, term101223);
        setField(term101149, term101149.getClass(), "viewToModelIndex", term101177);
        setField(term101149, term101149.getClass(), "modelToViewIndex", term101228);
        setIntField(term101149, term101149.getClass(), "lastRowCount", -534033672);
        setBooleanField(term101149, term101149.getClass(), "rebuildIndices", true);
        setField(term101231, term101231.getClass(), "listenerList", term101232);
        setField(term101149, term101149.getClass(), "listenerList", term101231);
        term101233 = new Integer(-1162790806);
        term101235 = new Integer(-1264595049);
        term101237 = new Integer(-2058884635);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term101233;
        args[1] = term101235;
        args[2] = term101237;
        callMethod(klass, "rowsUpdated", argTypes, term101149, args);
    }

};


