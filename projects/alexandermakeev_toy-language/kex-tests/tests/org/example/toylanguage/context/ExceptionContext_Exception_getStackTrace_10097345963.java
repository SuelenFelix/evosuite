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

public class ExceptionContext_Exception_getStackTrace_10097345963 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term497;

    public ExceptionContext_Exception_getStackTrace_10097345963() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term499 = new ArrayList();
        ((ArrayList) term499).add((Object)null);
        ((ArrayList) term499).add((Object)null);
        ((ArrayList) term499).add((Object)null);
        ((ArrayList) term499).add((Object)null);
        ((ArrayList) term499).add((Object)null);
        ((ArrayList) term499).add((Object)null);
        ((ArrayList) term499).add((Object)null);
        ((ArrayList) term499).add((Object)null);
        ((ArrayList) term499).add((Object)null);
        term497 = newInstance(Class.forName("org.example.toylanguage.context.ExceptionContext$Exception"));
        Object term498 = newInstance(Class.forName("org.example.toylanguage.expression.value.Value"));
        setField(term498, term498.getClass(), "value", null);
        setField(term497, term497.getClass(), "value", term498);
        setField(term497, term497.getClass(), "stackTrace", term499);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.context.ExceptionContext$Exception");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStackTrace", argTypes, term497, args);
    }

};


