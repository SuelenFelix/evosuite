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

public class FunctionDefinition_hashCode_10165807406 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1000;

    public FunctionDefinition_hashCode_10165807406() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1014 = new ArrayList();
        ((ArrayList) term1014).add("");
        ((ArrayList) term1014).add("");
        ((ArrayList) term1014).add("");
        ((ArrayList) term1014).add("");
        ((ArrayList) term1014).add("");
        ArrayList term1024 = new ArrayList();
        ((ArrayList) term1024).add((Object)null);
        ((ArrayList) term1024).add((Object)null);
        ((ArrayList) term1024).add((Object)null);
        ((ArrayList) term1024).add((Object)null);
        Integer term1028 = new Integer(388157121);
        HashMap term1044 = new HashMap();
        Set<Object> term1093 =  ((Map) term1044).keySet();
        HashSet term1043 = new HashSet((Collection<? extends Object>) term1093);
        HashMap term1050 = new HashMap();
        Set<Object> term1094 =  ((Map) term1050).keySet();
        HashSet term1049 = new HashSet((Collection<? extends Object>) term1094);
        HashMap term1058 = new HashMap();
        Set<Object> term1095 =  ((Map) term1058).keySet();
        HashSet term1057 = new HashSet((Collection<? extends Object>) term1095);
        HashMap term1064 = new HashMap();
        Set<Object> term1096 =  ((Map) term1064).keySet();
        HashSet term1063 = new HashSet((Collection<? extends Object>) term1096);
        HashSet term1070 = new HashSet();
        HashSet term1071 = new HashSet();
        term1000 = newInstance(Class.forName("org.example.toylanguage.context.definition.FunctionDefinition"));
        Object term1001 = newInstance(Class.forName("org.example.toylanguage.context.definition.FunctionDetails"));
        Object term1023 = newInstance(Class.forName("org.example.toylanguage.statement.FunctionStatement"));
        Object term1042 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        Object term1056 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        Object term1069 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        Object term1072 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        setField(term1001, term1001.getClass(), "name", "SeWCUkXfZv");
        setField(term1001, term1001.getClass(), "arguments", term1014);
        setField(term1000, term1000.getClass(), "details", term1001);
        setField(term1023, term1023.getClass(), "statements2Execute", term1024);
        setField(term1023, term1023.getClass(), "rowNumber", term1028);
        setField(term1023, term1023.getClass(), "blockName", "XosDTAzIAT");
        setField(term1000, term1000.getClass(), "statement", term1023);
        setField(term1042, term1042.getClass(), "classes", term1043);
        setField(term1042, term1042.getClass(), "functions", term1049);
        setField(term1056, term1056.getClass(), "classes", term1057);
        setField(term1056, term1056.getClass(), "functions", term1063);
        setField(term1069, term1069.getClass(), "classes", term1070);
        setField(term1069, term1069.getClass(), "functions", term1071);
        setField(term1072, term1072.getClass(), "classes", null);
        setField(term1072, term1072.getClass(), "functions", null);
        setField(term1072, term1072.getClass(), "parent", null);
        setField(term1069, term1069.getClass(), "parent", term1072);
        setField(term1056, term1056.getClass(), "parent", term1069);
        setField(term1042, term1042.getClass(), "parent", term1056);
        setField(term1000, term1000.getClass(), "definitionScope", term1042);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.context.definition.FunctionDefinition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term1000, args);
    }

};


