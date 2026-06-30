package com.fatihhernn.ecommerce.entities;

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
import static com.fatihhernn.ecommerce.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class State_setCountry_11150352406 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term433;
     Object term481;

    public State_setCountry_11150352406() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term475 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        setIntField(term475, term475.getClass(), "id", 97029295);
        setField(term475, term475.getClass(), "name", null);
        setField(term475, term475.getClass(), "country", null);
        Object term477 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        setIntField(term477, term477.getClass(), "id", 0);
        setField(term477, term477.getClass(), "name", null);
        setField(term477, term477.getClass(), "country", null);
        ArrayList term473 = new ArrayList();
        ((ArrayList) term473).add(term475);
        ((ArrayList) term473).add(term477);
        term433 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        Object term447 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term433, term433.getClass(), "id", 1328271830);
        setField(term433, term433.getClass(), "name", "PkWMRdJcBb");
        setIntField(term447, term447.getClass(), "id", 1596070772);
        setField(term447, term447.getClass(), "code", "jSpAteRute");
        setField(term447, term447.getClass(), "name", "swZVeJAxjt");
        setField(term447, term447.getClass(), "states", term473);
        setField(term433, term433.getClass(), "country", term447);
        Object term509 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        Object term512 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term509, term509.getClass(), "id", 287287233);
        setField(term509, term509.getClass(), "name", "");
        setIntField(term512, term512.getClass(), "id", 962840079);
        setField(term512, term512.getClass(), "code", null);
        setField(term512, term512.getClass(), "name", null);
        setField(term512, term512.getClass(), "states", null);
        setField(term509, term509.getClass(), "country", term512);
        Object term514 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        Object term517 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term514, term514.getClass(), "id", 1240914516);
        setField(term514, term514.getClass(), "name", "");
        setIntField(term517, term517.getClass(), "id", 0);
        setField(term517, term517.getClass(), "code", null);
        setField(term517, term517.getClass(), "name", null);
        setField(term517, term517.getClass(), "states", null);
        setField(term514, term514.getClass(), "country", term517);
        Object term519 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        Object term522 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term519, term519.getClass(), "id", 1090617576);
        setField(term519, term519.getClass(), "name", "");
        setIntField(term522, term522.getClass(), "id", 0);
        setField(term522, term522.getClass(), "code", null);
        setField(term522, term522.getClass(), "name", null);
        setField(term522, term522.getClass(), "states", null);
        setField(term519, term519.getClass(), "country", term522);
        ArrayList term507 = new ArrayList();
        ((ArrayList) term507).add(term509);
        ((ArrayList) term507).add(term514);
        ((ArrayList) term507).add(term519);
        term481 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term481, term481.getClass(), "id", 933028652);
        setField(term481, term481.getClass(), "code", "vjxIhXHxGR");
        setField(term481, term481.getClass(), "name", "QXzGXbEXMu");
        setField(term481, term481.getClass(), "states", term507);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.State");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.fatihhernn.ecommerce.entities.Country");
        Object[] args = new Object[1];
        args[0] = term481;
        callMethod(klass, "setCountry", argTypes, term433, args);
    }

};


