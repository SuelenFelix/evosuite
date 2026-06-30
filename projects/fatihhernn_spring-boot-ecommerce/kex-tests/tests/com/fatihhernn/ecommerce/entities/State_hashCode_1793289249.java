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

public class State_hashCode_1793289249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term746;

    public State_hashCode_1793289249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term788 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        setIntField(term788, term788.getClass(), "id", -1801760683);
        setField(term788, term788.getClass(), "name", null);
        setField(term788, term788.getClass(), "country", null);
        Object term790 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        setIntField(term790, term790.getClass(), "id", 890669485);
        setField(term790, term790.getClass(), "name", null);
        setField(term790, term790.getClass(), "country", null);
        Object term792 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        setIntField(term792, term792.getClass(), "id", 1386130016);
        setField(term792, term792.getClass(), "name", null);
        setField(term792, term792.getClass(), "country", null);
        Object term794 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        setIntField(term794, term794.getClass(), "id", 906181092);
        setField(term794, term794.getClass(), "name", null);
        setField(term794, term794.getClass(), "country", null);
        ArrayList term786 = new ArrayList();
        ((ArrayList) term786).add(term788);
        ((ArrayList) term786).add(term790);
        ((ArrayList) term786).add(term792);
        ((ArrayList) term786).add(term790);
        ((ArrayList) term786).add(term794);
        term746 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        Object term760 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term746, term746.getClass(), "id", -341962980);
        setField(term746, term746.getClass(), "name", "DbiCVtPPCT");
        setIntField(term760, term760.getClass(), "id", 1532716628);
        setField(term760, term760.getClass(), "code", "WzFopsaDuG");
        setField(term760, term760.getClass(), "name", "PapWxkhEWe");
        setField(term760, term760.getClass(), "states", term786);
        setField(term746, term746.getClass(), "country", term760);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.State");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term746, args);
    }

};


