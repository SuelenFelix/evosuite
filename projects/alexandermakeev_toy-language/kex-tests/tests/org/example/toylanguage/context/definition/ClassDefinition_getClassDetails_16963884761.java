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
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Integer;

public class ClassDefinition_getClassDetails_16963884761 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1284;

    public ClassDefinition_getClassDetails_16963884761() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1298 = new ArrayList();
        HashMap term1303 = new HashMap();
        Set<Object> term1369 =  ((Map) term1303).keySet();
        HashSet term1302 = new HashSet((Collection<? extends Object>) term1369);
        Integer term1330 = new Integer(-1183353915);
        ArrayList term1326 = new ArrayList();
        ((ArrayList) term1326).add((Object)null);
        ((ArrayList) term1326).add((Object)null);
        ((ArrayList) term1326).add((Object)null);
        ((ArrayList) term1326).add((Object)null);
        ((ArrayList) term1326).add((Object)null);
        ((ArrayList) term1326).add((Object)null);
        ((ArrayList) term1326).add((Object)null);
        ((ArrayList) term1326).add((Object)null);
        ((ArrayList) term1326).add((Object)null);
        HashMap term1346 = new HashMap();
        Set<Object> term1380 =  ((Map) term1346).keySet();
        HashSet term1345 = new HashSet((Collection<? extends Object>) term1380);
        HashMap term1353 = new HashMap();
        Set<Object> term1381 =  ((Map) term1353).keySet();
        HashSet term1352 = new HashSet((Collection<? extends Object>) term1381);
        term1284 = newInstance(Class.forName("org.example.toylanguage.context.definition.ClassDefinition"));
        Object term1285 = newInstance(Class.forName("org.example.toylanguage.context.definition.ClassDetails"));
        Object term1323 = newInstance(Class.forName("org.example.toylanguage.statement.ClassStatement"));
        Object term1344 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        Object term1358 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        setField(term1285, term1285.getClass(), "name", "uCdLbhvYeG");
        setField(term1285, term1285.getClass(), "properties", term1298);
        setField(term1284, term1284.getClass(), "classDetails", term1285);
        setField(term1284, term1284.getClass(), "baseTypes", term1302);
        setField(term1323, term1323.getClass(), "rowNumber", term1330);
        setField(term1323, term1323.getClass(), "statements2Execute", term1326);
        setField(term1323, term1323.getClass(), "blockName", "DBYTggnCkD");
        setField(term1284, term1284.getClass(), "statement", term1323);
        setField(term1344, term1344.getClass(), "classes", term1345);
        setField(term1344, term1344.getClass(), "functions", term1352);
        setField(term1358, term1358.getClass(), "classes", null);
        setField(term1358, term1358.getClass(), "functions", null);
        setField(term1358, term1358.getClass(), "parent", null);
        setField(term1344, term1344.getClass(), "parent", term1358);
        setField(term1284, term1284.getClass(), "definitionScope", term1344);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.context.definition.ClassDefinition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClassDetails", argTypes, term1284, args);
    }

};


