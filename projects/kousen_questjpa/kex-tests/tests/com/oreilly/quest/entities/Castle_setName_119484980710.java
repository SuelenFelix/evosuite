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

public class Castle_setName_119484980710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8570;

    public Castle_setName_119484980710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term8571 = new Long(1672578078364590450L);
        HashMap term8612 = new HashMap();
        Set<Object> term8659 =  ((Map) term8612).keySet();
        HashSet term8611 = new HashSet((Collection<? extends Object>) term8659);
        term8570 = newInstance(Class.forName("com.oreilly.quest.entities.Castle"));
        setField(term8570, term8570.getClass(), "id", term8571);
        setField(term8570, term8570.getClass(), "name", "VYkqXKVlAJ");
        setField(term8570, term8570.getClass(), "city", "XkIoWJRNwN");
        setField(term8570, term8570.getClass(), "state", "aNWLJdrZMq");
        setDoubleField(term8570, term8570.getClass(), "latitude", 0.7591353014991907);
        setDoubleField(term8570, term8570.getClass(), "longitude", 0.791695029600875);
        setField(term8570, term8570.getClass(), "knights", term8611);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Castle");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HHmNoYxIGj";
        callMethod(klass, "setName", argTypes, term8570, args);
    }

};


