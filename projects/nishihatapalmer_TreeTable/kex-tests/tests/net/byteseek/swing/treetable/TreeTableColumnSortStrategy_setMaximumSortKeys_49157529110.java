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
import java.lang.Integer;

public class TreeTableColumnSortStrategy_setMaximumSortKeys_49157529110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17617;
     Object term17660;

    public TreeTableColumnSortStrategy_setMaximumSortKeys_49157529110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17663 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$NewSortKeyPosition");
        Field term17662 = ((Class) term17663).getDeclaredField((String) "ADD_TO_END");
        ((Field) term17662).setAccessible(true);
        Object enum34 = ((Field) term17662).get((Object) null);
        Class<? extends Object> term18075 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$UpdateSortKeyPosition");
        Field term18074 = ((Class) term18075).getDeclaredField((String) "KEEP_POSITION");
        ((Field) term18074).setAccessible(true);
        Object enum35 = ((Field) term18074).get((Object) null);
        Class<? extends Object> term18511 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$RemoveSortKeyAction");
        Field term18510 = ((Class) term18511).getDeclaredField((String) "REMOVE");
        ((Field) term18510).setAccessible(true);
        Object enum36 = ((Field) term18510).get((Object) null);
        term17617 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy"));
        setIntField(term17617, term17617.getClass(), "maximumSortKeys", 3);
        setField(term17617, term17617.getClass(), "newSortKeyPosition", enum34);
        setField(term17617, term17617.getClass(), "updateSortKeyPosition", enum35);
        setField(term17617, term17617.getClass(), "removeSortKeyAction", enum36);
        term17660 = new Integer(-556405712);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term17660;
        callMethod(klass, "setMaximumSortKeys", argTypes, term17617, args);
    }

};


