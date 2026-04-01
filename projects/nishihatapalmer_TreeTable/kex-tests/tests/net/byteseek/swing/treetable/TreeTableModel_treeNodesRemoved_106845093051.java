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
     Object term99180;

    public TreeTableModel_treeNodesRemoved_106845093051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99180 = newInstance(Class.forName("javax.swing.event.TreeModelEvent"));
        Object term99181 = newInstance(Class.forName("javax.swing.tree.TreePath"));
        Object term99182 = newInstance(Class.forName("javax.swing.tree.TreePath"));
        Object term99183 = newInstance(Class.forName("javax.swing.tree.TreePath"));
        Object term99184 = newInstance(Class.forName("javax.swing.tree.TreePath"));
        Object term99185 = newInstance(Class.forName("java.lang.Object"));
        Object term99186 = newInstance(Class.forName("java.lang.Object"));
        Object term99187 = newInstance(Class.forName("java.lang.Object"));
        int[] term99188 = (int[]) newIntArray(0);
        Object[] term99189 = (Object[]) newArray("java.lang.Object", 5);
        Object term99190 = newInstance(Class.forName("java.lang.Object"));
        Object term99191 = newInstance(Class.forName("java.lang.Object"));
        Object term99192 = newInstance(Class.forName("java.lang.Object"));
        Object term99193 = newInstance(Class.forName("java.lang.Object"));
        setField(term99184, term99184.getClass(), "parentPath", null);
        setField(term99184, term99184.getClass(), "lastPathComponent", null);
        setField(term99183, term99183.getClass(), "parentPath", term99184);
        setField(term99183, term99183.getClass(), "lastPathComponent", term99185);
        setField(term99182, term99182.getClass(), "parentPath", term99183);
        setField(term99182, term99182.getClass(), "lastPathComponent", term99186);
        setField(term99181, term99181.getClass(), "parentPath", term99182);
        setField(term99181, term99181.getClass(), "lastPathComponent", term99187);
        setField(term99180, term99180.getClass(), "path", term99181);
        setField(term99180, term99180.getClass(), "childIndices", term99188);
        setElement(term99189, 0, term99190);
        setElement(term99189, 1, term99186);
        setElement(term99189, 2, term99187);
        setElement(term99189, 3, term99191);
        setElement(term99189, 4, term99192);
        setField(term99180, term99180.getClass(), "children", term99189);
        setField(term99180, term99180.getClass(), "source", term99193);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.event.TreeModelEvent");
        Object[] args = new Object[1];
        args[0] = term99180;
        callMethod(klass, "treeNodesRemoved", argTypes, null, args);
    }

};


