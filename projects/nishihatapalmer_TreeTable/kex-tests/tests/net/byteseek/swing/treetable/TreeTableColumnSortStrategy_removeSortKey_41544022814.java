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

public class TreeTableColumnSortStrategy_removeSortKey_41544022814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22846;
     Object term22889;
     Object term22892;

    public TreeTableColumnSortStrategy_removeSortKey_41544022814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22895 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$NewSortKeyPosition");
        Field term22894 = ((Class) term22895).getDeclaredField((String) "ADD_TO_END");
        ((Field) term22894).setAccessible(true);
        Object enum46 = ((Field) term22894).get((Object) null);
        Class<? extends Object> term23307 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$UpdateSortKeyPosition");
        Field term23306 = ((Class) term23307).getDeclaredField((String) "KEEP_POSITION");
        ((Field) term23306).setAccessible(true);
        Object enum47 = ((Field) term23306).get((Object) null);
        Class<? extends Object> term23743 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$RemoveSortKeyAction");
        Field term23742 = ((Class) term23743).getDeclaredField((String) "REMOVE");
        ((Field) term23742).setAccessible(true);
        Object enum48 = ((Field) term23742).get((Object) null);
        term22846 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy"));
        setIntField(term22846, term22846.getClass(), "maximumSortKeys", 3);
        setField(term22846, term22846.getClass(), "newSortKeyPosition", enum46);
        setField(term22846, term22846.getClass(), "updateSortKeyPosition", enum47);
        setField(term22846, term22846.getClass(), "removeSortKeyAction", enum48);
        term22889 = new LinkedList();
        term22892 = new Integer(304775596);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term22889;
        args[1] = term22892;
        callMethod(klass, "removeSortKey", argTypes, term22846, args);
    }

};


