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

public class CodegenResponse_pathFromDocRoot_198855446316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6144;

    public CodegenResponse_pathFromDocRoot_198855446316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6144 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenResponse"));
        setField(term6144, term6144.getClass(), "description", null);
        setField(term6144, term6144.getClass(), "headers", null);
        setField(term6144, term6144.getClass(), "headersObjectSchema", null);
        setField(term6144, term6144.getClass(), "content", null);
        setField(term6144, term6144.getClass(), "refInfo", null);
        setField(term6144, term6144.getClass(), "jsonPathPiece", null);
        setField(term6144, term6144.getClass(), "vendorExtensions", null);
        setField(term6144, term6144.getClass(), "imports", null);
        setBooleanField(term6144, term6144.getClass(), "componentModule", false);
        setField(term6144, term6144.getClass(), "pathFromDocRoot", null);
        setField(term6144, term6144.getClass(), "subpackage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "pathFromDocRoot", argTypes, term6144, args);
    }

};


