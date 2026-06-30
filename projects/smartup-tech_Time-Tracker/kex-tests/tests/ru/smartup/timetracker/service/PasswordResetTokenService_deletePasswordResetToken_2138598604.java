package ru.smartup.timetracker.service;

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
import static ru.smartup.timetracker.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PasswordResetTokenService_deletePasswordResetToken_2138598604 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23323;

    public PasswordResetTokenService_deletePasswordResetToken_2138598604() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23323 = newInstance(Class.forName("ru.smartup.timetracker.entity.PasswordResetToken"));
        Object term23337 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term23323, term23323.getClass(), "employeeId", 794568325);
        setField(term23323, term23323.getClass(), "token", "gltJarNuUk");
        setIntField(term23337, term23337.getClass(), "nanos", 21000000);
        setLongField(term23337, term23337.getClass(), "fastTime", 1791283637000L);
        setField(term23337, term23337.getClass(), "cdate", null);
        setField(term23323, term23323.getClass(), "tokenExpiry", term23337);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.PasswordResetTokenService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.PasswordResetToken");
        Object[] args = new Object[1];
        args[0] = term23323;
        callMethod(klass, "deletePasswordResetToken", argTypes, null, args);
    }

};


