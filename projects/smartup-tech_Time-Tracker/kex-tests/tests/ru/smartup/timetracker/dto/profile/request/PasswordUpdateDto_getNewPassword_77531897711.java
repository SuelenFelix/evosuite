package ru.smartup.timetracker.dto.profile.request;

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
import static ru.smartup.timetracker.dto.profile.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PasswordUpdateDto_getNewPassword_77531897711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1156;

    public PasswordUpdateDto_getNewPassword_77531897711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1156 = newInstance(Class.forName("ru.smartup.timetracker.dto.profile.request.PasswordUpdateDto"));
        setField(term1156, term1156.getClass(), "oldPassword", null);
        setField(term1156, term1156.getClass(), "newPassword", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.profile.request.PasswordUpdateDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNewPassword", argTypes, term1156, args);
    }

};


