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

public class CodegenResponse_hashCode_70707521212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6136;

    public CodegenResponse_hashCode_70707521212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6136 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenResponse"));
        setField(term6136, term6136.getClass(), "description", null);
        setField(term6136, term6136.getClass(), "headers", null);
        setField(term6136, term6136.getClass(), "headersObjectSchema", null);
        setField(term6136, term6136.getClass(), "content", null);
        setField(term6136, term6136.getClass(), "refInfo", null);
        setField(term6136, term6136.getClass(), "jsonPathPiece", null);
        setField(term6136, term6136.getClass(), "vendorExtensions", null);
        setField(term6136, term6136.getClass(), "imports", null);
        setBooleanField(term6136, term6136.getClass(), "componentModule", false);
        setField(term6136, term6136.getClass(), "pathFromDocRoot", null);
        setField(term6136, term6136.getClass(), "subpackage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term6136, args);
    }

};


