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

public class StatementParser_parse_13113273931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1688;

    public StatementParser_parse_13113273931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1688 = newInstance(Class.forName("org.example.toylanguage.StatementParser"));
        setField(term1688, term1688.getClass(), "tokens", null);
        setField(term1688, term1688.getClass(), "scanner", null);
        setField(term1688, term1688.getClass(), "compositeStatement", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.StatementParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.example.toylanguage.StatementParser");
        argTypes[1] = Class.forName("org.example.toylanguage.statement.CompositeStatement");
        argTypes[2] = Class.forName("org.example.toylanguage.context.definition.DefinitionScope");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "parse", argTypes, term1688, args);
    }

};


