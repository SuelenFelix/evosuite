package net.byteseek.swing.treetable;

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
import static net.byteseek.swing.treetable.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TableUtils_isResizeCursor_46618110518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term381749;

    public TableUtils_isResizeCursor_46618110518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term381749 = newInstance(Class.forName("java.awt.Cursor"));
        Object term381752 = newInstance(Class.forName("java.lang.Object"));
        Object term381753 = newInstance(Class.forName("java.awt.Cursor$CursorDisposer"));
        setIntField(term381749, term381749.getClass(), "type", -1774273964);
        setLongField(term381749, term381749.getClass(), "pData", 9013624480170062917L);
        setField(term381749, term381749.getClass(), "anchor", term381752);
        setLongField(term381753, term381753.getClass(), "pData", 7862575738391801707L);
        setField(term381749, term381749.getClass(), "disposer", term381753);
        setField(term381749, term381749.getClass(), "name", "OJJtVNPyKZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TableUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Cursor");
        Object[] args = new Object[1];
        args[0] = term381749;
        callMethod(klass, "isResizeCursor", argTypes, null, args);
    }

};


