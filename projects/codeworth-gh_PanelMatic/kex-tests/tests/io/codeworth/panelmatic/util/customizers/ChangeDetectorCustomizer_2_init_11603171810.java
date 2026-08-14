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

public class ChangeDetectorCustomizer_2_init_11603171810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term284;

    public ChangeDetectorCustomizer_2_init_11603171810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term285 = new ArrayList();
        term284 = newInstance(Class.forName("io.codeworth.panelmatic.util.customizers.ChangeDetectorCustomizer"));
        setField(term284, term284.getClass(), "listeners", term285);
        setBooleanField(term284, term284.getClass(), "fireingInProgress", true);
        setField(term284, term284.getClass(), "actionListener", null);
        setField(term284, term284.getClass(), "documentListener", null);
        setField(term284, term284.getClass(), "changeListener", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.util.customizers.ChangeDetectorCustomizer$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.codeworth.panelmatic.util.customizers.ChangeDetectorCustomizer");
        Object[] args = new Object[1];
        args[0] = term284;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


