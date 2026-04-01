package org.openRealmOfStars.utilities.repository;

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
import static org.openRealmOfStars.utilities.repository.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class RouteRepository_restoreRoute_3093328852 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45;
     Object term46;

    public RouteRepository_restoreRoute_3093328852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45 = newInstance(Class.forName("org.openRealmOfStars.utilities.repository.RouteRepository"));
        term46 = newInstance(Class.forName("java.io.DataInputStream"));
        byte[] term47 = (byte[]) newByteArray(4);
        char[] term52 = (char[]) newCharArray(1);
        byte[] term54 = (byte[]) newByteArray(6);
        char[] term61 = (char[]) newCharArray(2);
        setByteElement(term47, 0, (byte) 79);
        setByteElement(term47, 1, (byte) -119);
        setByteElement(term47, 2, (byte) -66);
        setByteElement(term47, 3, (byte) 83);
        setField(term46, term46.getClass(), "bytearr", term47);
        setCharElement(term52, 0, 'P');
        setField(term46, term46.getClass(), "chararr", term52);
        setByteElement(term54, 0, (byte) 74);
        setByteElement(term54, 1, (byte) -71);
        setByteElement(term54, 2, (byte) 49);
        setByteElement(term54, 3, (byte) -54);
        setByteElement(term54, 4, (byte) 67);
        setByteElement(term54, 5, (byte) 78);
        setField(term46, term46.getClass(), "readBuffer", term54);
        setCharElement(term61, 0, 'A');
        setCharElement(term61, 1, 'E');
        setField(term46, term46.getClass(), "lineBuffer", term61);
        setField(term46, term46.getClass(), "in", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.utilities.repository.RouteRepository");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.DataInputStream");
        Object[] args = new Object[1];
        args[0] = term46;
        callMethod(klass, "restoreRoute", argTypes, term45, args);
    }

};


