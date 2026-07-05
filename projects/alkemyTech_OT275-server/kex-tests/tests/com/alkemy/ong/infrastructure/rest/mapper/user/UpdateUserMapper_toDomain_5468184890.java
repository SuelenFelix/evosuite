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

public class UpdateUserMapper_toDomain_5468184890 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term432;

    public UpdateUserMapper_toDomain_5468184890() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term432 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.user.UpdateUserRequest"));
        setField(term432, term432.getClass(), "firstName", "xLbjWUgOIL");
        setField(term432, term432.getClass(), "lastName", "jDtqGUpnZN");
        setField(term432, term432.getClass(), "imageUrl", "nGKItKLYNC");
        setField(term432, term432.getClass(), "password", "UiUYnPrcCi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.user.UpdateUserMapper");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Identifiable");
        argTypes[1] = Class.forName("com.alkemy.ong.infrastructure.rest.request.user.UpdateUserRequest");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term432;
        callMethod(klass, "toDomain", argTypes, null, args);
    }

};


