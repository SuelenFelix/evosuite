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
     Object term29417;

    public MyObjectForm_getFilePath_84094748219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29417 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObjectForm"));
        setField(term29417, term29417.getClass(), "treeTableModel", null);
        setField(term29417, term29417.getClass(), "treeModel", null);
        setField(term29417, term29417.getClass(), "panel1", null);
        setField(term29417, term29417.getClass(), "rootPanel", null);
        setField(term29417, term29417.getClass(), "scrollPane", null);
        setField(term29417, term29417.getClass(), "table1", null);
        setField(term29417, term29417.getClass(), "showRootButton", null);
        setField(term29417, term29417.getClass(), "insertButton", null);
        setField(term29417, term29417.getClass(), "deleteButton", null);
        setField(term29417, term29417.getClass(), "toggleFilterButton", null);
        setField(term29417, term29417.getClass(), "sTextField", null);
        setField(term29417, term29417.getClass(), "random", null);
        setField(term29417, term29417.getClass(), "wordList", null);
        setBooleanField(term29417, term29417.getClass(), "showRoot", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.demo.treetable.MyObjectForm");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getFilePath", argTypes, term29417, args);
    }

};


