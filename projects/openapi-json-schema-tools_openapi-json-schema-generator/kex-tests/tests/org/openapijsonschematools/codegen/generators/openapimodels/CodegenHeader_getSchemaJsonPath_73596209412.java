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

public class CodegenHeader_getSchemaJsonPath_73596209412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3743;

    public CodegenHeader_getSchemaJsonPath_73596209412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3743 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenHeader"));
        setField(term3743, term3743.getClass(), "description", null);
        setField(term3743, term3743.getClass(), "example", null);
        setField(term3743, term3743.getClass(), "vendorExtensions", null);
        setField(term3743, term3743.getClass(), "required", null);
        setField(term3743, term3743.getClass(), "content", null);
        setField(term3743, term3743.getClass(), "imports", null);
        setBooleanField(term3743, term3743.getClass(), "componentModule", false);
        setField(term3743, term3743.getClass(), "jsonPathPiece", null);
        setField(term3743, term3743.getClass(), "explode", null);
        setField(term3743, term3743.getClass(), "style", null);
        setField(term3743, term3743.getClass(), "deprecated", null);
        setField(term3743, term3743.getClass(), "schema", null);
        setField(term3743, term3743.getClass(), "refInfo", null);
        setField(term3743, term3743.getClass(), "subpackage", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenHeader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSchemaJsonPath", argTypes, term3743, args);
    }

};


