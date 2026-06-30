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

public class FlowBuilderException_getType_12789065862 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8892;

    public FlowBuilderException_getType_12789065862() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8892 = newInstance(Class.forName("io.github.juliengalet.reactorflow.exception.FlowBuilderException"));
        setField(term8892, term8892.getClass(), "flowConcerned", null);
        setField(term8892, term8892.getClass(), "backtrace", null);
        setField(term8892, term8892.getClass(), "detailMessage", null);
        setField(term8892, term8892.getClass(), "cause", null);
        setField(term8892, term8892.getClass(), "stackTrace", null);
        setIntField(term8892, term8892.getClass(), "depth", 0);
        setField(term8892, term8892.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.exception.FlowBuilderException");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term8892, args);
    }

};


