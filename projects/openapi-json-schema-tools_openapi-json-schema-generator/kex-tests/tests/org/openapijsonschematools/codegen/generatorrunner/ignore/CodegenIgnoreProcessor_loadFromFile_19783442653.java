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

public class CodegenIgnoreProcessor_loadFromFile_19783442653 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4960;
     Object term4994;

    public CodegenIgnoreProcessor_loadFromFile_19783442653() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5019 = Class.forName((String) "java.io.File$PathStatus");
        Field term5018 = ((Class) term5019).getDeclaredField((String) "INVALID");
        ((Field) term5018).setAccessible(true);
        Object enum10 = ((Field) term5018).get((Object) null);
        ArrayList term4986 = new ArrayList();
        ((ArrayList) term4986).add((Object)null);
        ((ArrayList) term4986).add((Object)null);
        ((ArrayList) term4986).add((Object)null);
        ((ArrayList) term4986).add((Object)null);
        ((ArrayList) term4986).add((Object)null);
        ((ArrayList) term4986).add((Object)null);
        ((ArrayList) term4986).add((Object)null);
        ((ArrayList) term4986).add((Object)null);
        ((ArrayList) term4986).add((Object)null);
        ArrayList term4990 = new ArrayList();
        term4960 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.CodegenIgnoreProcessor"));
        Object term4961 = newInstance(Class.forName("java.io.File"));
        setField(term4960, term4960.getClass(), "LOGGER", null);
        setField(term4961, term4961.getClass(), "path", "ZiaGIbnzTs");
        setField(term4961, term4961.getClass(), "status", enum10);
        setIntField(term4961, term4961.getClass(), "prefixLength", 1162663216);
        setField(term4961, term4961.getClass(), "filePath", null);
        setField(term4960, term4960.getClass(), "ignoreFile", term4961);
        setField(term4960, term4960.getClass(), "exclusionRules", term4986);
        setField(term4960, term4960.getClass(), "inclusionRules", term4990);
        term4994 = newInstance(Class.forName("java.io.File"));
        setField(term4994, term4994.getClass(), "path", "tbcdzjIfER");
        setField(term4994, term4994.getClass(), "status", enum10);
        setIntField(term4994, term4994.getClass(), "prefixLength", 1484323161);
        setField(term4994, term4994.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.CodegenIgnoreProcessor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term4994;
        callMethod(klass, "loadFromFile", argTypes, term4960, args);
    }

};


