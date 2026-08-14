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

public class ChangeDetectorCustomizer_AddCommand_init_18961468320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80;

    public ChangeDetectorCustomizer_AddCommand_init_18961468320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term81 = new ArrayList();
        term80 = newInstance(Class.forName("io.codeworth.panelmatic.util.customizers.ChangeDetectorCustomizer"));
        setField(term80, term80.getClass(), "listeners", term81);
        setBooleanField(term80, term80.getClass(), "fireingInProgress", true);
        setField(term80, term80.getClass(), "actionListener", null);
        setField(term80, term80.getClass(), "documentListener", null);
        setField(term80, term80.getClass(), "changeListener", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.util.customizers.ChangeDetectorCustomizer$AddCommand");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("io.codeworth.panelmatic.util.customizers.ChangeDetectorCustomizer");
        argTypes[1] = Class.forName("io.codeworth.panelmatic.util.customizers.ChangeDetectorCustomizer$Listener");
        Object[] args = new Object[2];
        args[0] = term80;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


