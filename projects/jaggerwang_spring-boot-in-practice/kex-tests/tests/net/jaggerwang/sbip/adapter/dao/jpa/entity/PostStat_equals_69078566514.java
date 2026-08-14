package net.jaggerwang.sbip.adapter.dao.jpa.entity;

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
import static net.jaggerwang.sbip.adapter.dao.jpa.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class PostStat_equals_69078566514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3982;
     Object term4009;

    public PostStat_equals_69078566514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3983 = new Long(682356318767179819L);
        Long term3985 = new Long(-7291743527973326814L);
        Long term3987 = new Long(-5963439350418910964L);
        term3982 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostStat"));
        Object term3989 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3990 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3994 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3999 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4000 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4004 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3982, term3982.getClass(), "id", term3983);
        setField(term3982, term3982.getClass(), "postId", term3985);
        setField(term3982, term3982.getClass(), "likeCount", term3987);
        setIntField(term3990, term3990.getClass(), "year", 2024);
        setShortField(term3990, term3990.getClass(), "month", (short) 5);
        setShortField(term3990, term3990.getClass(), "day", (short) 6);
        setField(term3989, term3989.getClass(), "date", term3990);
        setByteField(term3994, term3994.getClass(), "hour", (byte) 20);
        setByteField(term3994, term3994.getClass(), "minute", (byte) 14);
        setByteField(term3994, term3994.getClass(), "second", (byte) 27);
        setIntField(term3994, term3994.getClass(), "nano", 900636101);
        setField(term3989, term3989.getClass(), "time", term3994);
        setField(term3982, term3982.getClass(), "createdAt", term3989);
        setIntField(term4000, term4000.getClass(), "year", 2021);
        setShortField(term4000, term4000.getClass(), "month", (short) 4);
        setShortField(term4000, term4000.getClass(), "day", (short) 17);
        setField(term3999, term3999.getClass(), "date", term4000);
        setByteField(term4004, term4004.getClass(), "hour", (byte) 4);
        setByteField(term4004, term4004.getClass(), "minute", (byte) 11);
        setByteField(term4004, term4004.getClass(), "second", (byte) 16);
        setIntField(term4004, term4004.getClass(), "nano", 509895858);
        setField(term3999, term3999.getClass(), "time", term4004);
        setField(term3982, term3982.getClass(), "updatedAt", term3999);
        term4009 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostStat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4009;
        callMethod(klass, "equals", argTypes, term3982, args);
    }

};


