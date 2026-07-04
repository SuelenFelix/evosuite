package com.org.model;

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
import static com.org.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class FacilityRoom_setRoomid_10009782024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38895;
     Object term38900;

    public FacilityRoom_setRoomid_10009782024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term38896 = new Integer(340642931);
        Integer term38898 = new Integer(-2018441502);
        term38895 = newInstance(Class.forName("com.org.model.FacilityRoom"));
        setField(term38895, term38895.getClass(), "facilityid", term38896);
        setField(term38895, term38895.getClass(), "roomid", term38898);
        term38900 = new Integer(-762480882);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.FacilityRoom");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term38900;
        callMethod(klass, "setRoomid", argTypes, term38895, args);
    }

};


