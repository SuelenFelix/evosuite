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
     Object term98353;
     Object term98355;
     Object term98357;

    public TreeTableModel_removeVisibleNodes_157814462966() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98353 = new Integer(405295896);
        term98355 = new Integer(-814977075);
        term98357 = (Object[]) newArray("java.lang.Object", 2);
        Object term98358 = newInstance(Class.forName("java.lang.Object"));
        Object term98359 = newInstance(Class.forName("java.lang.Object"));
        setElement(term98357, 0, term98358);
        setElement(term98357, 1, term98359);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModel");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term98353;
        args[1] = term98355;
        args[2] = term98357;
        callMethod(klass, "removeVisibleNodes", argTypes, null, args);
    }

};


