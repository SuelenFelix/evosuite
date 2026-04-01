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

public class TreeTableModel_getLastPathNode_156660330360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99232;

    public TreeTableModel_getLastPathNode_156660330360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99232 = newInstance(Class.forName("javax.swing.event.TreeModelEvent"));
        Object term99233 = newInstance(Class.forName("javax.swing.tree.TreePath"));
        Object term99234 = newInstance(Class.forName("javax.swing.tree.TreePath"));
        Object term99235 = newInstance(Class.forName("javax.swing.tree.TreePath"));
        Object term99236 = newInstance(Class.forName("javax.swing.tree.TreePath"));
        Object term99237 = newInstance(Class.forName("java.lang.Object"));
        Object term99238 = newInstance(Class.forName("java.lang.Object"));
        Object term99239 = newInstance(Class.forName("java.lang.Object"));
        int[] term99240 = (int[]) newIntArray(3);
        Object[] term99244 = (Object[]) newArray("java.lang.Object", 5);
        Object term99245 = newInstance(Class.forName("java.lang.Object"));
        Object term99246 = newInstance(Class.forName("java.lang.Object"));
        Object term99247 = newInstance(Class.forName("java.lang.Object"));
        Object term99248 = newInstance(Class.forName("java.lang.Object"));
        setField(term99236, term99236.getClass(), "parentPath", null);
        setField(term99236, term99236.getClass(), "lastPathComponent", null);
        setField(term99235, term99235.getClass(), "parentPath", term99236);
        setField(term99235, term99235.getClass(), "lastPathComponent", term99237);
        setField(term99234, term99234.getClass(), "parentPath", term99235);
        setField(term99234, term99234.getClass(), "lastPathComponent", term99238);
        setField(term99233, term99233.getClass(), "parentPath", term99234);
        setField(term99233, term99233.getClass(), "lastPathComponent", term99239);
        setField(term99232, term99232.getClass(), "path", term99233);
        setIntElement(term99240, 0, 872295704);
        setIntElement(term99240, 1, 86041387);
        setIntElement(term99240, 2, 1010721666);
        setField(term99232, term99232.getClass(), "childIndices", term99240);
        setElement(term99244, 0, term99245);
        setElement(term99244, 1, term99238);
        setElement(term99244, 2, term99239);
        setElement(term99244, 3, term99246);
        setElement(term99244, 4, term99247);
        setField(term99232, term99232.getClass(), "children", term99244);
        setField(term99232, term99232.getClass(), "source", term99248);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.event.TreeModelEvent");
        Object[] args = new Object[1];
        args[0] = term99232;
        callMethod(klass, "getLastPathNode", argTypes, null, args);
    }

};


