package org.example.toylanguage.context.definition;

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
import static org.example.toylanguage.context.definition.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class FunctionDetails_getName_11138915383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2328;

    public FunctionDetails_getName_11138915383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2341 = new ArrayList();
        ((ArrayList) term2341).add("dFOuezLNWb");
        ((ArrayList) term2341).add("PUWJnLuyiR");
        ((ArrayList) term2341).add("ADhJCRgHaS");
        ((ArrayList) term2341).add("qociGUMzem");
        term2328 = newInstance(Class.forName("org.example.toylanguage.context.definition.FunctionDetails"));
        setField(term2328, term2328.getClass(), "name", "SCmsfHIEPK");
        setField(term2328, term2328.getClass(), "arguments", term2341);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.context.definition.FunctionDetails");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term2328, args);
    }

};


