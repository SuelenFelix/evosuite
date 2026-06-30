package io.github.juliengalet.reactorflow.report;

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
import static io.github.juliengalet.reactorflow.report.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Metadata_from_183943331412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1357;

    public Metadata_from_183943331412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1357 = newInstance(Class.forName("io.github.juliengalet.reactorflow.report.Metadata"));
        setField(term1357, term1357.getClass(), "errors", null);
        setField(term1357, term1357.getClass(), "warnings", null);
        setField(term1357, term1357.getClass(), "data", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.juliengalet.reactorflow.report.Metadata");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.github.juliengalet.reactorflow.report.Metadata");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "from", argTypes, term1357, args);
    }

};


