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

public class FunctionDefinition_getStatement_18622567602 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term646;

    public FunctionDefinition_getStatement_18622567602() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term660 = new ArrayList();
        ((ArrayList) term660).add("");
        ((ArrayList) term660).add("");
        ((ArrayList) term660).add("");
        ((ArrayList) term660).add("");
        ArrayList term669 = new ArrayList();
        ((ArrayList) term669).add((Object)null);
        ((ArrayList) term669).add((Object)null);
        ((ArrayList) term669).add((Object)null);
        Integer term673 = new Integer(1358829571);
        HashMap term689 = new HashMap();
        Set<Object> term723 =  ((Map) term689).keySet();
        HashSet term688 = new HashSet((Collection<? extends Object>) term723);
        HashMap term696 = new HashMap();
        Set<Object> term724 =  ((Map) term696).keySet();
        HashSet term695 = new HashSet((Collection<? extends Object>) term724);
        term646 = newInstance(Class.forName("org.example.toylanguage.context.definition.FunctionDefinition"));
        Object term647 = newInstance(Class.forName("org.example.toylanguage.context.definition.FunctionDetails"));
        Object term668 = newInstance(Class.forName("org.example.toylanguage.statement.FunctionStatement"));
        Object term687 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        Object term702 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        setField(term647, term647.getClass(), "name", "MzXzaqaiHW");
        setField(term647, term647.getClass(), "arguments", term660);
        setField(term646, term646.getClass(), "details", term647);
        setField(term668, term668.getClass(), "statements2Execute", term669);
        setField(term668, term668.getClass(), "rowNumber", term673);
        setField(term668, term668.getClass(), "blockName", "BrWqhEIUUj");
        setField(term646, term646.getClass(), "statement", term668);
        setField(term687, term687.getClass(), "classes", term688);
        setField(term687, term687.getClass(), "functions", term695);
        setField(term702, term702.getClass(), "classes", null);
        setField(term702, term702.getClass(), "functions", null);
        setField(term702, term702.getClass(), "parent", null);
        setField(term687, term687.getClass(), "parent", term702);
        setField(term646, term646.getClass(), "definitionScope", term687);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.context.definition.FunctionDefinition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatement", argTypes, term646, args);
    }

};


