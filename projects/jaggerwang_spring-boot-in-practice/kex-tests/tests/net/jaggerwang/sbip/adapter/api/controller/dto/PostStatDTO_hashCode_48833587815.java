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

public class PostStatDTO_hashCode_48833587815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90583;

    public PostStatDTO_hashCode_48833587815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term90584 = new Long(-1909960197370926856L);
        Long term90586 = new Long(-9121990928010625836L);
        Long term90588 = new Long(1281090837858883601L);
        term90583 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostStatDTO"));
        Object term90590 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90591 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90595 = newInstance(Class.forName("java.time.LocalTime"));
        Object term90600 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90601 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90605 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term90583, term90583.getClass(), "id", term90584);
        setField(term90583, term90583.getClass(), "postId", term90586);
        setField(term90583, term90583.getClass(), "likeCount", term90588);
        setIntField(term90591, term90591.getClass(), "year", 2020);
        setShortField(term90591, term90591.getClass(), "month", (short) 3);
        setShortField(term90591, term90591.getClass(), "day", (short) 21);
        setField(term90590, term90590.getClass(), "date", term90591);
        setByteField(term90595, term90595.getClass(), "hour", (byte) 4);
        setByteField(term90595, term90595.getClass(), "minute", (byte) 37);
        setByteField(term90595, term90595.getClass(), "second", (byte) 54);
        setIntField(term90595, term90595.getClass(), "nano", 623488559);
        setField(term90590, term90590.getClass(), "time", term90595);
        setField(term90583, term90583.getClass(), "createdAt", term90590);
        setIntField(term90601, term90601.getClass(), "year", 2017);
        setShortField(term90601, term90601.getClass(), "month", (short) 12);
        setShortField(term90601, term90601.getClass(), "day", (short) 11);
        setField(term90600, term90600.getClass(), "date", term90601);
        setByteField(term90605, term90605.getClass(), "hour", (byte) 4);
        setByteField(term90605, term90605.getClass(), "minute", (byte) 59);
        setByteField(term90605, term90605.getClass(), "second", (byte) 55);
        setIntField(term90605, term90605.getClass(), "nano", 672136833);
        setField(term90600, term90600.getClass(), "time", term90605);
        setField(term90583, term90583.getClass(), "updatedAt", term90600);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostStatDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term90583, args);
    }

};


