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
import java.lang.Integer;

public class PomUtils_createSpecializedPomFromDebloatedPom_19190024068 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1682;
     Object term1715;
     Object term1721;

    public PomUtils_createSpecializedPomFromDebloatedPom_19190024068() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1684 = new HashMap();
        Set<Object> term1723 =  ((Map) term1684).keySet();
        HashSet term1683 = new HashSet((Collection<? extends Object>) term1723);
        term1682 = newInstance(Class.forName("se.kth.deptrim.util.PomUtils"));
        setField(term1682, term1682.getClass(), "specializedDependencies", term1683);
        setField(term1682, term1682.getClass(), "debloatedPomPath", "ypEdrstygY");
        setBooleanField(term1682, term1682.getClass(), "createSinglePomSpecialized", true);
        setBooleanField(term1682, term1682.getClass(), "createDependencySpecializedPerPom", true);
        setBooleanField(term1682, term1682.getClass(), "createAllPomSpecialized", true);
        HashMap term1716 = new HashMap();
        Set<Object> term1734 =  ((Map) term1716).keySet();
        term1715 = new HashSet((Collection<? extends Object>) term1734);
        term1721 = new Integer(568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("se.kth.deptrim.util.PomUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Set");
        argTypes[1] = Class.forName("java.lang.Integer");
        Object[] args = new Object[2];
        args[0] = term1715;
        args[1] = term1721;
        callMethod(klass, "createSpecializedPomFromDebloatedPom", argTypes, term1682, args);
    }

};


