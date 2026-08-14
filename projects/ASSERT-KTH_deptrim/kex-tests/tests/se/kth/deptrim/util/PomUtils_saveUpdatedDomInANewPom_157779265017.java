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

public class PomUtils_saveUpdatedDomInANewPom_157779265017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term802;

    public PomUtils_saveUpdatedDomInANewPom_157779265017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term802 = newInstance(Class.forName("se.kth.deptrim.util.PomUtils"));
        setField(term802, term802.getClass(), "specializedDependencies", null);
        setField(term802, term802.getClass(), "debloatedPomPath", null);
        setBooleanField(term802, term802.getClass(), "createSinglePomSpecialized", false);
        setBooleanField(term802, term802.getClass(), "createDependencySpecializedPerPom", false);
        setBooleanField(term802, term802.getClass(), "createAllPomSpecialized", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("se.kth.deptrim.util.PomUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.w3c.dom.Document");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "saveUpdatedDomInANewPom", argTypes, term802, args);
    }

};


