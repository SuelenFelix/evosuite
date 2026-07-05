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

public class User_setToken_94380471216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22524;

    public User_setToken_94380471216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term22525 = new Long(1099634235456795888L);
        Long term22588 = new Long(5391189846186870864L);
        term22524 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term22587 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        setField(term22524, term22524.getClass(), "id", term22525);
        setField(term22524, term22524.getClass(), "firstName", "ExjdCvAxlG");
        setField(term22524, term22524.getClass(), "lastName", "moMySSiBuB");
        setField(term22524, term22524.getClass(), "email", "iuuazALDWB");
        setField(term22524, term22524.getClass(), "password", "GqehccUels");
        setField(term22524, term22524.getClass(), "imageUrl", "llbDGujrPe");
        setField(term22587, term22587.getClass(), "id", term22588);
        setField(term22587, term22587.getClass(), "name", "QEoeITwBfz");
        setField(term22587, term22587.getClass(), "description", "rWOKjAUIvS");
        setField(term22524, term22524.getClass(), "role", term22587);
        setField(term22524, term22524.getClass(), "token", "IcpfsIGlDf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xCfGcRdHTK";
        callMethod(klass, "setToken", argTypes, term22524, args);
    }

};


