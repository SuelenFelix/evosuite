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

public class ClassDefinition_getStatement_15627381763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1481;

    public ClassDefinition_getStatement_15627381763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1495 = new ArrayList();
        ((ArrayList) term1495).add("");
        HashMap term1501 = new HashMap();
        Set<Object> term1578 =  ((Map) term1501).keySet();
        HashSet term1500 = new HashSet((Collection<? extends Object>) term1578);
        Integer term1522 = new Integer(-43417861);
        ArrayList term1518 = new ArrayList();
        HashMap term1538 = new HashMap();
        Set<Object> term1589 =  ((Map) term1538).keySet();
        HashSet term1537 = new HashSet((Collection<? extends Object>) term1589);
        HashMap term1545 = new HashMap();
        Set<Object> term1590 =  ((Map) term1545).keySet();
        HashSet term1544 = new HashSet((Collection<? extends Object>) term1590);
        HashMap term1553 = new HashMap();
        Set<Object> term1591 =  ((Map) term1553).keySet();
        HashSet term1552 = new HashSet((Collection<? extends Object>) term1591);
        HashMap term1559 = new HashMap();
        Set<Object> term1592 =  ((Map) term1559).keySet();
        HashSet term1558 = new HashSet((Collection<? extends Object>) term1592);
        HashSet term1565 = new HashSet();
        HashSet term1566 = new HashSet();
        term1481 = newInstance(Class.forName("org.example.toylanguage.context.definition.ClassDefinition"));
        Object term1482 = newInstance(Class.forName("org.example.toylanguage.context.definition.ClassDetails"));
        Object term1515 = newInstance(Class.forName("org.example.toylanguage.statement.ClassStatement"));
        Object term1536 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        Object term1551 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        Object term1564 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        Object term1567 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        setField(term1482, term1482.getClass(), "name", "zejWtMxJdV");
        setField(term1482, term1482.getClass(), "properties", term1495);
        setField(term1481, term1481.getClass(), "classDetails", term1482);
        setField(term1481, term1481.getClass(), "baseTypes", term1500);
        setField(term1515, term1515.getClass(), "rowNumber", term1522);
        setField(term1515, term1515.getClass(), "statements2Execute", term1518);
        setField(term1515, term1515.getClass(), "blockName", "dUXsPNSUez");
        setField(term1481, term1481.getClass(), "statement", term1515);
        setField(term1536, term1536.getClass(), "classes", term1537);
        setField(term1536, term1536.getClass(), "functions", term1544);
        setField(term1551, term1551.getClass(), "classes", term1552);
        setField(term1551, term1551.getClass(), "functions", term1558);
        setField(term1564, term1564.getClass(), "classes", term1565);
        setField(term1564, term1564.getClass(), "functions", term1566);
        setField(term1567, term1567.getClass(), "classes", null);
        setField(term1567, term1567.getClass(), "functions", null);
        setField(term1567, term1567.getClass(), "parent", null);
        setField(term1564, term1564.getClass(), "parent", term1567);
        setField(term1551, term1551.getClass(), "parent", term1564);
        setField(term1536, term1536.getClass(), "parent", term1551);
        setField(term1481, term1481.getClass(), "definitionScope", term1536);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.context.definition.ClassDefinition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatement", argTypes, term1481, args);
    }

};


