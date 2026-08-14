package net.jaggerwang.sbip.adapter.dao.jpa.entity;

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
import static net.jaggerwang.sbip.adapter.dao.jpa.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class UserRole_UserRoleBuilder_roleId_6370792623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27307;
     Object term27334;

    public UserRole_UserRoleBuilder_roleId_6370792623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term27308 = new Long(1924411240174876881L);
        Long term27310 = new Long(-8287954071414913487L);
        Long term27312 = new Long(-1379663556617181551L);
        term27307 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserRole$UserRoleBuilder"));
        Object term27314 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27315 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27319 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27324 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27325 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27329 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term27307, term27307.getClass(), "id", term27308);
        setField(term27307, term27307.getClass(), "userId", term27310);
        setField(term27307, term27307.getClass(), "roleId", term27312);
        setIntField(term27315, term27315.getClass(), "year", 2013);
        setShortField(term27315, term27315.getClass(), "month", (short) 7);
        setShortField(term27315, term27315.getClass(), "day", (short) 2);
        setField(term27314, term27314.getClass(), "date", term27315);
        setByteField(term27319, term27319.getClass(), "hour", (byte) 12);
        setByteField(term27319, term27319.getClass(), "minute", (byte) 16);
        setByteField(term27319, term27319.getClass(), "second", (byte) 13);
        setIntField(term27319, term27319.getClass(), "nano", 479538808);
        setField(term27314, term27314.getClass(), "time", term27319);
        setField(term27307, term27307.getClass(), "createdAt", term27314);
        setIntField(term27325, term27325.getClass(), "year", 2012);
        setShortField(term27325, term27325.getClass(), "month", (short) 10);
        setShortField(term27325, term27325.getClass(), "day", (short) 26);
        setField(term27324, term27324.getClass(), "date", term27325);
        setByteField(term27329, term27329.getClass(), "hour", (byte) 13);
        setByteField(term27329, term27329.getClass(), "minute", (byte) 50);
        setByteField(term27329, term27329.getClass(), "second", (byte) 34);
        setIntField(term27329, term27329.getClass(), "nano", 738625041);
        setField(term27324, term27324.getClass(), "time", term27329);
        setField(term27307, term27307.getClass(), "updatedAt", term27324);
        term27334 = new Long(-927624000067769617L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserRole$UserRoleBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term27334;
        callMethod(klass, "roleId", argTypes, term27307, args);
    }

};


