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

public class TreeTableRowSorter_moveNodeToSiblingPosition_171814226348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104384;
     Object term104490;
     Object term104492;

    public TreeTableRowSorter_moveNodeToSiblingPosition_171814226348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term104387 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term104389 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term104387, term104387.getClass(), "column", 433954476);
        setField(term104389, term104389.getClass(), "name", null);
        setIntField(term104389, term104389.getClass(), "ordinal", 0);
        setField(term104387, term104387.getClass(), "sortOrder", term104389);
        Object term104391 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term104391, term104391.getClass(), "column", 1780958641);
        setField(term104391, term104391.getClass(), "sortOrder", term104389);
        Object term104393 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term104395 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term104393, term104393.getClass(), "column", 1890582085);
        setField(term104395, term104395.getClass(), "name", null);
        setIntField(term104395, term104395.getClass(), "ordinal", 1);
        setField(term104393, term104393.getClass(), "sortOrder", term104395);
        Object term104397 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term104399 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term104397, term104397.getClass(), "column", 2146568808);
        setField(term104399, term104399.getClass(), "name", null);
        setIntField(term104399, term104399.getClass(), "ordinal", 2);
        setField(term104397, term104397.getClass(), "sortOrder", term104399);
        Object term104401 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term104401, term104401.getClass(), "column", 245081679);
        setField(term104401, term104401.getClass(), "sortOrder", term104399);
        Object term104403 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term104403, term104403.getClass(), "column", 1199789398);
        setField(term104403, term104403.getClass(), "sortOrder", term104395);
        Object term104405 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term104405, term104405.getClass(), "column", -1056402285);
        setField(term104405, term104405.getClass(), "sortOrder", term104395);
        Object term104407 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term104407, term104407.getClass(), "column", 1881803912);
        setField(term104407, term104407.getClass(), "sortOrder", term104399);
        Object term104409 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term104409, term104409.getClass(), "column", -188535038);
        setField(term104409, term104409.getClass(), "sortOrder", term104389);
        ArrayList term104385 = new ArrayList();
        ((ArrayList) term104385).add(term104387);
        ((ArrayList) term104385).add(term104391);
        ((ArrayList) term104385).add(term104393);
        ((ArrayList) term104385).add(term104397);
        ((ArrayList) term104385).add(term104401);
        ((ArrayList) term104385).add(term104403);
        ((ArrayList) term104385).add(term104405);
        ((ArrayList) term104385).add(term104407);
        ((ArrayList) term104385).add(term104409);
        ArrayList term104413 = new ArrayList();
        HashMap term104418 = new HashMap();
        Set<Object> term104494 =  ((Map) term104418).keySet();
        HashSet term104417 = new HashSet((Collection<? extends Object>) term104494);
        ArrayList term104455 = new ArrayList();
        ((ArrayList) term104455).add((Object)null);
        ((ArrayList) term104455).add((Object)null);
        ((ArrayList) term104455).add((Object)null);
        ((ArrayList) term104455).add((Object)null);
        ((ArrayList) term104455).add((Object)null);
        ((ArrayList) term104455).add((Object)null);
        ((ArrayList) term104455).add((Object)null);
        ((ArrayList) term104455).add((Object)null);
        ((ArrayList) term104455).add((Object)null);
        ArrayList term104458 = new ArrayList();
        HashSet term104461 = new HashSet();
        ArrayList term104471 = new ArrayList();
        ArrayList term104474 = new ArrayList();
        HashSet term104477 = new HashSet();
        term104384 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term104452 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 2);
        Object term104453 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term104454 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term104462 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 1);
        int[] term104463 = (int[]) newIntArray(1);
        Object term104467 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term104469 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term104470 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term104481 = (int[]) newIntArray(4);
        Object term104488 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term104489 = (Object[]) newArray("java.lang.Object", 0);
        setField(term104384, term104384.getClass(), "model", null);
        setField(term104384, term104384.getClass(), "sortKeys", term104385);
        setField(term104384, term104384.getClass(), "defaultSortKeys", term104413);
        setField(term104384, term104384.getClass(), "unsortableColumns", term104417);
        setField(term104384, term104384.getClass(), "nodeComparator", null);
        setField(term104384, term104384.getClass(), "sortStrategy", null);
        setField(term104454, term104454.getClass(), "model", null);
        setField(term104454, term104454.getClass(), "sortKeys", term104455);
        setField(term104454, term104454.getClass(), "defaultSortKeys", term104458);
        setField(term104454, term104454.getClass(), "unsortableColumns", term104461);
        setField(term104454, term104454.getClass(), "nodeComparator", null);
        setField(term104454, term104454.getClass(), "sortStrategy", null);
        setField(term104454, term104454.getClass(), "viewToModelIndex", term104462);
        setIntElement(term104463, 0, 912208163);
        setField(term104454, term104454.getClass(), "modelToViewIndex", term104463);
        setIntField(term104454, term104454.getClass(), "lastRowCount", 909767683);
        setBooleanField(term104454, term104454.getClass(), "rebuildIndices", true);
        setField(term104467, term104467.getClass(), "listenerList", null);
        setField(term104454, term104454.getClass(), "listenerList", term104467);
        setField(term104453, term104453.getClass(), "rowSorter", term104454);
        setIntField(term104453, term104453.getClass(), "modelIndex", -639390893);
        setElement(term104452, 0, term104453);
        setField(term104470, term104470.getClass(), "model", null);
        setField(term104470, term104470.getClass(), "sortKeys", term104471);
        setField(term104470, term104470.getClass(), "defaultSortKeys", term104474);
        setField(term104470, term104470.getClass(), "unsortableColumns", term104477);
        setField(term104470, term104470.getClass(), "nodeComparator", null);
        setField(term104470, term104470.getClass(), "sortStrategy", null);
        setField(term104470, term104470.getClass(), "viewToModelIndex", null);
        setField(term104470, term104470.getClass(), "modelToViewIndex", null);
        setIntField(term104470, term104470.getClass(), "lastRowCount", 0);
        setBooleanField(term104470, term104470.getClass(), "rebuildIndices", false);
        setField(term104470, term104470.getClass(), "listenerList", null);
        setField(term104469, term104469.getClass(), "rowSorter", term104470);
        setIntField(term104469, term104469.getClass(), "modelIndex", 1176415280);
        setElement(term104452, 1, term104469);
        setField(term104384, term104384.getClass(), "viewToModelIndex", term104452);
        setIntElement(term104481, 0, -1272714687);
        setIntElement(term104481, 1, -762778853);
        setIntElement(term104481, 2, 946727239);
        setIntElement(term104481, 3, 349182490);
        setField(term104384, term104384.getClass(), "modelToViewIndex", term104481);
        setIntField(term104384, term104384.getClass(), "lastRowCount", -353671511);
        setBooleanField(term104384, term104384.getClass(), "rebuildIndices", false);
        setField(term104488, term104488.getClass(), "listenerList", term104489);
        setField(term104384, term104384.getClass(), "listenerList", term104488);
        term104490 = new Integer(1598831363);
        term104492 = new Integer(-690367798);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("javax.swing.tree.TreeNode");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term104490;
        args[2] = term104492;
        callMethod(klass, "moveNodeToSiblingPosition", argTypes, term104384, args);
    }

};


