package com.alkemy.ong.domain;

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
import static com.alkemy.ong.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class User_getFirstName_3596027422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19817;

    public User_getFirstName_3596027422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term19818 = new Long(-1234885562462779381L);
        Long term19881 = new Long(2678845111978352940L);
        term19817 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term19880 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        setField(term19817, term19817.getClass(), "id", term19818);
        setField(term19817, term19817.getClass(), "firstName", "TxymnVINZF");
        setField(term19817, term19817.getClass(), "lastName", "fkBfmixBEh");
        setField(term19817, term19817.getClass(), "email", "SWbairdDKL");
        setField(term19817, term19817.getClass(), "password", "AibUFEALwF");
        setField(term19817, term19817.getClass(), "imageUrl", "eXOUrXTrdW");
        setField(term19880, term19880.getClass(), "id", term19881);
        setField(term19880, term19880.getClass(), "name", "aomDEETHep");
        setField(term19880, term19880.getClass(), "description", "GTMrlIYfIM");
        setField(term19817, term19817.getClass(), "role", term19880);
        setField(term19817, term19817.getClass(), "token", "eiDqCOWbLE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstName", argTypes, term19817, args);
    }

};


