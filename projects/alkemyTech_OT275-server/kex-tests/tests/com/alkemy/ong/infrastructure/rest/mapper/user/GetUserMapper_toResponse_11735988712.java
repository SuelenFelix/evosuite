package com.alkemy.ong.infrastructure.rest.mapper.user;

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
import static com.alkemy.ong.infrastructure.rest.mapper.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Long;

public class GetUserMapper_toResponse_11735988712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1119;
     Object term1120;

    public GetUserMapper_toResponse_11735988712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1119 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.user.GetUserMapper"));
        Long term1124 = new Long(-6573104506744284592L);
        Long term1187 = new Long(-4920224193275732920L);
        Object term1123 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term1186 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        setField(term1123, term1123.getClass(), "id", term1124);
        setField(term1123, term1123.getClass(), "firstName", "OWKQODBLzb");
        setField(term1123, term1123.getClass(), "lastName", "wGmYcqUkgE");
        setField(term1123, term1123.getClass(), "email", "idgaQsnJpQ");
        setField(term1123, term1123.getClass(), "password", "VgZnGoIFwQ");
        setField(term1123, term1123.getClass(), "imageUrl", "jUbSRrkrYZ");
        setField(term1186, term1186.getClass(), "id", term1187);
        setField(term1186, term1186.getClass(), "name", "");
        setField(term1186, term1186.getClass(), "description", "");
        setField(term1123, term1123.getClass(), "role", term1186);
        setField(term1123, term1123.getClass(), "token", "LvJFtLBaxj");
        Long term1205 = new Long(8428634514691209827L);
        Long term1213 = new Long(-2585684163342970173L);
        Object term1204 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term1212 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        setField(term1204, term1204.getClass(), "id", term1205);
        setField(term1204, term1204.getClass(), "firstName", "");
        setField(term1204, term1204.getClass(), "lastName", "");
        setField(term1204, term1204.getClass(), "email", "");
        setField(term1204, term1204.getClass(), "password", "");
        setField(term1204, term1204.getClass(), "imageUrl", "");
        setField(term1212, term1212.getClass(), "id", term1213);
        setField(term1212, term1212.getClass(), "name", null);
        setField(term1212, term1212.getClass(), "description", null);
        setField(term1204, term1204.getClass(), "role", term1212);
        setField(term1204, term1204.getClass(), "token", "");
        Long term1218 = new Long(8059786003080744426L);
        Object term1217 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        setField(term1217, term1217.getClass(), "id", term1218);
        setField(term1217, term1217.getClass(), "firstName", null);
        setField(term1217, term1217.getClass(), "lastName", null);
        setField(term1217, term1217.getClass(), "email", null);
        setField(term1217, term1217.getClass(), "password", null);
        setField(term1217, term1217.getClass(), "imageUrl", null);
        setField(term1217, term1217.getClass(), "role", null);
        setField(term1217, term1217.getClass(), "token", null);
        term1120 = new LinkedList();
        ((LinkedList) term1120).add(term1123);
        ((LinkedList) term1120).add(term1204);
        ((LinkedList) term1120).add(term1217);
        ((LinkedList) term1120).add((Object)null);
        ((LinkedList) term1120).add((Object)null);
        ((LinkedList) term1120).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.user.GetUserMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1120;
        callMethod(klass, "toResponse", argTypes, term1119, args);
    }

};


