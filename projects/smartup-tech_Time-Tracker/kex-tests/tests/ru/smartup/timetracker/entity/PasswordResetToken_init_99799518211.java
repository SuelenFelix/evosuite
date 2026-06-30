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
import java.lang.Integer;

public class PasswordResetToken_init_99799518211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110645;
     Object term110659;

    public PasswordResetToken_init_99799518211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110645 = new Integer(-297946422);
        term110659 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term110659, term110659.getClass(), "nanos", 920000000);
        setLongField(term110659, term110659.getClass(), "fastTime", 1383271451000L);
        setField(term110659, term110659.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.PasswordResetToken");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[3];
        args[0] = term110645;
        args[1] = "iQiGTulJiH";
        args[2] = term110659;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


