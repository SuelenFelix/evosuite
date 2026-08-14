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

public class CodegenHeader_addInstanceInfo_117517191315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3749;

    public CodegenHeader_addInstanceInfo_117517191315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3749 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenHeader"));
        setField(term3749, term3749.getClass(), "description", null);
        setField(term3749, term3749.getClass(), "example", null);
        setField(term3749, term3749.getClass(), "vendorExtensions", null);
        setField(term3749, term3749.getClass(), "required", null);
        setField(term3749, term3749.getClass(), "content", null);
        setField(term3749, term3749.getClass(), "imports", null);
        setBooleanField(term3749, term3749.getClass(), "componentModule", false);
        setField(term3749, term3749.getClass(), "jsonPathPiece", null);
        setField(term3749, term3749.getClass(), "explode", null);
        setField(term3749, term3749.getClass(), "style", null);
        setField(term3749, term3749.getClass(), "deprecated", null);
        setField(term3749, term3749.getClass(), "schema", null);
        setField(term3749, term3749.getClass(), "refInfo", null);
        setField(term3749, term3749.getClass(), "subpackage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenHeader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addInstanceInfo", argTypes, term3749, args);
    }

};


