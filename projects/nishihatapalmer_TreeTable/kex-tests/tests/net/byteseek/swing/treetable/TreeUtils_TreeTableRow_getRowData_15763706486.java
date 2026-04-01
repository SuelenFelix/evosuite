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
import java.lang.Object;

public class TreeUtils_TreeTableRow_getRowData_15763706486 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81455;

    public TreeUtils_TreeTableRow_getRowData_15763706486() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81455 = newInstance(Class.forName("net.byteseek.swing.treetable.TreeUtils$TreeTableRow"));
        Object term81456 = newInstance(Class.forName("java.lang.Object"));
        Object term81457 = newInstance(Class.forName("java.lang.Object"));
        Object[] term81458 = (Object[]) newArray("java.lang.Object", 3);
        Object term81459 = newInstance(Class.forName("java.lang.Object"));
        Object term81460 = newInstance(Class.forName("java.lang.Object"));
        Object term81461 = newInstance(Class.forName("java.lang.Object"));
        setField(term81455, term81455.getClass(), "id", term81456);
        setField(term81455, term81455.getClass(), "parentId", term81457);
        setElement(term81458, 0, term81459);
        setElement(term81458, 1, term81460);
        setElement(term81458, 2, term81461);
        setField(term81455, term81455.getClass(), "otherColumns", term81458);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeUtils$TreeTableRow");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRowData", argTypes, term81455, args);
    }

};


