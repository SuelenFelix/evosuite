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
import java.lang.Boolean;

public class TreeTableRowSorter_setRebuildIndices_114284153539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103500;
     Object term103569;

    public TreeTableRowSorter_setRebuildIndices_114284153539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term103501 = new ArrayList();
        ArrayList term103505 = new ArrayList();
        HashMap term103510 = new HashMap();
        Set<Object> term103571 =  ((Map) term103510).keySet();
        HashSet term103509 = new HashSet((Collection<? extends Object>) term103571);
        ArrayList term103527 = new ArrayList();
        ((ArrayList) term103527).add((Object)null);
        ((ArrayList) term103527).add((Object)null);
        ((ArrayList) term103527).add((Object)null);
        ((ArrayList) term103527).add((Object)null);
        ((ArrayList) term103527).add((Object)null);
        ((ArrayList) term103527).add((Object)null);
        ((ArrayList) term103527).add((Object)null);
        ((ArrayList) term103527).add((Object)null);
        ArrayList term103530 = new ArrayList();
        HashSet term103533 = new HashSet();
        ArrayList term103542 = new ArrayList();
        ((ArrayList) term103542).add((Object)null);
        ((ArrayList) term103542).add((Object)null);
        ((ArrayList) term103542).add((Object)null);
        ((ArrayList) term103542).add((Object)null);
        ((ArrayList) term103542).add((Object)null);
        ((ArrayList) term103542).add((Object)null);
        ((ArrayList) term103542).add((Object)null);
        ((ArrayList) term103542).add((Object)null);
        ((ArrayList) term103542).add((Object)null);
        ArrayList term103545 = new ArrayList();
        HashSet term103548 = new HashSet();
        term103500 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term103524 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 3);
        Object term103525 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term103526 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term103534 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 0);
        int[] term103535 = (int[]) newIntArray(0);
        Object term103538 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term103540 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term103541 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term103552 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term103553 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term103557 = (int[]) newIntArray(7);
        Object term103567 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term103568 = (Object[]) newArray("java.lang.Object", 0);
        setField(term103500, term103500.getClass(), "model", null);
        setField(term103500, term103500.getClass(), "sortKeys", term103501);
        setField(term103500, term103500.getClass(), "defaultSortKeys", term103505);
        setField(term103500, term103500.getClass(), "unsortableColumns", term103509);
        setField(term103500, term103500.getClass(), "nodeComparator", null);
        setField(term103500, term103500.getClass(), "sortStrategy", null);
        setField(term103526, term103526.getClass(), "model", null);
        setField(term103526, term103526.getClass(), "sortKeys", term103527);
        setField(term103526, term103526.getClass(), "defaultSortKeys", term103530);
        setField(term103526, term103526.getClass(), "unsortableColumns", term103533);
        setField(term103526, term103526.getClass(), "nodeComparator", null);
        setField(term103526, term103526.getClass(), "sortStrategy", null);
        setField(term103526, term103526.getClass(), "viewToModelIndex", term103534);
        setField(term103526, term103526.getClass(), "modelToViewIndex", term103535);
        setIntField(term103526, term103526.getClass(), "lastRowCount", -400720912);
        setBooleanField(term103526, term103526.getClass(), "rebuildIndices", true);
        setField(term103538, term103538.getClass(), "listenerList", null);
        setField(term103526, term103526.getClass(), "listenerList", term103538);
        setField(term103525, term103525.getClass(), "rowSorter", term103526);
        setIntField(term103525, term103525.getClass(), "modelIndex", 1266192397);
        setElement(term103524, 0, term103525);
        setField(term103541, term103541.getClass(), "model", null);
        setField(term103541, term103541.getClass(), "sortKeys", term103542);
        setField(term103541, term103541.getClass(), "defaultSortKeys", term103545);
        setField(term103541, term103541.getClass(), "unsortableColumns", term103548);
        setField(term103541, term103541.getClass(), "nodeComparator", null);
        setField(term103541, term103541.getClass(), "sortStrategy", null);
        setField(term103541, term103541.getClass(), "viewToModelIndex", null);
        setField(term103541, term103541.getClass(), "modelToViewIndex", null);
        setIntField(term103541, term103541.getClass(), "lastRowCount", 0);
        setBooleanField(term103541, term103541.getClass(), "rebuildIndices", false);
        setField(term103541, term103541.getClass(), "listenerList", null);
        setField(term103540, term103540.getClass(), "rowSorter", term103541);
        setIntField(term103540, term103540.getClass(), "modelIndex", 218346781);
        setElement(term103524, 1, term103540);
        setField(term103553, term103553.getClass(), "model", null);
        setField(term103553, term103553.getClass(), "sortKeys", null);
        setField(term103553, term103553.getClass(), "defaultSortKeys", null);
        setField(term103553, term103553.getClass(), "unsortableColumns", null);
        setField(term103553, term103553.getClass(), "nodeComparator", null);
        setField(term103553, term103553.getClass(), "sortStrategy", null);
        setField(term103553, term103553.getClass(), "viewToModelIndex", null);
        setField(term103553, term103553.getClass(), "modelToViewIndex", null);
        setIntField(term103553, term103553.getClass(), "lastRowCount", 0);
        setBooleanField(term103553, term103553.getClass(), "rebuildIndices", false);
        setField(term103553, term103553.getClass(), "listenerList", null);
        setField(term103552, term103552.getClass(), "rowSorter", term103553);
        setIntField(term103552, term103552.getClass(), "modelIndex", -984660976);
        setElement(term103524, 2, term103552);
        setField(term103500, term103500.getClass(), "viewToModelIndex", term103524);
        setIntElement(term103557, 0, -1419341969);
        setIntElement(term103557, 1, -89522625);
        setIntElement(term103557, 2, 1475906894);
        setIntElement(term103557, 3, -2004794532);
        setIntElement(term103557, 4, 1232958763);
        setIntElement(term103557, 5, -1702132549);
        setIntElement(term103557, 6, -1786136772);
        setField(term103500, term103500.getClass(), "modelToViewIndex", term103557);
        setIntField(term103500, term103500.getClass(), "lastRowCount", -1510967747);
        setBooleanField(term103500, term103500.getClass(), "rebuildIndices", true);
        setField(term103567, term103567.getClass(), "listenerList", term103568);
        setField(term103500, term103500.getClass(), "listenerList", term103567);
        term103569 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term103569;
        callMethod(klass, "setRebuildIndices", argTypes, term103500, args);
    }

};


