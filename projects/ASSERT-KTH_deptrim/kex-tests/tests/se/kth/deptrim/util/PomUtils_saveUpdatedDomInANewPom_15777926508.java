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

public class PomUtils_saveUpdatedDomInANewPom_15777926508 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term700;

    public PomUtils_saveUpdatedDomInANewPom_15777926508() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term702 = new HashMap();
        Set<Object> term747 =  ((Map) term702).keySet();
        HashSet term701 = new HashSet((Collection<? extends Object>) term747);
        term700 = newInstance(Class.forName("se.kth.deptrim.util.PomUtils"));
        setField(term700, term700.getClass(), "specializedDependencies", term701);
        setField(term700, term700.getClass(), "debloatedPomPath", "bnsyeQXFdu");
        setBooleanField(term700, term700.getClass(), "createSinglePomSpecialized", true);
        setBooleanField(term700, term700.getClass(), "createDependencySpecializedPerPom", false);
        setBooleanField(term700, term700.getClass(), "createAllPomSpecialized", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("se.kth.deptrim.util.PomUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Document");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "BwtdjiefJn";
        callMethod(klass, "saveUpdatedDomInANewPom", argTypes, term700, args);
    }

};


