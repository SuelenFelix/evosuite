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

public class MyDefaultTableModel_isCellEditable_139182732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36672;
     Object term36689;
     Object term36691;

    public MyDefaultTableModel_isCellEditable_139182732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term36675 = new ArrayList();
        term36672 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.export.MyDefaultTableModel"));
        Object term36673 = newInstance(Class.forName("java.util.Vector"));
        Object[] term36674 = (Object[]) newArray("java.lang.Object", 10);
        Object term36682 = newInstance(Class.forName("java.util.Vector"));
        Object[] term36683 = (Object[]) newArray("java.lang.Object", 10);
        Object term36687 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term36688 = (Object[]) newArray("java.lang.Object", 0);
        setElement(term36674, 0, term36675);
        setField(term36673, term36673.getClass(), "elementData", term36674);
        setIntField(term36673, term36673.getClass(), "elementCount", 1);
        setIntField(term36673, term36673.getClass(), "capacityIncrement", 0);
        setIntField(term36673, term36673.getClass(), "modCount", 1);
        setField(term36672, term36672.getClass(), "dataVector", term36673);
        setField(term36682, term36682.getClass(), "elementData", term36683);
        setIntField(term36682, term36682.getClass(), "elementCount", 0);
        setIntField(term36682, term36682.getClass(), "capacityIncrement", 0);
        setIntField(term36682, term36682.getClass(), "modCount", 0);
        setField(term36672, term36672.getClass(), "columnIdentifiers", term36682);
        setField(term36687, term36687.getClass(), "listenerList", term36688);
        setField(term36672, term36672.getClass(), "listenerList", term36687);
        term36689 = new Integer(-343325701);
        term36691 = new Integer(107945604);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.export.MyDefaultTableModel");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term36689;
        args[1] = term36691;
        callMethod(klass, "isCellEditable", argTypes, term36672, args);
    }

};


