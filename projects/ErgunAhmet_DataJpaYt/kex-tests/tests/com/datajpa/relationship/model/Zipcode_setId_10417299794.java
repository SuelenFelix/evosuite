package com.datajpa.relationship.model;

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
import static com.datajpa.relationship.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class Zipcode_setId_10417299794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1721;
     Object term1751;

    public Zipcode_setId_10417299794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1722 = new Long(4474998035090263139L);
        Long term1737 = new Long(2848819812340321742L);
        term1721 = newInstance(Class.forName("com.datajpa.relationship.model.Zipcode"));
        Object term1736 = newInstance(Class.forName("com.datajpa.relationship.model.City"));
        setField(term1721, term1721.getClass(), "id", term1722);
        setField(term1721, term1721.getClass(), "name", "jSpAteRute");
        setField(term1736, term1736.getClass(), "id", term1737);
        setField(term1736, term1736.getClass(), "name", "swZVeJAxjt");
        setField(term1721, term1721.getClass(), "city", term1736);
        term1751 = new Long(-8876856890348836498L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.model.Zipcode");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term1751;
        callMethod(klass, "setId", argTypes, term1721, args);
    }

};


