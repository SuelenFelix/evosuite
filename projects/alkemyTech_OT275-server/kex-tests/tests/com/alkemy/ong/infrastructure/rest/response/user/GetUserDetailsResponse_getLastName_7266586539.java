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

public class GetUserDetailsResponse_getLastName_7266586539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1017;

    public GetUserDetailsResponse_getLastName_7266586539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1018 = new Long(6967924379644551255L);
        term1017 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.user.GetUserDetailsResponse"));
        setField(term1017, term1017.getClass(), "id", term1018);
        setField(term1017, term1017.getClass(), "firstName", "GzFkzHGYFt");
        setField(term1017, term1017.getClass(), "lastName", "tShwQLRGNe");
        setField(term1017, term1017.getClass(), "email", "LvtrsXUliU");
        setField(term1017, term1017.getClass(), "imageUrl", "xLbjWUgOIL");
        setField(term1017, term1017.getClass(), "role", "jDtqGUpnZN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.user.GetUserDetailsResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastName", argTypes, term1017, args);
    }

};


