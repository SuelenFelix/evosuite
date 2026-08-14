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

public class PostStatDTO_getCreatedAt_557519156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90312;

    public PostStatDTO_getCreatedAt_557519156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term90313 = new Long(4633683327243391760L);
        Long term90315 = new Long(-5857237775500629566L);
        Long term90317 = new Long(6921894188357771660L);
        term90312 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostStatDTO"));
        Object term90319 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90320 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90324 = newInstance(Class.forName("java.time.LocalTime"));
        Object term90329 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90330 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90334 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term90312, term90312.getClass(), "id", term90313);
        setField(term90312, term90312.getClass(), "postId", term90315);
        setField(term90312, term90312.getClass(), "likeCount", term90317);
        setIntField(term90320, term90320.getClass(), "year", 2017);
        setShortField(term90320, term90320.getClass(), "month", (short) 8);
        setShortField(term90320, term90320.getClass(), "day", (short) 20);
        setField(term90319, term90319.getClass(), "date", term90320);
        setByteField(term90324, term90324.getClass(), "hour", (byte) 5);
        setByteField(term90324, term90324.getClass(), "minute", (byte) 32);
        setByteField(term90324, term90324.getClass(), "second", (byte) 38);
        setIntField(term90324, term90324.getClass(), "nano", 305374448);
        setField(term90319, term90319.getClass(), "time", term90324);
        setField(term90312, term90312.getClass(), "createdAt", term90319);
        setIntField(term90330, term90330.getClass(), "year", 2012);
        setShortField(term90330, term90330.getClass(), "month", (short) 6);
        setShortField(term90330, term90330.getClass(), "day", (short) 17);
        setField(term90329, term90329.getClass(), "date", term90330);
        setByteField(term90334, term90334.getClass(), "hour", (byte) 6);
        setByteField(term90334, term90334.getClass(), "minute", (byte) 7);
        setByteField(term90334, term90334.getClass(), "second", (byte) 50);
        setIntField(term90334, term90334.getClass(), "nano", 177119565);
        setField(term90329, term90329.getClass(), "time", term90334);
        setField(term90312, term90312.getClass(), "updatedAt", term90329);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostStatDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedAt", argTypes, term90312, args);
    }

};


