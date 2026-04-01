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

public class TreeTableColumnSortStrategy_getNewSortKeyPosition_9301672573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7251;

    public TreeTableColumnSortStrategy_getNewSortKeyPosition_9301672573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7295 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$NewSortKeyPosition");
        Field term7294 = ((Class) term7295).getDeclaredField((String) "ADD_TO_END");
        ((Field) term7294).setAccessible(true);
        Object enum10 = ((Field) term7294).get((Object) null);
        Class<? extends Object> term7707 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$UpdateSortKeyPosition");
        Field term7706 = ((Class) term7707).getDeclaredField((String) "KEEP_POSITION");
        ((Field) term7706).setAccessible(true);
        Object enum11 = ((Field) term7706).get((Object) null);
        Class<? extends Object> term8143 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$RemoveSortKeyAction");
        Field term8142 = ((Class) term8143).getDeclaredField((String) "REMOVE");
        ((Field) term8142).setAccessible(true);
        Object enum12 = ((Field) term8142).get((Object) null);
        term7251 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy"));
        setIntField(term7251, term7251.getClass(), "maximumSortKeys", 3);
        setField(term7251, term7251.getClass(), "newSortKeyPosition", enum10);
        setField(term7251, term7251.getClass(), "updateSortKeyPosition", enum11);
        setField(term7251, term7251.getClass(), "removeSortKeyAction", enum12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNewSortKeyPosition", argTypes, term7251, args);
    }

};


