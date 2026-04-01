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
import java.lang.Boolean;

public class MyObjectForm_buildRandomChildren_165202849513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19785;
     Object term19787;
     Object term19789;
     Object term19791;
     Object term19793;

    public MyObjectForm_buildRandomChildren_165202849513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19785 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObjectForm"));
        setField(term19785, term19785.getClass(), "treeTableModel", null);
        setField(term19785, term19785.getClass(), "treeModel", null);
        setField(term19785, term19785.getClass(), "panel1", null);
        setField(term19785, term19785.getClass(), "rootPanel", null);
        setField(term19785, term19785.getClass(), "scrollPane", null);
        setField(term19785, term19785.getClass(), "table1", null);
        setField(term19785, term19785.getClass(), "showRootButton", null);
        setField(term19785, term19785.getClass(), "insertButton", null);
        setField(term19785, term19785.getClass(), "deleteButton", null);
        setField(term19785, term19785.getClass(), "toggleFilterButton", null);
        setField(term19785, term19785.getClass(), "sTextField", null);
        setField(term19785, term19785.getClass(), "random", null);
        setField(term19785, term19785.getClass(), "wordList", null);
        setBooleanField(term19785, term19785.getClass(), "showRoot", false);
        term19787 = new Integer(0);
        term19789 = new Integer(0);
        term19791 = new Integer(0);
        term19793 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.demo.treetable.MyObjectForm");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("net.byteseek.demo.treetable.MyObject");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = term19787;
        args[2] = term19789;
        args[3] = term19791;
        args[4] = term19793;
        callMethod(klass, "buildRandomChildren", argTypes, term19785, args);
    }

};


