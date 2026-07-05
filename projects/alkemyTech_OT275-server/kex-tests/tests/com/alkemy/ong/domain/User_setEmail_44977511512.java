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

public class User_setEmail_44977511512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21683;

    public User_setEmail_44977511512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term21684 = new Long(6320559761926095887L);
        Long term21747 = new Long(5067793047038594982L);
        term21683 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term21746 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        setField(term21683, term21683.getClass(), "id", term21684);
        setField(term21683, term21683.getClass(), "firstName", "OYJvKAMFEk");
        setField(term21683, term21683.getClass(), "lastName", "puNAveVBkA");
        setField(term21683, term21683.getClass(), "email", "BcZKUIbuQL");
        setField(term21683, term21683.getClass(), "password", "YvjPnZyRnw");
        setField(term21683, term21683.getClass(), "imageUrl", "IKmMfqFPku");
        setField(term21746, term21746.getClass(), "id", term21747);
        setField(term21746, term21746.getClass(), "name", "NACnGDmVPl");
        setField(term21746, term21746.getClass(), "description", "SfWiFjkLGW");
        setField(term21683, term21683.getClass(), "role", term21746);
        setField(term21683, term21683.getClass(), "token", "urBahuOkUQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zHcZrTMdOT";
        callMethod(klass, "setEmail", argTypes, term21683, args);
    }

};


