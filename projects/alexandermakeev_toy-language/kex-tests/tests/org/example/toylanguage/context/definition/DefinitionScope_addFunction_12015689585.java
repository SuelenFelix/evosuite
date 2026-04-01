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
import java.util.ArrayList;
import java.lang.Integer;

public class DefinitionScope_addFunction_12015689585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term320;
     Object term356;

    public DefinitionScope_addFunction_12015689585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term322 = new HashMap();
        Set<Object> term412 =  ((Map) term322).keySet();
        HashSet term321 = new HashSet((Collection<? extends Object>) term412);
        HashMap term339 = new HashMap();
        Set<Object> term413 =  ((Map) term339).keySet();
        HashSet term338 = new HashSet((Collection<? extends Object>) term413);
        term320 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        Object term355 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        setField(term320, term320.getClass(), "classes", term321);
        setField(term320, term320.getClass(), "functions", term338);
        setField(term355, term355.getClass(), "classes", null);
        setField(term355, term355.getClass(), "functions", null);
        setField(term355, term355.getClass(), "parent", null);
        setField(term320, term320.getClass(), "parent", term355);
        ArrayList term370 = new ArrayList();
        ((ArrayList) term370).add("");
        ((ArrayList) term370).add("");
        ((ArrayList) term370).add("");
        ArrayList term378 = new ArrayList();
        ((ArrayList) term378).add((Object)null);
        ((ArrayList) term378).add((Object)null);
        ((ArrayList) term378).add((Object)null);
        Integer term382 = new Integer(-341962980);
        HashMap term398 = new HashMap();
        Set<Object> term434 =  ((Map) term398).keySet();
        HashSet term397 = new HashSet((Collection<? extends Object>) term434);
        HashMap term405 = new HashMap();
        Set<Object> term435 =  ((Map) term405).keySet();
        HashSet term404 = new HashSet((Collection<? extends Object>) term435);
        term356 = newInstance(Class.forName("org.example.toylanguage.context.definition.FunctionDefinition"));
        Object term357 = newInstance(Class.forName("org.example.toylanguage.context.definition.FunctionDetails"));
        Object term377 = newInstance(Class.forName("org.example.toylanguage.statement.FunctionStatement"));
        Object term396 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        Object term411 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        setField(term357, term357.getClass(), "name", "YQwoogpPyi");
        setField(term357, term357.getClass(), "arguments", term370);
        setField(term356, term356.getClass(), "details", term357);
        setField(term377, term377.getClass(), "statements2Execute", term378);
        setField(term377, term377.getClass(), "rowNumber", term382);
        setField(term377, term377.getClass(), "blockName", "YupgKTSEiI");
        setField(term356, term356.getClass(), "statement", term377);
        setField(term396, term396.getClass(), "classes", term397);
        setField(term396, term396.getClass(), "functions", term404);
        setField(term411, term411.getClass(), "classes", null);
        setField(term411, term411.getClass(), "functions", null);
        setField(term411, term411.getClass(), "parent", null);
        setField(term396, term396.getClass(), "parent", term411);
        setField(term356, term356.getClass(), "definitionScope", term396);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.context.definition.DefinitionScope");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.example.toylanguage.context.definition.FunctionDefinition");
        Object[] args = new Object[1];
        args[0] = term356;
        callMethod(klass, "addFunction", argTypes, term320, args);
    }

};


