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

public class FlowBuilderException_mapMessage_12360203735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11576;

    public FlowBuilderException_mapMessage_12360203735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11576 = newInstance(Class.forName("io.github.juliengalet.reactorflow.exception.FlowBuilderException"));
        setField(term11576, term11576.getClass(), "flowConcerned", null);
        setField(term11576, term11576.getClass(), "backtrace", null);
        setField(term11576, term11576.getClass(), "detailMessage", null);
        setField(term11576, term11576.getClass(), "cause", null);
        setField(term11576, term11576.getClass(), "stackTrace", null);
        setIntField(term11576, term11576.getClass(), "depth", 0);
        setField(term11576, term11576.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.exception.FlowBuilderException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Class");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "mapMessage", argTypes, term11576, args);
    }

};


