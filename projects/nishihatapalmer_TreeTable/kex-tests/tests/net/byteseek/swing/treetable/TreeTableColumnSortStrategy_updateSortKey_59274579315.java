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

public class TreeTableColumnSortStrategy_updateSortKey_59274579315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24143;
     Object term24186;
     Object term24189;
     Object term24191;

    public TreeTableColumnSortStrategy_updateSortKey_59274579315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24205 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$NewSortKeyPosition");
        Field term24204 = ((Class) term24205).getDeclaredField((String) "ADD_TO_END");
        ((Field) term24204).setAccessible(true);
        Object enum49 = ((Field) term24204).get((Object) null);
        Class<? extends Object> term24617 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$UpdateSortKeyPosition");
        Field term24616 = ((Class) term24617).getDeclaredField((String) "KEEP_POSITION");
        ((Field) term24616).setAccessible(true);
        Object enum50 = ((Field) term24616).get((Object) null);
        Class<? extends Object> term25053 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$RemoveSortKeyAction");
        Field term25052 = ((Class) term25053).getDeclaredField((String) "REMOVE");
        ((Field) term25052).setAccessible(true);
        Object enum51 = ((Field) term25052).get((Object) null);
        term24143 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy"));
        setIntField(term24143, term24143.getClass(), "maximumSortKeys", 3);
        setField(term24143, term24143.getClass(), "newSortKeyPosition", enum49);
        setField(term24143, term24143.getClass(), "updateSortKeyPosition", enum50);
        setField(term24143, term24143.getClass(), "removeSortKeyAction", enum51);
        term24186 = new LinkedList();
        term24189 = new Integer(-1347665717);
        term24191 = newInstance(Class.forName("javax.swing.SortOrder"));
        setField(term24191, term24191.getClass(), "name", "ASCENDING");
        setIntField(term24191, term24191.getClass(), "ordinal", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("javax.swing.SortOrder");
        Object[] args = new Object[3];
        args[0] = term24186;
        args[1] = term24189;
        args[2] = term24191;
        callMethod(klass, "updateSortKey", argTypes, term24143, args);
    }

};


