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

public class UserRole_hashCode_142240230314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14020;

    public UserRole_hashCode_142240230314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14021 = new Long(661905373566913125L);
        Long term14023 = new Long(-3753621038448351550L);
        Long term14025 = new Long(5304481534735378567L);
        term14020 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserRole"));
        Object term14027 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14028 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14032 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14037 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14038 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14042 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term14020, term14020.getClass(), "id", term14021);
        setField(term14020, term14020.getClass(), "userId", term14023);
        setField(term14020, term14020.getClass(), "roleId", term14025);
        setIntField(term14028, term14028.getClass(), "year", 2018);
        setShortField(term14028, term14028.getClass(), "month", (short) 5);
        setShortField(term14028, term14028.getClass(), "day", (short) 13);
        setField(term14027, term14027.getClass(), "date", term14028);
        setByteField(term14032, term14032.getClass(), "hour", (byte) 0);
        setByteField(term14032, term14032.getClass(), "minute", (byte) 47);
        setByteField(term14032, term14032.getClass(), "second", (byte) 45);
        setIntField(term14032, term14032.getClass(), "nano", 10058361);
        setField(term14027, term14027.getClass(), "time", term14032);
        setField(term14020, term14020.getClass(), "createdAt", term14027);
        setIntField(term14038, term14038.getClass(), "year", 2014);
        setShortField(term14038, term14038.getClass(), "month", (short) 6);
        setShortField(term14038, term14038.getClass(), "day", (short) 11);
        setField(term14037, term14037.getClass(), "date", term14038);
        setByteField(term14042, term14042.getClass(), "hour", (byte) 8);
        setByteField(term14042, term14042.getClass(), "minute", (byte) 55);
        setByteField(term14042, term14042.getClass(), "second", (byte) 58);
        setIntField(term14042, term14042.getClass(), "nano", 376244535);
        setField(term14037, term14037.getClass(), "time", term14042);
        setField(term14020, term14020.getClass(), "updatedAt", term14037);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.UserRole");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term14020, args);
    }

};


