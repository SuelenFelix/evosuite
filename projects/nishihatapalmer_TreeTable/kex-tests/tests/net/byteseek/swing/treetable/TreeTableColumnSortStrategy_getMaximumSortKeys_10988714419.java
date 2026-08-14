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

public class TreeTableColumnSortStrategy_getMaximumSortKeys_10988714419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16321;

    public TreeTableColumnSortStrategy_getMaximumSortKeys_10988714419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16365 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$NewSortKeyPosition");
        Field term16364 = ((Class) term16365).getDeclaredField((String) "ADD_TO_END");
        ((Field) term16364).setAccessible(true);
        Object enum31 = ((Field) term16364).get((Object) null);
        Class<? extends Object> term16777 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$UpdateSortKeyPosition");
        Field term16776 = ((Class) term16777).getDeclaredField((String) "KEEP_POSITION");
        ((Field) term16776).setAccessible(true);
        Object enum32 = ((Field) term16776).get((Object) null);
        Class<? extends Object> term17213 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$RemoveSortKeyAction");
        Field term17212 = ((Class) term17213).getDeclaredField((String) "REMOVE");
        ((Field) term17212).setAccessible(true);
        Object enum33 = ((Field) term17212).get((Object) null);
        term16321 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy"));
        setIntField(term16321, term16321.getClass(), "maximumSortKeys", 3);
        setField(term16321, term16321.getClass(), "newSortKeyPosition", enum31);
        setField(term16321, term16321.getClass(), "updateSortKeyPosition", enum32);
        setField(term16321, term16321.getClass(), "removeSortKeyAction", enum33);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaximumSortKeys", argTypes, term16321, args);
    }

};


