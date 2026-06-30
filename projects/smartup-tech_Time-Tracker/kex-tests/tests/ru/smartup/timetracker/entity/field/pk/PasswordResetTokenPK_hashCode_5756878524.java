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

public class PasswordResetTokenPK_hashCode_5756878524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75;

    public PasswordResetTokenPK_hashCode_5756878524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75 = newInstance(Class.forName("ru.smartup.timetracker.entity.field.pk.PasswordResetTokenPK"));
        setIntField(term75, term75.getClass(), "employeeId", 391863371);
        setField(term75, term75.getClass(), "token", "xxtlPwDYFs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.field.pk.PasswordResetTokenPK");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term75, args);
    }

};


