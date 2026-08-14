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
import java.lang.Boolean;
import java.lang.Integer;

public class MyOrderTableCellEditor_getTableCellEditorComponent_9294841302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60900;
     Object term60901;
     Object term60903;
     Object term60905;

    public MyOrderTableCellEditor_getTableCellEditorComponent_9294841302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60900 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.export.MyOrderTableCellEditor"));
        setField(term60900, term60900.getClass(), "listenerList", null);
        setField(term60900, term60900.getClass(), "changeEvent", null);
        term60901 = new Boolean(false);
        term60903 = new Integer(0);
        term60905 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.export.MyOrderTableCellEditor");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("javax.swing.JTable");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = boolean.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = term60901;
        args[3] = term60903;
        args[4] = term60905;
        callMethod(klass, "getTableCellEditorComponent", argTypes, term60900, args);
    }

};


