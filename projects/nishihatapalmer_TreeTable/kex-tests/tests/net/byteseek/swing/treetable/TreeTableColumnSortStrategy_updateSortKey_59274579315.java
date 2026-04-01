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
     Object term24147;
     Object term24190;
     Object term24193;
     Object term24195;

    public TreeTableColumnSortStrategy_updateSortKey_59274579315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24209 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$NewSortKeyPosition");
        Field term24208 = ((Class) term24209).getDeclaredField((String) "ADD_TO_END");
        ((Field) term24208).setAccessible(true);
        Object enum49 = ((Field) term24208).get((Object) null);
        Class<? extends Object> term24621 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$UpdateSortKeyPosition");
        Field term24620 = ((Class) term24621).getDeclaredField((String) "KEEP_POSITION");
        ((Field) term24620).setAccessible(true);
        Object enum50 = ((Field) term24620).get((Object) null);
        Class<? extends Object> term25057 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$RemoveSortKeyAction");
        Field term25056 = ((Class) term25057).getDeclaredField((String) "REMOVE");
        ((Field) term25056).setAccessible(true);
        Object enum51 = ((Field) term25056).get((Object) null);
        term24147 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy"));
        setIntField(term24147, term24147.getClass(), "maximumSortKeys", 3);
        setField(term24147, term24147.getClass(), "newSortKeyPosition", enum49);
        setField(term24147, term24147.getClass(), "updateSortKeyPosition", enum50);
        setField(term24147, term24147.getClass(), "removeSortKeyAction", enum51);
        term24190 = new LinkedList();
        term24193 = new Integer(-1347665717);
        term24195 = newInstance(Class.forName("javax.swing.SortOrder"));
        setField(term24195, term24195.getClass(), "name", "ASCENDING");
        setIntField(term24195, term24195.getClass(), "ordinal", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("javax.swing.SortOrder");
        Object[] args = new Object[3];
        args[0] = term24190;
        args[1] = term24193;
        args[2] = term24195;
        callMethod(klass, "updateSortKey", argTypes, term24147, args);
    }

};


