package se.kth.deptrim.core;

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
import static se.kth.deptrim.core.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SpecializedDependency_getSpecializedVersion_16578863947 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term887;

    public SpecializedDependency_getSpecializedVersion_16578863947() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term887 = newInstance(Class.forName("se.kth.deptrim.core.SpecializedDependency"));
        setField(term887, term887.getClass(), "originalGroupId", "wSQxaModmm");
        setField(term887, term887.getClass(), "originalArtifactId", "UlajhuVLaP");
        setField(term887, term887.getClass(), "originalVersion", "gGSMzuGICf");
        setField(term887, term887.getClass(), "specializedGroupId", "hxCBltsObl");
        setField(term887, term887.getClass(), "specializedArtifactId", "BndsHwAFMv");
        setField(term887, term887.getClass(), "specializedVersion", "GzFkzHGYFt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("se.kth.deptrim.core.SpecializedDependency");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSpecializedVersion", argTypes, term887, args);
    }

};


