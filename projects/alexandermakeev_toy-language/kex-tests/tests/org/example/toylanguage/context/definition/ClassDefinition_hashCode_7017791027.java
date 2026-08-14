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

public class ClassDefinition_hashCode_7017791027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1914;

    public ClassDefinition_hashCode_7017791027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1928 = new ArrayList();
        ((ArrayList) term1928).add("");
        ((ArrayList) term1928).add("");
        ((ArrayList) term1928).add("");
        ((ArrayList) term1928).add("");
        ((ArrayList) term1928).add("");
        ((ArrayList) term1928).add("");
        ((ArrayList) term1928).add("");
        HashMap term1940 = new HashMap();
        Set<Object> term2016 =  ((Map) term1940).keySet();
        HashSet term1939 = new HashSet((Collection<? extends Object>) term2016);
        Integer term1961 = new Integer(-1560631747);
        ArrayList term1957 = new ArrayList();
        ((ArrayList) term1957).add((Object)null);
        HashMap term1977 = new HashMap();
        Set<Object> term2027 =  ((Map) term1977).keySet();
        HashSet term1976 = new HashSet((Collection<? extends Object>) term2027);
        HashMap term1984 = new HashMap();
        Set<Object> term2028 =  ((Map) term1984).keySet();
        HashSet term1983 = new HashSet((Collection<? extends Object>) term2028);
        HashMap term1992 = new HashMap();
        Set<Object> term2029 =  ((Map) term1992).keySet();
        HashSet term1991 = new HashSet((Collection<? extends Object>) term2029);
        HashMap term1998 = new HashMap();
        Set<Object> term2030 =  ((Map) term1998).keySet();
        HashSet term1997 = new HashSet((Collection<? extends Object>) term2030);
        HashSet term2004 = new HashSet();
        HashSet term2005 = new HashSet();
        term1914 = newInstance(Class.forName("org.example.toylanguage.context.definition.ClassDefinition"));
        Object term1915 = newInstance(Class.forName("org.example.toylanguage.context.definition.ClassDetails"));
        Object term1954 = newInstance(Class.forName("org.example.toylanguage.statement.ClassStatement"));
        Object term1975 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        Object term1990 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        Object term2003 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        setField(term1915, term1915.getClass(), "name", "OzRiWLVXNx");
        setField(term1915, term1915.getClass(), "properties", term1928);
        setField(term1914, term1914.getClass(), "classDetails", term1915);
        setField(term1914, term1914.getClass(), "baseTypes", term1939);
        setField(term1954, term1954.getClass(), "rowNumber", term1961);
        setField(term1954, term1954.getClass(), "statements2Execute", term1957);
        setField(term1954, term1954.getClass(), "blockName", "fhdhDeWdoi");
        setField(term1914, term1914.getClass(), "statement", term1954);
        setField(term1975, term1975.getClass(), "classes", term1976);
        setField(term1975, term1975.getClass(), "functions", term1983);
        setField(term1990, term1990.getClass(), "classes", term1991);
        setField(term1990, term1990.getClass(), "functions", term1997);
        setField(term2003, term2003.getClass(), "classes", term2004);
        setField(term2003, term2003.getClass(), "functions", term2005);
        setField(term2003, term2003.getClass(), "parent", term2003);
        setField(term1990, term1990.getClass(), "parent", term2003);
        setField(term1975, term1975.getClass(), "parent", term1990);
        setField(term1914, term1914.getClass(), "definitionScope", term1975);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.context.definition.ClassDefinition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term1914, args);
    }

};


