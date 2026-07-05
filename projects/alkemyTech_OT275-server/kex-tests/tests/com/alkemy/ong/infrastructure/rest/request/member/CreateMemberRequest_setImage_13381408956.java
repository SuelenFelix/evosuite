package com.alkemy.ong.infrastructure.rest.request.member;

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
import static com.alkemy.ong.infrastructure.rest.request.member.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CreateMemberRequest_setImage_13381408956 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1906;

    public CreateMemberRequest_setImage_13381408956() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1906 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.member.CreateMemberRequest"));
        Object term1943 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.common.SocialMediaRequest"));
        setField(term1906, term1906.getClass(), "name", "LvJFtLBaxj");
        setField(term1906, term1906.getClass(), "image", "PHvxnGHptP");
        setField(term1906, term1906.getClass(), "description", "TimdotUuNC");
        setField(term1943, term1943.getClass(), "facebookUrl", "PkWMRdJcBb");
        setField(term1943, term1943.getClass(), "linkedInUrl", "jSpAteRute");
        setField(term1943, term1943.getClass(), "instagramUrl", "swZVeJAxjt");
        setField(term1906, term1906.getClass(), "socialMedia", term1943);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.member.CreateMemberRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xOcJIiQQDu";
        callMethod(klass, "setImage", argTypes, term1906, args);
    }

};


