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

public class PostStat_PostStatBuilder_id_10481511561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31617;
     Object term31644;

    public PostStat_PostStatBuilder_id_10481511561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term31618 = new Long(7777131569376571611L);
        Long term31620 = new Long(-2792969772767139843L);
        Long term31622 = new Long(6313343355456678206L);
        term31617 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostStat$PostStatBuilder"));
        Object term31624 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31625 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31629 = newInstance(Class.forName("java.time.LocalTime"));
        Object term31634 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31635 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31639 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term31617, term31617.getClass(), "id", term31618);
        setField(term31617, term31617.getClass(), "postId", term31620);
        setField(term31617, term31617.getClass(), "likeCount", term31622);
        setIntField(term31625, term31625.getClass(), "year", 2020);
        setShortField(term31625, term31625.getClass(), "month", (short) 12);
        setShortField(term31625, term31625.getClass(), "day", (short) 10);
        setField(term31624, term31624.getClass(), "date", term31625);
        setByteField(term31629, term31629.getClass(), "hour", (byte) 3);
        setByteField(term31629, term31629.getClass(), "minute", (byte) 40);
        setByteField(term31629, term31629.getClass(), "second", (byte) 14);
        setIntField(term31629, term31629.getClass(), "nano", 879978907);
        setField(term31624, term31624.getClass(), "time", term31629);
        setField(term31617, term31617.getClass(), "createdAt", term31624);
        setIntField(term31635, term31635.getClass(), "year", 2010);
        setShortField(term31635, term31635.getClass(), "month", (short) 3);
        setShortField(term31635, term31635.getClass(), "day", (short) 31);
        setField(term31634, term31634.getClass(), "date", term31635);
        setByteField(term31639, term31639.getClass(), "hour", (byte) 17);
        setByteField(term31639, term31639.getClass(), "minute", (byte) 7);
        setByteField(term31639, term31639.getClass(), "second", (byte) 55);
        setIntField(term31639, term31639.getClass(), "nano", 725965566);
        setField(term31634, term31634.getClass(), "time", term31639);
        setField(term31617, term31617.getClass(), "updatedAt", term31634);
        term31644 = new Long(-8901826621860118061L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostStat$PostStatBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term31644;
        callMethod(klass, "id", argTypes, term31617, args);
    }

};


