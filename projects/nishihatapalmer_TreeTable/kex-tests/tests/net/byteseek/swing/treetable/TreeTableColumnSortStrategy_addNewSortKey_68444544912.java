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
import java.lang.String;
import java.lang.Object;
import java.util.LinkedList;
import java.lang.Integer;

public class TreeTableColumnSortStrategy_addNewSortKey_68444544912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20215;
     Object term20258;
     Object term20272;

    public TreeTableColumnSortStrategy_addNewSortKey_68444544912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20275 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$NewSortKeyPosition");
        Field term20274 = ((Class) term20275).getDeclaredField((String) "ADD_TO_END");
        ((Field) term20274).setAccessible(true);
        Object enum40 = ((Field) term20274).get((Object) null);
        Class<? extends Object> term20687 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$UpdateSortKeyPosition");
        Field term20686 = ((Class) term20687).getDeclaredField((String) "KEEP_POSITION");
        ((Field) term20686).setAccessible(true);
        Object enum41 = ((Field) term20686).get((Object) null);
        Class<? extends Object> term21123 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$RemoveSortKeyAction");
        Field term21122 = ((Class) term21123).getDeclaredField((String) "REMOVE");
        ((Field) term21122).setAccessible(true);
        Object enum42 = ((Field) term21122).get((Object) null);
        term20215 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy"));
        setIntField(term20215, term20215.getClass(), "maximumSortKeys", 3);
        setField(term20215, term20215.getClass(), "newSortKeyPosition", enum40);
        setField(term20215, term20215.getClass(), "updateSortKeyPosition", enum41);
        setField(term20215, term20215.getClass(), "removeSortKeyAction", enum42);
        Object term20261 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term20263 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term20261, term20261.getClass(), "column", -1772434990);
        setField(term20263, term20263.getClass(), "name", "");
        setIntField(term20263, term20263.getClass(), "ordinal", 1);
        setField(term20261, term20261.getClass(), "sortOrder", term20263);
        Object term20267 = newInstance(Class.forName("javax.swing.RowSorter$SortKey"));
        Object term20269 = newInstance(Class.forName("javax.swing.SortOrder"));
        setIntField(term20267, term20267.getClass(), "column", -1845499264);
        setField(term20269, term20269.getClass(), "name", null);
        setIntField(term20269, term20269.getClass(), "ordinal", 2);
        setField(term20267, term20267.getClass(), "sortOrder", term20269);
        term20258 = new LinkedList();
        ((LinkedList) term20258).add(term20261);
        ((LinkedList) term20258).add(term20267);
        term20272 = new Integer(-505439934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term20258;
        args[1] = term20272;
        callMethod(klass, "addNewSortKey", argTypes, term20215, args);
    }

};


