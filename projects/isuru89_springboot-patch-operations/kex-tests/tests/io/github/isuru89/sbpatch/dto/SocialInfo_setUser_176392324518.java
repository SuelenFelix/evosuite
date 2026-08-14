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

public class SocialInfo_setUser_176392324518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2225;

    public SocialInfo_setUser_176392324518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2225 = newInstance(Class.forName("io.github.isuru89.sbpatch.dto.SocialInfo"));
        setField(term2225, term2225.getClass(), "user", null);
        setField(term2225, term2225.getClass(), "githubProfile", null);
        setField(term2225, term2225.getClass(), "twitterProfile", null);
        setField(term2225, term2225.getClass(), "linkedInProfile", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.isuru89.sbpatch.dto.SocialInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.github.isuru89.sbpatch.dto.UserDTO");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUser", argTypes, term2225, args);
    }

};


