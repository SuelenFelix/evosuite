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

public class PomUtils_replaceDependencyInPom_15651034314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term392;
     Object term417;

    public PomUtils_replaceDependencyInPom_15651034314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term394 = new HashMap();
        Set<Object> term490 =  ((Map) term394).keySet();
        HashSet term393 = new HashSet((Collection<? extends Object>) term490);
        term392 = newInstance(Class.forName("se.kth.deptrim.util.PomUtils"));
        setField(term392, term392.getClass(), "specializedDependencies", term393);
        setField(term392, term392.getClass(), "debloatedPomPath", "mXGCWJDOqA");
        setBooleanField(term392, term392.getClass(), "createSinglePomSpecialized", false);
        setBooleanField(term392, term392.getClass(), "createDependencySpecializedPerPom", true);
        setBooleanField(term392, term392.getClass(), "createAllPomSpecialized", false);
        term417 = newInstance(Class.forName("se.kth.deptrim.core.SpecializedDependency"));
        setField(term417, term417.getClass(), "originalGroupId", "dpNsDgfPso");
        setField(term417, term417.getClass(), "originalArtifactId", "hCWPJQKpdc");
        setField(term417, term417.getClass(), "originalVersion", "WzMEhMXkKx");
        setField(term417, term417.getClass(), "specializedGroupId", "XOiDvlDhdc");
        setField(term417, term417.getClass(), "specializedArtifactId", "AdxvLJhNLe");
        setField(term417, term417.getClass(), "specializedVersion", "lHfTrWKMPk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("se.kth.deptrim.util.PomUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("se.kth.deptrim.core.SpecializedDependency");
        argTypes[1] = Class.forName("org.w3c.dom.NodeList");
        Object[] args = new Object[2];
        args[0] = term417;
        args[1] = null;
        callMethod(klass, "replaceDependencyInPom", argTypes, term392, args);
    }

};


