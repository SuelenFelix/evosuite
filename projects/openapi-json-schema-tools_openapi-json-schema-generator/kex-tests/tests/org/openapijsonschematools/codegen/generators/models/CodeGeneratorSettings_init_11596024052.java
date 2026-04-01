package org.openapijsonschematools.codegen.generators.models;

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
import static org.openapijsonschematools.codegen.generators.models.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class CodeGeneratorSettings_init_11596024052 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3881;
     Object term3883;
     Object term3885;
     Object term3887;
     Object term3889;
     Object term3891;
     Object term3893;
     Object term3895;
     Object term3897;

    public CodeGeneratorSettings_init_11596024052() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3881 = new Boolean(false);
        term3883 = new Boolean(false);
        term3885 = new Boolean(false);
        term3887 = new Boolean(false);
        term3889 = new Boolean(false);
        term3891 = new Boolean(false);
        term3893 = new Boolean(false);
        term3895 = new Boolean(false);
        term3897 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.models.CodeGeneratorSettings");
        Class<?>[] argTypes = new Class<?>[18];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = boolean.class;
        argTypes[7] = boolean.class;
        argTypes[8] = boolean.class;
        argTypes[9] = boolean.class;
        argTypes[10] = Class.forName("java.lang.String");
        argTypes[11] = boolean.class;
        argTypes[12] = boolean.class;
        argTypes[13] = Class.forName("java.lang.String");
        argTypes[14] = Class.forName("java.lang.String");
        argTypes[15] = boolean.class;
        argTypes[16] = boolean.class;
        argTypes[17] = boolean.class;
        Object[] args = new Object[18];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        args[6] = term3881;
        args[7] = term3883;
        args[8] = term3885;
        args[9] = term3887;
        args[10] = null;
        args[11] = term3889;
        args[12] = term3891;
        args[13] = null;
        args[14] = null;
        args[15] = term3893;
        args[16] = term3895;
        args[17] = term3897;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


