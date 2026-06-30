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

public class PasswordUpdateDto_canEqual_17413103126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1019;
     Object term1044;

    public PasswordUpdateDto_canEqual_17413103126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1019 = newInstance(Class.forName("ru.smartup.timetracker.dto.profile.request.PasswordUpdateDto"));
        setField(term1019, term1019.getClass(), "oldPassword", "GzFkzHGYFt");
        setField(term1019, term1019.getClass(), "newPassword", "tShwQLRGNe");
        term1044 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.profile.request.PasswordUpdateDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1044;
        callMethod(klass, "canEqual", argTypes, term1019, args);
    }

};


