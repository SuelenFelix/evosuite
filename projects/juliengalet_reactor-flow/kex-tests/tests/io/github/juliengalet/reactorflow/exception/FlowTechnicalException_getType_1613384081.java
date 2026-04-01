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

public class FlowTechnicalException_getType_1613384081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14487;

    public FlowTechnicalException_getType_1613384081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14487 = newInstance(Class.forName("io.github.juliengalet.reactorflow.exception.FlowTechnicalException"));
        setField(term14487, term14487.getClass(), "flowConcerned", null);
        setField(term14487, term14487.getClass(), "backtrace", null);
        setField(term14487, term14487.getClass(), "detailMessage", null);
        setField(term14487, term14487.getClass(), "cause", null);
        setField(term14487, term14487.getClass(), "stackTrace", null);
        setIntField(term14487, term14487.getClass(), "depth", 0);
        setField(term14487, term14487.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.exception.FlowTechnicalException");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term14487, args);
    }

};


