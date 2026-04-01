package org.openapijsonschematools.codegen.clicommands;

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
import static org.openapijsonschematools.codegen.clicommands.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.LinkedList;

public class ListGenerators_appendForType_19069267772 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term695;
     Object enum0;
     Object term737;

    public ListGenerators_appendForType_19069267772() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term695 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term696 = (byte[]) newByteArray(16);
        setField(term695, term695.getClass(), "value", term696);
        setByteField(term695, term695.getClass(), "coder", (byte) 74);
        setIntField(term695, term695.getClass(), "count", -883034806);
        Class<? extends Object> term823 = Class.forName((String) "org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorType");
        Field term822 = ((Class) term823).getDeclaredField((String) "SERVER");
        ((Field) term822).setAccessible(true);
        enum0 = ((Field) term822).get((Object) null);
        term737 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.clicommands.ListGenerators");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorType");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.util.List");
        Object[] args = new Object[4];
        args[0] = term695;
        args[1] = enum0;
        args[2] = "RMFIsYGgne";
        args[3] = term737;
        callMethod(klass, "appendForType", argTypes, null, args);
    }

};


