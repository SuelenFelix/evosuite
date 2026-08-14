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

public class MyOrderTableCellEditor_getCellEditorValue_18176129273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60907;

    public MyOrderTableCellEditor_getCellEditorValue_18176129273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60907 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.export.MyOrderTableCellEditor"));
        Object term60908 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term60909 = (Object[]) newArray("java.lang.Object", 0);
        Object term60910 = newInstance(Class.forName("javax.swing.event.ChangeEvent"));
        Object term60911 = newInstance(Class.forName("java.lang.Object"));
        setField(term60908, term60908.getClass(), "listenerList", term60909);
        setField(term60907, term60907.getClass(), "listenerList", term60908);
        setField(term60910, term60910.getClass(), "source", term60911);
        setField(term60907, term60907.getClass(), "changeEvent", term60910);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.export.MyOrderTableCellEditor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCellEditorValue", argTypes, term60907, args);
    }

};


