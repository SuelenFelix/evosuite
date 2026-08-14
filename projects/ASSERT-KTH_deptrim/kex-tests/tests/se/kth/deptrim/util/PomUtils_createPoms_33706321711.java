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

public class PomUtils_createPoms_33706321711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1811;

    public PomUtils_createPoms_33706321711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1811 = newInstance(Class.forName("se.kth.deptrim.util.PomUtils"));
        setField(term1811, term1811.getClass(), "specializedDependencies", null);
        setField(term1811, term1811.getClass(), "debloatedPomPath", null);
        setBooleanField(term1811, term1811.getClass(), "createSinglePomSpecialized", false);
        setBooleanField(term1811, term1811.getClass(), "createDependencySpecializedPerPom", false);
        setBooleanField(term1811, term1811.getClass(), "createAllPomSpecialized", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("se.kth.deptrim.util.PomUtils");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createPoms", argTypes, term1811, args);
    }

};


