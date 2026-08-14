package org.openapijsonschematools.codegen.generatorrunner.ignore.rules;

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
import static org.openapijsonschematools.codegen.generatorrunner.ignore.rules.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DirectoryRule_matches_16269439253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10374;

    public DirectoryRule_matches_16269439253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10374 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.DirectoryRule"));
        setField(term10374, term10374.getClass(), "directoryMatcher", null);
        setField(term10374, term10374.getClass(), "contentsMatcher", null);
        setField(term10374, term10374.getClass(), "matcher", null);
        setField(term10374, term10374.getClass(), "definition", null);
        setField(term10374, term10374.getClass(), "syntax", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.DirectoryRule");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "matches", argTypes, term10374, args);
    }

};


