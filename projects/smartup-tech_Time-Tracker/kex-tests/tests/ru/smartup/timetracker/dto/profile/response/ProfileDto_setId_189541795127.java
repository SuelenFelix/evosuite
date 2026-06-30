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
import java.lang.Integer;

public class ProfileDto_setId_189541795127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2160;
     Object term2162;

    public ProfileDto_setId_189541795127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2160 = newInstance(Class.forName("ru.smartup.timetracker.dto.profile.response.ProfileDto"));
        setIntField(term2160, term2160.getClass(), "id", 0);
        setField(term2160, term2160.getClass(), "firstName", null);
        setField(term2160, term2160.getClass(), "middleName", null);
        setField(term2160, term2160.getClass(), "lastName", null);
        setField(term2160, term2160.getClass(), "email", null);
        setField(term2160, term2160.getClass(), "roles", null);
        setField(term2160, term2160.getClass(), "projectRoles", null);
        term2162 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.profile.response.ProfileDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2162;
        callMethod(klass, "setId", argTypes, term2160, args);
    }

};


