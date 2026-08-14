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

public class PostStat_getCreatedAt_6746829537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3767;

    public PostStat_getCreatedAt_6746829537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3768 = new Long(-5788180182343976541L);
        Long term3770 = new Long(2936323121573284007L);
        Long term3772 = new Long(-1154553077993834885L);
        term3767 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostStat"));
        Object term3774 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3775 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3779 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3784 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3785 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3789 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3767, term3767.getClass(), "id", term3768);
        setField(term3767, term3767.getClass(), "postId", term3770);
        setField(term3767, term3767.getClass(), "likeCount", term3772);
        setIntField(term3775, term3775.getClass(), "year", 2010);
        setShortField(term3775, term3775.getClass(), "month", (short) 5);
        setShortField(term3775, term3775.getClass(), "day", (short) 2);
        setField(term3774, term3774.getClass(), "date", term3775);
        setByteField(term3779, term3779.getClass(), "hour", (byte) 2);
        setByteField(term3779, term3779.getClass(), "minute", (byte) 22);
        setByteField(term3779, term3779.getClass(), "second", (byte) 33);
        setIntField(term3779, term3779.getClass(), "nano", 530835039);
        setField(term3774, term3774.getClass(), "time", term3779);
        setField(term3767, term3767.getClass(), "createdAt", term3774);
        setIntField(term3785, term3785.getClass(), "year", 2024);
        setShortField(term3785, term3785.getClass(), "month", (short) 4);
        setShortField(term3785, term3785.getClass(), "day", (short) 24);
        setField(term3784, term3784.getClass(), "date", term3785);
        setByteField(term3789, term3789.getClass(), "hour", (byte) 7);
        setByteField(term3789, term3789.getClass(), "minute", (byte) 2);
        setByteField(term3789, term3789.getClass(), "second", (byte) 51);
        setIntField(term3789, term3789.getClass(), "nano", 635502964);
        setField(term3784, term3784.getClass(), "time", term3789);
        setField(term3767, term3767.getClass(), "updatedAt", term3784);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.PostStat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedAt", argTypes, term3767, args);
    }

};


