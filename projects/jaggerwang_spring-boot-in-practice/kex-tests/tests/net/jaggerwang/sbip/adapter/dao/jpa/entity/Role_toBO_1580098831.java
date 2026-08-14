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

public class Role_toBO_1580098831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23393;

    public Role_toBO_1580098831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term23394 = new Long(-5671086125367688052L);
        term23393 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Role"));
        Object term23408 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23409 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23413 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23418 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23419 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23423 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term23393, term23393.getClass(), "id", term23394);
        setField(term23393, term23393.getClass(), "name", "ShIELyuULw");
        setIntField(term23409, term23409.getClass(), "year", 2028);
        setShortField(term23409, term23409.getClass(), "month", (short) 6);
        setShortField(term23409, term23409.getClass(), "day", (short) 21);
        setField(term23408, term23408.getClass(), "date", term23409);
        setByteField(term23413, term23413.getClass(), "hour", (byte) 2);
        setByteField(term23413, term23413.getClass(), "minute", (byte) 38);
        setByteField(term23413, term23413.getClass(), "second", (byte) 11);
        setIntField(term23413, term23413.getClass(), "nano", 40256095);
        setField(term23408, term23408.getClass(), "time", term23413);
        setField(term23393, term23393.getClass(), "createdAt", term23408);
        setIntField(term23419, term23419.getClass(), "year", 2017);
        setShortField(term23419, term23419.getClass(), "month", (short) 5);
        setShortField(term23419, term23419.getClass(), "day", (short) 17);
        setField(term23418, term23418.getClass(), "date", term23419);
        setByteField(term23423, term23423.getClass(), "hour", (byte) 22);
        setByteField(term23423, term23423.getClass(), "minute", (byte) 56);
        setByteField(term23423, term23423.getClass(), "second", (byte) 28);
        setIntField(term23423, term23423.getClass(), "nano", 581659115);
        setField(term23418, term23418.getClass(), "time", term23423);
        setField(term23393, term23393.getClass(), "updatedAt", term23418);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Role");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toBO", argTypes, term23393, args);
    }

};


