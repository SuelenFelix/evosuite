package org.example.toylanguage.expression;

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
import static org.example.toylanguage.expression.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Integer;

public class FunctionExpression_findClassDefinitionContainingFunction_7154756803 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129;
     Object term146;
     Object term247;

    public FunctionExpression_findClassDefinitionContainingFunction_7154756803() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term142 = new ArrayList();
        ((ArrayList) term142).add((Object)null);
        ((ArrayList) term142).add((Object)null);
        ((ArrayList) term142).add((Object)null);
        ((ArrayList) term142).add((Object)null);
        ((ArrayList) term142).add((Object)null);
        term129 = newInstance(Class.forName("org.example.toylanguage.expression.FunctionExpression"));
        setField(term129, term129.getClass(), "name", "xOEqzGAmDU");
        setField(term129, term129.getClass(), "argumentExpressions", term142);
        ArrayList term160 = new ArrayList();
        HashMap term165 = new HashMap();
        Set<Object> term269 =  ((Map) term165).keySet();
        HashSet term164 = new HashSet((Collection<? extends Object>) term269);
        Integer term192 = new Integer(1162663216);
        ArrayList term188 = new ArrayList();
        ((ArrayList) term188).add((Object)null);
        ((ArrayList) term188).add((Object)null);
        ((ArrayList) term188).add((Object)null);
        ((ArrayList) term188).add((Object)null);
        ((ArrayList) term188).add((Object)null);
        ((ArrayList) term188).add((Object)null);
        ((ArrayList) term188).add((Object)null);
        HashMap term208 = new HashMap();
        Set<Object> term280 =  ((Map) term208).keySet();
        HashSet term207 = new HashSet((Collection<? extends Object>) term280);
        HashMap term215 = new HashMap();
        Set<Object> term281 =  ((Map) term215).keySet();
        HashSet term214 = new HashSet((Collection<? extends Object>) term281);
        HashMap term223 = new HashMap();
        Set<Object> term282 =  ((Map) term223).keySet();
        HashSet term222 = new HashSet((Collection<? extends Object>) term282);
        HashMap term229 = new HashMap();
        Set<Object> term283 =  ((Map) term229).keySet();
        HashSet term228 = new HashSet((Collection<? extends Object>) term283);
        term146 = newInstance(Class.forName("org.example.toylanguage.context.definition.ClassDefinition"));
        Object term147 = newInstance(Class.forName("org.example.toylanguage.context.definition.ClassDetails"));
        Object term185 = newInstance(Class.forName("org.example.toylanguage.statement.ClassStatement"));
        Object term206 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        Object term221 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        Object term234 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        setField(term147, term147.getClass(), "name", "eZFUvlxvGV");
        setField(term147, term147.getClass(), "properties", term160);
        setField(term146, term146.getClass(), "classDetails", term147);
        setField(term146, term146.getClass(), "baseTypes", term164);
        setField(term185, term185.getClass(), "rowNumber", term192);
        setField(term185, term185.getClass(), "statements2Execute", term188);
        setField(term185, term185.getClass(), "blockName", "fhkbdRViHi");
        setField(term146, term146.getClass(), "statement", term185);
        setField(term206, term206.getClass(), "classes", term207);
        setField(term206, term206.getClass(), "functions", term214);
        setField(term221, term221.getClass(), "classes", term222);
        setField(term221, term221.getClass(), "functions", term228);
        setField(term234, term234.getClass(), "classes", null);
        setField(term234, term234.getClass(), "functions", null);
        setField(term234, term234.getClass(), "parent", null);
        setField(term221, term221.getClass(), "parent", term234);
        setField(term206, term206.getClass(), "parent", term221);
        setField(term146, term146.getClass(), "definitionScope", term206);
        term247 = new Integer(568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.expression.FunctionExpression");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.example.toylanguage.context.definition.ClassDefinition");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term146;
        args[1] = "oVgzLbrsFr";
        args[2] = term247;
        callMethod(klass, "findClassDefinitionContainingFunction", argTypes, term129, args);
    }

};


