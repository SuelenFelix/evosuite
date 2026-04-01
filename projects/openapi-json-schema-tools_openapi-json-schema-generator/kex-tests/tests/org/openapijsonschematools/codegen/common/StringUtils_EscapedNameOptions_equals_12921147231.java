package org.openapijsonschematools.codegen.common;

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
import static org.openapijsonschematools.codegen.common.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;

public class StringUtils_EscapedNameOptions_equals_12921147231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13139;
     Object term13263;

    public StringUtils_EscapedNameOptions_equals_12921147231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term13165 = new HashMap();
        Set<Object> term13284 =  ((Map) term13165).keySet();
        HashSet term13164 = new HashSet((Collection<? extends Object>) term13284);
        ArrayList term13175 = new ArrayList();
        ((ArrayList) term13175).add("kuTXqwMtDB");
        ((ArrayList) term13175).add("Ghbwtircqb");
        ((ArrayList) term13175).add("xrwlQZdwCp");
        ((ArrayList) term13175).add("IDCWpPLRkE");
        ((ArrayList) term13175).add("nyiiPDVjAc");
        ((ArrayList) term13175).add("aKnKipADSo");
        ((ArrayList) term13175).add("wSQxaModmm");
        term13139 = newInstance(Class.forName("org.openapijsonschematools.codegen.common.StringUtils$EscapedNameOptions"));
        setField(term13139, term13139.getClass(), "name", "OWDIEULEFu");
        setField(term13139, term13139.getClass(), "appendToReplacement", "dWRymuLBtr");
        setField(term13139, term13139.getClass(), "specialChars", term13164);
        setField(term13139, term13139.getClass(), "charactersToAllow", term13175);
        term13263 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.common.StringUtils$EscapedNameOptions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term13263;
        callMethod(klass, "equals", argTypes, term13139, args);
    }

};


