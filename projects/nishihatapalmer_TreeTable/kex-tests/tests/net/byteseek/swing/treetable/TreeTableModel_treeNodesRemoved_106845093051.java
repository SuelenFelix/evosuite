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

public class TreeTableModel_treeNodesRemoved_106845093051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98232;

    public TreeTableModel_treeNodesRemoved_106845093051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98232 = newInstance(Class.forName("javax.swing.event.TreeModelEvent"));
        Object term98233 = newInstance(Class.forName("javax.swing.tree.TreePath"));
        Object term98234 = newInstance(Class.forName("javax.swing.tree.TreePath"));
        Object term98235 = newInstance(Class.forName("javax.swing.tree.TreePath"));
        Object term98236 = newInstance(Class.forName("javax.swing.tree.TreePath"));
        Object term98237 = newInstance(Class.forName("java.lang.Object"));
        Object term98238 = newInstance(Class.forName("java.lang.Object"));
        Object term98239 = newInstance(Class.forName("java.lang.Object"));
        int[] term98240 = (int[]) newIntArray(9);
        Object[] term98250 = (Object[]) newArray("java.lang.Object", 8);
        Object term98251 = newInstance(Class.forName("java.lang.Object"));
        Object term98252 = newInstance(Class.forName("java.lang.Object"));
        Object term98253 = newInstance(Class.forName("java.lang.Object"));
        Object term98254 = newInstance(Class.forName("java.lang.Object"));
        Object term98255 = newInstance(Class.forName("java.lang.Object"));
        setField(term98236, term98236.getClass(), "parentPath", null);
        setField(term98236, term98236.getClass(), "lastPathComponent", null);
        setField(term98235, term98235.getClass(), "parentPath", term98236);
        setField(term98235, term98235.getClass(), "lastPathComponent", term98237);
        setField(term98234, term98234.getClass(), "parentPath", term98235);
        setField(term98234, term98234.getClass(), "lastPathComponent", term98238);
        setField(term98233, term98233.getClass(), "parentPath", term98234);
        setField(term98233, term98233.getClass(), "lastPathComponent", term98239);
        setField(term98232, term98232.getClass(), "path", term98233);
        setIntElement(term98240, 0, -271094506);
        setIntElement(term98240, 1, 455632030);
        setIntElement(term98240, 2, -1632929393);
        setIntElement(term98240, 3, -431440129);
        setIntElement(term98240, 4, -763576148);
        setIntElement(term98240, 5, 1568948514);
        setIntElement(term98240, 6, -1511130237);
        setIntElement(term98240, 7, 452088587);
        setIntElement(term98240, 8, -1630069454);
        setField(term98232, term98232.getClass(), "childIndices", term98240);
        setElement(term98250, 0, term98251);
        setElement(term98250, 1, term98238);
        setElement(term98250, 2, term98239);
        setElement(term98250, 3, term98252);
        setElement(term98250, 4, term98253);
        setElement(term98250, 5, term98254);
        setElement(term98250, 6, term98255);
        setElement(term98250, 7, term98255);
        setField(term98232, term98232.getClass(), "children", term98250);
        setField(term98232, term98232.getClass(), "source", term98251);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.event.TreeModelEvent");
        Object[] args = new Object[1];
        args[0] = term98232;
        callMethod(klass, "treeNodesRemoved", argTypes, null, args);
    }

};


