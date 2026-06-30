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
import java.lang.Integer;

public class State_setId_16063738524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term243;
     Object term299;

    public State_setId_16063738524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term285 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        setIntField(term285, term285.getClass(), "id", -1145578966);
        setField(term285, term285.getClass(), "name", null);
        setField(term285, term285.getClass(), "country", null);
        Object term287 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        setIntField(term287, term287.getClass(), "id", 1876565163);
        setField(term287, term287.getClass(), "name", null);
        setField(term287, term287.getClass(), "country", null);
        Object term289 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        setIntField(term289, term289.getClass(), "id", 0);
        setField(term289, term289.getClass(), "name", null);
        setField(term289, term289.getClass(), "country", null);
        Object term291 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        setIntField(term291, term291.getClass(), "id", 0);
        setField(term291, term291.getClass(), "name", null);
        setField(term291, term291.getClass(), "country", null);
        Object term293 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        setIntField(term293, term293.getClass(), "id", 0);
        setField(term293, term293.getClass(), "name", null);
        setField(term293, term293.getClass(), "country", null);
        Object term295 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        setIntField(term295, term295.getClass(), "id", 1962444399);
        setField(term295, term295.getClass(), "name", null);
        setField(term295, term295.getClass(), "country", null);
        ArrayList term283 = new ArrayList();
        ((ArrayList) term283).add(term285);
        ((ArrayList) term283).add(term287);
        ((ArrayList) term283).add(term289);
        ((ArrayList) term283).add(term291);
        ((ArrayList) term283).add(term293);
        ((ArrayList) term283).add(term295);
        ((ArrayList) term283).add(term287);
        ((ArrayList) term283).add(term291);
        term243 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        Object term257 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term243, term243.getClass(), "id", -1530420153);
        setField(term243, term243.getClass(), "name", "onpbIeEKoi");
        setIntField(term257, term257.getClass(), "id", -469968304);
        setField(term257, term257.getClass(), "code", "YRHGsAkhxb");
        setField(term257, term257.getClass(), "name", "ffYhPOzlUs");
        setField(term257, term257.getClass(), "states", term283);
        setField(term243, term243.getClass(), "country", term257);
        term299 = new Integer(-1016503459);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.State");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term299;
        callMethod(klass, "setId", argTypes, term243, args);
    }

};


