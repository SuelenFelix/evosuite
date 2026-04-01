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

public class MyObjectForm_initForm_13280832423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4096;

    public MyObjectForm_initForm_13280832423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4096 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObjectForm"));
        setField(term4096, term4096.getClass(), "treeTableModel", null);
        setField(term4096, term4096.getClass(), "treeModel", null);
        setField(term4096, term4096.getClass(), "panel1", null);
        setField(term4096, term4096.getClass(), "rootPanel", null);
        setField(term4096, term4096.getClass(), "scrollPane", null);
        setField(term4096, term4096.getClass(), "table1", null);
        setField(term4096, term4096.getClass(), "showRootButton", null);
        setField(term4096, term4096.getClass(), "insertButton", null);
        setField(term4096, term4096.getClass(), "deleteButton", null);
        setField(term4096, term4096.getClass(), "toggleFilterButton", null);
        setField(term4096, term4096.getClass(), "sTextField", null);
        setField(term4096, term4096.getClass(), "random", null);
        setField(term4096, term4096.getClass(), "wordList", null);
        setBooleanField(term4096, term4096.getClass(), "showRoot", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.demo.treetable.MyObjectForm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "initForm", argTypes, term4096, args);
    }

};


