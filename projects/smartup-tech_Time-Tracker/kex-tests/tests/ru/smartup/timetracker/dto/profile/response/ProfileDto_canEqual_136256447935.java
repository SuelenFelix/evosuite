package ru.smartup.timetracker.dto.profile.response;

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
import static ru.smartup.timetracker.dto.profile.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ProfileDto_canEqual_136256447935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2178;

    public ProfileDto_canEqual_136256447935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2178 = newInstance(Class.forName("ru.smartup.timetracker.dto.profile.response.ProfileDto"));
        setIntField(term2178, term2178.getClass(), "id", 0);
        setField(term2178, term2178.getClass(), "firstName", null);
        setField(term2178, term2178.getClass(), "middleName", null);
        setField(term2178, term2178.getClass(), "lastName", null);
        setField(term2178, term2178.getClass(), "email", null);
        setField(term2178, term2178.getClass(), "roles", null);
        setField(term2178, term2178.getClass(), "projectRoles", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.profile.response.ProfileDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term2178, args);
    }

};


