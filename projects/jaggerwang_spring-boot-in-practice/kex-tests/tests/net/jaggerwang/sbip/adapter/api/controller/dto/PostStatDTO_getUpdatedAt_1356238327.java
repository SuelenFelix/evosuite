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

public class PostStatDTO_getUpdatedAt_1356238327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90339;

    public PostStatDTO_getUpdatedAt_1356238327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term90340 = new Long(-6433492565384127622L);
        Long term90342 = new Long(2886519650889727392L);
        Long term90344 = new Long(3988621885328354087L);
        term90339 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostStatDTO"));
        Object term90346 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90347 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90351 = newInstance(Class.forName("java.time.LocalTime"));
        Object term90356 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90357 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90361 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term90339, term90339.getClass(), "id", term90340);
        setField(term90339, term90339.getClass(), "postId", term90342);
        setField(term90339, term90339.getClass(), "likeCount", term90344);
        setIntField(term90347, term90347.getClass(), "year", 2022);
        setShortField(term90347, term90347.getClass(), "month", (short) 12);
        setShortField(term90347, term90347.getClass(), "day", (short) 28);
        setField(term90346, term90346.getClass(), "date", term90347);
        setByteField(term90351, term90351.getClass(), "hour", (byte) 3);
        setByteField(term90351, term90351.getClass(), "minute", (byte) 53);
        setByteField(term90351, term90351.getClass(), "second", (byte) 54);
        setIntField(term90351, term90351.getClass(), "nano", 342790000);
        setField(term90346, term90346.getClass(), "time", term90351);
        setField(term90339, term90339.getClass(), "createdAt", term90346);
        setIntField(term90357, term90357.getClass(), "year", 2018);
        setShortField(term90357, term90357.getClass(), "month", (short) 4);
        setShortField(term90357, term90357.getClass(), "day", (short) 14);
        setField(term90356, term90356.getClass(), "date", term90357);
        setByteField(term90361, term90361.getClass(), "hour", (byte) 10);
        setByteField(term90361, term90361.getClass(), "minute", (byte) 6);
        setByteField(term90361, term90361.getClass(), "second", (byte) 20);
        setIntField(term90361, term90361.getClass(), "nano", 981356633);
        setField(term90356, term90356.getClass(), "time", term90361);
        setField(term90339, term90339.getClass(), "updatedAt", term90356);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostStatDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdatedAt", argTypes, term90339, args);
    }

};


