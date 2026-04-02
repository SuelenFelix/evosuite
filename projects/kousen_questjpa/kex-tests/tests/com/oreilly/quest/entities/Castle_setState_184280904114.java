package com.oreilly.quest.entities;

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
import static com.oreilly.quest.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Castle_setState_184280904114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8926;

    public Castle_setState_184280904114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8927 = new Long(-8033714905181142681L);
        HashMap term8968 = new HashMap();
        Set<Object> term9015 =  ((Map) term8968).keySet();
        HashSet term8967 = new HashSet((Collection<? extends Object>) term9015);
        term8926 = newInstance(Class.forName("com.oreilly.quest.entities.Castle"));
        setField(term8926, term8926.getClass(), "id", term8927);
        setField(term8926, term8926.getClass(), "name", "XYtryyobou");
        setField(term8926, term8926.getClass(), "city", "OYbzXylRWW");
        setField(term8926, term8926.getClass(), "state", "DSNsTGYXDF");
        setDoubleField(term8926, term8926.getClass(), "latitude", 0.5804948995371725);
        setDoubleField(term8926, term8926.getClass(), "longitude", 0.20737514139742264);
        setField(term8926, term8926.getClass(), "knights", term8967);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Castle");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sQvGcVjdEx";
        callMethod(klass, "setState", argTypes, term8926, args);
    }

};


