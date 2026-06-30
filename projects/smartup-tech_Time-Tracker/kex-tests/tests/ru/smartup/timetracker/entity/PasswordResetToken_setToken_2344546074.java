package ru.smartup.timetracker.entity;

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
import static ru.smartup.timetracker.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PasswordResetToken_setToken_2344546074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110456;

    public PasswordResetToken_setToken_2344546074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110456 = newInstance(Class.forName("ru.smartup.timetracker.entity.PasswordResetToken"));
        Object term110470 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term110456, term110456.getClass(), "employeeId", 633765954);
        setField(term110456, term110456.getClass(), "token", "PNzNzzjSXM");
        setIntField(term110470, term110470.getClass(), "nanos", 358000000);
        setLongField(term110470, term110470.getClass(), "fastTime", 1743915503000L);
        setField(term110470, term110470.getClass(), "cdate", null);
        setField(term110456, term110456.getClass(), "tokenExpiry", term110470);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.PasswordResetToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ktKcSZiuGM";
        callMethod(klass, "setToken", argTypes, term110456, args);
    }

};


