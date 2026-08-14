package io.github.isuru89.sbpatch.dto;

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
import static io.github.isuru89.sbpatch.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Object;

public class UserDTO_getUpdatedAt_3011938848 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3138;

    public UserDTO_getUpdatedAt_3011938848() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3139 = new Long(5953383087795962419L);
        Object term3191 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term3191, term3191.getClass(), "email", "");
        Object term3193 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term3193, term3193.getClass(), "email", "");
        ArrayList term3189 = new ArrayList();
        ((ArrayList) term3189).add(term3191);
        ((ArrayList) term3189).add(term3193);
        Long term3197 = new Long(7994303628307559416L);
        Long term3199 = new Long(2443640364875054177L);
        term3138 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.UserDTO"));
        setField(term3138, term3138.getClass(), "id", term3139);
        setField(term3138, term3138.getClass(), "userName", "tXfQjSqDzN");
        setField(term3138, term3138.getClass(), "firstName", "BjugTaMcxJ");
        setField(term3138, term3138.getClass(), "lastName", "vGiuZVPJNH");
        setField(term3138, term3138.getClass(), "primaryEmail", "tlzpzIjMib");
        setField(term3138, term3138.getClass(), "secondaryEmails", term3189);
        setField(term3138, term3138.getClass(), "createdAt", term3197);
        setField(term3138, term3138.getClass(), "updatedAt", term3199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.isuru89.sbpatch.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdatedAt", argTypes, term3138, args);
    }

};


