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

public class User_setLastName_136940139611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21479;

    public User_setLastName_136940139611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term21480 = new Long(8202413349907503373L);
        Long term21543 = new Long(4715419421865334491L);
        term21479 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term21542 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        setField(term21479, term21479.getClass(), "id", term21480);
        setField(term21479, term21479.getClass(), "firstName", "PxGAOnzJzj");
        setField(term21479, term21479.getClass(), "lastName", "fQVSHtJlDS");
        setField(term21479, term21479.getClass(), "email", "CGdXCWNTxp");
        setField(term21479, term21479.getClass(), "password", "TUBgEnrcjn");
        setField(term21479, term21479.getClass(), "imageUrl", "eUhEGNLBOk");
        setField(term21542, term21542.getClass(), "id", term21543);
        setField(term21542, term21542.getClass(), "name", "UrLisdyvVs");
        setField(term21542, term21542.getClass(), "description", "VckRXyiShh");
        setField(term21479, term21479.getClass(), "role", term21542);
        setField(term21479, term21479.getClass(), "token", "ZKwDTklKHb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tQMlnMStsQ";
        callMethod(klass, "setLastName", argTypes, term21479, args);
    }

};


