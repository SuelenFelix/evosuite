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

public class ClassDefinition_equals_2530924275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1681;
     Object term1770;

    public ClassDefinition_equals_2530924275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1695 = new ArrayList();
        ((ArrayList) term1695).add("");
        HashMap term1701 = new HashMap();
        Set<Object> term1781 =  ((Map) term1701).keySet();
        HashSet term1700 = new HashSet((Collection<? extends Object>) term1781);
        Integer term1724 = new Integer(803925431);
        ArrayList term1720 = new ArrayList();
        ((ArrayList) term1720).add((Object)null);
        ((ArrayList) term1720).add((Object)null);
        HashMap term1740 = new HashMap();
        Set<Object> term1792 =  ((Map) term1740).keySet();
        HashSet term1739 = new HashSet((Collection<? extends Object>) term1792);
        HashMap term1747 = new HashMap();
        Set<Object> term1793 =  ((Map) term1747).keySet();
        HashSet term1746 = new HashSet((Collection<? extends Object>) term1793);
        HashMap term1755 = new HashMap();
        Set<Object> term1794 =  ((Map) term1755).keySet();
        HashSet term1754 = new HashSet((Collection<? extends Object>) term1794);
        HashMap term1761 = new HashMap();
        Set<Object> term1795 =  ((Map) term1761).keySet();
        HashSet term1760 = new HashSet((Collection<? extends Object>) term1795);
        HashSet term1767 = new HashSet();
        HashSet term1768 = new HashSet();
        term1681 = newInstance(Class.forName("org.example.toylanguage.context.definition.ClassDefinition"));
        Object term1682 = newInstance(Class.forName("org.example.toylanguage.context.definition.ClassDetails"));
        Object term1717 = newInstance(Class.forName("org.example.toylanguage.statement.ClassStatement"));
        Object term1738 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        Object term1753 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        Object term1766 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        Object term1769 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        setField(term1682, term1682.getClass(), "name", "HGhIlMCaKM");
        setField(term1682, term1682.getClass(), "properties", term1695);
        setField(term1681, term1681.getClass(), "classDetails", term1682);
        setField(term1681, term1681.getClass(), "baseTypes", term1700);
        setField(term1717, term1717.getClass(), "rowNumber", term1724);
        setField(term1717, term1717.getClass(), "statements2Execute", term1720);
        setField(term1717, term1717.getClass(), "blockName", "AgQWngzXPH");
        setField(term1681, term1681.getClass(), "statement", term1717);
        setField(term1738, term1738.getClass(), "classes", term1739);
        setField(term1738, term1738.getClass(), "functions", term1746);
        setField(term1753, term1753.getClass(), "classes", term1754);
        setField(term1753, term1753.getClass(), "functions", term1760);
        setField(term1766, term1766.getClass(), "classes", term1767);
        setField(term1766, term1766.getClass(), "functions", term1768);
        setField(term1769, term1769.getClass(), "classes", null);
        setField(term1769, term1769.getClass(), "functions", null);
        setField(term1769, term1769.getClass(), "parent", null);
        setField(term1766, term1766.getClass(), "parent", term1769);
        setField(term1753, term1753.getClass(), "parent", term1766);
        setField(term1738, term1738.getClass(), "parent", term1753);
        setField(term1681, term1681.getClass(), "definitionScope", term1738);
        term1770 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.context.definition.ClassDefinition");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1770;
        callMethod(klass, "equals", argTypes, term1681, args);
    }

};


