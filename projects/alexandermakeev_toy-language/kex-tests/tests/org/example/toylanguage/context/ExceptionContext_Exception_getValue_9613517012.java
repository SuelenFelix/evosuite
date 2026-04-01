package org.example.toylanguage.context;

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
import static org.example.toylanguage.context.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class ExceptionContext_Exception_getValue_9613517012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term491;

    public ExceptionContext_Exception_getValue_9613517012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term493 = new ArrayList();
        ((ArrayList) term493).add((Object)null);
        ((ArrayList) term493).add((Object)null);
        term491 = newInstance(Class.forName("org.example.toylanguage.context.ExceptionContext$Exception"));
        Object term492 = newInstance(Class.forName("org.example.toylanguage.expression.value.Value"));
        setField(term492, term492.getClass(), "value", null);
        setField(term491, term491.getClass(), "value", term492);
        setField(term491, term491.getClass(), "stackTrace", term493);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.context.ExceptionContext$Exception");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getValue", argTypes, term491, args);
    }

};


