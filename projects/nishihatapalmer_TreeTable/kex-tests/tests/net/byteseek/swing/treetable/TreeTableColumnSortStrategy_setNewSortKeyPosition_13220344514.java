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
     Object term8547;
     Object enum16;

    public TreeTableColumnSortStrategy_setNewSortKeyPosition_13220344514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8605 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$NewSortKeyPosition");
        Field term8604 = ((Class) term8605).getDeclaredField((String) "ADD_TO_END");
        ((Field) term8604).setAccessible(true);
        Object enum13 = ((Field) term8604).get((Object) null);
        Class<? extends Object> term9017 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$UpdateSortKeyPosition");
        Field term9016 = ((Class) term9017).getDeclaredField((String) "KEEP_POSITION");
        ((Field) term9016).setAccessible(true);
        Object enum14 = ((Field) term9016).get((Object) null);
        Class<? extends Object> term9453 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$RemoveSortKeyAction");
        Field term9452 = ((Class) term9453).getDeclaredField((String) "REMOVE");
        ((Field) term9452).setAccessible(true);
        Object enum15 = ((Field) term9452).get((Object) null);
        term8547 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy"));
        setIntField(term8547, term8547.getClass(), "maximumSortKeys", 3);
        setField(term8547, term8547.getClass(), "newSortKeyPosition", enum13);
        setField(term8547, term8547.getClass(), "updateSortKeyPosition", enum14);
        setField(term8547, term8547.getClass(), "removeSortKeyAction", enum15);
        Class<? extends Object> term9858 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$NewSortKeyPosition");
        Field term9857 = ((Class) term9858).getDeclaredField((String) "MAKE_FIRST");
        ((Field) term9857).setAccessible(true);
        enum16 = ((Field) term9857).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy$NewSortKeyPosition");
        Object[] args = new Object[1];
        args[0] = enum16;
        callMethod(klass, "setNewSortKeyPosition", argTypes, term8547, args);
    }

};


