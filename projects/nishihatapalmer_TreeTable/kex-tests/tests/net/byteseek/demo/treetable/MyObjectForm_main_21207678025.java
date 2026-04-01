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

public class MyObjectForm_main_21207678025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35658;

    public MyObjectForm_main_21207678025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35658 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObjectForm"));
        setField(term35658, term35658.getClass(), "treeTableModel", null);
        setField(term35658, term35658.getClass(), "treeModel", null);
        setField(term35658, term35658.getClass(), "panel1", null);
        setField(term35658, term35658.getClass(), "rootPanel", null);
        setField(term35658, term35658.getClass(), "scrollPane", null);
        setField(term35658, term35658.getClass(), "table1", null);
        setField(term35658, term35658.getClass(), "showRootButton", null);
        setField(term35658, term35658.getClass(), "insertButton", null);
        setField(term35658, term35658.getClass(), "deleteButton", null);
        setField(term35658, term35658.getClass(), "toggleFilterButton", null);
        setField(term35658, term35658.getClass(), "sTextField", null);
        setField(term35658, term35658.getClass(), "random", null);
        setField(term35658, term35658.getClass(), "wordList", null);
        setBooleanField(term35658, term35658.getClass(), "showRoot", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.demo.treetable.MyObjectForm");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "main", argTypes, term35658, args);
    }

};


