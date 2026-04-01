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

public class MyObjectForm_getRandomDescription_208360023417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26182;

    public MyObjectForm_getRandomDescription_208360023417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26182 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObjectForm"));
        setField(term26182, term26182.getClass(), "treeTableModel", null);
        setField(term26182, term26182.getClass(), "treeModel", null);
        setField(term26182, term26182.getClass(), "panel1", null);
        setField(term26182, term26182.getClass(), "rootPanel", null);
        setField(term26182, term26182.getClass(), "scrollPane", null);
        setField(term26182, term26182.getClass(), "table1", null);
        setField(term26182, term26182.getClass(), "showRootButton", null);
        setField(term26182, term26182.getClass(), "insertButton", null);
        setField(term26182, term26182.getClass(), "deleteButton", null);
        setField(term26182, term26182.getClass(), "toggleFilterButton", null);
        setField(term26182, term26182.getClass(), "sTextField", null);
        setField(term26182, term26182.getClass(), "random", null);
        setField(term26182, term26182.getClass(), "wordList", null);
        setBooleanField(term26182, term26182.getClass(), "showRoot", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.demo.treetable.MyObjectForm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRandomDescription", argTypes, term26182, args);
    }

};


