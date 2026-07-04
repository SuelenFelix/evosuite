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

public class FacilityRoom_setFacilityid_909643983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38888;
     Object term38893;

    public FacilityRoom_setFacilityid_909643983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term38889 = new Integer(-1411058034);
        Integer term38891 = new Integer(-144155597);
        term38888 = newInstance(Class.forName("com.org.model.FacilityRoom"));
        setField(term38888, term38888.getClass(), "facilityid", term38889);
        setField(term38888, term38888.getClass(), "roomid", term38891);
        term38893 = new Integer(-996670851);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.FacilityRoom");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term38893;
        callMethod(klass, "setFacilityid", argTypes, term38888, args);
    }

};


