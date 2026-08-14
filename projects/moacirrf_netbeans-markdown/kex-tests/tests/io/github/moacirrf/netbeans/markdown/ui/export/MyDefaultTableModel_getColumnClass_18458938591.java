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
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;

public class MyDefaultTableModel_getColumnClass_18458938591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36653;
     Object term36670;

    public MyDefaultTableModel_getColumnClass_18458938591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term36656 = new ArrayList();
        term36653 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.export.MyDefaultTableModel"));
        Object term36654 = newInstance(Class.forName("java.util.Vector"));
        Object[] term36655 = (Object[]) newArray("java.lang.Object", 10);
        Object term36663 = newInstance(Class.forName("java.util.Vector"));
        Object[] term36664 = (Object[]) newArray("java.lang.Object", 10);
        Object term36668 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term36669 = (Object[]) newArray("java.lang.Object", 0);
        setElement(term36655, 0, term36656);
        setField(term36654, term36654.getClass(), "elementData", term36655);
        setIntField(term36654, term36654.getClass(), "elementCount", 1);
        setIntField(term36654, term36654.getClass(), "capacityIncrement", 0);
        setIntField(term36654, term36654.getClass(), "modCount", 1);
        setField(term36653, term36653.getClass(), "dataVector", term36654);
        setField(term36663, term36663.getClass(), "elementData", term36664);
        setIntField(term36663, term36663.getClass(), "elementCount", 0);
        setIntField(term36663, term36663.getClass(), "capacityIncrement", 0);
        setIntField(term36663, term36663.getClass(), "modCount", 0);
        setField(term36653, term36653.getClass(), "columnIdentifiers", term36663);
        setField(term36668, term36668.getClass(), "listenerList", term36669);
        setField(term36653, term36653.getClass(), "listenerList", term36668);
        term36670 = new Integer(96566506);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.export.MyDefaultTableModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term36670;
        callMethod(klass, "getColumnClass", argTypes, term36653, args);
    }

};


