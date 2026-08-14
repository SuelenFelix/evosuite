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

public class PomUtils_createDependencySpecializedPerPom_13363204173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term345;
     Object term374;

    public PomUtils_createDependencySpecializedPerPom_13363204173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term347 = new HashMap();
        Set<Object> term380 =  ((Map) term347).keySet();
        HashSet term346 = new HashSet((Collection<? extends Object>) term380);
        term345 = newInstance(Class.forName("se.kth.deptrim.util.PomUtils"));
        setField(term345, term345.getClass(), "specializedDependencies", term346);
        setField(term345, term345.getClass(), "debloatedPomPath", "OEXDRUKcFl");
        setBooleanField(term345, term345.getClass(), "createSinglePomSpecialized", true);
        setBooleanField(term345, term345.getClass(), "createDependencySpecializedPerPom", false);
        setBooleanField(term345, term345.getClass(), "createAllPomSpecialized", true);
        HashMap term375 = new HashMap();
        Set<Object> term391 =  ((Map) term375).keySet();
        term374 = new HashSet((Collection<? extends Object>) term391);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("se.kth.deptrim.util.PomUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term374;
        callMethod(klass, "createDependencySpecializedPerPom", argTypes, term345, args);
    }

};


