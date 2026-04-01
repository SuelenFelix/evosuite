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

public class EverythingRule_getExcludeOperation_11594900665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15764;

    public EverythingRule_getExcludeOperation_11594900665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15764 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.EverythingRule"));
        setField(term15764, term15764.getClass(), "definition", null);
        setField(term15764, term15764.getClass(), "syntax", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.EverythingRule");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExcludeOperation", argTypes, term15764, args);
    }

};


