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
     Object term14584;
     Object enum30;

    public TreeTableColumnSortStrategy_setUpdateSortKeyPosition_16442491878() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14642 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$NewSortKeyPosition");
        Field term14641 = ((Class) term14642).getDeclaredField((String) "ADD_TO_END");
        ((Field) term14641).setAccessible(true);
        Object enum27 = ((Field) term14641).get((Object) null);
        Class<? extends Object> term15054 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$UpdateSortKeyPosition");
        Field term15053 = ((Class) term15054).getDeclaredField((String) "KEEP_POSITION");
        ((Field) term15053).setAccessible(true);
        Object enum28 = ((Field) term15053).get((Object) null);
        Class<? extends Object> term15490 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$RemoveSortKeyAction");
        Field term15489 = ((Class) term15490).getDeclaredField((String) "REMOVE");
        ((Field) term15489).setAccessible(true);
        Object enum29 = ((Field) term15489).get((Object) null);
        term14584 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy"));
        setIntField(term14584, term14584.getClass(), "maximumSortKeys", 3);
        setField(term14584, term14584.getClass(), "newSortKeyPosition", enum27);
        setField(term14584, term14584.getClass(), "updateSortKeyPosition", enum28);
        setField(term14584, term14584.getClass(), "removeSortKeyAction", enum29);
        Class<? extends Object> term15895 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$UpdateSortKeyPosition");
        Field term15894 = ((Class) term15895).getDeclaredField((String) "MAKE_FIRST");
        ((Field) term15894).setAccessible(true);
        enum30 = ((Field) term15894).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy$UpdateSortKeyPosition");
        Object[] args = new Object[1];
        args[0] = enum30;
        callMethod(klass, "setUpdateSortKeyPosition", argTypes, term14584, args);
    }

};


