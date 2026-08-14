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

public class ClassDefinition_getDefinitionScope_9881091204 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1593;

    public ClassDefinition_getDefinitionScope_9881091204() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1607 = new ArrayList();
        HashMap term1612 = new HashMap();
        Set<Object> term1668 =  ((Map) term1612).keySet();
        HashSet term1611 = new HashSet((Collection<? extends Object>) term1668);
        Integer term1629 = new Integer(1252951645);
        ArrayList term1625 = new ArrayList();
        ((ArrayList) term1625).add((Object)null);
        ((ArrayList) term1625).add((Object)null);
        ((ArrayList) term1625).add((Object)null);
        ((ArrayList) term1625).add((Object)null);
        ((ArrayList) term1625).add((Object)null);
        ((ArrayList) term1625).add((Object)null);
        ((ArrayList) term1625).add((Object)null);
        ((ArrayList) term1625).add((Object)null);
        HashMap term1645 = new HashMap();
        Set<Object> term1679 =  ((Map) term1645).keySet();
        HashSet term1644 = new HashSet((Collection<? extends Object>) term1679);
        HashMap term1651 = new HashMap();
        Set<Object> term1680 =  ((Map) term1651).keySet();
        HashSet term1650 = new HashSet((Collection<? extends Object>) term1680);
        term1593 = newInstance(Class.forName("org.example.toylanguage.context.definition.ClassDefinition"));
        Object term1594 = newInstance(Class.forName("org.example.toylanguage.context.definition.ClassDetails"));
        Object term1622 = newInstance(Class.forName("org.example.toylanguage.statement.ClassStatement"));
        Object term1643 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        Object term1657 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        setField(term1594, term1594.getClass(), "name", "IbOvZLmtSE");
        setField(term1594, term1594.getClass(), "properties", term1607);
        setField(term1593, term1593.getClass(), "classDetails", term1594);
        setField(term1593, term1593.getClass(), "baseTypes", term1611);
        setField(term1622, term1622.getClass(), "rowNumber", term1629);
        setField(term1622, term1622.getClass(), "statements2Execute", term1625);
        setField(term1622, term1622.getClass(), "blockName", "WJosrfBMfA");
        setField(term1593, term1593.getClass(), "statement", term1622);
        setField(term1643, term1643.getClass(), "classes", term1644);
        setField(term1643, term1643.getClass(), "functions", term1650);
        setField(term1657, term1657.getClass(), "classes", null);
        setField(term1657, term1657.getClass(), "functions", null);
        setField(term1657, term1657.getClass(), "parent", null);
        setField(term1643, term1643.getClass(), "parent", term1657);
        setField(term1593, term1593.getClass(), "definitionScope", term1643);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.context.definition.ClassDefinition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDefinitionScope", argTypes, term1593, args);
    }

};


