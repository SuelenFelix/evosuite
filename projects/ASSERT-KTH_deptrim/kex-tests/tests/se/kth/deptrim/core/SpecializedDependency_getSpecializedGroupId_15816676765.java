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

public class SpecializedDependency_getSpecializedGroupId_15816676765 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term621;

    public SpecializedDependency_getSpecializedGroupId_15816676765() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term621 = newInstance(Class.forName("se.kth.deptrim.core.SpecializedDependency"));
        setField(term621, term621.getClass(), "originalGroupId", "IoAlmYsBwc");
        setField(term621, term621.getClass(), "originalArtifactId", "TEParAifyi");
        setField(term621, term621.getClass(), "originalVersion", "OWDIEULEFu");
        setField(term621, term621.getClass(), "specializedGroupId", "dWRymuLBtr");
        setField(term621, term621.getClass(), "specializedArtifactId", "AijpHYOFuy");
        setField(term621, term621.getClass(), "specializedVersion", "SbAoxhfrkn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("se.kth.deptrim.core.SpecializedDependency");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSpecializedGroupId", argTypes, term621, args);
    }

};


