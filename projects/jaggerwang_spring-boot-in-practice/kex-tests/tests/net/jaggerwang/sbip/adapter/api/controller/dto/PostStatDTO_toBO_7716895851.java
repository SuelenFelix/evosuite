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

public class PostStatDTO_toBO_7716895851 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90204;

    public PostStatDTO_toBO_7716895851() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term90205 = new Long(-3736670675123148973L);
        Long term90207 = new Long(-732854020469829996L);
        Long term90209 = new Long(2356364798178675182L);
        term90204 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostStatDTO"));
        Object term90211 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90212 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90216 = newInstance(Class.forName("java.time.LocalTime"));
        Object term90221 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90222 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90226 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term90204, term90204.getClass(), "id", term90205);
        setField(term90204, term90204.getClass(), "postId", term90207);
        setField(term90204, term90204.getClass(), "likeCount", term90209);
        setIntField(term90212, term90212.getClass(), "year", 2013);
        setShortField(term90212, term90212.getClass(), "month", (short) 11);
        setShortField(term90212, term90212.getClass(), "day", (short) 18);
        setField(term90211, term90211.getClass(), "date", term90212);
        setByteField(term90216, term90216.getClass(), "hour", (byte) 5);
        setByteField(term90216, term90216.getClass(), "minute", (byte) 52);
        setByteField(term90216, term90216.getClass(), "second", (byte) 28);
        setIntField(term90216, term90216.getClass(), "nano", 861263775);
        setField(term90211, term90211.getClass(), "time", term90216);
        setField(term90204, term90204.getClass(), "createdAt", term90211);
        setIntField(term90222, term90222.getClass(), "year", 2028);
        setShortField(term90222, term90222.getClass(), "month", (short) 11);
        setShortField(term90222, term90222.getClass(), "day", (short) 7);
        setField(term90221, term90221.getClass(), "date", term90222);
        setByteField(term90226, term90226.getClass(), "hour", (byte) 11);
        setByteField(term90226, term90226.getClass(), "minute", (byte) 57);
        setByteField(term90226, term90226.getClass(), "second", (byte) 10);
        setIntField(term90226, term90226.getClass(), "nano", 547411849);
        setField(term90221, term90221.getClass(), "time", term90226);
        setField(term90204, term90204.getClass(), "updatedAt", term90221);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostStatDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toBO", argTypes, term90204, args);
    }

};


