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
import java.util.ArrayList;
import java.lang.Integer;
import java.lang.Boolean;

public class CodegenSchema_getAllSchemas_119150746820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6146;
     Object term6150;
     Object term6154;
     Object term6156;

    public CodegenSchema_getAllSchemas_119150746820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6146 = new ArrayList();
        term6150 = new ArrayList();
        term6154 = new Integer(1162663216);
        term6156 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenSchema");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.util.ArrayList");
        argTypes[1] = Class.forName("java.util.ArrayList");
        argTypes[2] = int.class;
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term6146;
        args[1] = term6150;
        args[2] = term6154;
        args[3] = term6156;
        callMethod(klass, "getAllSchemas", argTypes, null, args);
    }

};


