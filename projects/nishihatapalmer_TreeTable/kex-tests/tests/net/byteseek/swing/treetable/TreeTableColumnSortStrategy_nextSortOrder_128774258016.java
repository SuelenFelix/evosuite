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

public class TreeTableColumnSortStrategy_nextSortOrder_128774258016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25470;
     Object term25513;

    public TreeTableColumnSortStrategy_nextSortOrder_128774258016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25527 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$NewSortKeyPosition");
        Field term25526 = ((Class) term25527).getDeclaredField((String) "ADD_TO_END");
        ((Field) term25526).setAccessible(true);
        Object enum52 = ((Field) term25526).get((Object) null);
        Class<? extends Object> term25939 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$UpdateSortKeyPosition");
        Field term25938 = ((Class) term25939).getDeclaredField((String) "KEEP_POSITION");
        ((Field) term25938).setAccessible(true);
        Object enum53 = ((Field) term25938).get((Object) null);
        Class<? extends Object> term26375 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$RemoveSortKeyAction");
        Field term26374 = ((Class) term26375).getDeclaredField((String) "REMOVE");
        ((Field) term26374).setAccessible(true);
        Object enum54 = ((Field) term26374).get((Object) null);
        term25470 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy"));
        setIntField(term25470, term25470.getClass(), "maximumSortKeys", 3);
        setField(term25470, term25470.getClass(), "newSortKeyPosition", enum52);
        setField(term25470, term25470.getClass(), "updateSortKeyPosition", enum53);
        setField(term25470, term25470.getClass(), "removeSortKeyAction", enum54);
        term25513 = newInstance(Class.forName("javax.swing.SortOrder"));
        setField(term25513, term25513.getClass(), "name", "ASCENDING");
        setIntField(term25513, term25513.getClass(), "ordinal", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.SortOrder");
        Object[] args = new Object[1];
        args[0] = term25513;
        callMethod(klass, "nextSortOrder", argTypes, term25470, args);
    }

};


