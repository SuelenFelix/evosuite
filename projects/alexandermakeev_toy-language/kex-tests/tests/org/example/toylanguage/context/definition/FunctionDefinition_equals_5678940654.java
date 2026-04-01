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
import java.lang.Integer;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class FunctionDefinition_equals_5678940654 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term807;
     Object term876;

    public FunctionDefinition_equals_5678940654() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term821 = new ArrayList();
        ((ArrayList) term821).add("");
        ((ArrayList) term821).add("");
        ((ArrayList) term821).add("");
        ArrayList term829 = new ArrayList();
        ((ArrayList) term829).add((Object)null);
        ((ArrayList) term829).add((Object)null);
        ((ArrayList) term829).add((Object)null);
        ((ArrayList) term829).add((Object)null);
        ((ArrayList) term829).add((Object)null);
        ((ArrayList) term829).add((Object)null);
        ((ArrayList) term829).add((Object)null);
        Integer term833 = new Integer(-2104981311);
        HashMap term849 = new HashMap();
        Set<Object> term897 =  ((Map) term849).keySet();
        HashSet term848 = new HashSet((Collection<? extends Object>) term897);
        HashMap term856 = new HashMap();
        Set<Object> term898 =  ((Map) term856).keySet();
        HashSet term855 = new HashSet((Collection<? extends Object>) term898);
        HashMap term864 = new HashMap();
        Set<Object> term899 =  ((Map) term864).keySet();
        HashSet term863 = new HashSet((Collection<? extends Object>) term899);
        HashMap term870 = new HashMap();
        Set<Object> term900 =  ((Map) term870).keySet();
        HashSet term869 = new HashSet((Collection<? extends Object>) term900);
        term807 = newInstance(Class.forName("org.example.toylanguage.context.definition.FunctionDefinition"));
        Object term808 = newInstance(Class.forName("org.example.toylanguage.context.definition.FunctionDetails"));
        Object term828 = newInstance(Class.forName("org.example.toylanguage.statement.FunctionStatement"));
        Object term847 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        Object term862 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        Object term875 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        setField(term808, term808.getClass(), "name", "OLYhTSqTqJ");
        setField(term808, term808.getClass(), "arguments", term821);
        setField(term807, term807.getClass(), "details", term808);
        setField(term828, term828.getClass(), "statements2Execute", term829);
        setField(term828, term828.getClass(), "rowNumber", term833);
        setField(term828, term828.getClass(), "blockName", "tViQSKUCLE");
        setField(term807, term807.getClass(), "statement", term828);
        setField(term847, term847.getClass(), "classes", term848);
        setField(term847, term847.getClass(), "functions", term855);
        setField(term862, term862.getClass(), "classes", term863);
        setField(term862, term862.getClass(), "functions", term869);
        setField(term875, term875.getClass(), "classes", null);
        setField(term875, term875.getClass(), "functions", null);
        setField(term875, term875.getClass(), "parent", null);
        setField(term862, term862.getClass(), "parent", term875);
        setField(term847, term847.getClass(), "parent", term862);
        setField(term807, term807.getClass(), "definitionScope", term847);
        term876 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.context.definition.FunctionDefinition");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term876;
        callMethod(klass, "equals", argTypes, term807, args);
    }

};


