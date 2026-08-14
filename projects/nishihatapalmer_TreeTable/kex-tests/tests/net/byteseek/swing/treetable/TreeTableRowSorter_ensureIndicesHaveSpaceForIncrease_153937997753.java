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

public class TreeTableRowSorter_ensureIndicesHaveSpaceForIncrease_153937997753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104489;
     Object term104596;

    public TreeTableRowSorter_ensureIndicesHaveSpaceForIncrease_153937997753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term104492 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term104494 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term104492, term104492.getClass(), "column", -985141153);
        setField(term104494, term104494.getClass(), "name", null);
        setIntField(term104494, term104494.getClass(), "ordinal", 1);
        setField(term104492, term104492.getClass(), "sortOrder", term104494);
        Object term104496 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term104496, term104496.getClass(), "column", -1983740361);
        setField(term104496, term104496.getClass(), "sortOrder", term104494);
        Object term104498 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term104500 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term104498, term104498.getClass(), "column", -1494716341);
        setField(term104500, term104500.getClass(), "name", null);
        setIntField(term104500, term104500.getClass(), "ordinal", 0);
        setField(term104498, term104498.getClass(), "sortOrder", term104500);
        Object term104502 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term104502, term104502.getClass(), "column", 816237851);
        setField(term104502, term104502.getClass(), "sortOrder", term104500);
        Object term104504 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term104504, term104504.getClass(), "column", -604114341);
        setField(term104504, term104504.getClass(), "sortOrder", term104500);
        Object term104506 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term104508 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term104506, term104506.getClass(), "column", 1146236760);
        setField(term104508, term104508.getClass(), "name", null);
        setIntField(term104508, term104508.getClass(), "ordinal", 2);
        setField(term104506, term104506.getClass(), "sortOrder", term104508);
        Object term104510 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term104510, term104510.getClass(), "column", 985801789);
        setField(term104510, term104510.getClass(), "sortOrder", term104500);
        Object term104512 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term104512, term104512.getClass(), "column", -1628536749);
        setField(term104512, term104512.getClass(), "sortOrder", term104500);
        ArrayList term104490 = new ArrayList();
        ((ArrayList) term104490).add(term104492);
        ((ArrayList) term104490).add(term104496);
        ((ArrayList) term104490).add(term104498);
        ((ArrayList) term104490).add(term104502);
        ((ArrayList) term104490).add(term104504);
        ((ArrayList) term104490).add(term104506);
        ((ArrayList) term104490).add(term104510);
        ((ArrayList) term104490).add(term104512);
        ArrayList term104516 = new ArrayList();
        HashMap term104521 = new HashMap();
        Set<Object> term104598 =  ((Map) term104521).keySet();
        HashSet term104520 = new HashSet((Collection<? extends Object>) term104598);
        ArrayList term104554 = new ArrayList();
        ((ArrayList) term104554).add((Object)null);
        ((ArrayList) term104554).add((Object)null);
        ArrayList term104557 = new ArrayList();
        HashSet term104560 = new HashSet();
        ArrayList term104574 = new ArrayList();
        ((ArrayList) term104574).add((Object)null);
        ((ArrayList) term104574).add((Object)null);
        ((ArrayList) term104574).add((Object)null);
        ArrayList term104577 = new ArrayList();
        HashSet term104580 = new HashSet();
        term104489 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term104551 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 3);
        Object term104552 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term104553 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term104561 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 6);
        int[] term104562 = (int[]) newIntArray(5);
        Object term104570 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term104572 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term104573 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term104584 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term104585 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term104589 = (int[]) newIntArray(2);
        Object term104594 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term104595 = (Object[]) newArray("java.lang.Object", 0);
        setField(term104489, term104489.getClass(), "model", null);
        setField(term104489, term104489.getClass(), "sortKeys", term104490);
        setField(term104489, term104489.getClass(), "defaultSortKeys", term104516);
        setField(term104489, term104489.getClass(), "unsortableColumns", term104520);
        setField(term104489, term104489.getClass(), "nodeComparator", null);
        setField(term104489, term104489.getClass(), "sortStrategy", null);
        setField(term104553, term104553.getClass(), "model", null);
        setField(term104553, term104553.getClass(), "sortKeys", term104554);
        setField(term104553, term104553.getClass(), "defaultSortKeys", term104557);
        setField(term104553, term104553.getClass(), "unsortableColumns", term104560);
        setField(term104553, term104553.getClass(), "nodeComparator", null);
        setField(term104553, term104553.getClass(), "sortStrategy", null);
        setField(term104553, term104553.getClass(), "viewToModelIndex", term104561);
        setIntElement(term104562, 0, -288619829);
        setIntElement(term104562, 1, -505635206);
        setIntElement(term104562, 2, 932246615);
        setIntElement(term104562, 3, 261281668);
        setIntElement(term104562, 4, 1712273163);
        setField(term104553, term104553.getClass(), "modelToViewIndex", term104562);
        setIntField(term104553, term104553.getClass(), "lastRowCount", 234306621);
        setBooleanField(term104553, term104553.getClass(), "rebuildIndices", true);
        setField(term104570, term104570.getClass(), "listenerList", null);
        setField(term104553, term104553.getClass(), "listenerList", term104570);
        setField(term104552, term104552.getClass(), "rowSorter", term104553);
        setIntField(term104552, term104552.getClass(), "modelIndex", 1025525602);
        setElement(term104551, 0, term104552);
        setField(term104573, term104573.getClass(), "model", null);
        setField(term104573, term104573.getClass(), "sortKeys", term104574);
        setField(term104573, term104573.getClass(), "defaultSortKeys", term104577);
        setField(term104573, term104573.getClass(), "unsortableColumns", term104580);
        setField(term104573, term104573.getClass(), "nodeComparator", null);
        setField(term104573, term104573.getClass(), "sortStrategy", null);
        setField(term104573, term104573.getClass(), "viewToModelIndex", null);
        setField(term104573, term104573.getClass(), "modelToViewIndex", null);
        setIntField(term104573, term104573.getClass(), "lastRowCount", 0);
        setBooleanField(term104573, term104573.getClass(), "rebuildIndices", false);
        setField(term104573, term104573.getClass(), "listenerList", null);
        setField(term104572, term104572.getClass(), "rowSorter", term104573);
        setIntField(term104572, term104572.getClass(), "modelIndex", 1669406334);
        setElement(term104551, 1, term104572);
        setField(term104585, term104585.getClass(), "model", null);
        setField(term104585, term104585.getClass(), "sortKeys", null);
        setField(term104585, term104585.getClass(), "defaultSortKeys", null);
        setField(term104585, term104585.getClass(), "unsortableColumns", null);
        setField(term104585, term104585.getClass(), "nodeComparator", null);
        setField(term104585, term104585.getClass(), "sortStrategy", null);
        setField(term104585, term104585.getClass(), "viewToModelIndex", null);
        setField(term104585, term104585.getClass(), "modelToViewIndex", null);
        setIntField(term104585, term104585.getClass(), "lastRowCount", 0);
        setBooleanField(term104585, term104585.getClass(), "rebuildIndices", false);
        setField(term104585, term104585.getClass(), "listenerList", null);
        setField(term104584, term104584.getClass(), "rowSorter", term104585);
        setIntField(term104584, term104584.getClass(), "modelIndex", -780862464);
        setElement(term104551, 2, term104584);
        setField(term104489, term104489.getClass(), "viewToModelIndex", term104551);
        setIntElement(term104589, 0, 2014099129);
        setIntElement(term104589, 1, -1024382698);
        setField(term104489, term104489.getClass(), "modelToViewIndex", term104589);
        setIntField(term104489, term104489.getClass(), "lastRowCount", -168406824);
        setBooleanField(term104489, term104489.getClass(), "rebuildIndices", false);
        setField(term104594, term104594.getClass(), "listenerList", term104595);
        setField(term104489, term104489.getClass(), "listenerList", term104594);
        term104596 = new Integer(2063577636);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term104596;
        callMethod(klass, "ensureIndicesHaveSpaceForIncrease", argTypes, term104489, args);
    }

};


