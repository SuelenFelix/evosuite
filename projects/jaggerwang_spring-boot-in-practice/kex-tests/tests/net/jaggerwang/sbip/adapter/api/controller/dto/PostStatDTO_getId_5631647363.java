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

public class PostStatDTO_getId_5631647363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90231;

    public PostStatDTO_getId_5631647363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term90232 = new Long(7063501880932248824L);
        Long term90234 = new Long(8782042393246212473L);
        Long term90236 = new Long(-5149906517600309652L);
        term90231 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostStatDTO"));
        Object term90238 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90239 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90243 = newInstance(Class.forName("java.time.LocalTime"));
        Object term90248 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90249 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90253 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term90231, term90231.getClass(), "id", term90232);
        setField(term90231, term90231.getClass(), "postId", term90234);
        setField(term90231, term90231.getClass(), "likeCount", term90236);
        setIntField(term90239, term90239.getClass(), "year", 2013);
        setShortField(term90239, term90239.getClass(), "month", (short) 7);
        setShortField(term90239, term90239.getClass(), "day", (short) 23);
        setField(term90238, term90238.getClass(), "date", term90239);
        setByteField(term90243, term90243.getClass(), "hour", (byte) 17);
        setByteField(term90243, term90243.getClass(), "minute", (byte) 48);
        setByteField(term90243, term90243.getClass(), "second", (byte) 26);
        setIntField(term90243, term90243.getClass(), "nano", 830729623);
        setField(term90238, term90238.getClass(), "time", term90243);
        setField(term90231, term90231.getClass(), "createdAt", term90238);
        setIntField(term90249, term90249.getClass(), "year", 2017);
        setShortField(term90249, term90249.getClass(), "month", (short) 3);
        setShortField(term90249, term90249.getClass(), "day", (short) 4);
        setField(term90248, term90248.getClass(), "date", term90249);
        setByteField(term90253, term90253.getClass(), "hour", (byte) 8);
        setByteField(term90253, term90253.getClass(), "minute", (byte) 46);
        setByteField(term90253, term90253.getClass(), "second", (byte) 7);
        setIntField(term90253, term90253.getClass(), "nano", 282753659);
        setField(term90248, term90248.getClass(), "time", term90253);
        setField(term90231, term90231.getClass(), "updatedAt", term90248);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostStatDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term90231, args);
    }

};


