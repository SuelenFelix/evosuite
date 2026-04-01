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

public class TreeTableModel_treeNodesRemoved_196758899052 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99194;
     Object term99199;

    public TreeTableModel_treeNodesRemoved_196758899052() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99194 = (int[]) newIntArray(4);
        setIntElement(term99194, 0, 2128383340);
        setIntElement(term99194, 1, 1238598518);
        setIntElement(term99194, 2, -558146961);
        setIntElement(term99194, 3, 1505480070);
        term99199 = (Object[]) newArray("java.lang.Object", 3);
        Object term99200 = newInstance(Class.forName("java.lang.Object"));
        Object term99201 = newInstance(Class.forName("java.lang.Object"));
        Object term99202 = newInstance(Class.forName("java.lang.Object"));
        setElement(term99199, 0, term99200);
        setElement(term99199, 1, term99201);
        setElement(term99199, 2, term99202);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModel");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("javax.swing.tree.TreeNode");
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term99194;
        args[2] = term99199;
        callMethod(klass, "treeNodesRemoved", argTypes, null, args);
    }

};


