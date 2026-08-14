package net.jaggerwang.sbip.adapter.api.controller.dto;

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
import static net.jaggerwang.sbip.adapter.api.controller.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserDTO_getIntro_198722084942 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16886;

    public UserDTO_getIntro_198722084942() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16886 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO"));
        setField(term16886, term16886.getClass(), "id", null);
        setField(term16886, term16886.getClass(), "username", null);
        setField(term16886, term16886.getClass(), "password", null);
        setField(term16886, term16886.getClass(), "mobile", null);
        setField(term16886, term16886.getClass(), "email", null);
        setField(term16886, term16886.getClass(), "avatarId", null);
        setField(term16886, term16886.getClass(), "intro", null);
        setField(term16886, term16886.getClass(), "createdAt", null);
        setField(term16886, term16886.getClass(), "updatedAt", null);
        setField(term16886, term16886.getClass(), "avatar", null);
        setField(term16886, term16886.getClass(), "stat", null);
        setField(term16886, term16886.getClass(), "following", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIntro", argTypes, term16886, args);
    }

};


