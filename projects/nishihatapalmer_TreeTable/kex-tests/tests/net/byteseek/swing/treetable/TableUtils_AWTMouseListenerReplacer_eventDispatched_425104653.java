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
     Object term82956;

    public TableUtils_AWTMouseListenerReplacer_eventDispatched_425104653() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82956 = newInstance(Class.forName("net.byteseek.swing.treetable.TableUtils$AWTMouseListenerReplacer"));
        setField(term82956, term82956.getClass(), "component", null);
        setIntField(term82956, term82956.getClass(), "eventReplacementId", -2072158633);
        setField(term82956, term82956.getClass(), "replacementListener", null);
        setField(term82956, term82956.getClass(), "removeListener", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TableUtils$AWTMouseListenerReplacer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.AWTEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "eventDispatched", argTypes, term82956, args);
    }

};


