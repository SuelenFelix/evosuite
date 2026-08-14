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

public class ClassDefinition_getBaseTypes_10079582352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1382;

    public ClassDefinition_getBaseTypes_10079582352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1396 = new ArrayList();
        HashMap term1401 = new HashMap();
        Set<Object> term1468 =  ((Map) term1401).keySet();
        HashSet term1400 = new HashSet((Collection<? extends Object>) term1468);
        Integer term1428 = new Integer(515182546);
        ArrayList term1424 = new ArrayList();
        HashMap term1444 = new HashMap();
        Set<Object> term1479 =  ((Map) term1444).keySet();
        HashSet term1443 = new HashSet((Collection<? extends Object>) term1479);
        HashMap term1451 = new HashMap();
        Set<Object> term1480 =  ((Map) term1451).keySet();
        HashSet term1450 = new HashSet((Collection<? extends Object>) term1480);
        term1382 = newInstance(Class.forName("org.example.toylanguage.context.definition.ClassDefinition"));
        Object term1383 = newInstance(Class.forName("org.example.toylanguage.context.definition.ClassDetails"));
        Object term1421 = newInstance(Class.forName("org.example.toylanguage.statement.ClassStatement"));
        Object term1442 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        Object term1457 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        setField(term1383, term1383.getClass(), "name", "iLsUPvsdys");
        setField(term1383, term1383.getClass(), "properties", term1396);
        setField(term1382, term1382.getClass(), "classDetails", term1383);
        setField(term1382, term1382.getClass(), "baseTypes", term1400);
        setField(term1421, term1421.getClass(), "rowNumber", term1428);
        setField(term1421, term1421.getClass(), "statements2Execute", term1424);
        setField(term1421, term1421.getClass(), "blockName", "oZAbUeXmhW");
        setField(term1382, term1382.getClass(), "statement", term1421);
        setField(term1442, term1442.getClass(), "classes", term1443);
        setField(term1442, term1442.getClass(), "functions", term1450);
        setField(term1457, term1457.getClass(), "classes", null);
        setField(term1457, term1457.getClass(), "functions", null);
        setField(term1457, term1457.getClass(), "parent", null);
        setField(term1442, term1442.getClass(), "parent", term1457);
        setField(term1382, term1382.getClass(), "definitionScope", term1442);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.context.definition.ClassDefinition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBaseTypes", argTypes, term1382, args);
    }

};


