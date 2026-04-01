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

public class DefinitionScope_addClass_19178392062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82;
     Object term110;

    public DefinitionScope_addClass_19178392062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term84 = new HashMap();
        Set<Object> term194 =  ((Map) term84).keySet();
        HashSet term83 = new HashSet((Collection<? extends Object>) term194);
        HashMap term93 = new HashMap();
        Set<Object> term195 =  ((Map) term93).keySet();
        HashSet term92 = new HashSet((Collection<? extends Object>) term195);
        term82 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        Object term109 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        setField(term82, term82.getClass(), "classes", term83);
        setField(term82, term82.getClass(), "functions", term92);
        setField(term109, term109.getClass(), "classes", null);
        setField(term109, term109.getClass(), "functions", null);
        setField(term109, term109.getClass(), "parent", null);
        setField(term82, term82.getClass(), "parent", term109);
        ArrayList term124 = new ArrayList();
        ((ArrayList) term124).add("");
        ((ArrayList) term124).add("");
        ((ArrayList) term124).add("");
        ((ArrayList) term124).add("");
        ((ArrayList) term124).add("");
        HashMap term134 = new HashMap();
        Set<Object> term206 =  ((Map) term134).keySet();
        HashSet term133 = new HashSet((Collection<? extends Object>) term206);
        Integer term151 = new Integer(-1786399638);
        ArrayList term147 = new ArrayList();
        ((ArrayList) term147).add((Object)null);
        ((ArrayList) term147).add((Object)null);
        HashMap term167 = new HashMap();
        Set<Object> term217 =  ((Map) term167).keySet();
        HashSet term166 = new HashSet((Collection<? extends Object>) term217);
        HashMap term174 = new HashMap();
        Set<Object> term218 =  ((Map) term174).keySet();
        HashSet term173 = new HashSet((Collection<? extends Object>) term218);
        HashMap term182 = new HashMap();
        Set<Object> term219 =  ((Map) term182).keySet();
        HashSet term181 = new HashSet((Collection<? extends Object>) term219);
        HashMap term188 = new HashMap();
        Set<Object> term220 =  ((Map) term188).keySet();
        HashSet term187 = new HashSet((Collection<? extends Object>) term220);
        term110 = newInstance(Class.forName("org.example.toylanguage.context.definition.ClassDefinition"));
        Object term111 = newInstance(Class.forName("org.example.toylanguage.context.definition.ClassDetails"));
        Object term144 = newInstance(Class.forName("org.example.toylanguage.statement.ClassStatement"));
        Object term165 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        Object term180 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        Object term193 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        setField(term111, term111.getClass(), "name", "cSHGbqKqlN");
        setField(term111, term111.getClass(), "properties", term124);
        setField(term110, term110.getClass(), "classDetails", term111);
        setField(term110, term110.getClass(), "baseTypes", term133);
        setField(term144, term144.getClass(), "rowNumber", term151);
        setField(term144, term144.getClass(), "statements2Execute", term147);
        setField(term144, term144.getClass(), "blockName", "jiUSjqwSIQ");
        setField(term110, term110.getClass(), "statement", term144);
        setField(term165, term165.getClass(), "classes", term166);
        setField(term165, term165.getClass(), "functions", term173);
        setField(term180, term180.getClass(), "classes", term181);
        setField(term180, term180.getClass(), "functions", term187);
        setField(term193, term193.getClass(), "classes", null);
        setField(term193, term193.getClass(), "functions", null);
        setField(term193, term193.getClass(), "parent", null);
        setField(term180, term180.getClass(), "parent", term193);
        setField(term165, term165.getClass(), "parent", term180);
        setField(term110, term110.getClass(), "definitionScope", term165);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.context.definition.DefinitionScope");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.example.toylanguage.context.definition.ClassDefinition");
        Object[] args = new Object[1];
        args[0] = term110;
        callMethod(klass, "addClass", argTypes, term82, args);
    }

};


