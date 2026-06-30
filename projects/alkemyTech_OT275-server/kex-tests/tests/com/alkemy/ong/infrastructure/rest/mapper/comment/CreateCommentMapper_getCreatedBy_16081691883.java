package com.alkemy.ong.infrastructure.rest.mapper.comment;

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
import static com.alkemy.ong.infrastructure.rest.mapper.comment.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class CreateCommentMapper_getCreatedBy_16081691883 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term418;
     Object term419;

    public CreateCommentMapper_getCreatedBy_16081691883() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term418 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.comment.CreateCommentMapper"));
        Long term420 = new Long(2120084523938730454L);
        Long term483 = new Long(6855071767938501807L);
        term419 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term482 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        setField(term419, term419.getClass(), "id", term420);
        setField(term419, term419.getClass(), "firstName", "jUbSRrkrYZ");
        setField(term419, term419.getClass(), "lastName", "bWWfajKbEX");
        setField(term419, term419.getClass(), "email", "cAPeiZHKGJ");
        setField(term419, term419.getClass(), "password", "LvJFtLBaxj");
        setField(term419, term419.getClass(), "imageUrl", "PHvxnGHptP");
        setField(term482, term482.getClass(), "id", term483);
        setField(term482, term482.getClass(), "name", "TimdotUuNC");
        setField(term482, term482.getClass(), "description", "PkWMRdJcBb");
        setField(term419, term419.getClass(), "role", term482);
        setField(term419, term419.getClass(), "token", "jSpAteRute");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.comment.CreateCommentMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.User");
        Object[] args = new Object[1];
        args[0] = term419;
        callMethod(klass, "getCreatedBy", argTypes, term418, args);
    }

};


