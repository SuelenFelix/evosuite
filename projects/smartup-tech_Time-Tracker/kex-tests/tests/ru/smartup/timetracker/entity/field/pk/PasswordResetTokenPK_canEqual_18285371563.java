package ru.smartup.timetracker.entity.field.pk;

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
import static ru.smartup.timetracker.entity.field.pk.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PasswordResetTokenPK_canEqual_18285371563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50;
     Object term64;

    public PasswordResetTokenPK_canEqual_18285371563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50 = newInstance(Class.forName("ru.smartup.timetracker.entity.field.pk.PasswordResetTokenPK"));
        setIntField(term50, term50.getClass(), "employeeId", 1484323161);
        setField(term50, term50.getClass(), "token", "MuLcgQHgqz");
        term64 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.field.pk.PasswordResetTokenPK");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term64;
        callMethod(klass, "canEqual", argTypes, term50, args);
    }

};


