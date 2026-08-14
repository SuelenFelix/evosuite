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

public class PomUtils_createDependencySpecializedPerPom_14658835852 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term312;

    public PomUtils_createDependencySpecializedPerPom_14658835852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term314 = new HashMap();
        Set<Object> term334 =  ((Map) term314).keySet();
        HashSet term313 = new HashSet((Collection<? extends Object>) term334);
        term312 = newInstance(Class.forName("se.kth.deptrim.util.PomUtils"));
        setField(term312, term312.getClass(), "specializedDependencies", term313);
        setField(term312, term312.getClass(), "debloatedPomPath", "TimdotUuNC");
        setBooleanField(term312, term312.getClass(), "createSinglePomSpecialized", true);
        setBooleanField(term312, term312.getClass(), "createDependencySpecializedPerPom", true);
        setBooleanField(term312, term312.getClass(), "createAllPomSpecialized", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("se.kth.deptrim.util.PomUtils");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createDependencySpecializedPerPom", argTypes, term312, args);
    }

};


