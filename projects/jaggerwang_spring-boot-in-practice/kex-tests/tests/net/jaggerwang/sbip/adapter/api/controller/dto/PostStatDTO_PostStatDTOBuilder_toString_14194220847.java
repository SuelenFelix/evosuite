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

public class PostStatDTO_PostStatDTOBuilder_toString_14194220847 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58482;

    public PostStatDTO_PostStatDTOBuilder_toString_14194220847() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term58483 = new Long(-4234850307320476025L);
        Long term58485 = new Long(4525524239494718372L);
        Long term58487 = new Long(5204341701727130016L);
        term58482 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostStatDTO$PostStatDTOBuilder"));
        Object term58489 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58490 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58494 = newInstance(Class.forName("java.time.LocalTime"));
        Object term58499 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term58500 = newInstance(Class.forName("java.time.LocalDate"));
        Object term58504 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term58482, term58482.getClass(), "id", term58483);
        setField(term58482, term58482.getClass(), "postId", term58485);
        setField(term58482, term58482.getClass(), "likeCount", term58487);
        setIntField(term58490, term58490.getClass(), "year", 2014);
        setShortField(term58490, term58490.getClass(), "month", (short) 2);
        setShortField(term58490, term58490.getClass(), "day", (short) 2);
        setField(term58489, term58489.getClass(), "date", term58490);
        setByteField(term58494, term58494.getClass(), "hour", (byte) 17);
        setByteField(term58494, term58494.getClass(), "minute", (byte) 45);
        setByteField(term58494, term58494.getClass(), "second", (byte) 37);
        setIntField(term58494, term58494.getClass(), "nano", 147840174);
        setField(term58489, term58489.getClass(), "time", term58494);
        setField(term58482, term58482.getClass(), "createdAt", term58489);
        setIntField(term58500, term58500.getClass(), "year", 2023);
        setShortField(term58500, term58500.getClass(), "month", (short) 4);
        setShortField(term58500, term58500.getClass(), "day", (short) 27);
        setField(term58499, term58499.getClass(), "date", term58500);
        setByteField(term58504, term58504.getClass(), "hour", (byte) 11);
        setByteField(term58504, term58504.getClass(), "minute", (byte) 41);
        setByteField(term58504, term58504.getClass(), "second", (byte) 10);
        setIntField(term58504, term58504.getClass(), "nano", 59265345);
        setField(term58499, term58499.getClass(), "time", term58504);
        setField(term58482, term58482.getClass(), "updatedAt", term58499);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostStatDTO$PostStatDTOBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term58482, args);
    }

};


