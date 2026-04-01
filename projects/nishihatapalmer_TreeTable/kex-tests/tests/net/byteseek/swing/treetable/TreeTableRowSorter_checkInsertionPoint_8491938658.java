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

public class TreeTableRowSorter_checkInsertionPoint_8491938658 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105438;
     Object term105508;
     Object term105510;

    public TreeTableRowSorter_checkInsertionPoint_8491938658() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term105441 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term105443 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term105441, term105441.getClass(), "column", 2003356558);
        setField(term105443, term105443.getClass(), "name", null);
        setIntField(term105443, term105443.getClass(), "ordinal", 0);
        setField(term105441, term105441.getClass(), "sortOrder", term105443);
        Object term105445 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term105445, term105445.getClass(), "column", -638126185);
        setField(term105445, term105445.getClass(), "sortOrder", term105443);
        Object term105447 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term105449 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term105447, term105447.getClass(), "column", 28070985);
        setField(term105449, term105449.getClass(), "name", null);
        setIntField(term105449, term105449.getClass(), "ordinal", 2);
        setField(term105447, term105447.getClass(), "sortOrder", term105449);
        Object term105451 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term105451, term105451.getClass(), "column", 334110739);
        setField(term105451, term105451.getClass(), "sortOrder", term105449);
        ArrayList term105439 = new ArrayList();
        ((ArrayList) term105439).add(term105441);
        ((ArrayList) term105439).add(term105445);
        ((ArrayList) term105439).add(term105447);
        ((ArrayList) term105439).add(term105451);
        ArrayList term105455 = new ArrayList();
        HashMap term105460 = new HashMap();
        Set<Object> term105512 =  ((Map) term105460).keySet();
        HashSet term105459 = new HashSet((Collection<? extends Object>) term105512);
        ArrayList term105473 = new ArrayList();
        ((ArrayList) term105473).add((Object)null);
        ((ArrayList) term105473).add((Object)null);
        ArrayList term105476 = new ArrayList();
        HashSet term105479 = new HashSet();
        ArrayList term105493 = new ArrayList();
        ((ArrayList) term105493).add((Object)null);
        ((ArrayList) term105493).add((Object)null);
        ((ArrayList) term105493).add((Object)null);
        ((ArrayList) term105493).add((Object)null);
        ((ArrayList) term105493).add((Object)null);
        ((ArrayList) term105493).add((Object)null);
        ((ArrayList) term105493).add((Object)null);
        ArrayList term105496 = new ArrayList();
        HashSet term105499 = new HashSet();
        term105438 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term105470 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 2);
        Object term105471 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term105472 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term105480 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 2);
        int[] term105481 = (int[]) newIntArray(5);
        Object term105489 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term105491 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term105492 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term105503 = (int[]) newIntArray(0);
        Object term105506 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term105507 = (Object[]) newArray("java.lang.Object", 0);
        setField(term105438, term105438.getClass(), "model", null);
        setField(term105438, term105438.getClass(), "sortKeys", term105439);
        setField(term105438, term105438.getClass(), "defaultSortKeys", term105455);
        setField(term105438, term105438.getClass(), "unsortableColumns", term105459);
        setField(term105438, term105438.getClass(), "nodeComparator", null);
        setField(term105438, term105438.getClass(), "sortStrategy", null);
        setField(term105472, term105472.getClass(), "model", null);
        setField(term105472, term105472.getClass(), "sortKeys", term105473);
        setField(term105472, term105472.getClass(), "defaultSortKeys", term105476);
        setField(term105472, term105472.getClass(), "unsortableColumns", term105479);
        setField(term105472, term105472.getClass(), "nodeComparator", null);
        setField(term105472, term105472.getClass(), "sortStrategy", null);
        setField(term105472, term105472.getClass(), "viewToModelIndex", term105480);
        setIntElement(term105481, 0, 1543539715);
        setIntElement(term105481, 1, 1744599521);
        setIntElement(term105481, 2, -985141153);
        setIntElement(term105481, 3, -1983740361);
        setIntElement(term105481, 4, -1494716341);
        setField(term105472, term105472.getClass(), "modelToViewIndex", term105481);
        setIntField(term105472, term105472.getClass(), "lastRowCount", 816237851);
        setBooleanField(term105472, term105472.getClass(), "rebuildIndices", false);
        setField(term105489, term105489.getClass(), "listenerList", null);
        setField(term105472, term105472.getClass(), "listenerList", term105489);
        setField(term105471, term105471.getClass(), "rowSorter", term105472);
        setIntField(term105471, term105471.getClass(), "modelIndex", -604114341);
        setElement(term105470, 0, term105471);
        setField(term105492, term105492.getClass(), "model", null);
        setField(term105492, term105492.getClass(), "sortKeys", term105493);
        setField(term105492, term105492.getClass(), "defaultSortKeys", term105496);
        setField(term105492, term105492.getClass(), "unsortableColumns", term105499);
        setField(term105492, term105492.getClass(), "nodeComparator", null);
        setField(term105492, term105492.getClass(), "sortStrategy", null);
        setField(term105492, term105492.getClass(), "viewToModelIndex", null);
        setField(term105492, term105492.getClass(), "modelToViewIndex", null);
        setIntField(term105492, term105492.getClass(), "lastRowCount", 0);
        setBooleanField(term105492, term105492.getClass(), "rebuildIndices", false);
        setField(term105492, term105492.getClass(), "listenerList", null);
        setField(term105491, term105491.getClass(), "rowSorter", term105492);
        setIntField(term105491, term105491.getClass(), "modelIndex", 1146236760);
        setElement(term105470, 1, term105491);
        setField(term105438, term105438.getClass(), "viewToModelIndex", term105470);
        setField(term105438, term105438.getClass(), "modelToViewIndex", term105503);
        setIntField(term105438, term105438.getClass(), "lastRowCount", 985801789);
        setBooleanField(term105438, term105438.getClass(), "rebuildIndices", true);
        setField(term105506, term105506.getClass(), "listenerList", term105507);
        setField(term105438, term105438.getClass(), "listenerList", term105506);
        term105508 = new Integer(-1628536749);
        term105510 = new Integer(-748022064);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term105508;
        args[1] = term105510;
        callMethod(klass, "checkInsertionPoint", argTypes, term105438, args);
    }

};


