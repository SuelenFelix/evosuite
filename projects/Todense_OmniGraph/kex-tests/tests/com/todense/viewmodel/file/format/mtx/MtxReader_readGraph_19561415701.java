package com.todense.viewmodel.file.format.mtx;

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
import static com.todense.viewmodel.file.format.mtx.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class MtxReader_readGraph_19561415701 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247;
     Object term249;

    public MtxReader_readGraph_19561415701() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term247 = newInstance(Class.forName("com.todense.viewmodel.file.format.mtx.MtxReader"));
        setDoubleField(term247, term247.getClass(), "areaSize", 0.3455959125047594);
        Class<? extends Object> term285 = Class.forName((String) "java.io.File$PathStatus");
        Field term284 = ((Class) term285).getDeclaredField((String) "INVALID");
        ((Field) term284).setAccessible(true);
        Object enum1 = ((Field) term284).get((Object) null);
        term249 = newInstance(Class.forName("java.io.File"));
        setField(term249, term249.getClass(), "path", "sjlJAEtRrb");
        setField(term249, term249.getClass(), "status", enum1);
        setIntField(term249, term249.getClass(), "prefixLength", 1484323161);
        setField(term249, term249.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.todense.viewmodel.file.format.mtx.MtxReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term249;
        callMethod(klass, "readGraph", argTypes, term247, args);
    }

};


