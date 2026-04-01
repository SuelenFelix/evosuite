package org.openapijsonschematools.codegen.generatorrunner;

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
import static org.openapijsonschematools.codegen.generatorrunner.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DefaultGeneratorRunner_1OperationIdComparator_compare_11363462293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4921;

    public DefaultGeneratorRunner_1OperationIdComparator_compare_11363462293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4921 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.DefaultGeneratorRunner$1OperationIdComparator"));
        setField(term4921, term4921.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generatorrunner.DefaultGeneratorRunner$1OperationIdComparator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenKey");
        argTypes[1] = Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenKey");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "compare", argTypes, term4921, args);
    }

};


