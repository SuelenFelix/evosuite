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

public class Contact_getEmail_17816053144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11005;

    public Contact_getEmail_17816053144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11006 = new Long(-7283193381993602128L);
        term11005 = newInstance(Class.forName("com.alkemy.ong.domain.Contact"));
        setField(term11005, term11005.getClass(), "id", term11006);
        setField(term11005, term11005.getClass(), "name", "VoKhXiLAaW");
        setField(term11005, term11005.getClass(), "phone", "CaalXzRXQI");
        setField(term11005, term11005.getClass(), "email", "eRBnKPjyVg");
        setField(term11005, term11005.getClass(), "message", "svPqsHBvrm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Contact");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term11005, args);
    }

};


