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

public class TreeTableColumnSortStrategy_findKeyColumn_212438177517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26788;
     Object term26831;
     Object term26834;

    public TreeTableColumnSortStrategy_findKeyColumn_212438177517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term26837 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$NewSortKeyPosition");
        Field term26836 = ((Class) term26837).getDeclaredField((String) "ADD_TO_END");
        ((Field) term26836).setAccessible(true);
        Object enum55 = ((Field) term26836).get((Object) null);
        Class<? extends Object> term27249 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$UpdateSortKeyPosition");
        Field term27248 = ((Class) term27249).getDeclaredField((String) "KEEP_POSITION");
        ((Field) term27248).setAccessible(true);
        Object enum56 = ((Field) term27248).get((Object) null);
        Class<? extends Object> term27685 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$RemoveSortKeyAction");
        Field term27684 = ((Class) term27685).getDeclaredField((String) "REMOVE");
        ((Field) term27684).setAccessible(true);
        Object enum57 = ((Field) term27684).get((Object) null);
        term26788 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy"));
        setIntField(term26788, term26788.getClass(), "maximumSortKeys", 3);
        setField(term26788, term26788.getClass(), "newSortKeyPosition", enum55);
        setField(term26788, term26788.getClass(), "updateSortKeyPosition", enum56);
        setField(term26788, term26788.getClass(), "removeSortKeyAction", enum57);
        term26831 = new LinkedList();
        term26834 = new Integer(-1888585309);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term26831;
        args[1] = term26834;
        callMethod(klass, "findKeyColumn", argTypes, term26788, args);
    }

};


