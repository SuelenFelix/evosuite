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
     Object term98200;

    public TreeTableModel_treeNodesInserted_199256391648() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98200 = newInstance(Class.forName("javax.swing.event.TreeModelEvent"));
        Object term98201 = newInstance(Class.forName("javax.swing.tree.TreePath"));
        Object term98202 = newInstance(Class.forName("javax.swing.tree.TreePath"));
        Object term98203 = newInstance(Class.forName("javax.swing.tree.TreePath"));
        Object term98204 = newInstance(Class.forName("javax.swing.tree.TreePath"));
        Object term98205 = newInstance(Class.forName("java.lang.Object"));
        Object term98206 = newInstance(Class.forName("java.lang.Object"));
        Object term98207 = newInstance(Class.forName("java.lang.Object"));
        int[] term98208 = (int[]) newIntArray(2);
        Object[] term98211 = (Object[]) newArray("java.lang.Object", 0);
        Object term98212 = newInstance(Class.forName("java.lang.Object"));
        setField(term98204, term98204.getClass(), "parentPath", null);
        setField(term98204, term98204.getClass(), "lastPathComponent", null);
        setField(term98203, term98203.getClass(), "parentPath", term98204);
        setField(term98203, term98203.getClass(), "lastPathComponent", term98205);
        setField(term98202, term98202.getClass(), "parentPath", term98203);
        setField(term98202, term98202.getClass(), "lastPathComponent", term98206);
        setField(term98201, term98201.getClass(), "parentPath", term98202);
        setField(term98201, term98201.getClass(), "lastPathComponent", term98207);
        setField(term98200, term98200.getClass(), "path", term98201);
        setIntElement(term98208, 0, -2129828854);
        setIntElement(term98208, 1, -47438786);
        setField(term98200, term98200.getClass(), "childIndices", term98208);
        setField(term98200, term98200.getClass(), "children", term98211);
        setField(term98200, term98200.getClass(), "source", term98212);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.event.TreeModelEvent");
        Object[] args = new Object[1];
        args[0] = term98200;
        callMethod(klass, "treeNodesInserted", argTypes, null, args);
    }

};


