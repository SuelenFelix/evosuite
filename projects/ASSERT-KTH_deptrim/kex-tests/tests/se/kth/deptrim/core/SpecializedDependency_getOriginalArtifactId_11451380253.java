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

public class SpecializedDependency_getOriginalArtifactId_11451380253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term355;

    public SpecializedDependency_getOriginalArtifactId_11451380253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term355 = newInstance(Class.forName("se.kth.deptrim.core.SpecializedDependency"));
        setField(term355, term355.getClass(), "originalGroupId", "ZiaGIbnzTs");
        setField(term355, term355.getClass(), "originalArtifactId", "tbcdzjIfER");
        setField(term355, term355.getClass(), "originalVersion", "HyxfbSQYBe");
        setField(term355, term355.getClass(), "specializedGroupId", "pCTimMblYc");
        setField(term355, term355.getClass(), "specializedArtifactId", "hNxWaHcfhY");
        setField(term355, term355.getClass(), "specializedVersion", "RkybSrpybU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("se.kth.deptrim.core.SpecializedDependency");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOriginalArtifactId", argTypes, term355, args);
    }

};


