package org.s1ck.gdl.model.predicates;

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
import static org.s1ck.gdl.model.predicates.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Long;
import java.util.ArrayList;

public class Predicate_fromGraphElement_7419830020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public Predicate_fromGraphElement_7419830020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3 = new HashMap();
        Set<Object> term103 =  ((Map) term3).keySet();
        HashSet term2 = new HashSet((Collection<? extends Object>) term103);
        Long term8 = new Long(2442117782898005296L);
        ArrayList term10 = new ArrayList();
        ((ArrayList) term10).add("PAEBtnZtTD");
        ((ArrayList) term10).add("sjlJAEtRrb");
        ((ArrayList) term10).add("MuLcgQHgqz");
        ((ArrayList) term10).add("xxtlPwDYFs");
        ((ArrayList) term10).add("jJCZpVmanW");
        HashMap term74 = new HashMap();
        term1 = newInstance(Class.forName("org.s1ck.gdl.model.GraphElement"));
        setField(term1, term1.getClass(), "graphs", term2);
        setField(term1, term1.getClass(), "id", term8);
        setField(term1, term1.getClass(), "labels", term10);
        setField(term1, term1.getClass(), "properties", term74);
        setField(term1, term1.getClass(), "variable", "EGtDIRbSSb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.predicates.Predicate");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.s1ck.gdl.model.GraphElement");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = "SzjVpOQTyS";
        callMethod(klass, "fromGraphElement", argTypes, null, args);
    }

};


