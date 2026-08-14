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

public class FunctionDefinition_getDetails_13901940121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term562;

    public FunctionDefinition_getDetails_13901940121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term576 = new ArrayList();
        ((ArrayList) term576).add("");
        ((ArrayList) term576).add("");
        ((ArrayList) term576).add("");
        ((ArrayList) term576).add("");
        ((ArrayList) term576).add("");
        ((ArrayList) term576).add("");
        ((ArrayList) term576).add("");
        ((ArrayList) term576).add("");
        ((ArrayList) term576).add("");
        ArrayList term590 = new ArrayList();
        ((ArrayList) term590).add((Object)null);
        ((ArrayList) term590).add((Object)null);
        ((ArrayList) term590).add((Object)null);
        ((ArrayList) term590).add((Object)null);
        ((ArrayList) term590).add((Object)null);
        ((ArrayList) term590).add((Object)null);
        ((ArrayList) term590).add((Object)null);
        ((ArrayList) term590).add((Object)null);
        Integer term594 = new Integer(-243422082);
        HashMap term610 = new HashMap();
        Set<Object> term644 =  ((Map) term610).keySet();
        HashSet term609 = new HashSet((Collection<? extends Object>) term644);
        HashMap term617 = new HashMap();
        Set<Object> term645 =  ((Map) term617).keySet();
        HashSet term616 = new HashSet((Collection<? extends Object>) term645);
        term562 = newInstance(Class.forName("org.example.toylanguage.context.definition.FunctionDefinition"));
        Object term563 = newInstance(Class.forName("org.example.toylanguage.context.definition.FunctionDetails"));
        Object term589 = newInstance(Class.forName("org.example.toylanguage.statement.FunctionStatement"));
        Object term608 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        Object term623 = newInstance(Class.forName("org.example.toylanguage.context.definition.DefinitionScope"));
        setField(term563, term563.getClass(), "name", "YJhnPtWtJR");
        setField(term563, term563.getClass(), "arguments", term576);
        setField(term562, term562.getClass(), "details", term563);
        setField(term589, term589.getClass(), "statements2Execute", term590);
        setField(term589, term589.getClass(), "rowNumber", term594);
        setField(term589, term589.getClass(), "blockName", "JPUZuGxKlI");
        setField(term562, term562.getClass(), "statement", term589);
        setField(term608, term608.getClass(), "classes", term609);
        setField(term608, term608.getClass(), "functions", term616);
        setField(term623, term623.getClass(), "classes", null);
        setField(term623, term623.getClass(), "functions", null);
        setField(term623, term623.getClass(), "parent", null);
        setField(term608, term608.getClass(), "parent", term623);
        setField(term562, term562.getClass(), "definitionScope", term608);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.example.toylanguage.context.definition.FunctionDefinition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDetails", argTypes, term562, args);
    }

};


