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

public class SpecializedDependency_getSpecializedArtifactId_79581355714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1025;

    public SpecializedDependency_getSpecializedArtifactId_79581355714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1025 = newInstance(Class.forName("se.kth.deptrim.core.SpecializedDependency"));
        setField(term1025, term1025.getClass(), "originalGroupId", null);
        setField(term1025, term1025.getClass(), "originalArtifactId", null);
        setField(term1025, term1025.getClass(), "originalVersion", null);
        setField(term1025, term1025.getClass(), "specializedGroupId", null);
        setField(term1025, term1025.getClass(), "specializedArtifactId", null);
        setField(term1025, term1025.getClass(), "specializedVersion", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("se.kth.deptrim.core.SpecializedDependency");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSpecializedArtifactId", argTypes, term1025, args);
    }

};


