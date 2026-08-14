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

public class SpecializedDependency_toString_13438180791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89;

    public SpecializedDependency_toString_13438180791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89 = newInstance(Class.forName("se.kth.deptrim.core.SpecializedDependency"));
        setField(term89, term89.getClass(), "originalGroupId", "jJCZpVmanW");
        setField(term89, term89.getClass(), "originalArtifactId", "EGtDIRbSSb");
        setField(term89, term89.getClass(), "originalVersion", "SzjVpOQTyS");
        setField(term89, term89.getClass(), "specializedGroupId", "MjGYSRKTNF");
        setField(term89, term89.getClass(), "specializedArtifactId", "hRNSzYYIrc");
        setField(term89, term89.getClass(), "specializedVersion", "RMFIsYGgne");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("se.kth.deptrim.core.SpecializedDependency");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term89, args);
    }

};


