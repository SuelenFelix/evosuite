package ru.smartup.timetracker.dto.password.recovery.request;

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
import static ru.smartup.timetracker.dto.password.recovery.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PasswordRecoveryDto_hashCode_56632934812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167;

    public PasswordRecoveryDto_hashCode_56632934812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term167 = newInstance(Class.forName("ru.smartup.timetracker.dto.password.recovery.request.PasswordRecoveryDto"));
        setField(term167, term167.getClass(), "email", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.password.recovery.request.PasswordRecoveryDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term167, args);
    }

};


