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

public class TableUtils_AWTMouseListenerReplacer_eventDispatched_425104653 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83692;

    public TableUtils_AWTMouseListenerReplacer_eventDispatched_425104653() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83692 = newInstance(Class.forName("net.byteseek.swing.treetable.TableUtils$AWTMouseListenerReplacer"));
        setField(term83692, term83692.getClass(), "component", null);
        setIntField(term83692, term83692.getClass(), "eventReplacementId", 1863910269);
        setField(term83692, term83692.getClass(), "replacementListener", null);
        setField(term83692, term83692.getClass(), "removeListener", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TableUtils$AWTMouseListenerReplacer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.AWTEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "eventDispatched", argTypes, term83692, args);
    }

};


