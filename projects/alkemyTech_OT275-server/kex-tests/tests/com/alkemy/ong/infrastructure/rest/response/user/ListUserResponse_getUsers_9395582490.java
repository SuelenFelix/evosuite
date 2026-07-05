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

public class ListUserResponse_getUsers_9395582490 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4235;

    public ListUserResponse_getUsers_9395582490() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4239 = new Long(8059786003080744426L);
        Object term4238 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.user.GetUserResponse"));
        setField(term4238, term4238.getClass(), "id", term4239);
        setField(term4238, term4238.getClass(), "firstName", "");
        setField(term4238, term4238.getClass(), "lastName", "");
        setField(term4238, term4238.getClass(), "email", "");
        setField(term4238, term4238.getClass(), "role", "");
        Long term4246 = new Long(-4365849114644724155L);
        Object term4245 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.user.GetUserResponse"));
        setField(term4245, term4245.getClass(), "id", term4246);
        setField(term4245, term4245.getClass(), "firstName", "");
        setField(term4245, term4245.getClass(), "lastName", "");
        setField(term4245, term4245.getClass(), "email", "");
        setField(term4245, term4245.getClass(), "role", "");
        Long term4253 = new Long(2486810210675247493L);
        Object term4252 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.user.GetUserResponse"));
        setField(term4252, term4252.getClass(), "id", term4253);
        setField(term4252, term4252.getClass(), "firstName", "");
        setField(term4252, term4252.getClass(), "lastName", "");
        setField(term4252, term4252.getClass(), "email", "");
        setField(term4252, term4252.getClass(), "role", "");
        Long term4260 = new Long(7009926388951271268L);
        Object term4259 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.user.GetUserResponse"));
        setField(term4259, term4259.getClass(), "id", term4260);
        setField(term4259, term4259.getClass(), "firstName", "");
        setField(term4259, term4259.getClass(), "lastName", "");
        setField(term4259, term4259.getClass(), "email", "");
        setField(term4259, term4259.getClass(), "role", "");
        Long term4267 = new Long(-7672528020740371001L);
        Object term4266 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.user.GetUserResponse"));
        setField(term4266, term4266.getClass(), "id", term4267);
        setField(term4266, term4266.getClass(), "firstName", "");
        setField(term4266, term4266.getClass(), "lastName", "");
        setField(term4266, term4266.getClass(), "email", "");
        setField(term4266, term4266.getClass(), "role", "");
        ArrayList term4236 = new ArrayList();
        ((ArrayList) term4236).add(term4238);
        ((ArrayList) term4236).add(term4245);
        ((ArrayList) term4236).add(term4252);
        ((ArrayList) term4236).add(term4259);
        ((ArrayList) term4236).add(term4266);
        term4235 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.user.ListUserResponse"));
        setField(term4235, term4235.getClass(), "users", term4236);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.user.ListUserResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsers", argTypes, term4235, args);
    }

};


