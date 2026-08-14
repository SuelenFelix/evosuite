package io.codeworth.panelmatic.util.customizers;

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
import static io.codeworth.panelmatic.util.customizers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ChangeDetectorCustomizer_fireChangeEvent_48661424511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66;

    public ChangeDetectorCustomizer_fireChangeEvent_48661424511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66 = newInstance(Class.forName("io.codeworth.panelmatic.util.customizers.ChangeDetectorCustomizer"));
        setField(term66, term66.getClass(), "listeners", null);
        setBooleanField(term66, term66.getClass(), "fireingInProgress", false);
        setField(term66, term66.getClass(), "actionListener", null);
        setField(term66, term66.getClass(), "documentListener", null);
        setField(term66, term66.getClass(), "changeListener", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.util.customizers.ChangeDetectorCustomizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "fireChangeEvent", argTypes, term66, args);
    }

};


