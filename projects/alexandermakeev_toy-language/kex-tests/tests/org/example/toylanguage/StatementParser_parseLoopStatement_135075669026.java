package org.example.toylanguage;

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
import static org.example.toylanguage.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class StatementParser_parseLoopStatement_135075669026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15921;

    public StatementParser_parseLoopStatement_135075669026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15921 = newInstance(Class.forName("org.example.toylanguage.StatementParser"));
        setField(term15921, term15921.getClass(), "tokens", null);
        setField(term15921, term15921.getClass(), "scanner", null);
        setField(term15921, term15921.getClass(), "compositeStatement", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.StatementParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.example.toylanguage.token.Token");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "parseLoopStatement", argTypes, term15921, args);
    }

};


