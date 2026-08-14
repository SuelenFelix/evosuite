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

public class PomUtils_createDependencySpecializedPerPom_133632041713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1819;

    public PomUtils_createDependencySpecializedPerPom_133632041713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1819 = newInstance(Class.forName("se.kth.deptrim.util.PomUtils"));
        setField(term1819, term1819.getClass(), "specializedDependencies", null);
        setField(term1819, term1819.getClass(), "debloatedPomPath", null);
        setBooleanField(term1819, term1819.getClass(), "createSinglePomSpecialized", false);
        setBooleanField(term1819, term1819.getClass(), "createDependencySpecializedPerPom", false);
        setBooleanField(term1819, term1819.getClass(), "createAllPomSpecialized", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("se.kth.deptrim.util.PomUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createDependencySpecializedPerPom", argTypes, term1819, args);
    }

};


