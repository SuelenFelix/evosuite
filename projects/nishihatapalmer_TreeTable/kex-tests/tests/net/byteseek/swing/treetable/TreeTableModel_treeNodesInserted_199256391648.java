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

public class TreeTableModel_treeNodesInserted_199256391648 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99155;

    public TreeTableModel_treeNodesInserted_199256391648() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99155 = newInstance(Class.forName("javax.swing.event.TreeModelEvent"));
        Object term99156 = newInstance(Class.forName("javax.swing.tree.TreePath"));
        Object term99157 = newInstance(Class.forName("javax.swing.tree.TreePath"));
        Object term99158 = newInstance(Class.forName("javax.swing.tree.TreePath"));
        Object term99159 = newInstance(Class.forName("javax.swing.tree.TreePath"));
        Object term99160 = newInstance(Class.forName("java.lang.Object"));
        Object term99161 = newInstance(Class.forName("java.lang.Object"));
        Object term99162 = newInstance(Class.forName("java.lang.Object"));
        int[] term99163 = (int[]) newIntArray(2);
        Object[] term99166 = (Object[]) newArray("java.lang.Object", 5);
        Object term99167 = newInstance(Class.forName("java.lang.Object"));
        Object term99168 = newInstance(Class.forName("java.lang.Object"));
        Object term99169 = newInstance(Class.forName("java.lang.Object"));
        Object term99170 = newInstance(Class.forName("java.lang.Object"));
        setField(term99159, term99159.getClass(), "parentPath", null);
        setField(term99159, term99159.getClass(), "lastPathComponent", null);
        setField(term99158, term99158.getClass(), "parentPath", term99159);
        setField(term99158, term99158.getClass(), "lastPathComponent", term99160);
        setField(term99157, term99157.getClass(), "parentPath", term99158);
        setField(term99157, term99157.getClass(), "lastPathComponent", term99161);
        setField(term99156, term99156.getClass(), "parentPath", term99157);
        setField(term99156, term99156.getClass(), "lastPathComponent", term99162);
        setField(term99155, term99155.getClass(), "path", term99156);
        setIntElement(term99163, 0, 109078154);
        setIntElement(term99163, 1, -314165467);
        setField(term99155, term99155.getClass(), "childIndices", term99163);
        setElement(term99166, 0, term99167);
        setElement(term99166, 1, term99161);
        setElement(term99166, 2, term99162);
        setElement(term99166, 3, term99168);
        setElement(term99166, 4, term99169);
        setField(term99155, term99155.getClass(), "children", term99166);
        setField(term99155, term99155.getClass(), "source", term99170);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.event.TreeModelEvent");
        Object[] args = new Object[1];
        args[0] = term99155;
        callMethod(klass, "treeNodesInserted", argTypes, null, args);
    }

};


