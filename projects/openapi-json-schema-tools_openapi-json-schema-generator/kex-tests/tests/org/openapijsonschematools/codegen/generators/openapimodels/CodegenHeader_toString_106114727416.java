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

public class CodegenHeader_toString_106114727416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3751;

    public CodegenHeader_toString_106114727416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3751 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenHeader"));
        setField(term3751, term3751.getClass(), "description", null);
        setField(term3751, term3751.getClass(), "example", null);
        setField(term3751, term3751.getClass(), "vendorExtensions", null);
        setField(term3751, term3751.getClass(), "required", null);
        setField(term3751, term3751.getClass(), "content", null);
        setField(term3751, term3751.getClass(), "imports", null);
        setBooleanField(term3751, term3751.getClass(), "componentModule", false);
        setField(term3751, term3751.getClass(), "jsonPathPiece", null);
        setField(term3751, term3751.getClass(), "explode", null);
        setField(term3751, term3751.getClass(), "style", null);
        setField(term3751, term3751.getClass(), "deprecated", null);
        setField(term3751, term3751.getClass(), "schema", null);
        setField(term3751, term3751.getClass(), "refInfo", null);
        setField(term3751, term3751.getClass(), "subpackage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenHeader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3751, args);
    }

};


