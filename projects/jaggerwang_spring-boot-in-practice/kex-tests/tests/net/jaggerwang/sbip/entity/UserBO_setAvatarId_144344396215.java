package net.jaggerwang.sbip.entity;

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
import static net.jaggerwang.sbip.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class UserBO_setAvatarId_144344396215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26892;
     Object term26977;

    public UserBO_setAvatarId_144344396215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term26893 = new Long(-8605430501912680279L);
        Long term26943 = new Long(2985226914509512766L);
        term26892 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserBO"));
        Object term26957 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26958 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26962 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26967 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26968 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26972 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term26892, term26892.getClass(), "id", term26893);
        setField(term26892, term26892.getClass(), "username", "tsTGdgQYUL");
        setField(term26892, term26892.getClass(), "password", "TtGbVmKcnX");
        setField(term26892, term26892.getClass(), "mobile", "GJVkUrCVdD");
        setField(term26892, term26892.getClass(), "email", "zNdorvdUgu");
        setField(term26892, term26892.getClass(), "avatarId", term26943);
        setField(term26892, term26892.getClass(), "intro", "oPxuZbkYio");
        setIntField(term26958, term26958.getClass(), "year", 2014);
        setShortField(term26958, term26958.getClass(), "month", (short) 5);
        setShortField(term26958, term26958.getClass(), "day", (short) 20);
        setField(term26957, term26957.getClass(), "date", term26958);
        setByteField(term26962, term26962.getClass(), "hour", (byte) 12);
        setByteField(term26962, term26962.getClass(), "minute", (byte) 30);
        setByteField(term26962, term26962.getClass(), "second", (byte) 37);
        setIntField(term26962, term26962.getClass(), "nano", 390283474);
        setField(term26957, term26957.getClass(), "time", term26962);
        setField(term26892, term26892.getClass(), "createdAt", term26957);
        setIntField(term26968, term26968.getClass(), "year", 2028);
        setShortField(term26968, term26968.getClass(), "month", (short) 11);
        setShortField(term26968, term26968.getClass(), "day", (short) 28);
        setField(term26967, term26967.getClass(), "date", term26968);
        setByteField(term26972, term26972.getClass(), "hour", (byte) 4);
        setByteField(term26972, term26972.getClass(), "minute", (byte) 25);
        setByteField(term26972, term26972.getClass(), "second", (byte) 12);
        setIntField(term26972, term26972.getClass(), "nano", 726554360);
        setField(term26967, term26967.getClass(), "time", term26972);
        setField(term26892, term26892.getClass(), "updatedAt", term26967);
        term26977 = new Long(4041117732464806744L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term26977;
        callMethod(klass, "setAvatarId", argTypes, term26892, args);
    }

};


