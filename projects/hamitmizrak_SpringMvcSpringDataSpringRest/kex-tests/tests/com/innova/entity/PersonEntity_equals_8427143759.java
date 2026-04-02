package com.innova.entity;

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
import static com.innova.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class PersonEntity_equals_8427143759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term253;
     Object term271;

    public PersonEntity_equals_8427143759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term254 = new Long(6967924379644551255L);
        term253 = newInstance(Class.forName("com.innova.entity.PersonEntity"));
        Object term269 = newInstance(Class.forName("java.util.Date"));
        setField(term253, term253.getClass(), "personId", term254);
        setField(term253, term253.getClass(), "personName", "RMFIsYGgne");
        setDoubleField(term253, term253.getClass(), "personPrice", 0.37773193782763337);
        setLongField(term269, term269.getClass(), "fastTime", 1500721068023L);
        setField(term269, term269.getClass(), "cdate", null);
        setField(term253, term253.getClass(), "date", term269);
        term271 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.entity.PersonEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term271;
        callMethod(klass, "equals", argTypes, term253, args);
    }

};


