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

public class CodegenHeader_getSetSchemaJsonPath_51951283319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3757;

    public CodegenHeader_getSetSchemaJsonPath_51951283319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3757 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenHeader"));
        setField(term3757, term3757.getClass(), "description", null);
        setField(term3757, term3757.getClass(), "example", null);
        setField(term3757, term3757.getClass(), "vendorExtensions", null);
        setField(term3757, term3757.getClass(), "required", null);
        setField(term3757, term3757.getClass(), "content", null);
        setField(term3757, term3757.getClass(), "imports", null);
        setBooleanField(term3757, term3757.getClass(), "componentModule", false);
        setField(term3757, term3757.getClass(), "jsonPathPiece", null);
        setField(term3757, term3757.getClass(), "explode", null);
        setField(term3757, term3757.getClass(), "style", null);
        setField(term3757, term3757.getClass(), "deprecated", null);
        setField(term3757, term3757.getClass(), "schema", null);
        setField(term3757, term3757.getClass(), "refInfo", null);
        setField(term3757, term3757.getClass(), "subpackage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenHeader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getSetSchemaJsonPath", argTypes, term3757, args);
    }

};


