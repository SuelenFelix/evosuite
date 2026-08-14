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

public class UserBO_hashCode_43488349521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27748;

    public UserBO_hashCode_43488349521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term27749 = new Long(5071015720043054072L);
        Long term27799 = new Long(-7006877527579112761L);
        term27748 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserBO"));
        Object term27813 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27814 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27818 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27823 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27824 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27828 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term27748, term27748.getClass(), "id", term27749);
        setField(term27748, term27748.getClass(), "username", "HHQcYMSBVc");
        setField(term27748, term27748.getClass(), "password", "wdoqITnaAP");
        setField(term27748, term27748.getClass(), "mobile", "rIPMBcrNqB");
        setField(term27748, term27748.getClass(), "email", "UDaboHZHhz");
        setField(term27748, term27748.getClass(), "avatarId", term27799);
        setField(term27748, term27748.getClass(), "intro", "nRvKihUSPj");
        setIntField(term27814, term27814.getClass(), "year", 2017);
        setShortField(term27814, term27814.getClass(), "month", (short) 1);
        setShortField(term27814, term27814.getClass(), "day", (short) 3);
        setField(term27813, term27813.getClass(), "date", term27814);
        setByteField(term27818, term27818.getClass(), "hour", (byte) 14);
        setByteField(term27818, term27818.getClass(), "minute", (byte) 1);
        setByteField(term27818, term27818.getClass(), "second", (byte) 1);
        setIntField(term27818, term27818.getClass(), "nano", 827128674);
        setField(term27813, term27813.getClass(), "time", term27818);
        setField(term27748, term27748.getClass(), "createdAt", term27813);
        setIntField(term27824, term27824.getClass(), "year", 2022);
        setShortField(term27824, term27824.getClass(), "month", (short) 9);
        setShortField(term27824, term27824.getClass(), "day", (short) 3);
        setField(term27823, term27823.getClass(), "date", term27824);
        setByteField(term27828, term27828.getClass(), "hour", (byte) 22);
        setByteField(term27828, term27828.getClass(), "minute", (byte) 31);
        setByteField(term27828, term27828.getClass(), "second", (byte) 44);
        setIntField(term27828, term27828.getClass(), "nano", 798112760);
        setField(term27823, term27823.getClass(), "time", term27828);
        setField(term27748, term27748.getClass(), "updatedAt", term27823);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term27748, args);
    }

};


