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

public class TreeTableModel_treeStructureChanged_62395632054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99207;

    public TreeTableModel_treeStructureChanged_62395632054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99207 = newInstance(Class.forName("javax.swing.event.TreeModelEvent"));
        Object term99208 = newInstance(Class.forName("javax.swing.tree.TreePath"));
        Object term99209 = newInstance(Class.forName("javax.swing.tree.TreePath"));
        Object term99210 = newInstance(Class.forName("javax.swing.tree.TreePath"));
        Object term99211 = newInstance(Class.forName("javax.swing.tree.TreePath"));
        Object term99212 = newInstance(Class.forName("java.lang.Object"));
        Object term99213 = newInstance(Class.forName("java.lang.Object"));
        Object term99214 = newInstance(Class.forName("java.lang.Object"));
        int[] term99215 = (int[]) newIntArray(5);
        Object[] term99221 = (Object[]) newArray("java.lang.Object", 9);
        Object term99222 = newInstance(Class.forName("java.lang.Object"));
        Object term99223 = newInstance(Class.forName("java.lang.Object"));
        Object term99224 = newInstance(Class.forName("java.lang.Object"));
        Object term99225 = newInstance(Class.forName("java.lang.Object"));
        Object term99226 = newInstance(Class.forName("java.lang.Object"));
        setField(term99211, term99211.getClass(), "parentPath", null);
        setField(term99211, term99211.getClass(), "lastPathComponent", null);
        setField(term99210, term99210.getClass(), "parentPath", term99211);
        setField(term99210, term99210.getClass(), "lastPathComponent", term99212);
        setField(term99209, term99209.getClass(), "parentPath", term99210);
        setField(term99209, term99209.getClass(), "lastPathComponent", term99213);
        setField(term99208, term99208.getClass(), "parentPath", term99209);
        setField(term99208, term99208.getClass(), "lastPathComponent", term99214);
        setField(term99207, term99207.getClass(), "path", term99208);
        setIntElement(term99215, 0, -829088844);
        setIntElement(term99215, 1, -31751777);
        setIntElement(term99215, 2, -246967963);
        setIntElement(term99215, 3, -1777140369);
        setIntElement(term99215, 4, 993627098);
        setField(term99207, term99207.getClass(), "childIndices", term99215);
        setElement(term99221, 0, term99222);
        setElement(term99221, 1, term99213);
        setElement(term99221, 2, term99214);
        setElement(term99221, 3, term99223);
        setElement(term99221, 4, term99224);
        setElement(term99221, 5, term99225);
        setElement(term99221, 6, term99226);
        setElement(term99221, 7, term99226);
        setElement(term99221, 8, term99222);
        setField(term99207, term99207.getClass(), "children", term99221);
        setField(term99207, term99207.getClass(), "source", term99213);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.event.TreeModelEvent");
        Object[] args = new Object[1];
        args[0] = term99207;
        callMethod(klass, "treeStructureChanged", argTypes, null, args);
    }

};


