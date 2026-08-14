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
import java.util.ArrayList;

public class ChangeDetectorCustomizer_1_init_11603172120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term296;

    public ChangeDetectorCustomizer_1_init_11603172120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term297 = new ArrayList();
        term296 = newInstance(Class.forName("io.codeworth.panelmatic.util.customizers.ChangeDetectorCustomizer"));
        setField(term296, term296.getClass(), "listeners", term297);
        setBooleanField(term296, term296.getClass(), "fireingInProgress", false);
        setField(term296, term296.getClass(), "actionListener", null);
        setField(term296, term296.getClass(), "documentListener", null);
        setField(term296, term296.getClass(), "changeListener", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.util.customizers.ChangeDetectorCustomizer$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.codeworth.panelmatic.util.customizers.ChangeDetectorCustomizer");
        Object[] args = new Object[1];
        args[0] = term296;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


