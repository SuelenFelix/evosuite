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
     Object term19773;
     Object term19775;
     Object term19777;
     Object term19779;
     Object term19781;

    public MyObjectForm_buildRandomChildren_165202849513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19773 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObjectForm"));
        setField(term19773, term19773.getClass(), "treeTableModel", null);
        setField(term19773, term19773.getClass(), "treeModel", null);
        setField(term19773, term19773.getClass(), "panel1", null);
        setField(term19773, term19773.getClass(), "rootPanel", null);
        setField(term19773, term19773.getClass(), "scrollPane", null);
        setField(term19773, term19773.getClass(), "table1", null);
        setField(term19773, term19773.getClass(), "showRootButton", null);
        setField(term19773, term19773.getClass(), "insertButton", null);
        setField(term19773, term19773.getClass(), "deleteButton", null);
        setField(term19773, term19773.getClass(), "toggleFilterButton", null);
        setField(term19773, term19773.getClass(), "sTextField", null);
        setField(term19773, term19773.getClass(), "random", null);
        setField(term19773, term19773.getClass(), "wordList", null);
        setBooleanField(term19773, term19773.getClass(), "showRoot", false);
        term19775 = new Integer(0);
        term19777 = new Integer(0);
        term19779 = new Integer(0);
        term19781 = new Boolean(false);
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
        args[1] = term19775;
        args[2] = term19777;
        args[3] = term19779;
        args[4] = term19781;
        callMethod(klass, "buildRandomChildren", argTypes, term19773, args);
    }

};


