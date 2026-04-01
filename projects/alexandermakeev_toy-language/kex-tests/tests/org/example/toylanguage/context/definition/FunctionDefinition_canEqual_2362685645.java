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

public class FunctionDefinition_canEqual_2362685645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term901;
     Object term975;

    public FunctionDefinition_canEqual_2362685645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term915 = new ArrayList();
        ((ArrayList) term915).add("");
        ((ArrayList) term915).add("");
        ((ArrayList) term915).add("");
        ((ArrayList) term915).add("");
        ((ArrayList) term915).add("");
        ((ArrayList) term915).add("");
        ((ArrayList) term915).add("");
        ((ArrayList) term915).add("");
        ((ArrayList) term915).add("");
        ArrayList term929 = new ArrayList();
        ((ArrayList) term929).add((Object)null);
        ((ArrayList) term929).add((Object)null);
        ((ArrayList) term929).add((Object)null);
        ((ArrayList) term929).add((Object)null);
        ((ArrayList) term929).add((Object)null);
        ((ArrayList) term929).add((Object)null);
        Integer term933 = new Integer(937859191);
        HashMap term949 = new HashMap();
        Set<Object> term996 =  ((Map) term949).keySet();
        HashSet term948 = new HashSet((Collection<? extends Object>) term996);
        HashMap term955 = new HashMap();
        Set<Object> term997 =  ((Map) term955).keySet();
        HashSet term954 = new HashSet((Collection<? extends Object>) term997);
        HashMap term963 = new HashMap();
        Set<Object> term998 =  ((Map) term963).keySet();
        HashSet term962 = new HashSet((Collection<? extends Object>) term998);
        HashMap term969 = new HashMap();
        Set<Object> term999 =  ((Map) term969).keySet();
        HashSet term968 = new HashSet((Collection<? extends Object>) term999);
        term901 = newInstance(Class.forName("org.example.toylanguage.context.definition.FunctionDefinition"));
        Object term902 = newInstance(Class.forName("org.example.toylanguage.context.definition.FunctionDetails"));
        Object term928 = newInstance(Class.forName("org.example.toylanguage.statement.FunctionStatement"));
        Object term947 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        Object term961 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        Object term974 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        setField(term902, term902.getClass(), "name", "jkzgCqWJrA");
        setField(term902, term902.getClass(), "arguments", term915);
        setField(term901, term901.getClass(), "details", term902);
        setField(term928, term928.getClass(), "statements2Execute", term929);
        setField(term928, term928.getClass(), "rowNumber", term933);
        setField(term928, term928.getClass(), "blockName", "rACmzcmIPm");
        setField(term901, term901.getClass(), "statement", term928);
        setField(term947, term947.getClass(), "classes", term948);
        setField(term947, term947.getClass(), "functions", term954);
        setField(term961, term961.getClass(), "classes", term962);
        setField(term961, term961.getClass(), "functions", term968);
        setField(term974, term974.getClass(), "classes", null);
        setField(term974, term974.getClass(), "functions", null);
        setField(term974, term974.getClass(), "parent", null);
        setField(term961, term961.getClass(), "parent", term974);
        setField(term947, term947.getClass(), "parent", term961);
        setField(term901, term901.getClass(), "definitionScope", term947);
        term975 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.context.definition.FunctionDefinition");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term975;
        callMethod(klass, "canEqual", argTypes, term901, args);
    }

};


