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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Integer;

public class ClassDefinition_init_18765340100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1103;
     Object term1156;
     Object term1162;
     Object term1183;

    public ClassDefinition_init_18765340100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1116 = new ArrayList();
        ((ArrayList) term1116).add("GAxMzRqmXU");
        ((ArrayList) term1116).add("XMhUDGKSWO");
        ((ArrayList) term1116).add("jLgzxtuvVo");
        term1103 = newInstance(Class.forName("org.example.toylanguage.context.definition.ClassDetails"));
        setField(term1103, term1103.getClass(), "name", "OZGyrUPedG");
        setField(term1103, term1103.getClass(), "properties", term1116);
        HashMap term1157 = new HashMap();
        Set<Object> term1268 =  ((Map) term1157).keySet();
        term1156 = new HashSet((Collection<? extends Object>) term1268);
        Integer term1169 = new Integer(-1254072822);
        ArrayList term1165 = new ArrayList();
        ((ArrayList) term1165).add((Object)null);
        ((ArrayList) term1165).add((Object)null);
        ((ArrayList) term1165).add((Object)null);
        ((ArrayList) term1165).add((Object)null);
        ((ArrayList) term1165).add((Object)null);
        ((ArrayList) term1165).add((Object)null);
        ((ArrayList) term1165).add((Object)null);
        ((ArrayList) term1165).add((Object)null);
        term1162 = newInstance(Class.forName("org.example.toylanguage.statement.ClassStatement"));
        setField(term1162, term1162.getClass(), "rowNumber", term1169);
        setField(term1162, term1162.getClass(), "statements2Execute", term1165);
        setField(term1162, term1162.getClass(), "blockName", "wmmxjOkPnH");
        HashMap term1185 = new HashMap();
        Set<Object> term1279 =  ((Map) term1185).keySet();
        HashSet term1184 = new HashSet((Collection<? extends Object>) term1279);
        HashMap term1201 = new HashMap();
        Set<Object> term1280 =  ((Map) term1201).keySet();
        HashSet term1200 = new HashSet((Collection<? extends Object>) term1280);
        HashMap term1208 = new HashMap();
        Set<Object> term1281 =  ((Map) term1208).keySet();
        HashSet term1207 = new HashSet((Collection<? extends Object>) term1281);
        HashMap term1216 = new HashMap();
        Set<Object> term1282 =  ((Map) term1216).keySet();
        HashSet term1215 = new HashSet((Collection<? extends Object>) term1282);
        HashMap term1222 = new HashMap();
        Set<Object> term1283 =  ((Map) term1222).keySet();
        HashSet term1221 = new HashSet((Collection<? extends Object>) term1283);
        term1183 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        Object term1199 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        Object term1214 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        Object term1227 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        setField(term1183, term1183.getClass(), "classes", term1184);
        setField(term1183, term1183.getClass(), "functions", null);
        setField(term1199, term1199.getClass(), "classes", term1200);
        setField(term1199, term1199.getClass(), "functions", term1207);
        setField(term1214, term1214.getClass(), "classes", term1215);
        setField(term1214, term1214.getClass(), "functions", term1221);
        setField(term1227, term1227.getClass(), "classes", null);
        setField(term1227, term1227.getClass(), "functions", null);
        setField(term1227, term1227.getClass(), "parent", null);
        setField(term1214, term1214.getClass(), "parent", term1227);
        setField(term1199, term1199.getClass(), "parent", term1214);
        setField(term1183, term1183.getClass(), "parent", term1199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.context.definition.ClassDefinition");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.example.toylanguage.context.definition.ClassDetails");
        argTypes[1] = Class.forName("java.util.Set");
        argTypes[2] = Class.forName("org.example.toylanguage.statement.ClassStatement");
        argTypes[3] = Class.forName("org.example.toylanguage.context.definition.DefinitionScope");
        Object[] args = new Object[4];
        args[0] = term1103;
        args[1] = term1156;
        args[2] = term1162;
        args[3] = term1183;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


