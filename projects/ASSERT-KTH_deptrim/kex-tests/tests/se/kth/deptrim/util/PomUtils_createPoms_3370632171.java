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

public class PomUtils_createPoms_3370632171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term266;

    public PomUtils_createPoms_3370632171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term268 = new HashMap();
        Set<Object> term301 =  ((Map) term268).keySet();
        HashSet term267 = new HashSet((Collection<? extends Object>) term301);
        term266 = newInstance(Class.forName("se.kth.deptrim.util.PomUtils"));
        setField(term266, term266.getClass(), "specializedDependencies", term267);
        setField(term266, term266.getClass(), "debloatedPomPath", "PHvxnGHptP");
        setBooleanField(term266, term266.getClass(), "createSinglePomSpecialized", false);
        setBooleanField(term266, term266.getClass(), "createDependencySpecializedPerPom", true);
        setBooleanField(term266, term266.getClass(), "createAllPomSpecialized", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("se.kth.deptrim.util.PomUtils");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createPoms", argTypes, term266, args);
    }

};


