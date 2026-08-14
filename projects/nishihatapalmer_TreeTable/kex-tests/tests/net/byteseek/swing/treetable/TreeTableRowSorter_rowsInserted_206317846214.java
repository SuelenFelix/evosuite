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

public class TreeTableRowSorter_rowsInserted_206317846214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100240;
     Object term100335;
     Object term100337;

    public TreeTableRowSorter_rowsInserted_206317846214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term100243 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term100245 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term100243, term100243.getClass(), "column", -191639503);
        setField(term100245, term100245.getClass(), "name", null);
        setIntField(term100245, term100245.getClass(), "ordinal", 0);
        setField(term100243, term100243.getClass(), "sortOrder", term100245);
        Object term100247 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term100249 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term100247, term100247.getClass(), "column", -1563700756);
        setField(term100249, term100249.getClass(), "name", null);
        setIntField(term100249, term100249.getClass(), "ordinal", 2);
        setField(term100247, term100247.getClass(), "sortOrder", term100249);
        Object term100251 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term100253 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term100251, term100251.getClass(), "column", -208314837);
        setField(term100253, term100253.getClass(), "name", null);
        setIntField(term100253, term100253.getClass(), "ordinal", 1);
        setField(term100251, term100251.getClass(), "sortOrder", term100253);
        Object term100255 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term100255, term100255.getClass(), "column", 697841387);
        setField(term100255, term100255.getClass(), "sortOrder", term100245);
        Object term100257 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term100257, term100257.getClass(), "column", -1749591213);
        setField(term100257, term100257.getClass(), "sortOrder", term100249);
        Object term100259 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term100259, term100259.getClass(), "column", 1703093401);
        setField(term100259, term100259.getClass(), "sortOrder", term100245);
        Object term100261 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term100261, term100261.getClass(), "column", 47607734);
        setField(term100261, term100261.getClass(), "sortOrder", term100245);
        Object term100263 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term100263, term100263.getClass(), "column", 1717232691);
        setField(term100263, term100263.getClass(), "sortOrder", term100249);
        ArrayList term100241 = new ArrayList();
        ((ArrayList) term100241).add(term100243);
        ((ArrayList) term100241).add(term100247);
        ((ArrayList) term100241).add(term100251);
        ((ArrayList) term100241).add(term100255);
        ((ArrayList) term100241).add(term100257);
        ((ArrayList) term100241).add(term100259);
        ((ArrayList) term100241).add(term100261);
        ((ArrayList) term100241).add(term100263);
        ArrayList term100267 = new ArrayList();
        HashMap term100272 = new HashMap();
        Set<Object> term100339 =  ((Map) term100272).keySet();
        HashSet term100271 = new HashSet((Collection<? extends Object>) term100339);
        ArrayList term100301 = new ArrayList();
        ((ArrayList) term100301).add((Object)null);
        ((ArrayList) term100301).add((Object)null);
        ((ArrayList) term100301).add((Object)null);
        ArrayList term100304 = new ArrayList();
        HashSet term100307 = new HashSet();
        ArrayList term100320 = new ArrayList();
        ((ArrayList) term100320).add((Object)null);
        ((ArrayList) term100320).add((Object)null);
        ((ArrayList) term100320).add((Object)null);
        ((ArrayList) term100320).add((Object)null);
        ArrayList term100323 = new ArrayList();
        HashSet term100326 = new HashSet();
        term100240 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term100298 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 2);
        Object term100299 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term100300 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term100308 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 5);
        int[] term100309 = (int[]) newIntArray(4);
        Object term100316 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term100318 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term100319 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term100330 = (int[]) newIntArray(0);
        Object term100333 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term100334 = (Object[]) newArray("java.lang.Object", 0);
        setField(term100240, term100240.getClass(), "model", null);
        setField(term100240, term100240.getClass(), "sortKeys", term100241);
        setField(term100240, term100240.getClass(), "defaultSortKeys", term100267);
        setField(term100240, term100240.getClass(), "unsortableColumns", term100271);
        setField(term100240, term100240.getClass(), "nodeComparator", null);
        setField(term100240, term100240.getClass(), "sortStrategy", null);
        setField(term100300, term100300.getClass(), "model", null);
        setField(term100300, term100300.getClass(), "sortKeys", term100301);
        setField(term100300, term100300.getClass(), "defaultSortKeys", term100304);
        setField(term100300, term100300.getClass(), "unsortableColumns", term100307);
        setField(term100300, term100300.getClass(), "nodeComparator", null);
        setField(term100300, term100300.getClass(), "sortStrategy", null);
        setField(term100300, term100300.getClass(), "viewToModelIndex", term100308);
        setIntElement(term100309, 0, 1073400519);
        setIntElement(term100309, 1, -2025555268);
        setIntElement(term100309, 2, -746950289);
        setIntElement(term100309, 3, -137577510);
        setField(term100300, term100300.getClass(), "modelToViewIndex", term100309);
        setIntField(term100300, term100300.getClass(), "lastRowCount", 719185716);
        setBooleanField(term100300, term100300.getClass(), "rebuildIndices", false);
        setField(term100316, term100316.getClass(), "listenerList", null);
        setField(term100300, term100300.getClass(), "listenerList", term100316);
        setField(term100299, term100299.getClass(), "rowSorter", term100300);
        setIntField(term100299, term100299.getClass(), "modelIndex", 1624820010);
        setElement(term100298, 0, term100299);
        setField(term100319, term100319.getClass(), "model", null);
        setField(term100319, term100319.getClass(), "sortKeys", term100320);
        setField(term100319, term100319.getClass(), "defaultSortKeys", term100323);
        setField(term100319, term100319.getClass(), "unsortableColumns", term100326);
        setField(term100319, term100319.getClass(), "nodeComparator", null);
        setField(term100319, term100319.getClass(), "sortStrategy", null);
        setField(term100319, term100319.getClass(), "viewToModelIndex", null);
        setField(term100319, term100319.getClass(), "modelToViewIndex", null);
        setIntField(term100319, term100319.getClass(), "lastRowCount", 0);
        setBooleanField(term100319, term100319.getClass(), "rebuildIndices", false);
        setField(term100319, term100319.getClass(), "listenerList", null);
        setField(term100318, term100318.getClass(), "rowSorter", term100319);
        setIntField(term100318, term100318.getClass(), "modelIndex", -831921156);
        setElement(term100298, 1, term100318);
        setField(term100240, term100240.getClass(), "viewToModelIndex", term100298);
        setField(term100240, term100240.getClass(), "modelToViewIndex", term100330);
        setIntField(term100240, term100240.getClass(), "lastRowCount", -2085566906);
        setBooleanField(term100240, term100240.getClass(), "rebuildIndices", true);
        setField(term100333, term100333.getClass(), "listenerList", term100334);
        setField(term100240, term100240.getClass(), "listenerList", term100333);
        term100335 = new Integer(1773193728);
        term100337 = new Integer(-1341357647);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term100335;
        args[1] = term100337;
        callMethod(klass, "rowsInserted", argTypes, term100240, args);
    }

};


