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

public class FunctionDefinition_getDefinitionScope_13029107583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term725;

    public FunctionDefinition_getDefinitionScope_13029107583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term739 = new ArrayList();
        ((ArrayList) term739).add("");
        ((ArrayList) term739).add("");
        ((ArrayList) term739).add("");
        ((ArrayList) term739).add("");
        ((ArrayList) term739).add("");
        ((ArrayList) term739).add("");
        ((ArrayList) term739).add("");
        ArrayList term751 = new ArrayList();
        ((ArrayList) term751).add((Object)null);
        ((ArrayList) term751).add((Object)null);
        ((ArrayList) term751).add((Object)null);
        Integer term755 = new Integer(-1882480155);
        HashMap term771 = new HashMap();
        Set<Object> term805 =  ((Map) term771).keySet();
        HashSet term770 = new HashSet((Collection<? extends Object>) term805);
        HashMap term778 = new HashMap();
        Set<Object> term806 =  ((Map) term778).keySet();
        HashSet term777 = new HashSet((Collection<? extends Object>) term806);
        term725 = newInstance(Class.forName("org.example.toylanguage.context.definition.FunctionDefinition"));
        Object term726 = newInstance(Class.forName("org.example.toylanguage.context.definition.FunctionDetails"));
        Object term750 = newInstance(Class.forName("org.example.toylanguage.statement.FunctionStatement"));
        Object term769 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        Object term784 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        setField(term726, term726.getClass(), "name", "KyGXZcXJwq");
        setField(term726, term726.getClass(), "arguments", term739);
        setField(term725, term725.getClass(), "details", term726);
        setField(term750, term750.getClass(), "statements2Execute", term751);
        setField(term750, term750.getClass(), "rowNumber", term755);
        setField(term750, term750.getClass(), "blockName", "HvnMmAOZev");
        setField(term725, term725.getClass(), "statement", term750);
        setField(term769, term769.getClass(), "classes", term770);
        setField(term769, term769.getClass(), "functions", term777);
        setField(term784, term784.getClass(), "classes", null);
        setField(term784, term784.getClass(), "functions", null);
        setField(term784, term784.getClass(), "parent", null);
        setField(term769, term769.getClass(), "parent", term784);
        setField(term725, term725.getClass(), "definitionScope", term769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.context.definition.FunctionDefinition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDefinitionScope", argTypes, term725, args);
    }

};


