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

public class CodegenIgnoreProcessor_getExclusionRules_7753019568 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6163;

    public CodegenIgnoreProcessor_getExclusionRules_7753019568() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6208 = Class.forName((String) "java.io.File$PathStatus");
        Field term6207 = ((Class) term6208).getDeclaredField((String) "INVALID");
        ((Field) term6207).setAccessible(true);
        Object enum15 = ((Field) term6207).get((Object) null);
        ArrayList term6189 = new ArrayList();
        ArrayList term6193 = new ArrayList();
        ((ArrayList) term6193).add((Object)null);
        ((ArrayList) term6193).add((Object)null);
        term6163 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.CodegenIgnoreProcessor"));
        Object term6164 = newInstance(Class.forName("java.io.File"));
        setField(term6163, term6163.getClass(), "LOGGER", null);
        setField(term6164, term6164.getClass(), "path", "SbAoxhfrkn");
        setField(term6164, term6164.getClass(), "status", enum15);
        setIntField(term6164, term6164.getClass(), "prefixLength", 1227103734);
        setField(term6164, term6164.getClass(), "filePath", null);
        setField(term6163, term6163.getClass(), "ignoreFile", term6164);
        setField(term6163, term6163.getClass(), "exclusionRules", term6189);
        setField(term6163, term6163.getClass(), "inclusionRules", term6193);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.CodegenIgnoreProcessor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExclusionRules", argTypes, term6163, args);
    }

};


