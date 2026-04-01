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

public class TreeTableRowSorter_modelStructureChanged_177646909312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100697;

    public TreeTableRowSorter_modelStructureChanged_177646909312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term100700 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term100702 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term100700, term100700.getClass(), "column", -1619435313);
        setField(term100702, term100702.getClass(), "name", null);
        setIntField(term100702, term100702.getClass(), "ordinal", 2);
        setField(term100700, term100700.getClass(), "sortOrder", term100702);
        Object term100704 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term100706 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term100704, term100704.getClass(), "column", 1013801066);
        setField(term100706, term100706.getClass(), "name", null);
        setIntField(term100706, term100706.getClass(), "ordinal", 0);
        setField(term100704, term100704.getClass(), "sortOrder", term100706);
        Object term100708 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term100708, term100708.getClass(), "column", 1512541853);
        setField(term100708, term100708.getClass(), "sortOrder", term100702);
        ArrayList term100698 = new ArrayList();
        ((ArrayList) term100698).add(term100700);
        ((ArrayList) term100698).add(term100704);
        ((ArrayList) term100698).add(term100708);
        ArrayList term100712 = new ArrayList();
        HashMap term100717 = new HashMap();
        Set<Object> term100743 =  ((Map) term100717).keySet();
        HashSet term100716 = new HashSet((Collection<? extends Object>) term100743);
        term100697 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term100731 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 0);
        int[] term100732 = (int[]) newIntArray(6);
        Object term100741 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term100742 = (Object[]) newArray("java.lang.Object", 0);
        setField(term100697, term100697.getClass(), "model", null);
        setField(term100697, term100697.getClass(), "sortKeys", term100698);
        setField(term100697, term100697.getClass(), "defaultSortKeys", term100712);
        setField(term100697, term100697.getClass(), "unsortableColumns", term100716);
        setField(term100697, term100697.getClass(), "nodeComparator", null);
        setField(term100697, term100697.getClass(), "sortStrategy", null);
        setField(term100697, term100697.getClass(), "viewToModelIndex", term100731);
        setIntElement(term100732, 0, -965421502);
        setIntElement(term100732, 1, 1319026002);
        setIntElement(term100732, 2, -1368173231);
        setIntElement(term100732, 3, 1956006038);
        setIntElement(term100732, 4, -1062304878);
        setIntElement(term100732, 5, -1377876610);
        setField(term100697, term100697.getClass(), "modelToViewIndex", term100732);
        setIntField(term100697, term100697.getClass(), "lastRowCount", -1456184732);
        setBooleanField(term100697, term100697.getClass(), "rebuildIndices", false);
        setField(term100741, term100741.getClass(), "listenerList", term100742);
        setField(term100697, term100697.getClass(), "listenerList", term100741);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "modelStructureChanged", argTypes, term100697, args);
    }

};


