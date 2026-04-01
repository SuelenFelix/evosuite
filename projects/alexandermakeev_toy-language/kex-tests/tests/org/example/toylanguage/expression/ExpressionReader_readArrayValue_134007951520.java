package org.example.toylanguage.expression;

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
import static org.example.toylanguage.expression.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ExpressionReader_readArrayValue_134007951520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20994;

    public ExpressionReader_readArrayValue_134007951520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20994 = newInstance(Class.forName("org.example.toylanguage.expression.ExpressionReader"));
        setField(term20994, term20994.getClass(), "operands", null);
        setField(term20994, term20994.getClass(), "operators", null);
        setField(term20994, term20994.getClass(), "tokens", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.expression.ExpressionReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.example.toylanguage.token.Token");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "readArrayValue", argTypes, term20994, args);
    }

};


