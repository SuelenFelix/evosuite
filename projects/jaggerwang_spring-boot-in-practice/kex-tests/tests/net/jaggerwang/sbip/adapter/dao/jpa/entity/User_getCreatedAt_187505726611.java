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

public class User_getCreatedAt_187505726611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28821;

    public User_getCreatedAt_187505726611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28822 = new Long(-4507768716367203234L);
        Long term28872 = new Long(-192072503176550129L);
        term28821 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User"));
        Object term28886 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28887 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28891 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28896 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28897 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28901 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term28821, term28821.getClass(), "id", term28822);
        setField(term28821, term28821.getClass(), "username", "aQFUvuaYxd");
        setField(term28821, term28821.getClass(), "password", "zNFLXMifnS");
        setField(term28821, term28821.getClass(), "mobile", "HHQcYMSBVc");
        setField(term28821, term28821.getClass(), "email", "wdoqITnaAP");
        setField(term28821, term28821.getClass(), "avatarId", term28872);
        setField(term28821, term28821.getClass(), "intro", "rIPMBcrNqB");
        setIntField(term28887, term28887.getClass(), "year", 2015);
        setShortField(term28887, term28887.getClass(), "month", (short) 5);
        setShortField(term28887, term28887.getClass(), "day", (short) 26);
        setField(term28886, term28886.getClass(), "date", term28887);
        setByteField(term28891, term28891.getClass(), "hour", (byte) 9);
        setByteField(term28891, term28891.getClass(), "minute", (byte) 34);
        setByteField(term28891, term28891.getClass(), "second", (byte) 10);
        setIntField(term28891, term28891.getClass(), "nano", 873043034);
        setField(term28886, term28886.getClass(), "time", term28891);
        setField(term28821, term28821.getClass(), "createdAt", term28886);
        setIntField(term28897, term28897.getClass(), "year", 2021);
        setShortField(term28897, term28897.getClass(), "month", (short) 11);
        setShortField(term28897, term28897.getClass(), "day", (short) 13);
        setField(term28896, term28896.getClass(), "date", term28897);
        setByteField(term28901, term28901.getClass(), "hour", (byte) 7);
        setByteField(term28901, term28901.getClass(), "minute", (byte) 27);
        setByteField(term28901, term28901.getClass(), "second", (byte) 1);
        setIntField(term28901, term28901.getClass(), "nano", 59611302);
        setField(term28896, term28896.getClass(), "time", term28901);
        setField(term28821, term28821.getClass(), "updatedAt", term28896);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedAt", argTypes, term28821, args);
    }

};


