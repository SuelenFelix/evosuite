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

public class PomUtils_createSpecializedPomFromDebloatedPom_19190024067 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term645;
     Object term680;
     Object term686;

    public PomUtils_createSpecializedPomFromDebloatedPom_19190024067() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term647 = new HashMap();
        Set<Object> term688 =  ((Map) term647).keySet();
        HashSet term646 = new HashSet((Collection<? extends Object>) term688);
        term645 = newInstance(Class.forName("se.kth.deptrim.util.PomUtils"));
        setField(term645, term645.getClass(), "specializedDependencies", term646);
        setField(term645, term645.getClass(), "debloatedPomPath", "izPpKDErnQ");
        setBooleanField(term645, term645.getClass(), "createSinglePomSpecialized", true);
        setBooleanField(term645, term645.getClass(), "createDependencySpecializedPerPom", true);
        setBooleanField(term645, term645.getClass(), "createAllPomSpecialized", true);
        HashMap term681 = new HashMap();
        Set<Object> term699 =  ((Map) term681).keySet();
        term680 = new HashSet((Collection<? extends Object>) term699);
        term686 = new Integer(568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("se.kth.deptrim.util.PomUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Set");
        argTypes[1] = Class.forName("java.lang.Integer");
        Object[] args = new Object[2];
        args[0] = term680;
        args[1] = term686;
        callMethod(klass, "createSpecializedPomFromDebloatedPom", argTypes, term645, args);
    }

};


