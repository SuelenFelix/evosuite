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

public class PostStatDTO_setId_9932064948 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90366;
     Object term90393;

    public PostStatDTO_setId_9932064948() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term90367 = new Long(-8785640072434283607L);
        Long term90369 = new Long(-3745055287608698860L);
        Long term90371 = new Long(-2505520083946785927L);
        term90366 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostStatDTO"));
        Object term90373 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90374 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90378 = newInstance(Class.forName("java.time.LocalTime"));
        Object term90383 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90384 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90388 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term90366, term90366.getClass(), "id", term90367);
        setField(term90366, term90366.getClass(), "postId", term90369);
        setField(term90366, term90366.getClass(), "likeCount", term90371);
        setIntField(term90374, term90374.getClass(), "year", 2010);
        setShortField(term90374, term90374.getClass(), "month", (short) 7);
        setShortField(term90374, term90374.getClass(), "day", (short) 17);
        setField(term90373, term90373.getClass(), "date", term90374);
        setByteField(term90378, term90378.getClass(), "hour", (byte) 3);
        setByteField(term90378, term90378.getClass(), "minute", (byte) 45);
        setByteField(term90378, term90378.getClass(), "second", (byte) 30);
        setIntField(term90378, term90378.getClass(), "nano", 146814860);
        setField(term90373, term90373.getClass(), "time", term90378);
        setField(term90366, term90366.getClass(), "createdAt", term90373);
        setIntField(term90384, term90384.getClass(), "year", 2024);
        setShortField(term90384, term90384.getClass(), "month", (short) 12);
        setShortField(term90384, term90384.getClass(), "day", (short) 5);
        setField(term90383, term90383.getClass(), "date", term90384);
        setByteField(term90388, term90388.getClass(), "hour", (byte) 2);
        setByteField(term90388, term90388.getClass(), "minute", (byte) 50);
        setByteField(term90388, term90388.getClass(), "second", (byte) 28);
        setIntField(term90388, term90388.getClass(), "nano", 545409856);
        setField(term90383, term90383.getClass(), "time", term90388);
        setField(term90366, term90366.getClass(), "updatedAt", term90383);
        term90393 = new Long(3830634993165746272L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostStatDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term90393;
        callMethod(klass, "setId", argTypes, term90366, args);
    }

};


