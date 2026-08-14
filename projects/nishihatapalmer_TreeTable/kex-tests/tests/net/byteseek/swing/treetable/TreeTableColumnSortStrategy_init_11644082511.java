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
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;

public class TreeTableColumnSortStrategy_init_11644082511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4590;
     Object enum4;
     Object enum5;
     Object enum6;

    public TreeTableColumnSortStrategy_init_11644082511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4590 = new Integer(1442160736);
        Class<? extends Object> term4670 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$NewSortKeyPosition");
        Field term4669 = ((Class) term4670).getDeclaredField((String) "MAKE_FIRST");
        ((Field) term4669).setAccessible(true);
        enum4 = ((Field) term4669).get((Object) null);
        Class<? extends Object> term5082 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$UpdateSortKeyPosition");
        Field term5081 = ((Class) term5082).getDeclaredField((String) "MAKE_FIRST");
        ((Field) term5081).setAccessible(true);
        enum5 = ((Field) term5081).get((Object) null);
        Class<? extends Object> term5509 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$RemoveSortKeyAction");
        Field term5508 = ((Class) term5509).getDeclaredField((String) "REMOVE_SUBSEQUENT");
        ((Field) term5508).setAccessible(true);
        enum6 = ((Field) term5508).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy$NewSortKeyPosition");
        argTypes[2] = Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy$UpdateSortKeyPosition");
        argTypes[3] = Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy$RemoveSortKeyAction");
        Object[] args = new Object[4];
        args[0] = term4590;
        args[1] = enum4;
        args[2] = enum5;
        args[3] = enum6;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


