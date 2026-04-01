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

public class TreeTableColumnSortStrategy_setRemoveSortKeyAction_9469030056 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11565;
     Object enum23;

    public TreeTableColumnSortStrategy_setRemoveSortKeyAction_9469030056() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11623 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$NewSortKeyPosition");
        Field term11622 = ((Class) term11623).getDeclaredField((String) "ADD_TO_END");
        ((Field) term11622).setAccessible(true);
        Object enum20 = ((Field) term11622).get((Object) null);
        Class<? extends Object> term12035 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$UpdateSortKeyPosition");
        Field term12034 = ((Class) term12035).getDeclaredField((String) "KEEP_POSITION");
        ((Field) term12034).setAccessible(true);
        Object enum21 = ((Field) term12034).get((Object) null);
        Class<? extends Object> term12471 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$RemoveSortKeyAction");
        Field term12470 = ((Class) term12471).getDeclaredField((String) "REMOVE");
        ((Field) term12470).setAccessible(true);
        Object enum22 = ((Field) term12470).get((Object) null);
        term11565 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy"));
        setIntField(term11565, term11565.getClass(), "maximumSortKeys", 3);
        setField(term11565, term11565.getClass(), "newSortKeyPosition", enum20);
        setField(term11565, term11565.getClass(), "updateSortKeyPosition", enum21);
        setField(term11565, term11565.getClass(), "removeSortKeyAction", enum22);
        Class<? extends Object> term12876 = Class.forName((String) "net.byteseek.swing.treetable.TreeTableColumnSortStrategy$RemoveSortKeyAction");
        Field term12875 = ((Class) term12876).getDeclaredField((String) "REMOVE_ALL");
        ((Field) term12875).setAccessible(true);
        enum23 = ((Field) term12875).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.byteseek.swing.treetable.TreeTableColumnSortStrategy$RemoveSortKeyAction");
        Object[] args = new Object[1];
        args[0] = enum23;
        callMethod(klass, "setRemoveSortKeyAction", argTypes, term11565, args);
    }

};


