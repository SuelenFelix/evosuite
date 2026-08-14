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

public class PomUtils_createAllCombinationsOfSpecializedPoms_14357234846 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term607;

    public PomUtils_createAllCombinationsOfSpecializedPoms_14357234846() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term609 = new HashMap();
        Set<Object> term634 =  ((Map) term609).keySet();
        HashSet term608 = new HashSet((Collection<? extends Object>) term634);
        term607 = newInstance(Class.forName("se.kth.deptrim.util.PomUtils"));
        setField(term607, term607.getClass(), "specializedDependencies", term608);
        setField(term607, term607.getClass(), "debloatedPomPath", "cudZvLMQon");
        setBooleanField(term607, term607.getClass(), "createSinglePomSpecialized", false);
        setBooleanField(term607, term607.getClass(), "createDependencySpecializedPerPom", false);
        setBooleanField(term607, term607.getClass(), "createAllPomSpecialized", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("se.kth.deptrim.util.PomUtils");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createAllCombinationsOfSpecializedPoms", argTypes, term607, args);
    }

};


