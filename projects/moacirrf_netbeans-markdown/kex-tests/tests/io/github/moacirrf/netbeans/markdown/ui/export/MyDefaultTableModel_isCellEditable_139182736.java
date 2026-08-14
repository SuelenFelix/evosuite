package io.github.moacirrf.netbeans.markdown.ui.export;

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
import static io.github.moacirrf.netbeans.markdown.ui.export.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class MyDefaultTableModel_isCellEditable_139182736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36709;
     Object term36710;
     Object term36712;

    public MyDefaultTableModel_isCellEditable_139182736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36709 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.export.MyDefaultTableModel"));
        setField(term36709, term36709.getClass(), "dataVector", null);
        setField(term36709, term36709.getClass(), "columnIdentifiers", null);
        setField(term36709, term36709.getClass(), "listenerList", null);
        term36710 = new Integer(0);
        term36712 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.export.MyDefaultTableModel");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term36710;
        args[1] = term36712;
        callMethod(klass, "isCellEditable", argTypes, term36709, args);
    }

};


