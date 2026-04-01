package org.example.toylanguage.expression.value;

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
import static org.example.toylanguage.expression.value.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Integer;
import java.util.LinkedHashMap;

public class ClassValue_init_9994196880 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151;
     Object term221;
     Object term255;

    public ClassValue_init_9994196880() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term165 = new ArrayList();
        HashMap term170 = new HashMap();
        Set<Object> term271 =  ((Map) term170).keySet();
        HashSet term169 = new HashSet((Collection<? extends Object>) term271);
        Integer term191 = new Integer(1162663216);
        ArrayList term187 = new ArrayList();
        ((ArrayList) term187).add((Object)null);
        ((ArrayList) term187).add((Object)null);
        ((ArrayList) term187).add((Object)null);
        ((ArrayList) term187).add((Object)null);
        ((ArrayList) term187).add((Object)null);
        ((ArrayList) term187).add((Object)null);
        ((ArrayList) term187).add((Object)null);
        ((ArrayList) term187).add((Object)null);
        ((ArrayList) term187).add((Object)null);
        HashMap term207 = new HashMap();
        Set<Object> term282 =  ((Map) term207).keySet();
        HashSet term206 = new HashSet((Collection<? extends Object>) term282);
        HashMap term214 = new HashMap();
        Set<Object> term283 =  ((Map) term214).keySet();
        HashSet term213 = new HashSet((Collection<? extends Object>) term283);
        term151 = newInstance(Class.forName("org.example.toylanguage.context.definition.ClassDefinition"));
        Object term152 = newInstance(Class.forName("org.example.toylanguage.context.definition.ClassDetails"));
        Object term184 = newInstance(Class.forName("org.example.toylanguage.statement.ClassStatement"));
        Object term205 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        Object term220 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        setField(term152, term152.getClass(), "name", "xxtlPwDYFs");
        setField(term152, term152.getClass(), "properties", term165);
        setField(term151, term151.getClass(), "classDetails", term152);
        setField(term151, term151.getClass(), "baseTypes", term169);
        setField(term184, term184.getClass(), "rowNumber", term191);
        setField(term184, term184.getClass(), "statements2Execute", term187);
        setField(term184, term184.getClass(), "blockName", "xOEqzGAmDU");
        setField(term151, term151.getClass(), "statement", term184);
        setField(term205, term205.getClass(), "classes", term206);
        setField(term205, term205.getClass(), "functions", term213);
        setField(term220, term220.getClass(), "classes", null);
        setField(term220, term220.getClass(), "functions", null);
        setField(term220, term220.getClass(), "parent", null);
        setField(term205, term205.getClass(), "parent", term220);
        setField(term151, term151.getClass(), "definitionScope", term205);
        HashMap term222 = new HashMap();
        HashMap term233 = new HashMap();
        HashMap term242 = new HashMap();
        HashMap term249 = new HashMap();
        term221 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term232 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term241 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term248 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        Object term254 = newInstance(Class.forName("org.example.toylanguage.context.MemoryScope"));
        setField(term221, term221.getClass(), "variables", term222);
        setField(term232, term232.getClass(), "variables", term233);
        setField(term241, term241.getClass(), "variables", term242);
        setField(term248, term248.getClass(), "variables", term249);
        setField(term254, term254.getClass(), "variables", null);
        setField(term254, term254.getClass(), "parent", null);
        setField(term248, term248.getClass(), "parent", term254);
        setField(term241, term241.getClass(), "parent", term248);
        setField(term232, term232.getClass(), "parent", term241);
        setField(term221, term221.getClass(), "parent", term232);
        term255 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.expression.value.ClassValue");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.example.toylanguage.context.definition.ClassDefinition");
        argTypes[1] = Class.forName("org.example.toylanguage.context.MemoryScope");
        argTypes[2] = Class.forName("java.util.Map");
        Object[] args = new Object[3];
        args[0] = term151;
        args[1] = term221;
        args[2] = term255;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


