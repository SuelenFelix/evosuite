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

public class TreeTableRowSorter_getModelRowCount_39628556311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100612;

    public TreeTableRowSorter_getModelRowCount_39628556311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term100615 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term100617 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term100615, term100615.getClass(), "column", -1374527319);
        setField(term100617, term100617.getClass(), "name", null);
        setIntField(term100617, term100617.getClass(), "ordinal", 2);
        setField(term100615, term100615.getClass(), "sortOrder", term100617);
        Object term100619 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term100619, term100619.getClass(), "column", -1735276919);
        setField(term100619, term100619.getClass(), "sortOrder", term100617);
        Object term100621 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term100623 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term100621, term100621.getClass(), "column", -712023865);
        setField(term100623, term100623.getClass(), "name", null);
        setIntField(term100623, term100623.getClass(), "ordinal", 0);
        setField(term100621, term100621.getClass(), "sortOrder", term100623);
        ArrayList term100613 = new ArrayList();
        ((ArrayList) term100613).add(term100615);
        ((ArrayList) term100613).add(term100619);
        ((ArrayList) term100613).add(term100621);
        ArrayList term100627 = new ArrayList();
        HashMap term100632 = new HashMap();
        Set<Object> term100692 =  ((Map) term100632).keySet();
        HashSet term100631 = new HashSet((Collection<? extends Object>) term100692);
        ArrayList term100653 = new ArrayList();
        ((ArrayList) term100653).add((Object)null);
        ((ArrayList) term100653).add((Object)null);
        ((ArrayList) term100653).add((Object)null);
        ((ArrayList) term100653).add((Object)null);
        ((ArrayList) term100653).add((Object)null);
        ((ArrayList) term100653).add((Object)null);
        ((ArrayList) term100653).add((Object)null);
        ((ArrayList) term100653).add((Object)null);
        ((ArrayList) term100653).add((Object)null);
        ArrayList term100656 = new ArrayList();
        HashSet term100659 = new HashSet();
        ArrayList term100668 = new ArrayList();
        ((ArrayList) term100668).add((Object)null);
        ArrayList term100671 = new ArrayList();
        HashSet term100674 = new HashSet();
        term100612 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term100650 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 3);
        Object term100651 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term100652 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term100660 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 6);
        int[] term100661 = (int[]) newIntArray(0);
        Object term100664 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term100666 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term100667 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term100678 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term100679 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term100683 = (int[]) newIntArray(4);
        Object term100690 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term100691 = (Object[]) newArray("java.lang.Object", 0);
        setField(term100612, term100612.getClass(), "model", null);
        setField(term100612, term100612.getClass(), "sortKeys", term100613);
        setField(term100612, term100612.getClass(), "defaultSortKeys", term100627);
        setField(term100612, term100612.getClass(), "unsortableColumns", term100631);
        setField(term100612, term100612.getClass(), "nodeComparator", null);
        setField(term100612, term100612.getClass(), "sortStrategy", null);
        setField(term100652, term100652.getClass(), "model", null);
        setField(term100652, term100652.getClass(), "sortKeys", term100653);
        setField(term100652, term100652.getClass(), "defaultSortKeys", term100656);
        setField(term100652, term100652.getClass(), "unsortableColumns", term100659);
        setField(term100652, term100652.getClass(), "nodeComparator", null);
        setField(term100652, term100652.getClass(), "sortStrategy", null);
        setField(term100652, term100652.getClass(), "viewToModelIndex", term100660);
        setField(term100652, term100652.getClass(), "modelToViewIndex", term100661);
        setIntField(term100652, term100652.getClass(), "lastRowCount", 1737876343);
        setBooleanField(term100652, term100652.getClass(), "rebuildIndices", false);
        setField(term100664, term100664.getClass(), "listenerList", null);
        setField(term100652, term100652.getClass(), "listenerList", term100664);
        setField(term100651, term100651.getClass(), "rowSorter", term100652);
        setIntField(term100651, term100651.getClass(), "modelIndex", -897937940);
        setElement(term100650, 0, term100651);
        setField(term100667, term100667.getClass(), "model", null);
        setField(term100667, term100667.getClass(), "sortKeys", term100668);
        setField(term100667, term100667.getClass(), "defaultSortKeys", term100671);
        setField(term100667, term100667.getClass(), "unsortableColumns", term100674);
        setField(term100667, term100667.getClass(), "nodeComparator", null);
        setField(term100667, term100667.getClass(), "sortStrategy", null);
        setField(term100667, term100667.getClass(), "viewToModelIndex", null);
        setField(term100667, term100667.getClass(), "modelToViewIndex", null);
        setIntField(term100667, term100667.getClass(), "lastRowCount", 0);
        setBooleanField(term100667, term100667.getClass(), "rebuildIndices", false);
        setField(term100667, term100667.getClass(), "listenerList", null);
        setField(term100666, term100666.getClass(), "rowSorter", term100667);
        setIntField(term100666, term100666.getClass(), "modelIndex", 1523261232);
        setElement(term100650, 1, term100666);
        setField(term100679, term100679.getClass(), "model", null);
        setField(term100679, term100679.getClass(), "sortKeys", null);
        setField(term100679, term100679.getClass(), "defaultSortKeys", null);
        setField(term100679, term100679.getClass(), "unsortableColumns", null);
        setField(term100679, term100679.getClass(), "nodeComparator", null);
        setField(term100679, term100679.getClass(), "sortStrategy", null);
        setField(term100679, term100679.getClass(), "viewToModelIndex", null);
        setField(term100679, term100679.getClass(), "modelToViewIndex", null);
        setIntField(term100679, term100679.getClass(), "lastRowCount", 0);
        setBooleanField(term100679, term100679.getClass(), "rebuildIndices", false);
        setField(term100679, term100679.getClass(), "listenerList", null);
        setField(term100678, term100678.getClass(), "rowSorter", term100679);
        setIntField(term100678, term100678.getClass(), "modelIndex", -428988337);
        setElement(term100650, 2, term100678);
        setField(term100612, term100612.getClass(), "viewToModelIndex", term100650);
        setIntElement(term100683, 0, 48047085);
        setIntElement(term100683, 1, 1902784843);
        setIntElement(term100683, 2, 2021136615);
        setIntElement(term100683, 3, 1778570695);
        setField(term100612, term100612.getClass(), "modelToViewIndex", term100683);
        setIntField(term100612, term100612.getClass(), "lastRowCount", -1142164411);
        setBooleanField(term100612, term100612.getClass(), "rebuildIndices", false);
        setField(term100690, term100690.getClass(), "listenerList", term100691);
        setField(term100612, term100612.getClass(), "listenerList", term100690);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getModelRowCount", argTypes, term100612, args);
    }

};


