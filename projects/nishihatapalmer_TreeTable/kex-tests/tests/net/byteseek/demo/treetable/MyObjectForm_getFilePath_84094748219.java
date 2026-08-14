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

public class MyObjectForm_getFilePath_84094748219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29399;

    public MyObjectForm_getFilePath_84094748219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29399 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObjectForm"));
        setField(term29399, term29399.getClass(), "treeTableModel", null);
        setField(term29399, term29399.getClass(), "treeModel", null);
        setField(term29399, term29399.getClass(), "panel1", null);
        setField(term29399, term29399.getClass(), "rootPanel", null);
        setField(term29399, term29399.getClass(), "scrollPane", null);
        setField(term29399, term29399.getClass(), "table1", null);
        setField(term29399, term29399.getClass(), "showRootButton", null);
        setField(term29399, term29399.getClass(), "insertButton", null);
        setField(term29399, term29399.getClass(), "deleteButton", null);
        setField(term29399, term29399.getClass(), "toggleFilterButton", null);
        setField(term29399, term29399.getClass(), "sTextField", null);
        setField(term29399, term29399.getClass(), "random", null);
        setField(term29399, term29399.getClass(), "wordList", null);
        setBooleanField(term29399, term29399.getClass(), "showRoot", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.demo.treetable.MyObjectForm");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getFilePath", argTypes, term29399, args);
    }

};


