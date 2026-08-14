package org.openapijsonschematools.codegen.generators.openapimodels;

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
import static org.openapijsonschematools.codegen.generators.openapimodels.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class CodegenHeader_init_9127653310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3739;

    public CodegenHeader_init_9127653310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3739 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenHeader");
        Class<?>[] argTypes = new Class<?>[14];
        argTypes[0] = Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenText");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.util.Map");
        argTypes[3] = Class.forName("java.lang.Boolean");
        argTypes[4] = Class.forName("java.util.LinkedHashMap");
        argTypes[5] = Class.forName("java.util.TreeSet");
        argTypes[6] = boolean.class;
        argTypes[7] = Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenKey");
        argTypes[8] = Class.forName("java.lang.Boolean");
        argTypes[9] = Class.forName("java.lang.String");
        argTypes[10] = Class.forName("java.lang.Boolean");
        argTypes[11] = Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenSchema");
        argTypes[12] = Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenRefInfo");
        argTypes[13] = Class.forName("java.lang.String");
        Object[] args = new Object[14];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = term3739;
        args[7] = null;
        args[8] = null;
        args[9] = null;
        args[10] = null;
        args[11] = null;
        args[12] = null;
        args[13] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


