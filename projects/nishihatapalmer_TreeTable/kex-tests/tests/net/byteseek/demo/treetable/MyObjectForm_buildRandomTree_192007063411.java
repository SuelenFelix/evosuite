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
import java.lang.Integer;

public class MyObjectForm_buildRandomTree_192007063411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16637;
     Object term16639;
     Object term16641;

    public MyObjectForm_buildRandomTree_192007063411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16637 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObjectForm"));
        setField(term16637, term16637.getClass(), "treeTableModel", null);
        setField(term16637, term16637.getClass(), "treeModel", null);
        setField(term16637, term16637.getClass(), "panel1", null);
        setField(term16637, term16637.getClass(), "rootPanel", null);
        setField(term16637, term16637.getClass(), "scrollPane", null);
        setField(term16637, term16637.getClass(), "table1", null);
        setField(term16637, term16637.getClass(), "showRootButton", null);
        setField(term16637, term16637.getClass(), "insertButton", null);
        setField(term16637, term16637.getClass(), "deleteButton", null);
        setField(term16637, term16637.getClass(), "toggleFilterButton", null);
        setField(term16637, term16637.getClass(), "sTextField", null);
        setField(term16637, term16637.getClass(), "random", null);
        setField(term16637, term16637.getClass(), "wordList", null);
        setBooleanField(term16637, term16637.getClass(), "showRoot", false);
        term16639 = new Integer(0);
        term16641 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.demo.treetable.MyObjectForm");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term16639;
        args[1] = term16641;
        callMethod(klass, "buildRandomTree", argTypes, term16637, args);
    }

};


