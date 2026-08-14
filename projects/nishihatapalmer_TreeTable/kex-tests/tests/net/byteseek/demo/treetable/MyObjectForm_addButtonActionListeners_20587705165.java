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

public class MyObjectForm_addButtonActionListeners_20587705165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7380;

    public MyObjectForm_addButtonActionListeners_20587705165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7380 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObjectForm"));
        setField(term7380, term7380.getClass(), "treeTableModel", null);
        setField(term7380, term7380.getClass(), "treeModel", null);
        setField(term7380, term7380.getClass(), "panel1", null);
        setField(term7380, term7380.getClass(), "rootPanel", null);
        setField(term7380, term7380.getClass(), "scrollPane", null);
        setField(term7380, term7380.getClass(), "table1", null);
        setField(term7380, term7380.getClass(), "showRootButton", null);
        setField(term7380, term7380.getClass(), "insertButton", null);
        setField(term7380, term7380.getClass(), "deleteButton", null);
        setField(term7380, term7380.getClass(), "toggleFilterButton", null);
        setField(term7380, term7380.getClass(), "sTextField", null);
        setField(term7380, term7380.getClass(), "random", null);
        setField(term7380, term7380.getClass(), "wordList", null);
        setBooleanField(term7380, term7380.getClass(), "showRoot", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.demo.treetable.MyObjectForm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "addButtonActionListeners", argTypes, term7380, args);
    }

};


