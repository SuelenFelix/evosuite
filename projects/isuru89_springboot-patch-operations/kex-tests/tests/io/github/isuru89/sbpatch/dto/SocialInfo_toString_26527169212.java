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
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;

public class SocialInfo_toString_26527169212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2050;

    public SocialInfo_toString_26527169212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2052 = new Long(6617340557564669657L);
        Object term2104 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term2104, term2104.getClass(), "email", null);
        Object term2105 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term2105, term2105.getClass(), "email", null);
        Object term2106 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term2106, term2106.getClass(), "email", null);
        Object term2107 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term2107, term2107.getClass(), "email", null);
        Object term2108 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.Email"));
        setField(term2108, term2108.getClass(), "email", null);
        ArrayList term2102 = new ArrayList();
        ((ArrayList) term2102).add(term2104);
        ((ArrayList) term2102).add(term2105);
        ((ArrayList) term2102).add(term2106);
        ((ArrayList) term2102).add(term2107);
        ((ArrayList) term2102).add(term2108);
        Long term2111 = new Long(1439298019805881866L);
        Long term2113 = new Long(-8708192233349544946L);
        term2050 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.SocialInfo"));
        Object term2051 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.UserDTO"));
        setField(term2051, term2051.getClass(), "id", term2052);
        setField(term2051, term2051.getClass(), "userName", "gCWtLVKVVe");
        setField(term2051, term2051.getClass(), "firstName", "fWKJoSoCwE");
        setField(term2051, term2051.getClass(), "lastName", "wfaXBpWAUH");
        setField(term2051, term2051.getClass(), "primaryEmail", "VMeAzAHwZj");
        setField(term2051, term2051.getClass(), "secondaryEmails", term2102);
        setField(term2051, term2051.getClass(), "createdAt", term2111);
        setField(term2051, term2051.getClass(), "updatedAt", term2113);
        setField(term2050, term2050.getClass(), "user", term2051);
        setField(term2050, term2050.getClass(), "githubProfile", "pXOkjyeIRb");
        setField(term2050, term2050.getClass(), "twitterProfile", "GgZWSjxjyE");
        setField(term2050, term2050.getClass(), "linkedInProfile", "EeBVbzjcCI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.isuru89.sbpatch.dto.SocialInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2050, args);
    }

};


