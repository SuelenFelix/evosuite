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

public class PomUtils_createAllCombinationsOfSpecializedPoms_14357234847 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1644;

    public PomUtils_createAllCombinationsOfSpecializedPoms_14357234847() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1646 = new HashMap();
        Set<Object> term1671 =  ((Map) term1646).keySet();
        HashSet term1645 = new HashSet((Collection<? extends Object>) term1671);
        term1644 = newInstance(Class.forName("se.kth.deptrim.util.PomUtils"));
        setField(term1644, term1644.getClass(), "specializedDependencies", term1645);
        setField(term1644, term1644.getClass(), "debloatedPomPath", "OIHoJeysUi");
        setBooleanField(term1644, term1644.getClass(), "createSinglePomSpecialized", false);
        setBooleanField(term1644, term1644.getClass(), "createDependencySpecializedPerPom", false);
        setBooleanField(term1644, term1644.getClass(), "createAllPomSpecialized", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("se.kth.deptrim.util.PomUtils");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createAllCombinationsOfSpecializedPoms", argTypes, term1644, args);
    }

};


