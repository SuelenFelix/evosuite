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

public class TreeTableRowSorter_getSortKeys_2016667239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100394;

    public TreeTableRowSorter_getSortKeys_2016667239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term100395 = new ArrayList();
        ArrayList term100399 = new ArrayList();
        HashMap term100404 = new HashMap();
        Set<Object> term100473 =  ((Map) term100404).keySet();
        HashSet term100403 = new HashSet((Collection<? extends Object>) term100473);
        ArrayList term100425 = new ArrayList();
        ((ArrayList) term100425).add((Object)null);
        ((ArrayList) term100425).add((Object)null);
        ((ArrayList) term100425).add((Object)null);
        ((ArrayList) term100425).add((Object)null);
        ((ArrayList) term100425).add((Object)null);
        ((ArrayList) term100425).add((Object)null);
        ((ArrayList) term100425).add((Object)null);
        ((ArrayList) term100425).add((Object)null);
        ArrayList term100428 = new ArrayList();
        HashSet term100431 = new HashSet();
        ArrayList term100444 = new ArrayList();
        ((ArrayList) term100444).add((Object)null);
        ((ArrayList) term100444).add((Object)null);
        ((ArrayList) term100444).add((Object)null);
        ((ArrayList) term100444).add((Object)null);
        ((ArrayList) term100444).add((Object)null);
        ((ArrayList) term100444).add((Object)null);
        ArrayList term100447 = new ArrayList();
        HashSet term100450 = new HashSet();
        term100394 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term100422 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 5);
        Object term100423 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term100424 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term100432 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 7);
        int[] term100433 = (int[]) newIntArray(4);
        Object term100440 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term100442 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term100443 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term100454 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term100455 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term100459 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term100460 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term100464 = (int[]) newIntArray(4);
        Object term100471 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term100472 = (Object[]) newArray("java.lang.Object", 0);
        setField(term100394, term100394.getClass(), "model", null);
        setField(term100394, term100394.getClass(), "sortKeys", term100395);
        setField(term100394, term100394.getClass(), "defaultSortKeys", term100399);
        setField(term100394, term100394.getClass(), "unsortableColumns", term100403);
        setField(term100394, term100394.getClass(), "nodeComparator", null);
        setField(term100394, term100394.getClass(), "sortStrategy", null);
        setField(term100424, term100424.getClass(), "model", null);
        setField(term100424, term100424.getClass(), "sortKeys", term100425);
        setField(term100424, term100424.getClass(), "defaultSortKeys", term100428);
        setField(term100424, term100424.getClass(), "unsortableColumns", term100431);
        setField(term100424, term100424.getClass(), "nodeComparator", null);
        setField(term100424, term100424.getClass(), "sortStrategy", null);
        setField(term100424, term100424.getClass(), "viewToModelIndex", term100432);
        setIntElement(term100433, 0, -1421649118);
        setIntElement(term100433, 1, -511248284);
        setIntElement(term100433, 2, 788630042);
        setIntElement(term100433, 3, 1430066560);
        setField(term100424, term100424.getClass(), "modelToViewIndex", term100433);
        setIntField(term100424, term100424.getClass(), "lastRowCount", 836734074);
        setBooleanField(term100424, term100424.getClass(), "rebuildIndices", true);
        setField(term100440, term100440.getClass(), "listenerList", null);
        setField(term100424, term100424.getClass(), "listenerList", term100440);
        setField(term100423, term100423.getClass(), "rowSorter", term100424);
        setIntField(term100423, term100423.getClass(), "modelIndex", -1747711865);
        setElement(term100422, 0, term100423);
        setField(term100443, term100443.getClass(), "model", null);
        setField(term100443, term100443.getClass(), "sortKeys", term100444);
        setField(term100443, term100443.getClass(), "defaultSortKeys", term100447);
        setField(term100443, term100443.getClass(), "unsortableColumns", term100450);
        setField(term100443, term100443.getClass(), "nodeComparator", null);
        setField(term100443, term100443.getClass(), "sortStrategy", null);
        setField(term100443, term100443.getClass(), "viewToModelIndex", null);
        setField(term100443, term100443.getClass(), "modelToViewIndex", null);
        setIntField(term100443, term100443.getClass(), "lastRowCount", 0);
        setBooleanField(term100443, term100443.getClass(), "rebuildIndices", false);
        setField(term100443, term100443.getClass(), "listenerList", null);
        setField(term100442, term100442.getClass(), "rowSorter", term100443);
        setIntField(term100442, term100442.getClass(), "modelIndex", 682812715);
        setElement(term100422, 1, term100442);
        setField(term100455, term100455.getClass(), "model", null);
        setField(term100455, term100455.getClass(), "sortKeys", null);
        setField(term100455, term100455.getClass(), "defaultSortKeys", null);
        setField(term100455, term100455.getClass(), "unsortableColumns", null);
        setField(term100455, term100455.getClass(), "nodeComparator", null);
        setField(term100455, term100455.getClass(), "sortStrategy", null);
        setField(term100455, term100455.getClass(), "viewToModelIndex", null);
        setField(term100455, term100455.getClass(), "modelToViewIndex", null);
        setIntField(term100455, term100455.getClass(), "lastRowCount", 0);
        setBooleanField(term100455, term100455.getClass(), "rebuildIndices", false);
        setField(term100455, term100455.getClass(), "listenerList", null);
        setField(term100454, term100454.getClass(), "rowSorter", term100455);
        setIntField(term100454, term100454.getClass(), "modelIndex", -1092883950);
        setElement(term100422, 2, term100454);
        setField(term100460, term100460.getClass(), "model", null);
        setField(term100460, term100460.getClass(), "sortKeys", null);
        setField(term100460, term100460.getClass(), "defaultSortKeys", null);
        setField(term100460, term100460.getClass(), "unsortableColumns", null);
        setField(term100460, term100460.getClass(), "nodeComparator", null);
        setField(term100460, term100460.getClass(), "sortStrategy", null);
        setField(term100460, term100460.getClass(), "viewToModelIndex", null);
        setField(term100460, term100460.getClass(), "modelToViewIndex", null);
        setIntField(term100460, term100460.getClass(), "lastRowCount", 0);
        setBooleanField(term100460, term100460.getClass(), "rebuildIndices", false);
        setField(term100460, term100460.getClass(), "listenerList", null);
        setField(term100459, term100459.getClass(), "rowSorter", term100460);
        setIntField(term100459, term100459.getClass(), "modelIndex", 380484139);
        setElement(term100422, 3, term100459);
        setElement(term100422, 4, term100459);
        setField(term100394, term100394.getClass(), "viewToModelIndex", term100422);
        setIntElement(term100464, 0, 950385621);
        setIntElement(term100464, 1, -232352320);
        setIntElement(term100464, 2, -232333014);
        setIntElement(term100464, 3, -139694079);
        setField(term100394, term100394.getClass(), "modelToViewIndex", term100464);
        setIntField(term100394, term100394.getClass(), "lastRowCount", -1602072035);
        setBooleanField(term100394, term100394.getClass(), "rebuildIndices", false);
        setField(term100471, term100471.getClass(), "listenerList", term100472);
        setField(term100394, term100394.getClass(), "listenerList", term100471);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSortKeys", argTypes, term100394, args);
    }

};


