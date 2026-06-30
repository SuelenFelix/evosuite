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
import java.lang.Long;

public class GetUserDetailsResponse_setLastName_8596837873 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251;

    public GetUserDetailsResponse_setLastName_8596837873() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term252 = new Long(-8400487765614892086L);
        term251 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.user.GetUserDetailsResponse"));
        setField(term251, term251.getClass(), "id", term252);
        setField(term251, term251.getClass(), "firstName", "uuaPigETmJ");
        setField(term251, term251.getClass(), "lastName", "MxlszYVzRf");
        setField(term251, term251.getClass(), "email", "LQFpaHEwXR");
        setField(term251, term251.getClass(), "imageUrl", "oVcInYnLWB");
        setField(term251, term251.getClass(), "role", "aJlieCFVtF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.user.GetUserDetailsResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZiaGIbnzTs";
        callMethod(klass, "setLastName", argTypes, term251, args);
    }

};


