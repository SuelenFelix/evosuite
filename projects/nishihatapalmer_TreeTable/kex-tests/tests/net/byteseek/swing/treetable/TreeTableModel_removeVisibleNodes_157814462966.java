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
import java.lang.Object;

public class TreeTableModel_removeVisibleNodes_157814462966 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99270;
     Object term99272;
     Object term99274;

    public TreeTableModel_removeVisibleNodes_157814462966() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99270 = new Integer(1648665618);
        term99272 = new Integer(633765954);
        term99274 = (Object[]) newArray("java.lang.Object", 7);
        Object term99275 = newInstance(Class.forName("java.lang.Object"));
        Object term99276 = newInstance(Class.forName("java.lang.Object"));
        Object term99277 = newInstance(Class.forName("java.lang.Object"));
        Object term99278 = newInstance(Class.forName("java.lang.Object"));
        Object term99279 = newInstance(Class.forName("java.lang.Object"));
        Object term99280 = newInstance(Class.forName("java.lang.Object"));
        Object term99281 = newInstance(Class.forName("java.lang.Object"));
        setElement(term99274, 0, term99275);
        setElement(term99274, 1, term99276);
        setElement(term99274, 2, term99277);
        setElement(term99274, 3, term99278);
        setElement(term99274, 4, term99279);
        setElement(term99274, 5, term99280);
        setElement(term99274, 6, term99281);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModel");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term99270;
        args[1] = term99272;
        args[2] = term99274;
        callMethod(klass, "removeVisibleNodes", argTypes, null, args);
    }

};


