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

public class PasswordResetToken_setTokenExpiry_6055976015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110505;
     Object term110522;

    public PasswordResetToken_setTokenExpiry_6055976015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110505 = newInstance(Class.forName("ru.smartup.timetracker.entity.PasswordResetToken"));
        Object term110519 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term110505, term110505.getClass(), "employeeId", 269110087);
        setField(term110505, term110505.getClass(), "token", "PSOttyUeqv");
        setIntField(term110519, term110519.getClass(), "nanos", 821000000);
        setLongField(term110519, term110519.getClass(), "fastTime", 1848117620000L);
        setField(term110519, term110519.getClass(), "cdate", null);
        setField(term110505, term110505.getClass(), "tokenExpiry", term110519);
        term110522 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term110522, term110522.getClass(), "nanos", 255000000);
        setLongField(term110522, term110522.getClass(), "fastTime", 1647755551000L);
        setField(term110522, term110522.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.PasswordResetToken");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = term110522;
        callMethod(klass, "setTokenExpiry", argTypes, term110505, args);
    }

};


