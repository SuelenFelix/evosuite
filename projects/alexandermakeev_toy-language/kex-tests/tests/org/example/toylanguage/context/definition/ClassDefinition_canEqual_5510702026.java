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

public class ClassDefinition_canEqual_5510702026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1796;
     Object term1888;

    public ClassDefinition_canEqual_5510702026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1810 = new ArrayList();
        ((ArrayList) term1810).add("");
        ((ArrayList) term1810).add("");
        ((ArrayList) term1810).add("");
        ((ArrayList) term1810).add("");
        ((ArrayList) term1810).add("");
        HashMap term1820 = new HashMap();
        Set<Object> term1899 =  ((Map) term1820).keySet();
        HashSet term1819 = new HashSet((Collection<? extends Object>) term1899);
        Integer term1843 = new Integer(-1351605385);
        ArrayList term1839 = new ArrayList();
        ((ArrayList) term1839).add((Object)null);
        HashMap term1859 = new HashMap();
        Set<Object> term1910 =  ((Map) term1859).keySet();
        HashSet term1858 = new HashSet((Collection<? extends Object>) term1910);
        HashMap term1866 = new HashMap();
        Set<Object> term1911 =  ((Map) term1866).keySet();
        HashSet term1865 = new HashSet((Collection<? extends Object>) term1911);
        HashMap term1873 = new HashMap();
        Set<Object> term1912 =  ((Map) term1873).keySet();
        HashSet term1872 = new HashSet((Collection<? extends Object>) term1912);
        HashMap term1879 = new HashMap();
        Set<Object> term1913 =  ((Map) term1879).keySet();
        HashSet term1878 = new HashSet((Collection<? extends Object>) term1913);
        HashSet term1885 = new HashSet();
        HashSet term1886 = new HashSet();
        term1796 = newInstance(Class.forName("org.example.toylanguage.context.definition.ClassDefinition"));
        Object term1797 = newInstance(Class.forName("org.example.toylanguage.context.definition.ClassDetails"));
        Object term1836 = newInstance(Class.forName("org.example.toylanguage.statement.ClassStatement"));
        Object term1857 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        Object term1871 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        Object term1884 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        Object term1887 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        setField(term1797, term1797.getClass(), "name", "LPlTDoLrUy");
        setField(term1797, term1797.getClass(), "properties", term1810);
        setField(term1796, term1796.getClass(), "classDetails", term1797);
        setField(term1796, term1796.getClass(), "baseTypes", term1819);
        setField(term1836, term1836.getClass(), "rowNumber", term1843);
        setField(term1836, term1836.getClass(), "statements2Execute", term1839);
        setField(term1836, term1836.getClass(), "blockName", "DInvDrzBtt");
        setField(term1796, term1796.getClass(), "statement", term1836);
        setField(term1857, term1857.getClass(), "classes", term1858);
        setField(term1857, term1857.getClass(), "functions", term1865);
        setField(term1871, term1871.getClass(), "classes", term1872);
        setField(term1871, term1871.getClass(), "functions", term1878);
        setField(term1884, term1884.getClass(), "classes", term1885);
        setField(term1884, term1884.getClass(), "functions", term1886);
        setField(term1887, term1887.getClass(), "classes", null);
        setField(term1887, term1887.getClass(), "functions", null);
        setField(term1887, term1887.getClass(), "parent", null);
        setField(term1884, term1884.getClass(), "parent", term1887);
        setField(term1871, term1871.getClass(), "parent", term1884);
        setField(term1857, term1857.getClass(), "parent", term1871);
        setField(term1796, term1796.getClass(), "definitionScope", term1857);
        term1888 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.context.definition.ClassDefinition");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1888;
        callMethod(klass, "canEqual", argTypes, term1796, args);
    }

};


