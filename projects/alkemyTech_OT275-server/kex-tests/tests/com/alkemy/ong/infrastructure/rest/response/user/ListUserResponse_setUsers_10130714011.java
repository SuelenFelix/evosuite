package com.alkemy.ong.infrastructure.rest.response.user;

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
import static com.alkemy.ong.infrastructure.rest.response.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Long;
import java.util.LinkedList;

public class ListUserResponse_setUsers_10130714011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4275;
     Object term4308;

    public ListUserResponse_setUsers_10130714011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4279 = new Long(-4502405999831680926L);
        Object term4278 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.user.GetUserResponse"));
        setField(term4278, term4278.getClass(), "id", term4279);
        setField(term4278, term4278.getClass(), "firstName", "");
        setField(term4278, term4278.getClass(), "lastName", "");
        setField(term4278, term4278.getClass(), "email", "");
        setField(term4278, term4278.getClass(), "role", "");
        Long term4286 = new Long(1967728129628047933L);
        Object term4285 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.user.GetUserResponse"));
        setField(term4285, term4285.getClass(), "id", term4286);
        setField(term4285, term4285.getClass(), "firstName", "");
        setField(term4285, term4285.getClass(), "lastName", "");
        setField(term4285, term4285.getClass(), "email", "");
        setField(term4285, term4285.getClass(), "role", "");
        Long term4293 = new Long(2120084523938730454L);
        Object term4292 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.user.GetUserResponse"));
        setField(term4292, term4292.getClass(), "id", term4293);
        setField(term4292, term4292.getClass(), "firstName", "");
        setField(term4292, term4292.getClass(), "lastName", "");
        setField(term4292, term4292.getClass(), "email", "");
        setField(term4292, term4292.getClass(), "role", "");
        Long term4300 = new Long(6855071767938501807L);
        Object term4299 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.user.GetUserResponse"));
        setField(term4299, term4299.getClass(), "id", term4300);
        setField(term4299, term4299.getClass(), "firstName", "");
        setField(term4299, term4299.getClass(), "lastName", "");
        setField(term4299, term4299.getClass(), "email", "");
        setField(term4299, term4299.getClass(), "role", "");
        ArrayList term4276 = new ArrayList();
        ((ArrayList) term4276).add(term4278);
        ((ArrayList) term4276).add(term4285);
        ((ArrayList) term4276).add(term4292);
        ((ArrayList) term4276).add(term4299);
        term4275 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.user.ListUserResponse"));
        setField(term4275, term4275.getClass(), "users", term4276);
        term4308 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.user.ListUserResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term4308;
        callMethod(klass, "setUsers", argTypes, term4275, args);
    }

};


