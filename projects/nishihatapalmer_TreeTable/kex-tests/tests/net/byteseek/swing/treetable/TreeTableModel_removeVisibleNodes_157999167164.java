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

public class TreeTableModel_removeVisibleNodes_157999167164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98340;
     Object term98344;

    public TreeTableModel_removeVisibleNodes_157999167164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98340 = (int[]) newIntArray(3);
        setIntElement(term98340, 0, -1967153290);
        setIntElement(term98340, 1, -1397251956);
        setIntElement(term98340, 2, -796934571);
        term98344 = (Object[]) newArray("java.lang.Object", 5);
        Object term98345 = newInstance(Class.forName("java.lang.Object"));
        Object term98346 = newInstance(Class.forName("java.lang.Object"));
        Object term98347 = newInstance(Class.forName("java.lang.Object"));
        Object term98348 = newInstance(Class.forName("java.lang.Object"));
        Object term98349 = newInstance(Class.forName("java.lang.Object"));
        setElement(term98344, 0, term98345);
        setElement(term98344, 1, term98346);
        setElement(term98344, 2, term98347);
        setElement(term98344, 3, term98348);
        setElement(term98344, 4, term98349);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModel");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term98340;
        args[1] = term98344;
        callMethod(klass, "removeVisibleNodes", argTypes, null, args);
    }

};


