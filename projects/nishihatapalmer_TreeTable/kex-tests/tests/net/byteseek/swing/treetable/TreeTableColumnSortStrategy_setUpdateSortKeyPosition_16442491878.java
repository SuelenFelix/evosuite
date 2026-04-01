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

public class TreeTableColumnSortStrategy_setUpdateSortKeyPosition_16442491878 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14588;
     Object enum30;

    public TreeTableColumnSortStrategy_setUpdateSortKeyPosition_16442491878() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14646 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$NewSortKeyPosition");
        Field term14645 = ((Class) term14646).getDeclaredField((String) "ADD_TO_END");
        ((Field) term14645).setAccessible(true);
        Object enum27 = ((Field) term14645).get((Object) null);
        Class<? extends Object> term15058 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$UpdateSortKeyPosition");
        Field term15057 = ((Class) term15058).getDeclaredField((String) "KEEP_POSITION");
        ((Field) term15057).setAccessible(true);
        Object enum28 = ((Field) term15057).get((Object) null);
        Class<? extends Object> term15494 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$RemoveSortKeyAction");
        Field term15493 = ((Class) term15494).getDeclaredField((String) "REMOVE");
        ((Field) term15493).setAccessible(true);
        Object enum29 = ((Field) term15493).get((Object) null);
        term14588 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy"));
        setIntField(term14588, term14588.getClass(), "maximumSortKeys", 3);
        setField(term14588, term14588.getClass(), "newSortKeyPosition", enum27);
        setField(term14588, term14588.getClass(), "updateSortKeyPosition", enum28);
        setField(term14588, term14588.getClass(), "removeSortKeyAction", enum29);
        Class<? extends Object> term15899 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$UpdateSortKeyPosition");
        Field term15898 = ((Class) term15899).getDeclaredField((String) "MAKE_FIRST");
        ((Field) term15898).setAccessible(true);
        enum30 = ((Field) term15898).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy$UpdateSortKeyPosition");
        Object[] args = new Object[1];
        args[0] = enum30;
        callMethod(klass, "setUpdateSortKeyPosition", argTypes, term14588, args);
    }

};


