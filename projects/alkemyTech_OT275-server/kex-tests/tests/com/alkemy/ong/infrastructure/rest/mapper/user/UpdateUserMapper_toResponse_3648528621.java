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
import java.lang.Long;
import java.lang.Object;

public class UpdateUserMapper_toResponse_3648528621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term521;

    public UpdateUserMapper_toResponse_3648528621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term522 = new Long(-4325723315152823407L);
        Long term585 = new Long(2535595959091595249L);
        term521 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term584 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        setField(term521, term521.getClass(), "id", term522);
        setField(term521, term521.getClass(), "firstName", "UoYtihxVaS");
        setField(term521, term521.getClass(), "lastName", "JDswTTCZHV");
        setField(term521, term521.getClass(), "email", "onpbIeEKoi");
        setField(term521, term521.getClass(), "password", "YRHGsAkhxb");
        setField(term521, term521.getClass(), "imageUrl", "ffYhPOzlUs");
        setField(term584, term584.getClass(), "id", term585);
        setField(term584, term584.getClass(), "name", "MLqYREekMl");
        setField(term584, term584.getClass(), "description", "ytSBIKXogI");
        setField(term521, term521.getClass(), "role", term584);
        setField(term521, term521.getClass(), "token", "nHXjMycHlU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.user.UpdateUserMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.User");
        Object[] args = new Object[1];
        args[0] = term521;
        callMethod(klass, "toResponse", argTypes, null, args);
    }

};


