package io.github.juliengalet.reactorflow.exception;

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
import static io.github.juliengalet.reactorflow.exception.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class FlowFunctionalException_getType_6996984841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3132;

    public FlowFunctionalException_getType_6996984841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3132 = newInstance(Class.forName("io.github.juliengalet.reactorflow.exception.FlowFunctionalException"));
        setField(term3132, term3132.getClass(), "flowConcerned", null);
        setField(term3132, term3132.getClass(), "backtrace", null);
        setField(term3132, term3132.getClass(), "detailMessage", null);
        setField(term3132, term3132.getClass(), "cause", null);
        setField(term3132, term3132.getClass(), "stackTrace", null);
        setIntField(term3132, term3132.getClass(), "depth", 0);
        setField(term3132, term3132.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.exception.FlowFunctionalException");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term3132, args);
    }

};


