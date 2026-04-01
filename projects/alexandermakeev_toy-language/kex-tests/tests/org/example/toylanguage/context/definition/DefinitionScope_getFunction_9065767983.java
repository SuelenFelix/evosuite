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

public class DefinitionScope_getFunction_9065767983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221;
     Object term271;

    public DefinitionScope_getFunction_9065767983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term223 = new HashMap();
        Set<Object> term273 =  ((Map) term223).keySet();
        HashSet term222 = new HashSet((Collection<? extends Object>) term273);
        HashMap term238 = new HashMap();
        Set<Object> term274 =  ((Map) term238).keySet();
        HashSet term237 = new HashSet((Collection<? extends Object>) term274);
        HashMap term245 = new HashMap();
        Set<Object> term275 =  ((Map) term245).keySet();
        HashSet term244 = new HashSet((Collection<? extends Object>) term275);
        HashMap term252 = new HashMap();
        Set<Object> term276 =  ((Map) term252).keySet();
        HashSet term251 = new HashSet((Collection<? extends Object>) term276);
        term221 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        Object term243 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        Object term258 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        setField(term221, term221.getClass(), "classes", term222);
        setField(term221, term221.getClass(), "functions", term237);
        setField(term243, term243.getClass(), "classes", term244);
        setField(term243, term243.getClass(), "functions", term251);
        setField(term258, term258.getClass(), "classes", null);
        setField(term258, term258.getClass(), "functions", null);
        setField(term258, term258.getClass(), "parent", null);
        setField(term243, term243.getClass(), "parent", term258);
        setField(term221, term221.getClass(), "parent", term243);
        term271 = new Integer(568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.context.definition.DefinitionScope");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = "UqKUbMyPMJ";
        args[1] = term271;
        callMethod(klass, "getFunction", argTypes, term221, args);
    }

};


