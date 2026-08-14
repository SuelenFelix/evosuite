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

public class PostStatDTO_setLikeCount_137737042710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90424;
     Object term90451;

    public PostStatDTO_setLikeCount_137737042710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term90425 = new Long(3693671303799195202L);
        Long term90427 = new Long(5122767787240845667L);
        Long term90429 = new Long(-1856029526365001621L);
        term90424 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostStatDTO"));
        Object term90431 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90432 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90436 = newInstance(Class.forName("java.time.LocalTime"));
        Object term90441 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90442 = newInstance(Class.forName("java.time.LocalDate"));
        Object term90446 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term90424, term90424.getClass(), "id", term90425);
        setField(term90424, term90424.getClass(), "postId", term90427);
        setField(term90424, term90424.getClass(), "likeCount", term90429);
        setIntField(term90432, term90432.getClass(), "year", 2013);
        setShortField(term90432, term90432.getClass(), "month", (short) 8);
        setShortField(term90432, term90432.getClass(), "day", (short) 14);
        setField(term90431, term90431.getClass(), "date", term90432);
        setByteField(term90436, term90436.getClass(), "hour", (byte) 5);
        setByteField(term90436, term90436.getClass(), "minute", (byte) 8);
        setByteField(term90436, term90436.getClass(), "second", (byte) 18);
        setIntField(term90436, term90436.getClass(), "nano", 403898061);
        setField(term90431, term90431.getClass(), "time", term90436);
        setField(term90424, term90424.getClass(), "createdAt", term90431);
        setIntField(term90442, term90442.getClass(), "year", 2019);
        setShortField(term90442, term90442.getClass(), "month", (short) 11);
        setShortField(term90442, term90442.getClass(), "day", (short) 7);
        setField(term90441, term90441.getClass(), "date", term90442);
        setByteField(term90446, term90446.getClass(), "hour", (byte) 8);
        setByteField(term90446, term90446.getClass(), "minute", (byte) 45);
        setByteField(term90446, term90446.getClass(), "second", (byte) 49);
        setIntField(term90446, term90446.getClass(), "nano", 848776212);
        setField(term90441, term90441.getClass(), "time", term90446);
        setField(term90424, term90424.getClass(), "updatedAt", term90441);
        term90451 = new Long(6951543447963559207L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.PostStatDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term90451;
        callMethod(klass, "setLikeCount", argTypes, term90424, args);
    }

};


