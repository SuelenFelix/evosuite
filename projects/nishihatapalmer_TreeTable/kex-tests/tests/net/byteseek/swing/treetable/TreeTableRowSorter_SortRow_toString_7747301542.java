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
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class TreeTableRowSorter_SortRow_toString_7747301542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369624;

    public TreeTableRowSorter_SortRow_toString_7747301542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term369628 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term369628, term369628.getClass(), "column", 1080834214);
        setField(term369628, term369628.getClass(), "sortOrder", null);
        Object term369630 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term369630, term369630.getClass(), "column", 323842695);
        setField(term369630, term369630.getClass(), "sortOrder", null);
        Object term369632 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term369632, term369632.getClass(), "column", 331897564);
        setField(term369632, term369632.getClass(), "sortOrder", null);
        Object term369634 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term369634, term369634.getClass(), "column", -968105925);
        setField(term369634, term369634.getClass(), "sortOrder", null);
        Object term369636 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term369636, term369636.getClass(), "column", -206020926);
        setField(term369636, term369636.getClass(), "sortOrder", null);
        Object term369638 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term369638, term369638.getClass(), "column", -2054014210);
        setField(term369638, term369638.getClass(), "sortOrder", null);
        Object term369640 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term369640, term369640.getClass(), "column", 1179045520);
        setField(term369640, term369640.getClass(), "sortOrder", null);
        Object term369642 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term369642, term369642.getClass(), "column", 1056739921);
        setField(term369642, term369642.getClass(), "sortOrder", null);
        Object term369644 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term369644, term369644.getClass(), "column", 1384627927);
        setField(term369644, term369644.getClass(), "sortOrder", null);
        ArrayList term369626 = new ArrayList();
        ((ArrayList) term369626).add(term369628);
        ((ArrayList) term369626).add(term369630);
        ((ArrayList) term369626).add(term369632);
        ((ArrayList) term369626).add(term369634);
        ((ArrayList) term369626).add(term369636);
        ((ArrayList) term369626).add(term369638);
        ((ArrayList) term369626).add(term369640);
        ((ArrayList) term369626).add(term369642);
        ((ArrayList) term369626).add(term369644);
        ArrayList term369648 = new ArrayList();
        HashMap term369653 = new HashMap();
        Set<Object> term369693 =  ((Map) term369653).keySet();
        HashSet term369652 = new HashSet((Collection<? extends Object>) term369693);
        term369624 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term369625 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term369659 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 7);
        Object term369660 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term369661 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term369665 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term369666 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term369670 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term369671 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term369675 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term369677 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        int[] term369679 = (int[]) newIntArray(8);
        Object term369690 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term369691 = (Object[]) newArray("java.lang.Object", 0);
        setField(term369625, term369625.getClass(), "model", null);
        setField(term369625, term369625.getClass(), "sortKeys", term369626);
        setField(term369625, term369625.getClass(), "defaultSortKeys", term369648);
        setField(term369625, term369625.getClass(), "unsortableColumns", term369652);
        setField(term369625, term369625.getClass(), "nodeComparator", null);
        setField(term369625, term369625.getClass(), "sortStrategy", null);
        setField(term369661, term369661.getClass(), "model", null);
        setField(term369661, term369661.getClass(), "sortKeys", null);
        setField(term369661, term369661.getClass(), "defaultSortKeys", null);
        setField(term369661, term369661.getClass(), "unsortableColumns", null);
        setField(term369661, term369661.getClass(), "nodeComparator", null);
        setField(term369661, term369661.getClass(), "sortStrategy", null);
        setField(term369661, term369661.getClass(), "viewToModelIndex", null);
        setField(term369661, term369661.getClass(), "modelToViewIndex", null);
        setIntField(term369661, term369661.getClass(), "lastRowCount", -1901115940);
        setBooleanField(term369661, term369661.getClass(), "rebuildIndices", true);
        setField(term369661, term369661.getClass(), "listenerList", null);
        setField(term369660, term369660.getClass(), "rowSorter", term369661);
        setIntField(term369660, term369660.getClass(), "modelIndex", 1934437115);
        setElement(term369659, 0, term369660);
        setField(term369666, term369666.getClass(), "model", null);
        setField(term369666, term369666.getClass(), "sortKeys", null);
        setField(term369666, term369666.getClass(), "defaultSortKeys", null);
        setField(term369666, term369666.getClass(), "unsortableColumns", null);
        setField(term369666, term369666.getClass(), "nodeComparator", null);
        setField(term369666, term369666.getClass(), "sortStrategy", null);
        setField(term369666, term369666.getClass(), "viewToModelIndex", null);
        setField(term369666, term369666.getClass(), "modelToViewIndex", null);
        setIntField(term369666, term369666.getClass(), "lastRowCount", 0);
        setBooleanField(term369666, term369666.getClass(), "rebuildIndices", false);
        setField(term369666, term369666.getClass(), "listenerList", null);
        setField(term369665, term369665.getClass(), "rowSorter", term369666);
        setIntField(term369665, term369665.getClass(), "modelIndex", 1820319919);
        setElement(term369659, 1, term369665);
        setField(term369671, term369671.getClass(), "model", null);
        setField(term369671, term369671.getClass(), "sortKeys", null);
        setField(term369671, term369671.getClass(), "defaultSortKeys", null);
        setField(term369671, term369671.getClass(), "unsortableColumns", null);
        setField(term369671, term369671.getClass(), "nodeComparator", null);
        setField(term369671, term369671.getClass(), "sortStrategy", null);
        setField(term369671, term369671.getClass(), "viewToModelIndex", null);
        setField(term369671, term369671.getClass(), "modelToViewIndex", null);
        setIntField(term369671, term369671.getClass(), "lastRowCount", 0);
        setBooleanField(term369671, term369671.getClass(), "rebuildIndices", false);
        setField(term369671, term369671.getClass(), "listenerList", null);
        setField(term369670, term369670.getClass(), "rowSorter", term369671);
        setIntField(term369670, term369670.getClass(), "modelIndex", 1444962020);
        setElement(term369659, 2, term369670);
        setElement(term369659, 3, term369665);
        setElement(term369659, 4, term369624);
        setField(term369675, term369675.getClass(), "rowSorter", null);
        setIntField(term369675, term369675.getClass(), "modelIndex", 0);
        setElement(term369659, 5, term369675);
        setField(term369677, term369677.getClass(), "rowSorter", null);
        setIntField(term369677, term369677.getClass(), "modelIndex", 0);
        setElement(term369659, 6, term369677);
        setField(term369625, term369625.getClass(), "viewToModelIndex", term369659);
        setIntElement(term369679, 0, 1636228804);
        setIntElement(term369679, 1, -1650533427);
        setIntElement(term369679, 2, -1076430316);
        setIntElement(term369679, 3, 1984492528);
        setIntElement(term369679, 4, -655764067);
        setIntElement(term369679, 5, 31238744);
        setIntElement(term369679, 6, 680031965);
        setIntElement(term369679, 7, -2112419098);
        setField(term369625, term369625.getClass(), "modelToViewIndex", term369679);
        setIntField(term369625, term369625.getClass(), "lastRowCount", -1649429373);
        setBooleanField(term369625, term369625.getClass(), "rebuildIndices", true);
        setField(term369690, term369690.getClass(), "listenerList", term369691);
        setField(term369625, term369625.getClass(), "listenerList", term369690);
        setField(term369624, term369624.getClass(), "rowSorter", term369625);
        setIntField(term369624, term369624.getClass(), "modelIndex", -1605518502);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term369624, args);
    }

};


