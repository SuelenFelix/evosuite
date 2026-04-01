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

public class MyObjectForm_createTreeModel_13340643557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10358;

    public MyObjectForm_createTreeModel_13340643557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10358 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObjectForm"));
        setField(term10358, term10358.getClass(), "treeTableModel", null);
        setField(term10358, term10358.getClass(), "treeModel", null);
        setField(term10358, term10358.getClass(), "panel1", null);
        setField(term10358, term10358.getClass(), "rootPanel", null);
        setField(term10358, term10358.getClass(), "scrollPane", null);
        setField(term10358, term10358.getClass(), "table1", null);
        setField(term10358, term10358.getClass(), "showRootButton", null);
        setField(term10358, term10358.getClass(), "insertButton", null);
        setField(term10358, term10358.getClass(), "deleteButton", null);
        setField(term10358, term10358.getClass(), "toggleFilterButton", null);
        setField(term10358, term10358.getClass(), "sTextField", null);
        setField(term10358, term10358.getClass(), "random", null);
        setField(term10358, term10358.getClass(), "wordList", null);
        setBooleanField(term10358, term10358.getClass(), "showRoot", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.demo.treetable.MyObjectForm");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.tree.TreeNode");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createTreeModel", argTypes, term10358, args);
    }

};


