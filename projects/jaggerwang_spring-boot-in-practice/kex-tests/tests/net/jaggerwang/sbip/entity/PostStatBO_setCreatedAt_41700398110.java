package net.jaggerwang.sbip.entity;

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
import static net.jaggerwang.sbip.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class PostStatBO_setCreatedAt_41700398110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24686;
     Object term24713;

    public PostStatBO_setCreatedAt_41700398110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term24687 = new Long(9192899183781208922L);
        Long term24689 = new Long(-7705159544905337794L);
        Long term24691 = new Long(0L);
        term24686 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostStatBO"));
        Object term24693 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24694 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24698 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24703 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24704 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24708 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term24686, term24686.getClass(), "id", term24687);
        setField(term24686, term24686.getClass(), "postId", term24689);
        setField(term24686, term24686.getClass(), "likeCount", term24691);
        setIntField(term24694, term24694.getClass(), "year", 2025);
        setShortField(term24694, term24694.getClass(), "month", (short) 1);
        setShortField(term24694, term24694.getClass(), "day", (short) 20);
        setField(term24693, term24693.getClass(), "date", term24694);
        setByteField(term24698, term24698.getClass(), "hour", (byte) 22);
        setByteField(term24698, term24698.getClass(), "minute", (byte) 55);
        setByteField(term24698, term24698.getClass(), "second", (byte) 9);
        setIntField(term24698, term24698.getClass(), "nano", 660955568);
        setField(term24693, term24693.getClass(), "time", term24698);
        setField(term24686, term24686.getClass(), "createdAt", term24693);
        setIntField(term24704, term24704.getClass(), "year", 2014);
        setShortField(term24704, term24704.getClass(), "month", (short) 2);
        setShortField(term24704, term24704.getClass(), "day", (short) 26);
        setField(term24703, term24703.getClass(), "date", term24704);
        setByteField(term24708, term24708.getClass(), "hour", (byte) 16);
        setByteField(term24708, term24708.getClass(), "minute", (byte) 42);
        setByteField(term24708, term24708.getClass(), "second", (byte) 39);
        setIntField(term24708, term24708.getClass(), "nano", 690212071);
        setField(term24703, term24703.getClass(), "time", term24708);
        setField(term24686, term24686.getClass(), "updatedAt", term24703);
        term24713 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24714 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24718 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term24714, term24714.getClass(), "year", 2019);
        setShortField(term24714, term24714.getClass(), "month", (short) 9);
        setShortField(term24714, term24714.getClass(), "day", (short) 3);
        setField(term24713, term24713.getClass(), "date", term24714);
        setByteField(term24718, term24718.getClass(), "hour", (byte) 2);
        setByteField(term24718, term24718.getClass(), "minute", (byte) 32);
        setByteField(term24718, term24718.getClass(), "second", (byte) 30);
        setIntField(term24718, term24718.getClass(), "nano", 339846128);
        setField(term24713, term24713.getClass(), "time", term24718);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostStatBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term24713;
        callMethod(klass, "setCreatedAt", argTypes, term24686, args);
    }

};


