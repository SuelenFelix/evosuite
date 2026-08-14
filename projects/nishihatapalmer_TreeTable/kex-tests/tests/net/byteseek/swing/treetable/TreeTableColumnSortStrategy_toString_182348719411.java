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

public class TreeTableColumnSortStrategy_toString_182348719411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18915;

    public TreeTableColumnSortStrategy_toString_182348719411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18959 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$NewSortKeyPosition");
        Field term18958 = ((Class) term18959).getDeclaredField((String) "ADD_TO_END");
        ((Field) term18958).setAccessible(true);
        Object enum37 = ((Field) term18958).get((Object) null);
        Class<? extends Object> term19371 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$UpdateSortKeyPosition");
        Field term19370 = ((Class) term19371).getDeclaredField((String) "KEEP_POSITION");
        ((Field) term19370).setAccessible(true);
        Object enum38 = ((Field) term19370).get((Object) null);
        Class<? extends Object> term19807 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$RemoveSortKeyAction");
        Field term19806 = ((Class) term19807).getDeclaredField((String) "REMOVE");
        ((Field) term19806).setAccessible(true);
        Object enum39 = ((Field) term19806).get((Object) null);
        term18915 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy"));
        setIntField(term18915, term18915.getClass(), "maximumSortKeys", 3);
        setField(term18915, term18915.getClass(), "newSortKeyPosition", enum37);
        setField(term18915, term18915.getClass(), "updateSortKeyPosition", enum38);
        setField(term18915, term18915.getClass(), "removeSortKeyAction", enum39);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term18915, args);
    }

};


