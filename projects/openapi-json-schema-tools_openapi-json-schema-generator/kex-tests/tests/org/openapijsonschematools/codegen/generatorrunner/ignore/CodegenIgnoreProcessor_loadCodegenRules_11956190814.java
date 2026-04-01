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

public class CodegenIgnoreProcessor_loadCodegenRules_11956190814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5171;
     Object term5205;

    public CodegenIgnoreProcessor_loadCodegenRules_11956190814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5241 = Class.forName((String) "java.io.File$PathStatus");
        Field term5240 = ((Class) term5241).getDeclaredField((String) "INVALID");
        ((Field) term5240).setAccessible(true);
        Object enum11 = ((Field) term5240).get((Object) null);
        ArrayList term5197 = new ArrayList();
        ((ArrayList) term5197).add((Object)null);
        ((ArrayList) term5197).add((Object)null);
        ((ArrayList) term5197).add((Object)null);
        ((ArrayList) term5197).add((Object)null);
        ((ArrayList) term5197).add((Object)null);
        ((ArrayList) term5197).add((Object)null);
        ((ArrayList) term5197).add((Object)null);
        ((ArrayList) term5197).add((Object)null);
        ((ArrayList) term5197).add((Object)null);
        ArrayList term5201 = new ArrayList();
        ((ArrayList) term5201).add((Object)null);
        ((ArrayList) term5201).add((Object)null);
        ((ArrayList) term5201).add((Object)null);
        ((ArrayList) term5201).add((Object)null);
        ((ArrayList) term5201).add((Object)null);
        ((ArrayList) term5201).add((Object)null);
        ((ArrayList) term5201).add((Object)null);
        ((ArrayList) term5201).add((Object)null);
        ((ArrayList) term5201).add((Object)null);
        term5171 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.CodegenIgnoreProcessor"));
        Object term5172 = newInstance(Class.forName("java.io.File"));
        setField(term5171, term5171.getClass(), "LOGGER", null);
        setField(term5172, term5172.getClass(), "path", "HyxfbSQYBe");
        setField(term5172, term5172.getClass(), "status", enum11);
        setIntField(term5172, term5172.getClass(), "prefixLength", 391863371);
        setField(term5172, term5172.getClass(), "filePath", null);
        setField(term5171, term5171.getClass(), "ignoreFile", term5172);
        setField(term5171, term5171.getClass(), "exclusionRules", term5197);
        setField(term5171, term5171.getClass(), "inclusionRules", term5201);
        Class<? extends Object> term5394 = Class.forName((String) "java.io.File$PathStatus");
        Field term5393 = ((Class) term5394).getDeclaredField((String) "CHECKED");
        ((Field) term5393).setAccessible(true);
        Object enum12 = ((Field) term5393).get((Object) null);
        term5205 = newInstance(Class.forName("java.io.File"));
        setField(term5205, term5205.getClass(), "path", "pCTimMblYc");
        setField(term5205, term5205.getClass(), "status", enum12);
        setIntField(term5205, term5205.getClass(), "prefixLength", -1922583790);
        setField(term5205, term5205.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.CodegenIgnoreProcessor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term5205;
        callMethod(klass, "loadCodegenRules", argTypes, term5171, args);
    }

};


