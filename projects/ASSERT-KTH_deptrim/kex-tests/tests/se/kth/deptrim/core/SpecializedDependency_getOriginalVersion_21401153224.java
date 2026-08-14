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

public class SpecializedDependency_getOriginalVersion_21401153224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term488;

    public SpecializedDependency_getOriginalVersion_21401153224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term488 = newInstance(Class.forName("se.kth.deptrim.core.SpecializedDependency"));
        setField(term488, term488.getClass(), "originalGroupId", "xOEqzGAmDU");
        setField(term488, term488.getClass(), "originalArtifactId", "eZFUvlxvGV");
        setField(term488, term488.getClass(), "originalVersion", "BYqFIqCKAV");
        setField(term488, term488.getClass(), "specializedGroupId", "vrQLuWIDJX");
        setField(term488, term488.getClass(), "specializedArtifactId", "flxyYxBRtu");
        setField(term488, term488.getClass(), "specializedVersion", "OclPbYPkcH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("se.kth.deptrim.core.SpecializedDependency");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOriginalVersion", argTypes, term488, args);
    }

};


