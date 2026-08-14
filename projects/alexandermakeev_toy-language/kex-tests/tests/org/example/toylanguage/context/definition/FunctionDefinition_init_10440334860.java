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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class FunctionDefinition_init_10440334860 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term480;
     Object term497;
     Object term516;

    public FunctionDefinition_init_10440334860() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term493 = new ArrayList();
        term480 = newInstance(Class.forName("org.example.toylanguage.context.definition.FunctionDetails"));
        setField(term480, term480.getClass(), "name", "eBcTbweeYp");
        setField(term480, term480.getClass(), "arguments", term493);
        ArrayList term498 = new ArrayList();
        ((ArrayList) term498).add((Object)null);
        ((ArrayList) term498).add((Object)null);
        ((ArrayList) term498).add((Object)null);
        ((ArrayList) term498).add((Object)null);
        ((ArrayList) term498).add((Object)null);
        ((ArrayList) term498).add((Object)null);
        ((ArrayList) term498).add((Object)null);
        Integer term502 = new Integer(2095798786);
        term497 = newInstance(Class.forName("org.example.toylanguage.statement.FunctionStatement"));
        setField(term497, term497.getClass(), "statements2Execute", term498);
        setField(term497, term497.getClass(), "rowNumber", term502);
        setField(term497, term497.getClass(), "blockName", "drcmjfQUDq");
        HashMap term518 = new HashMap();
        Set<Object> term560 =  ((Map) term518).keySet();
        HashSet term517 = new HashSet((Collection<? extends Object>) term560);
        HashMap term527 = new HashMap();
        Set<Object> term561 =  ((Map) term527).keySet();
        HashSet term526 = new HashSet((Collection<? extends Object>) term561);
        term516 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        Object term539 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        setField(term516, term516.getClass(), "classes", term517);
        setField(term516, term516.getClass(), "functions", term526);
        setField(term539, term539.getClass(), "classes", null);
        setField(term539, term539.getClass(), "functions", null);
        setField(term539, term539.getClass(), "parent", null);
        setField(term516, term516.getClass(), "parent", term539);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.context.definition.FunctionDefinition");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.example.toylanguage.context.definition.FunctionDetails");
        argTypes[1] = Class.forName("org.example.toylanguage.statement.FunctionStatement");
        argTypes[2] = Class.forName("org.example.toylanguage.context.definition.DefinitionScope");
        Object[] args = new Object[3];
        args[0] = term480;
        args[1] = term497;
        args[2] = term516;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


