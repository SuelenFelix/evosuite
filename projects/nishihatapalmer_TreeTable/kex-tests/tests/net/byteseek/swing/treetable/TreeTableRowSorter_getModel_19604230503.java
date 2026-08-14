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

public class TreeTableRowSorter_getModel_19604230503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98955;

    public TreeTableRowSorter_getModel_19604230503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term98958 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term98960 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term98958, term98958.getClass(), "column", 1743398246);
        setField(term98960, term98960.getClass(), "name", null);
        setIntField(term98960, term98960.getClass(), "ordinal", 2);
        setField(term98958, term98958.getClass(), "sortOrder", term98960);
        Object term98962 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        setIntField(term98962, term98962.getClass(), "column", -934658823);
        setField(term98962, term98962.getClass(), "sortOrder", term98960);
        Object term98964 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term98966 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term98964, term98964.getClass(), "column", 1632177303);
        setField(term98966, term98966.getClass(), "name", null);
        setIntField(term98966, term98966.getClass(), "ordinal", 1);
        setField(term98964, term98964.getClass(), "sortOrder", term98966);
        Object term98968 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term98970 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term98968, term98968.getClass(), "column", -802592348);
        setField(term98970, term98970.getClass(), "name", null);
        setIntField(term98970, term98970.getClass(), "ordinal", 0);
        setField(term98968, term98968.getClass(), "sortOrder", term98970);
        ArrayList term98956 = new ArrayList();
        ((ArrayList) term98956).add(term98958);
        ((ArrayList) term98956).add(term98962);
        ((ArrayList) term98956).add(term98964);
        ((ArrayList) term98956).add(term98968);
        ArrayList term98974 = new ArrayList();
        HashMap term98979 = new HashMap();
        Set<Object> term99047 =  ((Map) term98979).keySet();
        HashSet term98978 = new HashSet((Collection<? extends Object>) term99047);
        ArrayList term99000 = new ArrayList();
        ((ArrayList) term99000).add((Object)null);
        ((ArrayList) term99000).add((Object)null);
        ((ArrayList) term99000).add((Object)null);
        ((ArrayList) term99000).add((Object)null);
        ((ArrayList) term99000).add((Object)null);
        ((ArrayList) term99000).add((Object)null);
        ((ArrayList) term99000).add((Object)null);
        ((ArrayList) term99000).add((Object)null);
        ((ArrayList) term99000).add((Object)null);
        ArrayList term99003 = new ArrayList();
        HashSet term99006 = new HashSet();
        ArrayList term99020 = new ArrayList();
        ArrayList term99023 = new ArrayList();
        HashSet term99026 = new HashSet();
        term98955 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term98997 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 4);
        Object term98998 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term98999 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object[] term99007 = (Object[]) newArray("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow", 4);
        int[] term99008 = (int[]) newIntArray(5);
        Object term99016 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object term99018 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term99019 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term99030 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term99031 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        Object term99035 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter$SortRow"));
        Object term99036 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter"));
        int[] term99040 = (int[]) newIntArray(2);
        Object term99045 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term99046 = (Object[]) newArray("java.lang.Object", 0);
        setField(term98955, term98955.getClass(), "model", null);
        setField(term98955, term98955.getClass(), "sortKeys", term98956);
        setField(term98955, term98955.getClass(), "defaultSortKeys", term98974);
        setField(term98955, term98955.getClass(), "unsortableColumns", term98978);
        setField(term98955, term98955.getClass(), "nodeComparator", null);
        setField(term98955, term98955.getClass(), "sortStrategy", null);
        setField(term98999, term98999.getClass(), "model", null);
        setField(term98999, term98999.getClass(), "sortKeys", term99000);
        setField(term98999, term98999.getClass(), "defaultSortKeys", term99003);
        setField(term98999, term98999.getClass(), "unsortableColumns", term99006);
        setField(term98999, term98999.getClass(), "nodeComparator", null);
        setField(term98999, term98999.getClass(), "sortStrategy", null);
        setField(term98999, term98999.getClass(), "viewToModelIndex", term99007);
        setIntElement(term99008, 0, 722519669);
        setIntElement(term99008, 1, -40335961);
        setIntElement(term99008, 2, 175343605);
        setIntElement(term99008, 3, 1050853183);
        setIntElement(term99008, 4, 848428785);
        setField(term98999, term98999.getClass(), "modelToViewIndex", term99008);
        setIntField(term98999, term98999.getClass(), "lastRowCount", -1984436481);
        setBooleanField(term98999, term98999.getClass(), "rebuildIndices", true);
        setField(term99016, term99016.getClass(), "listenerList", null);
        setField(term98999, term98999.getClass(), "listenerList", term99016);
        setField(term98998, term98998.getClass(), "rowSorter", term98999);
        setIntField(term98998, term98998.getClass(), "modelIndex", -407582855);
        setElement(term98997, 0, term98998);
        setField(term99019, term99019.getClass(), "model", null);
        setField(term99019, term99019.getClass(), "sortKeys", term99020);
        setField(term99019, term99019.getClass(), "defaultSortKeys", term99023);
        setField(term99019, term99019.getClass(), "unsortableColumns", term99026);
        setField(term99019, term99019.getClass(), "nodeComparator", null);
        setField(term99019, term99019.getClass(), "sortStrategy", null);
        setField(term99019, term99019.getClass(), "viewToModelIndex", null);
        setField(term99019, term99019.getClass(), "modelToViewIndex", null);
        setIntField(term99019, term99019.getClass(), "lastRowCount", 0);
        setBooleanField(term99019, term99019.getClass(), "rebuildIndices", false);
        setField(term99019, term99019.getClass(), "listenerList", null);
        setField(term99018, term99018.getClass(), "rowSorter", term99019);
        setIntField(term99018, term99018.getClass(), "modelIndex", 1190753616);
        setElement(term98997, 1, term99018);
        setField(term99031, term99031.getClass(), "model", null);
        setField(term99031, term99031.getClass(), "sortKeys", null);
        setField(term99031, term99031.getClass(), "defaultSortKeys", null);
        setField(term99031, term99031.getClass(), "unsortableColumns", null);
        setField(term99031, term99031.getClass(), "nodeComparator", null);
        setField(term99031, term99031.getClass(), "sortStrategy", null);
        setField(term99031, term99031.getClass(), "viewToModelIndex", null);
        setField(term99031, term99031.getClass(), "modelToViewIndex", null);
        setIntField(term99031, term99031.getClass(), "lastRowCount", 0);
        setBooleanField(term99031, term99031.getClass(), "rebuildIndices", false);
        setField(term99031, term99031.getClass(), "listenerList", null);
        setField(term99030, term99030.getClass(), "rowSorter", term99031);
        setIntField(term99030, term99030.getClass(), "modelIndex", -752378450);
        setElement(term98997, 2, term99030);
        setField(term99036, term99036.getClass(), "model", null);
        setField(term99036, term99036.getClass(), "sortKeys", null);
        setField(term99036, term99036.getClass(), "defaultSortKeys", null);
        setField(term99036, term99036.getClass(), "unsortableColumns", null);
        setField(term99036, term99036.getClass(), "nodeComparator", null);
        setField(term99036, term99036.getClass(), "sortStrategy", null);
        setField(term99036, term99036.getClass(), "viewToModelIndex", null);
        setField(term99036, term99036.getClass(), "modelToViewIndex", null);
        setIntField(term99036, term99036.getClass(), "lastRowCount", 0);
        setBooleanField(term99036, term99036.getClass(), "rebuildIndices", false);
        setField(term99036, term99036.getClass(), "listenerList", null);
        setField(term99035, term99035.getClass(), "rowSorter", term99036);
        setIntField(term99035, term99035.getClass(), "modelIndex", 848907965);
        setElement(term98997, 3, term99035);
        setField(term98955, term98955.getClass(), "viewToModelIndex", term98997);
        setIntElement(term99040, 0, 1865070548);
        setIntElement(term99040, 1, 1904515443);
        setField(term98955, term98955.getClass(), "modelToViewIndex", term99040);
        setIntField(term98955, term98955.getClass(), "lastRowCount", 1361126430);
        setBooleanField(term98955, term98955.getClass(), "rebuildIndices", false);
        setField(term99045, term99045.getClass(), "listenerList", term99046);
        setField(term98955, term98955.getClass(), "listenerList", term99045);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableRowSorter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getModel", argTypes, term98955, args);
    }

};


