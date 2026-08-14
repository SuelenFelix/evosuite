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

public class PostLike_setUpdatedAt_25723696111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31428;
     Object term31455;

    public PostLike_setUpdatedAt_25723696111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term31429 = new Long(-4987344934532917085L);
        Long term31431 = new Long(4832511106024339541L);
        Long term31433 = new Long(7840243516767232066L);
        term31428 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostLike"));
        Object term31435 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31436 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31440 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31445 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31446 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31450 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term31428, term31428.getClass(), "id", term31429);
        setField(term31428, term31428.getClass(), "userId", term31431);
        setField(term31428, term31428.getClass(), "postId", term31433);
        setIntField(term31436, term31436.getClass(), "year", 2019);
        setShortField(term31436, term31436.getClass(), "month", (short) 10);
        setShortField(term31436, term31436.getClass(), "day", (short) 21);
        setField(term31435, term31435.getClass(), "date", term31436);
        setByteField(term31440, term31440.getClass(), "hour", (byte) 23);
        setByteField(term31440, term31440.getClass(), "minute", (byte) 33);
        setByteField(term31440, term31440.getClass(), "second", (byte) 19);
        setIntField(term31440, term31440.getClass(), "nano", 72784109);
        setField(term31435, term31435.getClass(), "time", term31440);
        setField(term31428, term31428.getClass(), "createdAt", term31435);
        setIntField(term31446, term31446.getClass(), "year", 2027);
        setShortField(term31446, term31446.getClass(), "month", (short) 10);
        setShortField(term31446, term31446.getClass(), "day", (short) 12);
        setField(term31445, term31445.getClass(), "date", term31446);
        setByteField(term31450, term31450.getClass(), "hour", (byte) 23);
        setByteField(term31450, term31450.getClass(), "minute", (byte) 45);
        setByteField(term31450, term31450.getClass(), "second", (byte) 21);
        setIntField(term31450, term31450.getClass(), "nano", 866836785);
        setField(term31445, term31445.getClass(), "time", term31450);
        setField(term31428, term31428.getClass(), "updatedAt", term31445);
        term31455 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31456 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31460 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term31456, term31456.getClass(), "year", 2022);
        setShortField(term31456, term31456.getClass(), "month", (short) 5);
        setShortField(term31456, term31456.getClass(), "day", (short) 27);
        setField(term31455, term31455.getClass(), "date", term31456);
        setByteField(term31460, term31460.getClass(), "hour", (byte) 11);
        setByteField(term31460, term31460.getClass(), "minute", (byte) 48);
        setByteField(term31460, term31460.getClass(), "second", (byte) 27);
        setIntField(term31460, term31460.getClass(), "nano", 101970300);
        setField(term31455, term31455.getClass(), "time", term31460);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostLike");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term31455;
        callMethod(klass, "setUpdatedAt", argTypes, term31428, args);
    }

};


