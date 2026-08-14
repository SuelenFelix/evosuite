package io.codeworth.panelmatic.util;

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
import static io.codeworth.panelmatic.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class PanelPostProcessors_1_process_11122357671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term332;

    public PanelPostProcessors_1_process_11122357671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term333 = new Boolean(true);
        Boolean term335 = new Boolean(true);
        term332 = newInstance(Class.forName("io.codeworth.panelmatic.util.PanelPostProcessors$1"));
        setField(term332, term332.getClass(), "val$vScroll", term333);
        setField(term332, term332.getClass(), "val$hScroll", term335);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.util.PanelPostProcessors$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.JComponent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "process", argTypes, term332, args);
    }

};


