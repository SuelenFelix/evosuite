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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class PomUtils_createSinglePomSpecialized_17620946265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term561;

    public PomUtils_createSinglePomSpecialized_17620946265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term563 = new HashMap();
        Set<Object> term596 =  ((Map) term563).keySet();
        HashSet term562 = new HashSet((Collection<? extends Object>) term596);
        term561 = newInstance(Class.forName("se.kth.deptrim.util.PomUtils"));
        setField(term561, term561.getClass(), "specializedDependencies", term562);
        setField(term561, term561.getClass(), "debloatedPomPath", "BRIVNtfUWU");
        setBooleanField(term561, term561.getClass(), "createSinglePomSpecialized", false);
        setBooleanField(term561, term561.getClass(), "createDependencySpecializedPerPom", true);
        setBooleanField(term561, term561.getClass(), "createAllPomSpecialized", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("se.kth.deptrim.util.PomUtils");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createSinglePomSpecialized", argTypes, term561, args);
    }

};


