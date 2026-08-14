package net.jaggerwang.sbip.adapter.dao;

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
import static net.jaggerwang.sbip.adapter.dao.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class PostStatDaoImpl_save_19959086720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31493;

    public PostStatDaoImpl_save_19959086720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term31494 = new Long(3128610259359668233L);
        Long term31496 = new Long(-7966859634511305171L);
        Long term31498 = new Long(0L);
        term31493 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostStatBO"));
        Object term31500 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31501 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31505 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31510 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31511 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31515 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term31493, term31493.getClass(), "id", term31494);
        setField(term31493, term31493.getClass(), "postId", term31496);
        setField(term31493, term31493.getClass(), "likeCount", term31498);
        setIntField(term31501, term31501.getClass(), "year", 2015);
        setShortField(term31501, term31501.getClass(), "month", (short) 7);
        setShortField(term31501, term31501.getClass(), "day", (short) 16);
        setField(term31500, term31500.getClass(), "date", term31501);
        setByteField(term31505, term31505.getClass(), "hour", (byte) 15);
        setByteField(term31505, term31505.getClass(), "minute", (byte) 28);
        setByteField(term31505, term31505.getClass(), "second", (byte) 35);
        setIntField(term31505, term31505.getClass(), "nano", 374805749);
        setField(term31500, term31500.getClass(), "time", term31505);
        setField(term31493, term31493.getClass(), "createdAt", term31500);
        setIntField(term31511, term31511.getClass(), "year", 2021);
        setShortField(term31511, term31511.getClass(), "month", (short) 6);
        setShortField(term31511, term31511.getClass(), "day", (short) 19);
        setField(term31510, term31510.getClass(), "date", term31511);
        setByteField(term31515, term31515.getClass(), "hour", (byte) 17);
        setByteField(term31515, term31515.getClass(), "minute", (byte) 58);
        setByteField(term31515, term31515.getClass(), "second", (byte) 4);
        setIntField(term31515, term31515.getClass(), "nano", 753905173);
        setField(term31510, term31510.getClass(), "time", term31515);
        setField(term31493, term31493.getClass(), "updatedAt", term31510);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.PostStatDaoImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("net.jaggerwang.sbip.entity.PostStatBO");
        Object[] args = new Object[1];
        args[0] = term31493;
        callMethod(klass, "save", argTypes, null, args);
    }

};


