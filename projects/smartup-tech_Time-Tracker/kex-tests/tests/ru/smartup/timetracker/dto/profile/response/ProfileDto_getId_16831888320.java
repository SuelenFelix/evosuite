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

public class ProfileDto_getId_16831888320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2146;

    public ProfileDto_getId_16831888320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2146 = newInstance(Class.forName("ru.smartup.timetracker.dto.profile.response.ProfileDto"));
        setIntField(term2146, term2146.getClass(), "id", 0);
        setField(term2146, term2146.getClass(), "firstName", null);
        setField(term2146, term2146.getClass(), "middleName", null);
        setField(term2146, term2146.getClass(), "lastName", null);
        setField(term2146, term2146.getClass(), "email", null);
        setField(term2146, term2146.getClass(), "roles", null);
        setField(term2146, term2146.getClass(), "projectRoles", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.profile.response.ProfileDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term2146, args);
    }

};


