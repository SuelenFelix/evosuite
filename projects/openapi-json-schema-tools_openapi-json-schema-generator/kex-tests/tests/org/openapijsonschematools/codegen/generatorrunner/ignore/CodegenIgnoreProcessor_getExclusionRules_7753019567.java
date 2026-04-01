package org.openapijsonschematools.codegen.generatorrunner.ignore;

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
import static org.openapijsonschematools.codegen.generatorrunner.ignore.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class CodegenIgnoreProcessor_getExclusionRules_7753019567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5934;

    public CodegenIgnoreProcessor_getExclusionRules_7753019567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5979 = Class.forName((String) "java.io.File$PathStatus");
        Field term5978 = ((Class) term5979).getDeclaredField((String) "INVALID");
        ((Field) term5978).setAccessible(true);
        Object enum15 = ((Field) term5978).get((Object) null);
        ArrayList term5960 = new ArrayList();
        ArrayList term5964 = new ArrayList();
        ((ArrayList) term5964).add((Object)null);
        ((ArrayList) term5964).add((Object)null);
        term5934 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.CodegenIgnoreProcessor"));
        Object term5935 = newInstance(Class.forName("java.io.File"));
        setField(term5934, term5934.getClass(), "LOGGER", null);
        setField(term5935, term5935.getClass(), "path", "eZFUvlxvGV");
        setField(term5935, term5935.getClass(), "status", enum15);
        setIntField(term5935, term5935.getClass(), "prefixLength", 1227103734);
        setField(term5935, term5935.getClass(), "filePath", null);
        setField(term5934, term5934.getClass(), "ignoreFile", term5935);
        setField(term5934, term5934.getClass(), "exclusionRules", term5960);
        setField(term5934, term5934.getClass(), "inclusionRules", term5964);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.CodegenIgnoreProcessor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExclusionRules", argTypes, term5934, args);
    }

};


