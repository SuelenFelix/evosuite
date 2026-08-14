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

public class PomUtils_saveUpdatedDomInANewPom_15777926509 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1735;

    public PomUtils_saveUpdatedDomInANewPom_15777926509() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1737 = new HashMap();
        Set<Object> term1784 =  ((Map) term1737).keySet();
        HashSet term1736 = new HashSet((Collection<? extends Object>) term1784);
        term1735 = newInstance(Class.forName("se.kth.deptrim.util.PomUtils"));
        setField(term1735, term1735.getClass(), "specializedDependencies", term1736);
        setField(term1735, term1735.getClass(), "debloatedPomPath", "GEJABPlHSI");
        setBooleanField(term1735, term1735.getClass(), "createSinglePomSpecialized", true);
        setBooleanField(term1735, term1735.getClass(), "createDependencySpecializedPerPom", false);
        setBooleanField(term1735, term1735.getClass(), "createAllPomSpecialized", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("se.kth.deptrim.util.PomUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Document");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "aQFUvuaYxd";
        callMethod(klass, "saveUpdatedDomInANewPom", argTypes, term1735, args);
    }

};


