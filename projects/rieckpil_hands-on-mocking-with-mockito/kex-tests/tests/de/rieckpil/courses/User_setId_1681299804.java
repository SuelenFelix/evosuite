package de.rieckpil.courses;

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
import static de.rieckpil.courses.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class User_setId_1681299804 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1189;
     Object term1226;

    public User_setId_1681299804() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1190 = new Long(-8400487765614892086L);
        term1189 = newInstance(Class.forName("de.rieckpil.courses.User"));
        Object term1216 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1217 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1221 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1189, term1189.getClass(), "id", term1190);
        setField(term1189, term1189.getClass(), "username", "jDtqGUpnZN");
        setField(term1189, term1189.getClass(), "email", "nGKItKLYNC");
        setIntField(term1217, term1217.getClass(), "year", 2015);
        setShortField(term1217, term1217.getClass(), "month", (short) 4);
        setShortField(term1217, term1217.getClass(), "day", (short) 14);
        setField(term1216, term1216.getClass(), "date", term1217);
        setByteField(term1221, term1221.getClass(), "hour", (byte) 18);
        setByteField(term1221, term1221.getClass(), "minute", (byte) 24);
        setByteField(term1221, term1221.getClass(), "second", (byte) 32);
        setIntField(term1221, term1221.getClass(), "nano", 369233818);
        setField(term1216, term1216.getClass(), "time", term1221);
        setField(term1189, term1189.getClass(), "createdAt", term1216);
        term1226 = new Long(5270370404989704783L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.rieckpil.courses.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term1226;
        callMethod(klass, "setId", argTypes, term1189, args);
    }

};


