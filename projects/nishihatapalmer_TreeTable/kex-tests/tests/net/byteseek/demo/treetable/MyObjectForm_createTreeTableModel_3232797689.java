package net.byteseek.demo.treetable;

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
import static net.byteseek.demo.treetable.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MyObjectForm_createTreeTableModel_3232797689 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13499;

    public MyObjectForm_createTreeTableModel_3232797689() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13499 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObjectForm"));
        setField(term13499, term13499.getClass(), "treeTableModel", null);
        setField(term13499, term13499.getClass(), "treeModel", null);
        setField(term13499, term13499.getClass(), "panel1", null);
        setField(term13499, term13499.getClass(), "rootPanel", null);
        setField(term13499, term13499.getClass(), "scrollPane", null);
        setField(term13499, term13499.getClass(), "table1", null);
        setField(term13499, term13499.getClass(), "showRootButton", null);
        setField(term13499, term13499.getClass(), "insertButton", null);
        setField(term13499, term13499.getClass(), "deleteButton", null);
        setField(term13499, term13499.getClass(), "toggleFilterButton", null);
        setField(term13499, term13499.getClass(), "sTextField", null);
        setField(term13499, term13499.getClass(), "random", null);
        setField(term13499, term13499.getClass(), "wordList", null);
        setBooleanField(term13499, term13499.getClass(), "showRoot", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.demo.treetable.MyObjectForm");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.tree.TreeNode");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createTreeTableModel", argTypes, term13499, args);
    }

};


