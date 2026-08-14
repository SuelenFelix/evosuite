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

public class PostStatDTO_setCreatedAt_38654278711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90453;
     Object term90480;

    public PostStatDTO_setCreatedAt_38654278711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term90454 = new Long(-5708751122198529383L);
        Long term90456 = new Long(3684413141105346843L);
        Long term90458 = new Long(808630420020053699L);
        term90453 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostStatDTO"));
        Object term90460 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90461 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90465 = newInstance(Class.forName("java.time.LocalTime"));
        Object term90470 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90471 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90475 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term90453, term90453.getClass(), "id", term90454);
        setField(term90453, term90453.getClass(), "postId", term90456);
        setField(term90453, term90453.getClass(), "likeCount", term90458);
        setIntField(term90461, term90461.getClass(), "year", 2020);
        setShortField(term90461, term90461.getClass(), "month", (short) 5);
        setShortField(term90461, term90461.getClass(), "day", (short) 16);
        setField(term90460, term90460.getClass(), "date", term90461);
        setByteField(term90465, term90465.getClass(), "hour", (byte) 5);
        setByteField(term90465, term90465.getClass(), "minute", (byte) 22);
        setByteField(term90465, term90465.getClass(), "second", (byte) 27);
        setIntField(term90465, term90465.getClass(), "nano", 680063090);
        setField(term90460, term90460.getClass(), "time", term90465);
        setField(term90453, term90453.getClass(), "createdAt", term90460);
        setIntField(term90471, term90471.getClass(), "year", 2022);
        setShortField(term90471, term90471.getClass(), "month", (short) 5);
        setShortField(term90471, term90471.getClass(), "day", (short) 29);
        setField(term90470, term90470.getClass(), "date", term90471);
        setByteField(term90475, term90475.getClass(), "hour", (byte) 18);
        setByteField(term90475, term90475.getClass(), "minute", (byte) 7);
        setByteField(term90475, term90475.getClass(), "second", (byte) 41);
        setIntField(term90475, term90475.getClass(), "nano", 988527834);
        setField(term90470, term90470.getClass(), "time", term90475);
        setField(term90453, term90453.getClass(), "updatedAt", term90470);
        term90480 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90481 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90485 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term90481, term90481.getClass(), "year", 2015);
        setShortField(term90481, term90481.getClass(), "month", (short) 6);
        setShortField(term90481, term90481.getClass(), "day", (short) 2);
        setField(term90480, term90480.getClass(), "date", term90481);
        setByteField(term90485, term90485.getClass(), "hour", (byte) 20);
        setByteField(term90485, term90485.getClass(), "minute", (byte) 44);
        setByteField(term90485, term90485.getClass(), "second", (byte) 56);
        setIntField(term90485, term90485.getClass(), "nano", 902936064);
        setField(term90480, term90480.getClass(), "time", term90485);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostStatDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term90480;
        callMethod(klass, "setCreatedAt", argTypes, term90453, args);
    }

};


