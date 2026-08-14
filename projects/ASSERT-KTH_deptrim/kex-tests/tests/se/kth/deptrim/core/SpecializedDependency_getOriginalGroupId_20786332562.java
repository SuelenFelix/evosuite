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

public class SpecializedDependency_getOriginalGroupId_20786332562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222;

    public SpecializedDependency_getOriginalGroupId_20786332562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222 = newInstance(Class.forName("se.kth.deptrim.core.SpecializedDependency"));
        setField(term222, term222.getClass(), "originalGroupId", "NRdvgJlhkX");
        setField(term222, term222.getClass(), "originalArtifactId", "uuaPigETmJ");
        setField(term222, term222.getClass(), "originalVersion", "MxlszYVzRf");
        setField(term222, term222.getClass(), "specializedGroupId", "LQFpaHEwXR");
        setField(term222, term222.getClass(), "specializedArtifactId", "oVcInYnLWB");
        setField(term222, term222.getClass(), "specializedVersion", "aJlieCFVtF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("se.kth.deptrim.core.SpecializedDependency");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOriginalGroupId", argTypes, term222, args);
    }

};


