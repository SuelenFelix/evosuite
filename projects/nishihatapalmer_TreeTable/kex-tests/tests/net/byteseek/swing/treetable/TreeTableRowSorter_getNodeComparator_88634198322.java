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

public class TreeTableRowSorter_getNodeComparator_88634198322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101175;

    public TreeTableRowSorter_getNodeComparator_88634198322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term101178 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term101180 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term101178, term101178.getClass(), "column", 848113442);
        setField(term101180, term101180.getClass(), "name", null);
        setIntField(term101180, term101180.getClass(), "ordinal", 0);
        setField(term101178, term101178.getClass(), "sortOrder", term101180);
        Object term101182 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term101184 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term101182, term101182.getClass(), "column", 793974213);
        setField(term101184, term101184.getClass(), "name", null);
        setIntField(term101184, term101184.getClass(), "ordinal", 2);
        setField(term101182, term101182.getClass(), "sortOrder", term101184);
        ArrayList term101176 = new ArrayList();
        ((ArrayList) term101176).add(term101178);
        ((ArrayList) term101176).add(term101182);
        ArrayList term101188 = new ArrayList();
        HashMap term101193 = new HashMap();
        Set<Object> term101277 =  ((Map) term101193).keySet();
        HashSet term101192 = new HashSet((Collection<? extends Object>) term101277);
        ArrayList term101230 = new ArrayList();
        ArrayList term101233 = new ArrayList();
        HashSet term101236 = new HashSet();
        ArrayList term101251 = new ArrayList();
        ((ArrayList) term101251).add((Object)null);
        ((ArrayList) term101251).add((Object)null);
        ((ArrayList) term101251).add((Object)null);
        ((ArrayList) term101251).add((Object)null);
        ArrayList term101254 = new ArrayList();
        HashSet term101257 = new HashSet();
        term101175 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term101227 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 4);
        Object term101228 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term101229 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term101237 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 1);
        int[] term101238 = (int[]) newIntArray(6);
        Object term101247 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term101249 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term101250 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term101261 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term101262 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term101266 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term101267 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term101271 = (int[]) newIntArray(1);
        Object term101275 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term101276 = (Object[]) newArray("java.lang.Object", 0);
        setField(term101175, term101175.getClass(), "model", null);
        setField(term101175, term101175.getClass(), "sortKeys", term101176);
        setField(term101175, term101175.getClass(), "defaultSortKeys", term101188);
        setField(term101175, term101175.getClass(), "unsortableColumns", term101192);
        setField(term101175, term101175.getClass(), "nodeComparator", null);
        setField(term101175, term101175.getClass(), "sortStrategy", null);
        setField(term101229, term101229.getClass(), "model", null);
        setField(term101229, term101229.getClass(), "sortKeys", term101230);
        setField(term101229, term101229.getClass(), "defaultSortKeys", term101233);
        setField(term101229, term101229.getClass(), "unsortableColumns", term101236);
        setField(term101229, term101229.getClass(), "nodeComparator", null);
        setField(term101229, term101229.getClass(), "sortStrategy", null);
        setField(term101229, term101229.getClass(), "viewToModelIndex", term101237);
        setIntElement(term101238, 0, -2060284160);
        setIntElement(term101238, 1, -568450686);
        setIntElement(term101238, 2, 1314660281);
        setIntElement(term101238, 3, -126399768);
        setIntElement(term101238, 4, 318982923);
        setIntElement(term101238, 5, -154210001);
        setField(term101229, term101229.getClass(), "modelToViewIndex", term101238);
        setIntField(term101229, term101229.getClass(), "lastRowCount", 621910137);
        setBooleanField(term101229, term101229.getClass(), "rebuildIndices", true);
        setField(term101247, term101247.getClass(), "listenerList", null);
        setField(term101229, term101229.getClass(), "listenerList", term101247);
        setField(term101228, term101228.getClass(), "rowSorter", term101229);
        setIntField(term101228, term101228.getClass(), "modelIndex", 241533020);
        setElement(term101227, 0, term101228);
        setField(term101250, term101250.getClass(), "model", null);
        setField(term101250, term101250.getClass(), "sortKeys", term101251);
        setField(term101250, term101250.getClass(), "defaultSortKeys", term101254);
        setField(term101250, term101250.getClass(), "unsortableColumns", term101257);
        setField(term101250, term101250.getClass(), "nodeComparator", null);
        setField(term101250, term101250.getClass(), "sortStrategy", null);
        setField(term101250, term101250.getClass(), "viewToModelIndex", null);
        setField(term101250, term101250.getClass(), "modelToViewIndex", null);
        setIntField(term101250, term101250.getClass(), "lastRowCount", 0);
        setBooleanField(term101250, term101250.getClass(), "rebuildIndices", false);
        setField(term101250, term101250.getClass(), "listenerList", null);
        setField(term101249, term101249.getClass(), "rowSorter", term101250);
        setIntField(term101249, term101249.getClass(), "modelIndex", 2081679151);
        setElement(term101227, 1, term101249);
        setField(term101262, term101262.getClass(), "model", null);
        setField(term101262, term101262.getClass(), "sortKeys", null);
        setField(term101262, term101262.getClass(), "defaultSortKeys", null);
        setField(term101262, term101262.getClass(), "unsortableColumns", null);
        setField(term101262, term101262.getClass(), "nodeComparator", null);
        setField(term101262, term101262.getClass(), "sortStrategy", null);
        setField(term101262, term101262.getClass(), "viewToModelIndex", null);
        setField(term101262, term101262.getClass(), "modelToViewIndex", null);
        setIntField(term101262, term101262.getClass(), "lastRowCount", 0);
        setBooleanField(term101262, term101262.getClass(), "rebuildIndices", false);
        setField(term101262, term101262.getClass(), "listenerList", null);
        setField(term101261, term101261.getClass(), "rowSorter", term101262);
        setIntField(term101261, term101261.getClass(), "modelIndex", -1030167086);
        setElement(term101227, 2, term101261);
        setField(term101267, term101267.getClass(), "model", null);
        setField(term101267, term101267.getClass(), "sortKeys", null);
        setField(term101267, term101267.getClass(), "defaultSortKeys", null);
        setField(term101267, term101267.getClass(), "unsortableColumns", null);
        setField(term101267, term101267.getClass(), "nodeComparator", null);
        setField(term101267, term101267.getClass(), "sortStrategy", null);
        setField(term101267, term101267.getClass(), "viewToModelIndex", null);
        setField(term101267, term101267.getClass(), "modelToViewIndex", null);
        setIntField(term101267, term101267.getClass(), "lastRowCount", 0);
        setBooleanField(term101267, term101267.getClass(), "rebuildIndices", false);
        setField(term101267, term101267.getClass(), "listenerList", null);
        setField(term101266, term101266.getClass(), "rowSorter", term101267);
        setIntField(term101266, term101266.getClass(), "modelIndex", -434230943);
        setElement(term101227, 3, term101266);
        setField(term101175, term101175.getClass(), "viewToModelIndex", term101227);
        setIntElement(term101271, 0, 698633875);
        setField(term101175, term101175.getClass(), "modelToViewIndex", term101271);
        setIntField(term101175, term101175.getClass(), "lastRowCount", 548468113);
        setBooleanField(term101175, term101175.getClass(), "rebuildIndices", false);
        setField(term101275, term101275.getClass(), "listenerList", term101276);
        setField(term101175, term101175.getClass(), "listenerList", term101275);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNodeComparator", argTypes, term101175, args);
    }

};


