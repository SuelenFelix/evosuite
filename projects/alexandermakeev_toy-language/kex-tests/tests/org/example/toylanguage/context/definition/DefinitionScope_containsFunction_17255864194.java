package org.example.toylanguage.context.definition;

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
import static org.example.toylanguage.context.definition.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Integer;

public class DefinitionScope_containsFunction_17255864194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287;
     Object term307;

    public DefinitionScope_containsFunction_17255864194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term289 = new HashMap();
        Set<Object> term309 =  ((Map) term289).keySet();
        HashSet term288 = new HashSet((Collection<? extends Object>) term309);
        term287 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        Object term294 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        setField(term287, term287.getClass(), "classes", term288);
        setField(term287, term287.getClass(), "functions", null);
        setField(term294, term294.getClass(), "classes", null);
        setField(term294, term294.getClass(), "functions", null);
        setField(term294, term294.getClass(), "parent", null);
        setField(term287, term287.getClass(), "parent", term294);
        term307 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.context.definition.DefinitionScope");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = "TGiJfagfky";
        args[1] = term307;
        callMethod(klass, "containsFunction", argTypes, term287, args);
    }

};


