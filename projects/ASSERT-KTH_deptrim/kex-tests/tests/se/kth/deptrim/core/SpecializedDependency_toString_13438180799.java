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

public class SpecializedDependency_toString_13438180799 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1020;

    public SpecializedDependency_toString_13438180799() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1020 = newInstance(Class.forName("se.kth.deptrim.core.SpecializedDependency"));
        setField(term1020, term1020.getClass(), "originalGroupId", null);
        setField(term1020, term1020.getClass(), "originalArtifactId", null);
        setField(term1020, term1020.getClass(), "originalVersion", null);
        setField(term1020, term1020.getClass(), "specializedGroupId", null);
        setField(term1020, term1020.getClass(), "specializedArtifactId", null);
        setField(term1020, term1020.getClass(), "specializedVersion", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("se.kth.deptrim.core.SpecializedDependency");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1020, args);
    }

};


