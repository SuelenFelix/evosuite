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

public class UserDTO_fromBO_8023159333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16877;

    public UserDTO_fromBO_8023159333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16877 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO"));
        setField(term16877, term16877.getClass(), "id", null);
        setField(term16877, term16877.getClass(), "username", null);
        setField(term16877, term16877.getClass(), "password", null);
        setField(term16877, term16877.getClass(), "mobile", null);
        setField(term16877, term16877.getClass(), "email", null);
        setField(term16877, term16877.getClass(), "avatarId", null);
        setField(term16877, term16877.getClass(), "intro", null);
        setField(term16877, term16877.getClass(), "createdAt", null);
        setField(term16877, term16877.getClass(), "updatedAt", null);
        setField(term16877, term16877.getClass(), "avatar", null);
        setField(term16877, term16877.getClass(), "stat", null);
        setField(term16877, term16877.getClass(), "following", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.jaggerwang.sbip.entity.UserBO");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "fromBO", argTypes, term16877, args);
    }

};


