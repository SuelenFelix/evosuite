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

public class CodeGeneratorSettings_init_11596024050 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3169;
     Object term3171;
     Object term3173;
     Object term3175;
     Object term3189;
     Object term3191;
     Object term3217;
     Object term3219;
     Object term3221;

    public CodeGeneratorSettings_init_11596024050() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3169 = new Boolean(false);
        term3171 = new Boolean(false);
        term3173 = new Boolean(false);
        term3175 = new Boolean(true);
        term3189 = new Boolean(true);
        term3191 = new Boolean(true);
        term3217 = new Boolean(true);
        term3219 = new Boolean(false);
        term3221 = new Boolean(true);
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
        args[0] = "mXGCWJDOqA";
        args[1] = "dpNsDgfPso";
        args[2] = "hCWPJQKpdc";
        args[3] = "WzMEhMXkKx";
        args[4] = "XOiDvlDhdc";
        args[5] = "AdxvLJhNLe";
        args[6] = term3169;
        args[7] = term3171;
        args[8] = term3173;
        args[9] = term3175;
        args[10] = "lHfTrWKMPk";
        args[11] = term3189;
        args[12] = term3191;
        args[13] = "JDaAnsVTGV";
        args[14] = "mLUZFTfjle";
        args[15] = term3217;
        args[16] = term3219;
        args[17] = term3221;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


