package net.jaggerwang.sbip.adapter.api.controller.dto;

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
import static net.jaggerwang.sbip.adapter.api.controller.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class UserStatDTO_init_122685774424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28890;
     Object term28892;
     Object term28894;
     Object term28896;
     Object term28898;
     Object term28900;
     Object term28902;
     Object term28912;

    public UserStatDTO_init_122685774424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28890 = new Long(7199459243454109261L);
        term28892 = new Long(-1009485425289165749L);
        term28894 = new Long(-5044181804110715069L);
        term28896 = new Long(-2413135395771470086L);
        term28898 = new Long(-823085399570394644L);
        term28900 = new Long(-894705411488729365L);
        term28902 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28903 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28907 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term28903, term28903.getClass(), "year", 2028);
        setShortField(term28903, term28903.getClass(), "month", (short) 6);
        setShortField(term28903, term28903.getClass(), "day", (short) 21);
        setField(term28902, term28902.getClass(), "date", term28903);
        setByteField(term28907, term28907.getClass(), "hour", (byte) 2);
        setByteField(term28907, term28907.getClass(), "minute", (byte) 38);
        setByteField(term28907, term28907.getClass(), "second", (byte) 11);
        setIntField(term28907, term28907.getClass(), "nano", 40256095);
        setField(term28902, term28902.getClass(), "time", term28907);
        term28912 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28913 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28917 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term28913, term28913.getClass(), "year", 2017);
        setShortField(term28913, term28913.getClass(), "month", (short) 5);
        setShortField(term28913, term28913.getClass(), "day", (short) 17);
        setField(term28912, term28912.getClass(), "date", term28913);
        setByteField(term28917, term28917.getClass(), "hour", (byte) 22);
        setByteField(term28917, term28917.getClass(), "minute", (byte) 56);
        setByteField(term28917, term28917.getClass(), "second", (byte) 28);
        setIntField(term28917, term28917.getClass(), "nano", 581659115);
        setField(term28912, term28912.getClass(), "time", term28917);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.UserStatDTO");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.Long");
        argTypes[2] = Class.forName("java.lang.Long");
        argTypes[3] = Class.forName("java.lang.Long");
        argTypes[4] = Class.forName("java.lang.Long");
        argTypes[5] = Class.forName("java.lang.Long");
        argTypes[6] = Class.forName("java.time.LocalDateTime");
        argTypes[7] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[8];
        args[0] = term28890;
        args[1] = term28892;
        args[2] = term28894;
        args[3] = term28896;
        args[4] = term28898;
        args[5] = term28900;
        args[6] = term28902;
        args[7] = term28912;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


