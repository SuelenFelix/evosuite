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

public class MyObjectForm_readWordList_62401966015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22932;

    public MyObjectForm_readWordList_62401966015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22932 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObjectForm"));
        setField(term22932, term22932.getClass(), "treeTableModel", null);
        setField(term22932, term22932.getClass(), "treeModel", null);
        setField(term22932, term22932.getClass(), "panel1", null);
        setField(term22932, term22932.getClass(), "rootPanel", null);
        setField(term22932, term22932.getClass(), "scrollPane", null);
        setField(term22932, term22932.getClass(), "table1", null);
        setField(term22932, term22932.getClass(), "showRootButton", null);
        setField(term22932, term22932.getClass(), "insertButton", null);
        setField(term22932, term22932.getClass(), "deleteButton", null);
        setField(term22932, term22932.getClass(), "toggleFilterButton", null);
        setField(term22932, term22932.getClass(), "sTextField", null);
        setField(term22932, term22932.getClass(), "random", null);
        setField(term22932, term22932.getClass(), "wordList", null);
        setBooleanField(term22932, term22932.getClass(), "showRoot", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.demo.treetable.MyObjectForm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "readWordList", argTypes, term22932, args);
    }

};


