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

public class PostStat_getId_1672701324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3686;

    public PostStat_getId_1672701324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3687 = new Long(-2068172595987555756L);
        Long term3689 = new Long(-6292278961887936280L);
        Long term3691 = new Long(-6645965768855543712L);
        term3686 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostStat"));
        Object term3693 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3694 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3698 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3703 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3704 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3708 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3686, term3686.getClass(), "id", term3687);
        setField(term3686, term3686.getClass(), "postId", term3689);
        setField(term3686, term3686.getClass(), "likeCount", term3691);
        setIntField(term3694, term3694.getClass(), "year", 2021);
        setShortField(term3694, term3694.getClass(), "month", (short) 8);
        setShortField(term3694, term3694.getClass(), "day", (short) 12);
        setField(term3693, term3693.getClass(), "date", term3694);
        setByteField(term3698, term3698.getClass(), "hour", (byte) 2);
        setByteField(term3698, term3698.getClass(), "minute", (byte) 17);
        setByteField(term3698, term3698.getClass(), "second", (byte) 51);
        setIntField(term3698, term3698.getClass(), "nano", 207375141);
        setField(term3693, term3693.getClass(), "time", term3698);
        setField(term3686, term3686.getClass(), "createdAt", term3693);
        setIntField(term3704, term3704.getClass(), "year", 2025);
        setShortField(term3704, term3704.getClass(), "month", (short) 11);
        setShortField(term3704, term3704.getClass(), "day", (short) 3);
        setField(term3703, term3703.getClass(), "date", term3704);
        setByteField(term3708, term3708.getClass(), "hour", (byte) 21);
        setByteField(term3708, term3708.getClass(), "minute", (byte) 24);
        setByteField(term3708, term3708.getClass(), "second", (byte) 23);
        setIntField(term3708, term3708.getClass(), "nano", 210986721);
        setField(term3703, term3703.getClass(), "time", term3708);
        setField(term3686, term3686.getClass(), "updatedAt", term3703);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostStat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term3686, args);
    }

};


