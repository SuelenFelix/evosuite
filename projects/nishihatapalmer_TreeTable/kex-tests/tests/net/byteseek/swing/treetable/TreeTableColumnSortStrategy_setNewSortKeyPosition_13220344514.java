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

public class TreeTableColumnSortStrategy_setNewSortKeyPosition_13220344514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8543;
     Object enum16;

    public TreeTableColumnSortStrategy_setNewSortKeyPosition_13220344514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8601 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$NewSortKeyPosition");
        Field term8600 = ((Class) term8601).getDeclaredField((String) "ADD_TO_END");
        ((Field) term8600).setAccessible(true);
        Object enum13 = ((Field) term8600).get((Object) null);
        Class<? extends Object> term9013 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$UpdateSortKeyPosition");
        Field term9012 = ((Class) term9013).getDeclaredField((String) "KEEP_POSITION");
        ((Field) term9012).setAccessible(true);
        Object enum14 = ((Field) term9012).get((Object) null);
        Class<? extends Object> term9449 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$RemoveSortKeyAction");
        Field term9448 = ((Class) term9449).getDeclaredField((String) "REMOVE");
        ((Field) term9448).setAccessible(true);
        Object enum15 = ((Field) term9448).get((Object) null);
        term8543 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy"));
        setIntField(term8543, term8543.getClass(), "maximumSortKeys", 3);
        setField(term8543, term8543.getClass(), "newSortKeyPosition", enum13);
        setField(term8543, term8543.getClass(), "updateSortKeyPosition", enum14);
        setField(term8543, term8543.getClass(), "removeSortKeyAction", enum15);
        Class<? extends Object> term9854 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$NewSortKeyPosition");
        Field term9853 = ((Class) term9854).getDeclaredField((String) "MAKE_FIRST");
        ((Field) term9853).setAccessible(true);
        enum16 = ((Field) term9853).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy$NewSortKeyPosition");
        Object[] args = new Object[1];
        args[0] = enum16;
        callMethod(klass, "setNewSortKeyPosition", argTypes, term8543, args);
    }

};


