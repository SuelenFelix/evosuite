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

public class CodegenIgnoreProcessor_getInclusionRules_7130875707 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5976;

    public CodegenIgnoreProcessor_getInclusionRules_7130875707() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6021 = Class.forName((String) "java.io.File$PathStatus");
        Field term6020 = ((Class) term6021).getDeclaredField((String) "CHECKED");
        ((Field) term6020).setAccessible(true);
        Object enum14 = ((Field) term6020).get((Object) null);
        ArrayList term6002 = new ArrayList();
        ArrayList term6006 = new ArrayList();
        ((ArrayList) term6006).add((Object)null);
        term5976 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.CodegenIgnoreProcessor"));
        Object term5977 = newInstance(Class.forName("java.io.File"));
        setField(term5976, term5976.getClass(), "LOGGER", null);
        setField(term5977, term5977.getClass(), "path", "AijpHYOFuy");
        setField(term5977, term5977.getClass(), "status", enum14);
        setIntField(term5977, term5977.getClass(), "prefixLength", -2038273078);
        setField(term5977, term5977.getClass(), "filePath", null);
        setField(term5976, term5976.getClass(), "ignoreFile", term5977);
        setField(term5976, term5976.getClass(), "exclusionRules", term6002);
        setField(term5976, term5976.getClass(), "inclusionRules", term6006);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.CodegenIgnoreProcessor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInclusionRules", argTypes, term5976, args);
    }

};


