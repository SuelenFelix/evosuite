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

public class MyObjectForm_1_insertUpdate_4799037252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46588;

    public MyObjectForm_1_insertUpdate_4799037252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46588 = newInstance(Class.forName("net.byteseek.demo.treetable.MyObjectForm$1"));
        setField(term46588, term46588.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.demo.treetable.MyObjectForm$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.event.DocumentEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "insertUpdate", argTypes, term46588, args);
    }

};


