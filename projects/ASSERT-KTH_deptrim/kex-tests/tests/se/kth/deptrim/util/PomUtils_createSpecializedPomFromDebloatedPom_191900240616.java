package se.kth.deptrim.util;

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
import static se.kth.deptrim.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PomUtils_createSpecializedPomFromDebloatedPom_191900240616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term798;

    public PomUtils_createSpecializedPomFromDebloatedPom_191900240616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term798 = newInstance(Class.forName("se.kth.deptrim.util.PomUtils"));
        setField(term798, term798.getClass(), "specializedDependencies", null);
        setField(term798, term798.getClass(), "debloatedPomPath", null);
        setBooleanField(term798, term798.getClass(), "createSinglePomSpecialized", false);
        setBooleanField(term798, term798.getClass(), "createDependencySpecializedPerPom", false);
        setBooleanField(term798, term798.getClass(), "createAllPomSpecialized", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("se.kth.deptrim.util.PomUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Set");
        argTypes[1] = Class.forName("java.lang.Integer");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "createSpecializedPomFromDebloatedPom", argTypes, term798, args);
    }

};


