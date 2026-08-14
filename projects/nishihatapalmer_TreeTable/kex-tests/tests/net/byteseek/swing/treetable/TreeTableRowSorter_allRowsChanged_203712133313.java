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

public class TreeTableRowSorter_allRowsChanged_203712133313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100133;

    public TreeTableRowSorter_allRowsChanged_203712133313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term100136 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term100138 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term100136, term100136.getClass(), "column", -2060535464);
        setField(term100138, term100138.getClass(), "name", null);
        setIntField(term100138, term100138.getClass(), "ordinal", 0);
        setField(term100136, term100136.getClass(), "sortOrder", term100138);
        Object term100140 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term100140, term100140.getClass(), "column", -1242946317);
        setField(term100140, term100140.getClass(), "sortOrder", term100138);
        ArrayList term100134 = new ArrayList();
        ((ArrayList) term100134).add(term100136);
        ((ArrayList) term100134).add(term100140);
        ArrayList term100144 = new ArrayList();
        HashMap term100149 = new HashMap();
        Set<Object> term100227 =  ((Map) term100149).keySet();
        HashSet term100148 = new HashSet((Collection<? extends Object>) term100227);
        ArrayList term100170 = new ArrayList();
        ((ArrayList) term100170).add((Object)null);
        ((ArrayList) term100170).add((Object)null);
        ((ArrayList) term100170).add((Object)null);
        ((ArrayList) term100170).add((Object)null);
        ((ArrayList) term100170).add((Object)null);
        ArrayList term100173 = new ArrayList();
        HashSet term100176 = new HashSet();
        ArrayList term100188 = new ArrayList();
        ((ArrayList) term100188).add((Object)null);
        ((ArrayList) term100188).add((Object)null);
        ((ArrayList) term100188).add((Object)null);
        ((ArrayList) term100188).add((Object)null);
        ((ArrayList) term100188).add((Object)null);
        ((ArrayList) term100188).add((Object)null);
        ((ArrayList) term100188).add((Object)null);
        ArrayList term100191 = new ArrayList();
        HashSet term100194 = new HashSet();
        term100133 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term100167 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 7);
        Object term100168 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term100169 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term100177 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 6);
        int[] term100178 = (int[]) newIntArray(3);
        Object term100184 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term100186 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term100187 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term100198 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term100199 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term100203 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term100204 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term100208 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term100209 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term100213 = (int[]) newIntArray(9);
        Object term100225 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term100226 = (Object[]) newArray("java.lang.Object", 0);
        setField(term100133, term100133.getClass(), "model", null);
        setField(term100133, term100133.getClass(), "sortKeys", term100134);
        setField(term100133, term100133.getClass(), "defaultSortKeys", term100144);
        setField(term100133, term100133.getClass(), "unsortableColumns", term100148);
        setField(term100133, term100133.getClass(), "nodeComparator", null);
        setField(term100133, term100133.getClass(), "sortStrategy", null);
        setField(term100169, term100169.getClass(), "model", null);
        setField(term100169, term100169.getClass(), "sortKeys", term100170);
        setField(term100169, term100169.getClass(), "defaultSortKeys", term100173);
        setField(term100169, term100169.getClass(), "unsortableColumns", term100176);
        setField(term100169, term100169.getClass(), "nodeComparator", null);
        setField(term100169, term100169.getClass(), "sortStrategy", null);
        setField(term100169, term100169.getClass(), "viewToModelIndex", term100177);
        setIntElement(term100178, 0, -1320402633);
        setIntElement(term100178, 1, 919602316);
        setIntElement(term100178, 2, 1833713431);
        setField(term100169, term100169.getClass(), "modelToViewIndex", term100178);
        setIntField(term100169, term100169.getClass(), "lastRowCount", -706222608);
        setBooleanField(term100169, term100169.getClass(), "rebuildIndices", false);
        setField(term100184, term100184.getClass(), "listenerList", null);
        setField(term100169, term100169.getClass(), "listenerList", term100184);
        setField(term100168, term100168.getClass(), "rowSorter", term100169);
        setIntField(term100168, term100168.getClass(), "modelIndex", -2003607923);
        setElement(term100167, 0, term100168);
        setField(term100187, term100187.getClass(), "model", null);
        setField(term100187, term100187.getClass(), "sortKeys", term100188);
        setField(term100187, term100187.getClass(), "defaultSortKeys", term100191);
        setField(term100187, term100187.getClass(), "unsortableColumns", term100194);
        setField(term100187, term100187.getClass(), "nodeComparator", null);
        setField(term100187, term100187.getClass(), "sortStrategy", null);
        setField(term100187, term100187.getClass(), "viewToModelIndex", null);
        setField(term100187, term100187.getClass(), "modelToViewIndex", null);
        setIntField(term100187, term100187.getClass(), "lastRowCount", 0);
        setBooleanField(term100187, term100187.getClass(), "rebuildIndices", false);
        setField(term100187, term100187.getClass(), "listenerList", null);
        setField(term100186, term100186.getClass(), "rowSorter", term100187);
        setIntField(term100186, term100186.getClass(), "modelIndex", 1378805929);
        setElement(term100167, 1, term100186);
        setField(term100199, term100199.getClass(), "model", null);
        setField(term100199, term100199.getClass(), "sortKeys", null);
        setField(term100199, term100199.getClass(), "defaultSortKeys", null);
        setField(term100199, term100199.getClass(), "unsortableColumns", null);
        setField(term100199, term100199.getClass(), "nodeComparator", null);
        setField(term100199, term100199.getClass(), "sortStrategy", null);
        setField(term100199, term100199.getClass(), "viewToModelIndex", null);
        setField(term100199, term100199.getClass(), "modelToViewIndex", null);
        setIntField(term100199, term100199.getClass(), "lastRowCount", 0);
        setBooleanField(term100199, term100199.getClass(), "rebuildIndices", false);
        setField(term100199, term100199.getClass(), "listenerList", null);
        setField(term100198, term100198.getClass(), "rowSorter", term100199);
        setIntField(term100198, term100198.getClass(), "modelIndex", 695052304);
        setElement(term100167, 2, term100198);
        setField(term100204, term100204.getClass(), "model", null);
        setField(term100204, term100204.getClass(), "sortKeys", null);
        setField(term100204, term100204.getClass(), "defaultSortKeys", null);
        setField(term100204, term100204.getClass(), "unsortableColumns", null);
        setField(term100204, term100204.getClass(), "nodeComparator", null);
        setField(term100204, term100204.getClass(), "sortStrategy", null);
        setField(term100204, term100204.getClass(), "viewToModelIndex", null);
        setField(term100204, term100204.getClass(), "modelToViewIndex", null);
        setIntField(term100204, term100204.getClass(), "lastRowCount", 0);
        setBooleanField(term100204, term100204.getClass(), "rebuildIndices", false);
        setField(term100204, term100204.getClass(), "listenerList", null);
        setField(term100203, term100203.getClass(), "rowSorter", term100204);
        setIntField(term100203, term100203.getClass(), "modelIndex", -179937218);
        setElement(term100167, 3, term100203);
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
        setIntField(term100208, term100208.getClass(), "modelIndex", -1626074989);
        setElement(term100167, 4, term100208);
        setElement(term100167, 5, term100208);
        setElement(term100167, 6, term100203);
        setField(term100133, term100133.getClass(), "viewToModelIndex", term100167);
        setIntElement(term100213, 0, 940896043);
        setIntElement(term100213, 1, -1156002984);
        setIntElement(term100213, 2, 1676254730);
        setIntElement(term100213, 3, -1661200819);
        setIntElement(term100213, 4, -235039141);
        setIntElement(term100213, 5, -1414233013);
        setIntElement(term100213, 6, -1174440096);
        setIntElement(term100213, 7, -679614653);
        setIntElement(term100213, 8, -561851867);
        setField(term100133, term100133.getClass(), "modelToViewIndex", term100213);
        setIntField(term100133, term100133.getClass(), "lastRowCount", -1809928454);
        setBooleanField(term100133, term100133.getClass(), "rebuildIndices", true);
        setField(term100225, term100225.getClass(), "listenerList", term100226);
        setField(term100133, term100133.getClass(), "listenerList", term100225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "allRowsChanged", argTypes, term100133, args);
    }

};


