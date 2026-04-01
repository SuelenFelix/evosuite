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

public class TableUtils_AWTMouseListenerReplacer_deactivate_16298439422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83690;

    public TableUtils_AWTMouseListenerReplacer_deactivate_16298439422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83690 = newInstance(Class.forName("net.byteseek.swing.treetable.TableUtils$AWTMouseListenerReplacer"));
        setField(term83690, term83690.getClass(), "component", null);
        setIntField(term83690, term83690.getClass(), "eventReplacementId", 40571662);
        setField(term83690, term83690.getClass(), "replacementListener", null);
        setField(term83690, term83690.getClass(), "removeListener", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TableUtils$AWTMouseListenerReplacer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "deactivate", argTypes, term83690, args);
    }

};


