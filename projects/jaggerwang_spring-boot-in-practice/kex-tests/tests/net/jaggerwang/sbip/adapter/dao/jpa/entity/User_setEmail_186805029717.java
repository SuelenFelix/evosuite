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

public class User_setEmail_186805029717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29699;

    public User_setEmail_186805029717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term29700 = new Long(2984955721798941743L);
        Long term29750 = new Long(7495572757420909707L);
        term29699 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User"));
        Object term29764 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29765 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29769 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29774 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29775 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29779 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term29699, term29699.getClass(), "id", term29700);
        setField(term29699, term29699.getClass(), "username", "qFGKIJjlmV");
        setField(term29699, term29699.getClass(), "password", "IHqvyhMtuM");
        setField(term29699, term29699.getClass(), "mobile", "dAldIGYAXV");
        setField(term29699, term29699.getClass(), "email", "mLwibAPEsa");
        setField(term29699, term29699.getClass(), "avatarId", term29750);
        setField(term29699, term29699.getClass(), "intro", "zsWKWiTFuo");
        setIntField(term29765, term29765.getClass(), "year", 2027);
        setShortField(term29765, term29765.getClass(), "month", (short) 3);
        setShortField(term29765, term29765.getClass(), "day", (short) 20);
        setField(term29764, term29764.getClass(), "date", term29765);
        setByteField(term29769, term29769.getClass(), "hour", (byte) 9);
        setByteField(term29769, term29769.getClass(), "minute", (byte) 34);
        setByteField(term29769, term29769.getClass(), "second", (byte) 31);
        setIntField(term29769, term29769.getClass(), "nano", 746182707);
        setField(term29764, term29764.getClass(), "time", term29769);
        setField(term29699, term29699.getClass(), "createdAt", term29764);
        setIntField(term29775, term29775.getClass(), "year", 2018);
        setShortField(term29775, term29775.getClass(), "month", (short) 9);
        setShortField(term29775, term29775.getClass(), "day", (short) 11);
        setField(term29774, term29774.getClass(), "date", term29775);
        setByteField(term29779, term29779.getClass(), "hour", (byte) 18);
        setByteField(term29779, term29779.getClass(), "minute", (byte) 44);
        setByteField(term29779, term29779.getClass(), "second", (byte) 42);
        setIntField(term29779, term29779.getClass(), "nano", 303163100);
        setField(term29774, term29774.getClass(), "time", term29779);
        setField(term29699, term29699.getClass(), "updatedAt", term29774);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UPUbwyHQKN";
        callMethod(klass, "setEmail", argTypes, term29699, args);
    }

};


