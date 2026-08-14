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

public class TreeTableRowSorter_checkValidColumn_61367919754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104606;
     Object term104686;

    public TreeTableRowSorter_checkValidColumn_61367919754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term104609 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term104611 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term104609, term104609.getClass(), "column", 1680632578);
        setField(term104611, term104611.getClass(), "name", null);
        setIntField(term104611, term104611.getClass(), "ordinal", 1);
        setField(term104609, term104609.getClass(), "sortOrder", term104611);
        Object term104613 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term104615 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term104613, term104613.getClass(), "column", 511399994);
        setField(term104615, term104615.getClass(), "name", null);
        setIntField(term104615, term104615.getClass(), "ordinal", 0);
        setField(term104613, term104613.getClass(), "sortOrder", term104615);
        Object term104617 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term104619 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term104617, term104617.getClass(), "column", 2094923086);
        setField(term104619, term104619.getClass(), "name", null);
        setIntField(term104619, term104619.getClass(), "ordinal", 2);
        setField(term104617, term104617.getClass(), "sortOrder", term104619);
        Object term104621 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term104621, term104621.getClass(), "column", 1532355365);
        setField(term104621, term104621.getClass(), "sortOrder", term104615);
        Object term104623 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term104623, term104623.getClass(), "column", -156316508);
        setField(term104623, term104623.getClass(), "sortOrder", term104619);
        Object term104625 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term104625, term104625.getClass(), "column", -1304449497);
        setField(term104625, term104625.getClass(), "sortOrder", term104615);
        ArrayList term104607 = new ArrayList();
        ((ArrayList) term104607).add(term104609);
        ((ArrayList) term104607).add(term104613);
        ((ArrayList) term104607).add(term104617);
        ((ArrayList) term104607).add(term104621);
        ((ArrayList) term104607).add(term104623);
        ((ArrayList) term104607).add(term104625);
        ArrayList term104629 = new ArrayList();
        HashMap term104634 = new HashMap();
        Set<Object> term104688 =  ((Map) term104634).keySet();
        HashSet term104633 = new HashSet((Collection<? extends Object>) term104688);
        ArrayList term104663 = new ArrayList();
        ((ArrayList) term104663).add((Object)null);
        ((ArrayList) term104663).add((Object)null);
        ((ArrayList) term104663).add((Object)null);
        ((ArrayList) term104663).add((Object)null);
        ((ArrayList) term104663).add((Object)null);
        ArrayList term104666 = new ArrayList();
        HashSet term104669 = new HashSet();
        term104606 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term104660 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 1);
        Object term104661 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term104662 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term104670 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 4);
        int[] term104671 = (int[]) newIntArray(1);
        Object term104675 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        int[] term104677 = (int[]) newIntArray(4);
        Object term104684 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term104685 = (Object[]) newArray("java.lang.Object", 0);
        setField(term104606, term104606.getClass(), "model", null);
        setField(term104606, term104606.getClass(), "sortKeys", term104607);
        setField(term104606, term104606.getClass(), "defaultSortKeys", term104629);
        setField(term104606, term104606.getClass(), "unsortableColumns", term104633);
        setField(term104606, term104606.getClass(), "nodeComparator", null);
        setField(term104606, term104606.getClass(), "sortStrategy", null);
        setField(term104662, term104662.getClass(), "model", null);
        setField(term104662, term104662.getClass(), "sortKeys", term104663);
        setField(term104662, term104662.getClass(), "defaultSortKeys", term104666);
        setField(term104662, term104662.getClass(), "unsortableColumns", term104669);
        setField(term104662, term104662.getClass(), "nodeComparator", null);
        setField(term104662, term104662.getClass(), "sortStrategy", null);
        setField(term104662, term104662.getClass(), "viewToModelIndex", term104670);
        setIntElement(term104671, 0, 975753484);
        setField(term104662, term104662.getClass(), "modelToViewIndex", term104671);
        setIntField(term104662, term104662.getClass(), "lastRowCount", -1886360357);
        setBooleanField(term104662, term104662.getClass(), "rebuildIndices", false);
        setField(term104675, term104675.getClass(), "listenerList", null);
        setField(term104662, term104662.getClass(), "listenerList", term104675);
        setField(term104661, term104661.getClass(), "rowSorter", term104662);
        setIntField(term104661, term104661.getClass(), "modelIndex", -235867268);
        setElement(term104660, 0, term104661);
        setField(term104606, term104606.getClass(), "viewToModelIndex", term104660);
        setIntElement(term104677, 0, -972330704);
        setIntElement(term104677, 1, 134173297);
        setIntElement(term104677, 2, 2025698852);
        setIntElement(term104677, 3, 113961338);
        setField(term104606, term104606.getClass(), "modelToViewIndex", term104677);
        setIntField(term104606, term104606.getClass(), "lastRowCount", 1869277085);
        setBooleanField(term104606, term104606.getClass(), "rebuildIndices", false);
        setField(term104684, term104684.getClass(), "listenerList", term104685);
        setField(term104606, term104606.getClass(), "listenerList", term104684);
        term104686 = new Integer(498801287);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term104686;
        callMethod(klass, "checkValidColumn", argTypes, term104606, args);
    }

};


