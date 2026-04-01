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

public class CodegenResponse_getDeepestRef_96690811415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6142;

    public CodegenResponse_getDeepestRef_96690811415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6142 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenResponse"));
        setField(term6142, term6142.getClass(), "description", null);
        setField(term6142, term6142.getClass(), "headers", null);
        setField(term6142, term6142.getClass(), "headersObjectSchema", null);
        setField(term6142, term6142.getClass(), "content", null);
        setField(term6142, term6142.getClass(), "refInfo", null);
        setField(term6142, term6142.getClass(), "jsonPathPiece", null);
        setField(term6142, term6142.getClass(), "vendorExtensions", null);
        setField(term6142, term6142.getClass(), "imports", null);
        setBooleanField(term6142, term6142.getClass(), "componentModule", false);
        setField(term6142, term6142.getClass(), "pathFromDocRoot", null);
        setField(term6142, term6142.getClass(), "subpackage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDeepestRef", argTypes, term6142, args);
    }

};


