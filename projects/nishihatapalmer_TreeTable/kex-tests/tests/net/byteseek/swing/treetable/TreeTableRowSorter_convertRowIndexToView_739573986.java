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

public class TreeTableRowSorter_convertRowIndexToView_739573986 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100131;
     Object term100220;

    public TreeTableRowSorter_convertRowIndexToView_739573986() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term100134 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term100136 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term100134, term100134.getClass(), "column", -1728316609);
        setField(term100136, term100136.getClass(), "name", null);
        setIntField(term100136, term100136.getClass(), "ordinal", 1);
        setField(term100134, term100134.getClass(), "sortOrder", term100136);
        Object term100138 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term100140 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term100138, term100138.getClass(), "column", 47118909);
        setField(term100140, term100140.getClass(), "name", null);
        setIntField(term100140, term100140.getClass(), "ordinal", 0);
        setField(term100138, term100138.getClass(), "sortOrder", term100140);
        Object term100142 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term100142, term100142.getClass(), "column", -2093707412);
        setField(term100142, term100142.getClass(), "sortOrder", term100140);
        Object term100144 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term100144, term100144.getClass(), "column", -680627153);
        setField(term100144, term100144.getClass(), "sortOrder", term100136);
        Object term100146 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term100146, term100146.getClass(), "column", 722519669);
        setField(term100146, term100146.getClass(), "sortOrder", term100136);
        Object term100148 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term100148, term100148.getClass(), "column", -40335961);
        setField(term100148, term100148.getClass(), "sortOrder", term100136);
        Object term100150 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term100150, term100150.getClass(), "column", 175343605);
        setField(term100150, term100150.getClass(), "sortOrder", term100140);
        Object term100152 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term100152, term100152.getClass(), "column", 1050853183);
        setField(term100152, term100152.getClass(), "sortOrder", term100136);
        ArrayList term100132 = new ArrayList();
        ((ArrayList) term100132).add(term100134);
        ((ArrayList) term100132).add(term100138);
        ((ArrayList) term100132).add(term100142);
        ((ArrayList) term100132).add(term100144);
        ((ArrayList) term100132).add(term100146);
        ((ArrayList) term100132).add(term100148);
        ((ArrayList) term100132).add(term100150);
        ((ArrayList) term100132).add(term100152);
        ArrayList term100156 = new ArrayList();
        HashMap term100161 = new HashMap();
        Set<Object> term100222 =  ((Map) term100161).keySet();
        HashSet term100160 = new HashSet((Collection<? extends Object>) term100222);
        ArrayList term100174 = new ArrayList();
        ArrayList term100177 = new ArrayList();
        HashSet term100180 = new HashSet();
        ArrayList term100198 = new ArrayList();
        ((ArrayList) term100198).add((Object)null);
        ((ArrayList) term100198).add((Object)null);
        ((ArrayList) term100198).add((Object)null);
        ((ArrayList) term100198).add((Object)null);
        ((ArrayList) term100198).add((Object)null);
        ((ArrayList) term100198).add((Object)null);
        ((ArrayList) term100198).add((Object)null);
        ((ArrayList) term100198).add((Object)null);
        ((ArrayList) term100198).add((Object)null);
        ArrayList term100201 = new ArrayList();
        HashSet term100204 = new HashSet();
        term100131 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term100171 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 3);
        Object term100172 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term100173 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term100181 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 2);
        int[] term100182 = (int[]) newIntArray(9);
        Object term100194 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term100196 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term100197 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term100208 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term100209 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term100213 = (int[]) newIntArray(2);
        Object term100218 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term100219 = (Object[]) newArray("java.lang.Object", 0);
        setField(term100131, term100131.getClass(), "model", null);
        setField(term100131, term100131.getClass(), "sortKeys", term100132);
        setField(term100131, term100131.getClass(), "defaultSortKeys", term100156);
        setField(term100131, term100131.getClass(), "unsortableColumns", term100160);
        setField(term100131, term100131.getClass(), "nodeComparator", null);
        setField(term100131, term100131.getClass(), "sortStrategy", null);
        setField(term100173, term100173.getClass(), "model", null);
        setField(term100173, term100173.getClass(), "sortKeys", term100174);
        setField(term100173, term100173.getClass(), "defaultSortKeys", term100177);
        setField(term100173, term100173.getClass(), "unsortableColumns", term100180);
        setField(term100173, term100173.getClass(), "nodeComparator", null);
        setField(term100173, term100173.getClass(), "sortStrategy", null);
        setField(term100173, term100173.getClass(), "viewToModelIndex", term100181);
        setIntElement(term100182, 0, -407582855);
        setIntElement(term100182, 1, 1190753616);
        setIntElement(term100182, 2, -752378450);
        setIntElement(term100182, 3, 848907965);
        setIntElement(term100182, 4, 1865070548);
        setIntElement(term100182, 5, 1904515443);
        setIntElement(term100182, 6, 1361126430);
        setIntElement(term100182, 7, 1728588701);
        setIntElement(term100182, 8, -355769268);
        setField(term100173, term100173.getClass(), "modelToViewIndex", term100182);
        setIntField(term100173, term100173.getClass(), "lastRowCount", -114460662);
        setBooleanField(term100173, term100173.getClass(), "rebuildIndices", false);
        setField(term100194, term100194.getClass(), "listenerList", null);
        setField(term100173, term100173.getClass(), "listenerList", term100194);
        setField(term100172, term100172.getClass(), "rowSorter", term100173);
        setIntField(term100172, term100172.getClass(), "modelIndex", -355376034);
        setElement(term100171, 0, term100172);
        setField(term100197, term100197.getClass(), "model", null);
        setField(term100197, term100197.getClass(), "sortKeys", term100198);
        setField(term100197, term100197.getClass(), "defaultSortKeys", term100201);
        setField(term100197, term100197.getClass(), "unsortableColumns", term100204);
        setField(term100197, term100197.getClass(), "nodeComparator", null);
        setField(term100197, term100197.getClass(), "sortStrategy", null);
        setField(term100197, term100197.getClass(), "viewToModelIndex", null);
        setField(term100197, term100197.getClass(), "modelToViewIndex", null);
        setIntField(term100197, term100197.getClass(), "lastRowCount", 0);
        setBooleanField(term100197, term100197.getClass(), "rebuildIndices", false);
        setField(term100197, term100197.getClass(), "listenerList", null);
        setField(term100196, term100196.getClass(), "rowSorter", term100197);
        setIntField(term100196, term100196.getClass(), "modelIndex", 588390599);
        setElement(term100171, 1, term100196);
        setField(term100209, term100209.getClass(), "model", null);
        setField(term100209, term100209.getClass(), "sortKeys", null);
        setField(term100209, term100209.getClass(), "defaultSortKeys", null);
        setField(term100209, term100209.getClass(), "unsortableColumns", null);
        setField(term100209, term100209.getClass(), "nodeComparator", null);
        setField(term100209, term100209.getClass(), "sortStrategy", null);
        setField(term100209, term100209.getClass(), "viewToModelIndex", null);
        setField(term100209, term100209.getClass(), "modelToViewIndex", null);
        setIntField(term100209, term100209.getClass(), "lastRowCount", 0);
        setBooleanField(term100209, term100209.getClass(), "rebuildIndices", false);
        setField(term100209, term100209.getClass(), "listenerList", null);
        setField(term100208, term100208.getClass(), "rowSorter", term100209);
        setIntField(term100208, term100208.getClass(), "modelIndex", -95969566);
        setElement(term100171, 2, term100208);
        setField(term100131, term100131.getClass(), "viewToModelIndex", term100171);
        setIntElement(term100213, 0, -68615285);
        setIntElement(term100213, 1, -337504086);
        setField(term100131, term100131.getClass(), "modelToViewIndex", term100213);
        setIntField(term100131, term100131.getClass(), "lastRowCount", 2074130991);
        setBooleanField(term100131, term100131.getClass(), "rebuildIndices", false);
        setField(term100218, term100218.getClass(), "listenerList", term100219);
        setField(term100131, term100131.getClass(), "listenerList", term100218);
        term100220 = new Integer(532588266);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term100220;
        callMethod(klass, "convertRowIndexToView", argTypes, term100131, args);
    }

};


