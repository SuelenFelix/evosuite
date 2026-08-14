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

public class MyDefaultTableModel_toInputModel_5408324253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36693;

    public MyDefaultTableModel_toInputModel_5408324253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36693 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.export.MyDefaultTableModel"));
        Object term36694 = newInstance(Class.forName("java.util.Vector"));
        Object[] term36695 = (Object[]) newArray("java.lang.Object", 10);
        Object term36699 = newInstance(Class.forName("java.util.Vector"));
        Object[] term36700 = (Object[]) newArray("java.lang.Object", 10);
        Object term36704 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term36705 = (Object[]) newArray("java.lang.Object", 0);
        setField(term36694, term36694.getClass(), "elementData", term36695);
        setIntField(term36694, term36694.getClass(), "elementCount", 0);
        setIntField(term36694, term36694.getClass(), "capacityIncrement", 0);
        setIntField(term36694, term36694.getClass(), "modCount", 0);
        setField(term36693, term36693.getClass(), "dataVector", term36694);
        setField(term36699, term36699.getClass(), "elementData", term36700);
        setIntField(term36699, term36699.getClass(), "elementCount", 0);
        setIntField(term36699, term36699.getClass(), "capacityIncrement", 0);
        setIntField(term36699, term36699.getClass(), "modCount", 0);
        setField(term36693, term36693.getClass(), "columnIdentifiers", term36699);
        setField(term36704, term36704.getClass(), "listenerList", term36705);
        setField(term36693, term36693.getClass(), "listenerList", term36704);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.export.MyDefaultTableModel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toInputModel", argTypes, term36693, args);
    }

};


