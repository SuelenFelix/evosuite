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

public class CodegenIgnoreProcessor_allowsFile_17952150555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5536;
     Object term5570;

    public CodegenIgnoreProcessor_allowsFile_17952150555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5595 = Class.forName((String) "java.io.File$PathStatus");
        Field term5594 = ((Class) term5595).getDeclaredField((String) "CHECKED");
        ((Field) term5594).setAccessible(true);
        Object enum13 = ((Field) term5594).get((Object) null);
        ArrayList term5562 = new ArrayList();
        ((ArrayList) term5562).add((Object)null);
        ((ArrayList) term5562).add((Object)null);
        ((ArrayList) term5562).add((Object)null);
        ArrayList term5566 = new ArrayList();
        ((ArrayList) term5566).add((Object)null);
        ((ArrayList) term5566).add((Object)null);
        ((ArrayList) term5566).add((Object)null);
        ((ArrayList) term5566).add((Object)null);
        ((ArrayList) term5566).add((Object)null);
        ((ArrayList) term5566).add((Object)null);
        ((ArrayList) term5566).add((Object)null);
        term5536 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.CodegenIgnoreProcessor"));
        Object term5537 = newInstance(Class.forName("java.io.File"));
        setField(term5536, term5536.getClass(), "LOGGER", null);
        setField(term5537, term5537.getClass(), "path", "hNxWaHcfhY");
        setField(term5537, term5537.getClass(), "status", enum13);
        setIntField(term5537, term5537.getClass(), "prefixLength", -616727354);
        setField(term5537, term5537.getClass(), "filePath", null);
        setField(term5536, term5536.getClass(), "ignoreFile", term5537);
        setField(term5536, term5536.getClass(), "exclusionRules", term5562);
        setField(term5536, term5536.getClass(), "inclusionRules", term5566);
        term5570 = newInstance(Class.forName("java.io.File"));
        setField(term5570, term5570.getClass(), "path", "RkybSrpybU");
        setField(term5570, term5570.getClass(), "status", enum13);
        setIntField(term5570, term5570.getClass(), "prefixLength", -1955890973);
        setField(term5570, term5570.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.CodegenIgnoreProcessor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term5570;
        callMethod(klass, "allowsFile", argTypes, term5536, args);
    }

};


